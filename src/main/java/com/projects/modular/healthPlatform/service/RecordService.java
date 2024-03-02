package com.projects.modular.healthPlatform.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.projects.core.beetl.LayuiPageInfo;
import com.projects.modular.healthPlatform.entity.Record;
import com.projects.modular.healthPlatform.model.params.RecordParam;
import com.projects.modular.healthPlatform.model.result.RecordResult;

/**
 * <p>
 * 健康档案 服务类
 * </p>
 *
 * @author demo
 * @since 2023-12-01
 */
public interface RecordService extends IService<Record> {

    /**
     * 新增
     *
     * @author demo
     * @Date 2023-12-01
     */
    void add(RecordParam param);

    /**
     * 删除
     *
     * @author demo
     * @Date 2023-12-01
     */
    void delete(RecordParam param);

    /**
     * 更新
     *
     * @author demo
     * @Date 2023-12-01
     */
    void update(RecordParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    RecordResult findBySpec(RecordParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    List<RecordResult> findListBySpec(RecordParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
     LayuiPageInfo findPageBySpec(RecordParam param);

}
