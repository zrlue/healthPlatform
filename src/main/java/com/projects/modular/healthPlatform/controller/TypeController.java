package com.projects.modular.healthPlatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.projects.core.beetl.LayuiPageInfo;
import com.projects.modular.healthPlatform.entity.Type;
import com.projects.modular.healthPlatform.model.params.TypeParam;
import com.projects.modular.healthPlatform.service.TypeService;

import cn.stylefeng.roses.core.base.controller.BaseController;
import cn.stylefeng.roses.core.reqres.response.ResponseData;


/**
 * 分类控制器
 *
 * @author demo
 * @Date 2023-12-01 22:29:33
 */
@Controller
@RequestMapping("/type")
public class TypeController extends BaseController {

    private String PREFIX = "/modular/type";

    @Autowired
    private TypeService typeService;

    /**
     * 跳转到主页面
     *
     * @author demo
     * @Date 2023-12-01
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "/type.html";
    }

    /**
     * 新增页面
     *
     * @author demo
     * @Date 2023-12-01
     */
    @RequestMapping("/add")
    public String add() {
        return PREFIX + "/type_add.html";
    }

    /**
     * 编辑页面
     *
     * @author demo
     * @Date 2023-12-01
     */
    @RequestMapping("/edit")
    public String edit() {
        return PREFIX + "/type_edit.html";
    }

    /**
     * 新增接口
     *
     * @author demo
     * @Date 2023-12-01
     */
    @RequestMapping("/addItem")
    @ResponseBody
    public ResponseData addItem(TypeParam typeParam) {
        this.typeService.add(typeParam);
        return ResponseData.success();
    }

    /**
     * 编辑接口
     *
     * @author demo
     * @Date 2023-12-01
     */
    @RequestMapping("/editItem")
    @ResponseBody
    public ResponseData editItem(TypeParam typeParam) {
        this.typeService.update(typeParam);
        return ResponseData.success();
    }

    /**
     * 删除接口
     *
     * @author demo
     * @Date 2023-12-01
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseData delete(TypeParam typeParam) {
        this.typeService.delete(typeParam);
        return ResponseData.success();
    }

    
    
    @RequestMapping("/getList")
    @ResponseBody
    public ResponseData getTypeList() {
    	TypeParam param = new TypeParam();
    	QueryWrapper<Type> objectQueryWrapper = new QueryWrapper<>();
    	List<Type> list = typeService.getBaseMapper().selectList(objectQueryWrapper);
        return ResponseData.success(list);
    }
    
    /**
     * 查看详情接口
     *
     * @author demo
     * @Date 2023-12-01
     */
    @RequestMapping("/detail")
    @ResponseBody
    public ResponseData detail(TypeParam typeParam) {
        Type detail = this.typeService.getById(typeParam.getTypeId());
        return ResponseData.success(detail);
    }

    /**
     * 查询列表
     *
     * @author demo
     * @Date 2023-12-01
     */
    @ResponseBody
    @RequestMapping("/list")
    public LayuiPageInfo list(TypeParam typeParam) {
        return this.typeService.findPageBySpec(typeParam);
    }

}


