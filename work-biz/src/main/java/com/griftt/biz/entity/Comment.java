package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 评论
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@TableName("sa_comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 评论类型
     */
    private Integer commentType;

    /**
     * 主题内容的id
     */
    private Integer item;

    /**
     * 主题内容发布人
     */
    private Integer belong;

    /**
     * 评论人
     */
    private Integer commentId;

    /**
     * 被回复人id
     */
    private Integer beReplyId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 标识 （精品，置顶）
     */
    private Integer mark;

    /**
     * 点赞数
     */
    private Integer praise;

    /**
     * 管理员
     */
    private Long handlePerson;

    /**
     * 状态 1：显示 ,0 ：隐藏
     */
    private Integer status;

    /**
     * 新增时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 部门id
     */
    private Integer deptid;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    /**
     * 记录状态
     */
    private Integer recordStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getBelong() {
        return belong;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getBeReplyId() {
        return beReplyId;
    }

    public void setBeReplyId(Integer beReplyId) {
        this.beReplyId = beReplyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getHandlePerson() {
        return handlePerson;
    }

    public void setHandlePerson(Long handlePerson) {
        this.handlePerson = handlePerson;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Override
    public String toString() {
        return "Comment{" +
        "id=" + id +
        ", commentType=" + commentType +
        ", item=" + item +
        ", belong=" + belong +
        ", commentId=" + commentId +
        ", beReplyId=" + beReplyId +
        ", content=" + content +
        ", mark=" + mark +
        ", praise=" + praise +
        ", handlePerson=" + handlePerson +
        ", status=" + status +
        ", createTime=" + createTime +
        ", deptid=" + deptid +
        ", updateTime=" + updateTime +
        ", recordStatus=" + recordStatus +
        "}";
    }
}
