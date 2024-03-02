package com.projects.modular.healthPlatform.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.projects.core.beetl.LayuiPageInfo;
import com.projects.modular.healthPlatform.entity.Activity;
import com.projects.modular.healthPlatform.model.params.ActivityParam;
import com.projects.modular.healthPlatform.model.result.ActivityResult;

/**
 * <p>
 * 社区活动 服务类
 * </p>
 *
 * @author demo
 * @since 2023-12-01
 */
public interface ActivityService extends IService<Activity> {

    /**
     * 新增
     *
     * @author demo
     * @Date 2024-01-10
     */
    void add(ActivityParam param);

    /**
     * 删除
     *
     * @author demo
     * @Date 2024-01-10
     */
    void delete(ActivityParam param);

    /**
     * 更新
     *
     * @author demo
     * @Date 2024-01-10
     */
    void update(ActivityParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author demo
     * @Date 2024-01-10
     */
    ActivityResult findBySpec(ActivityParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author demo
     * @Date 2024-01-10
     */
    List<ActivityResult> findListBySpec(ActivityParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author demo
     * @Date 2024-01-10
     */
     LayuiPageInfo findPageBySpec(ActivityParam param);

}
