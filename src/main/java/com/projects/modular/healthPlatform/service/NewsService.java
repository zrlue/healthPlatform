package com.projects.modular.healthPlatform.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.projects.core.beetl.LayuiPageInfo;
import com.projects.modular.healthPlatform.entity.News;
import com.projects.modular.healthPlatform.model.params.NewsParam;
import com.projects.modular.healthPlatform.model.result.NewsResult;

/**
 * <p>
 * 新闻 服务类
 * </p>
 *
 * @author demo
 * @since 2023-12-01
 */
public interface NewsService extends IService<News> {

    /**
     * 新增
     *
     * @author demo
     * @Date 2023-12-01
     */
    void add(NewsParam param);

    /**
     * 删除
     *
     * @author demo
     * @Date 2023-12-01
     */
    void delete(NewsParam param);

    /**
     * 更新
     *
     * @author demo
     * @Date 2023-12-01
     */
    void update(NewsParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    NewsResult findBySpec(NewsParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    List<News> findListBySpec(NewsParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
     LayuiPageInfo findPageBySpec(NewsParam param);

}
