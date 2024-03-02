package com.projects.modular.healthPlatform.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.projects.core.beetl.LayuiPageInfo;
import com.projects.modular.healthPlatform.entity.Comment;
import com.projects.modular.healthPlatform.model.params.CommentParam;
import com.projects.modular.healthPlatform.model.result.CommentResult;

import java.util.List;

/**
 * <p>
 * 评论 服务类
 * </p>
 *
 * @author demo
 * @since 2023-12-01
 */
public interface CommentService extends IService<Comment> {

    /**
     * 新增
     *
     * @author demo
     * @Date 2023-12-01
     */
    void add(CommentParam param);

    /**
     * 删除
     *
     * @author demo
     * @Date 2023-12-01
     */
    void delete(CommentParam param);

    /**
     * 更新
     *
     * @author demo
     * @Date 2023-12-01
     */
    void update(CommentParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    CommentResult findBySpec(CommentParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    List<CommentResult> findListBySpec(CommentParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-01
     */
    LayuiPageInfo findPageBySpec(CommentParam param);

}
