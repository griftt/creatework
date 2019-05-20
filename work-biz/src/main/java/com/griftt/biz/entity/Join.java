package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 参加活动\众测 用户名单
 * </p>
 *
 * @author griftt
 * @since 2019-05-10
 */
@TableName("sa_join")
public class Join implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 活动众测id
     */
    private Integer activityId;

    /**
     * 类型
     */
    private Integer projectType;

    /**
     * 用户id
     */
    private Integer playerId;

    /**
     * 用户名
     */
    private String playerName;

    /**
     * 地址
     */
    private String address;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 入选状态 0: 未入选  1: 入选 
     */
    private Integer selectedStatus;

    /**
     * 得奖 0:不得奖1：得奖
     */
    private Integer sortStatus;

    /**
     * 是否提交作品
     */
    private Integer submissionWorks;

    /**
     * 处理时间
     */
    private Date handleTime;

    /**
     * 处理人
     */
    private String handlePerson;

    /**
     * 处理人备注
     */
    private String remark;

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

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSelectedStatus() {
        return selectedStatus;
    }

    public void setSelectedStatus(Integer selectedStatus) {
        this.selectedStatus = selectedStatus;
    }

    public Integer getSortStatus() {
        return sortStatus;
    }

    public void setSortStatus(Integer sortStatus) {
        this.sortStatus = sortStatus;
    }

    public Integer getSubmissionWorks() {
        return submissionWorks;
    }

    public void setSubmissionWorks(Integer submissionWorks) {
        this.submissionWorks = submissionWorks;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getHandlePerson() {
        return handlePerson;
    }

    public void setHandlePerson(String handlePerson) {
        this.handlePerson = handlePerson;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "Join{" +
        "id=" + id +
        ", activityId=" + activityId +
        ", projectType=" + projectType +
        ", playerId=" + playerId +
        ", playerName=" + playerName +
        ", address=" + address +
        ", phone=" + phone +
        ", selectedStatus=" + selectedStatus +
        ", sortStatus=" + sortStatus +
        ", submissionWorks=" + submissionWorks +
        ", handleTime=" + handleTime +
        ", handlePerson=" + handlePerson +
        ", remark=" + remark +
        ", deptid=" + deptid +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", recordStatus=" + recordStatus +
        "}";
    }
}
