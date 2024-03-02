layui.use(['table', 'admin', 'ax'], function () {
    var $ = layui.$;
    var table = layui.table;
    var $ax = layui.ax;
    var admin = layui.admin;

    /**
     * 注册用户管理
     */
    var RegisteredUsers = {
        tableId: "registeredUsersTable"
    };

    /**
     * 初始化表格的列
     */
    RegisteredUsers.initColumn = function () {
        return [[
            {type: 'checkbox'},
            {field: 'userId', hide: true, title: '主键'},
            {field: 'name', sort: true, title: '姓名'},
            {field: 'passWord', sort: true, title: '密码'},
            {field: 'userName', sort: true, title: '用户'},
            {field: 'pic', sort: true, title: '头像'},
            {field: 'address', sort: true, title: '手机号'},
            {align: 'center', toolbar: '#tableBar', title: '操作'}
        ]];
    };

    /**
     * 点击查询按钮
     */
    RegisteredUsers.search = function () {
        var queryData = {};
        queryData['condition'] = $("#condition").val();
        table.reload(RegisteredUsers.tableId, {where: queryData});
    };

    /**
     * 弹出添加对话框
     */
    RegisteredUsers.openAddDlg = function () {
        admin.putTempData('formOk', false);
        top.layui.admin.open({
            type: 2,
            title: '添加注册用户',
            content: Feng.ctxPath + '/registeredUsers/add',
            end: function () {
                admin.getTempData('formOk') && table.reload(RegisteredUsers.tableId);
            }
        });
    };

    /**
     * 导出excel按钮
     */
    RegisteredUsers.exportExcel = function () {
        var checkRows = table.checkStatus(RegisteredUsers.tableId);
        if (checkRows.data.length === 0) {
            Feng.error("请选择要导出的数据");
        } else {
            table.exportFile(tableResult.config.id, checkRows.data, 'xls');
        }
    };

    /**
     * 点击编辑
     *
     * @param data 点击按钮时候的行数据
     */
    RegisteredUsers.openEditDlg = function (data) {
        admin.putTempData('formOk', false);
        top.layui.admin.open({
            type: 2,
            title: '修改注册用户',
            content: Feng.ctxPath + '/registeredUsers/edit?userId=' + data.userId,
            end: function () {
                admin.getTempData('formOk') && table.reload(RegisteredUsers.tableId);
            }
        });
    };

    /**
     * 点击删除
     *
     * @param data 点击按钮时候的行数据
     */
    RegisteredUsers.onDeleteItem = function (data) {
        var operation = function () {
            var ajax = new $ax(Feng.ctxPath + "/registeredUsers/delete", function (data) {
                Feng.success("删除成功!");
                table.reload(RegisteredUsers.tableId);
            }, function (data) {
                Feng.error("删除失败!" + data.responseJSON.message + "!");
            });
            ajax.set("userId", data.userId);
            ajax.start();
        };
        Feng.confirm("是否删除?", operation);
    };

    // 渲染表格
    var tableResult = table.render({
        elem: '#' + RegisteredUsers.tableId,
        url: Feng.ctxPath + '/registeredUsers/list',
        page: true,
        height: "full-158",
        cellMinWidth: 100,
        cols: RegisteredUsers.initColumn()
    });

    // 搜索按钮点击事件
    $('#btnSearch').click(function () {
        RegisteredUsers.search();
    });

    // 添加按钮点击事件
    $('#btnAdd').click(function () {
        RegisteredUsers.openAddDlg();
    });

    // 导出excel
    $('#btnExp').click(function () {
        RegisteredUsers.exportExcel();
    });

    // 工具条点击事件
    table.on('tool(' + RegisteredUsers.tableId + ')', function (obj) {
        var data = obj.data;
        var layEvent = obj.event;

        if (layEvent === 'edit') {
            RegisteredUsers.openEditDlg(data);
        } else if (layEvent === 'delete') {
            RegisteredUsers.onDeleteItem(data);
        }
    });
});
