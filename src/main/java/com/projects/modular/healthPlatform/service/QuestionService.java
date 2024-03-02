package com.projects.modular.healthPlatform.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.projects.core.beetl.LayuiPageInfo;
import com.projects.modular.healthPlatform.entity.Question;
import com.projects.modular.healthPlatform.model.params.QuestionParam;
import com.projects.modular.healthPlatform.model.result.QuestionResult;

/**
 * <p>
 * 留言管理 服务类
 * </p>
 *
 * @author demo
 * @since 2023-12-19
 */
public interface QuestionService extends IService<Question> {

    /**
     * 新增
     *
     * @author demo
     * @Date 2023-12-19
     */
    void add(QuestionParam param);

    /**
     * 删除
     *
     * @author demo
     * @Date 2023-12-19
     */
    void delete(QuestionParam param);

    /**
     * 更新
     *
     * @author demo
     * @Date 2023-12-19
     */
    void update(QuestionParam param);

    /**
     * 查询单条数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-19
     */
    QuestionResult findBySpec(QuestionParam param);

    /**
     * 查询列表，Specification模式
     *
     * @author demo
     * @Date 2023-12-19
     */
    List<QuestionResult> findListBySpec(QuestionParam param);

    /**
     * 查询分页数据，Specification模式
     *
     * @author demo
     * @Date 2023-12-19
     */
     LayuiPageInfo findPageBySpec(QuestionParam param);

}
