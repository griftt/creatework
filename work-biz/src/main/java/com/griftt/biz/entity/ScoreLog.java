package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 积分记录
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@TableName("sa_score_log")
public class ScoreLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 原始积分
     */
    private Integer originalScore;

    /**
     * 最新积分
     */
    private Integer currentScore;

    /**
     * 变动积分
     */
    private Integer changeScore;

    /**
     * 积分来源
     */
    private Integer whereFrom;

    /**
     * 积分用户
     */
    private Integer playerId;

    /**
     * 管理员
     */
    private Integer adminId;

    /**
     * 来源id
     */
    private Integer fromPlayerId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 部门id
     */
    private Integer deptid;

    /**
     * 添加时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    /**
     * 记录状态:1-正常；0-删除；
     */
    private Integer recordStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOriginalScore() {
        return originalScore;
    }

    public void setOriginalScore(Integer originalScore) {
        this.originalScore = originalScore;
    }

    public Integer getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(Integer currentScore) {
        this.currentScore = currentScore;
    }

    public Integer getChangeScore() {
        return changeScore;
    }

    public void setChangeScore(Integer changeScore) {
        this.changeScore = changeScore;
    }

    public Integer getWhereFrom() {
        return whereFrom;
    }

    public void setWhereFrom(Integer whereFrom) {
        this.whereFrom = whereFrom;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getFromPlayerId() {
        return fromPlayerId;
    }

    public void setFromPlayerId(Integer fromPlayerId) {
        this.fromPlayerId = fromPlayerId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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
        return "ScoreLog{" +
        "id=" + id +
        ", originalScore=" + originalScore +
        ", currentScore=" + currentScore +
        ", changeScore=" + changeScore +
        ", whereFrom=" + whereFrom +
        ", playerId=" + playerId +
        ", adminId=" + adminId +
        ", fromPlayerId=" + fromPlayerId +
        ", orderNo=" + orderNo +
        ", deptid=" + deptid +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", recordStatus=" + recordStatus +
        "}";
    }
}
