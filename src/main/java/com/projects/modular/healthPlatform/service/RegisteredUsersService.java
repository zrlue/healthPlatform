package com.projects.modular.healthPlatform.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.projects.core.beetl.LayuiPageInfo;
import com.projects.modular.healthPlatform.entity.RegisteredUsers;
import com.projects.modular.healthPlatform.model.params.RegisteredUsersParam;
import com.projects.modular.healthPlatform.model.result.RegisteredUsersResult;

/**
 * <p>
 * 注册用户 服务类
 * </p>
 *
 * @author demo
 * @since 2023-12-01
 */
public interface RegisteredUsersService extends IService<RegisteredUsers> {

    /**
     * 新增
     *
     * @author demo
     * @Date 2023-12-01
     */
    void add(RegisteredUsersParam param);

    /**
     * 删除
     *
     * @author demo
     * @Date 2023-12-01
     */
    void delete(RegisteredUsersParam param);

    /**
     * 更新
     *
     * @author demo
     * @Date 2023-12-01
     */
    void update(RegisteredUsersParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    RegisteredUsersResult findBySpec(RegisteredUsersParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    List<RegisteredUsersResult> findListBySpec(RegisteredUsersParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
     LayuiPageInfo findPageBySpec(RegisteredUsersParam param);

}
