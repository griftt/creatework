package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户晒物
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@TableName("sa_present")
public class Present implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 用户id
     *
     */
    private Integer playerId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 内容
     */
    private String text;

    /**
     * 浏览量
     */
    private Integer watch;

    /**
     * 点赞数
     */
    private Integer praise;

    /**
     * 标识(置顶 1 / 未置顶 0 )
     */
    private Integer mark;

    /**
     * 状态（显示/屏蔽）
     */
    private Integer status;

    /**
     * 下线时间
     */
    private Date offlineTime;

    /**
     * 处理人
     */
    private Long handlePerson;

    /**
     * 备注
     */
    private String content;

    /**
     * 处理时间
     */
    private Date handleTime;

    /**
     * 部门id
     */
    private Integer deptid;

    /**
     * 新增时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getWatch() {
        return watch;
    }

    public void setWatch(Integer watch) {
        this.watch = watch;
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

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public Long getHandlePerson() {
        return handlePerson;
    }

    public void setHandlePerson(Long handlePerson) {
        this.handlePerson = handlePerson;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        return "Present{" +
        "id=" + id +
        ", goodsId=" + goodsId +
        ", playerId=" + playerId +
        ", userName=" + userName +
        ", text=" + text +
        ", watch=" + watch +
        ", praise=" + praise +
        ", mark=" + mark +
        ", status=" + status +
        ", offlineTime=" + offlineTime +
        ", handlePerson=" + handlePerson +
        ", content=" + content +
        ", handleTime=" + handleTime +
        ", deptid=" + deptid +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", recordStatus=" + recordStatus +
        "}";
    }
}
