package com.projects.modular.healthPlatform.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.projects.core.beetl.LayuiPageInfo;
import com.projects.modular.healthPlatform.entity.Order;
import com.projects.modular.healthPlatform.model.params.OrderParam;
import com.projects.modular.healthPlatform.model.result.OrderResult;

/**
 * <p>
 * 服务预约 服务类
 * </p>
 *
 * @author demo
 * @since 2023-12-01
 */
public interface OrderService extends IService<Order> {

    /**
     * 新增
     *
     * @author demo
     * @Date 2023-12-01
     */
    void add(OrderParam param);

    /**
     * 删除
     *
     * @author demo
     * @Date 2023-12-01
     */
    void delete(OrderParam param);

    /**
     * 更新
     *
     * @author demo
     * @Date 2023-12-01
     */
    void update(OrderParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    OrderResult findBySpec(OrderParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    List<OrderResult> findListBySpec(OrderParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
     LayuiPageInfo findPageBySpec(OrderParam param);

}
