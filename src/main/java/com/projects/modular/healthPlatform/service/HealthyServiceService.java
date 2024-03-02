package com.projects.modular.healthPlatform.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.projects.core.beetl.LayuiPageInfo;
import com.projects.modular.healthPlatform.entity.HealthyService;
import com.projects.modular.healthPlatform.model.params.HealthyServiceParam;
import com.projects.modular.healthPlatform.model.result.HealthyServiceResult;

/**
 * <p>
 * 健康服务 服务类
 * </p>
 *
 * @author demo
 * @since 2023-12-01
 */
public interface HealthyServiceService extends IService<HealthyService> {

    /**
     * 新增
     *
     * @author demo
     * @Date 2023-12-01
     */
    void add(HealthyServiceParam param);

    /**
     * 删除
     *
     * @author demo
     * @Date 2023-12-01
     */
    void delete(HealthyServiceParam param);

    /**
     * 更新
     *
     * @author demo
     * @Date 2023-12-01
     */
    void update(HealthyServiceParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    HealthyServiceResult findBySpec(HealthyServiceParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    List<HealthyServiceResult> findListBySpec(HealthyServiceParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
     LayuiPageInfo findPageBySpec(HealthyServiceParam param);

}
