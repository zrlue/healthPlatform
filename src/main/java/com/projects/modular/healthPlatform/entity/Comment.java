package com.projects.modular.healthPlatform.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 评论
 * </p>
 *
 * @author demo
 * @since 2023-12-01
 */
@TableName("t_comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "comment_id", type = IdType.ID_WORKER)
    private Long commentId;

    /**
     * 内容
     */
    @TableField("content")
    private String content;

    /**
     * 评论人
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 活动
     */
    @TableField("forum_id")
    private Long forumId;

    /**
     * 评论时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

   


    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getForumId() {
        return forumId;
    }

    public void setForumId(Long forumId) {
        this.forumId = forumId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

  

    @Override
    public String toString() {
        return "Comment{" +
        "commentId=" + commentId +
        ", content=" + content +
        ", userId=" + userId +
        ", forumId=" + forumId +
        ", createTime=" + createTime +
   
        "}";
    }
}
