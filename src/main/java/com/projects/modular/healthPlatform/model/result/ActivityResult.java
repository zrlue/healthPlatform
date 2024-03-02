package com.projects.modular.healthPlatform.model.result;

import com.projects.modular.healthPlatform.entity.RegisteredUsers;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 社区活动返回结果对象
 * </p>
 *
 * @author demo
 * @since 2023-12-01
 */
@Data
public class ActivityResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long activityId;

    /**
     * 活动主题
     */
    private String title;

    /**
     * 活动内容
     */
    private String context;

    /**
     * 举办时间
     */
    private Date time;

    /**
     * 图片
     */
    private String pic;

    /**
     * 发布活动的用户id
     */
    private Long userId;

    /**
     * 发起人的昵称
     */
    private String name;

    /**
     * 微信小程序用于表示活动状态
     * 1为活动进行中，0为活动结束
     */
    private int status;

    /**
     * 数据库用于表示活动状态
     * 为1活动进行中，0活动结束
     */
    private int endPoint;

    /**
     * 用于统计评论数量
     */
    private int coount;

    /**
     * 报名用户列表
     */
    private List<RegisteredUsers> user;

}
