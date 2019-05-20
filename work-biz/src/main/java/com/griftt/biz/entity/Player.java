package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 会员用户
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@TableName("sa_player")
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户编号
     */
    private String userNo;

    /**
     * 微信别名
     */
    private String nickname;

    /**
     * 头像
     */
    private String userhead;

    /**
     * OPENID
     */
    private String openid;

    /**
     * mini_openid
     */
    private String miniOpenid;

    /**
     * uid
     */
    private String unionid;

    /**
     * 电话
     */
    private String phone;

    /**
     * 二维码入口
     */
    private String qrcode;

    /**
     * 积分
     */
    private Integer score;

    /**
     * 历史总获得积分
     */
    private Integer historyTotalScore;

    /**
     * 性别
     */
    private Integer sex = 0;

    /**
     * 是否产生第一次购买    1 - 是；0 - 否
     */
    private Integer fistBuy;

    /**
     * 1 - 有效；0 - 无效；2-冻结
     */
    private Integer status;

    /**
     * 部门id
     */
    private Integer deptid;

    /**
     * 代理商id
     */
    private Integer agentId;

    /**
     * 推荐人id
     */
    private Integer introducerId;


    /**
     *众测参与次数
     */
    private Integer testAttendCount;
    /**
     * 入选次数
     */
    private Integer selectedCount;

    /**
     *报告上传数
     */
    private Integer uploadReportCount;

    /**
     *活动参与次数
     */
    private Integer activityAttendCount;

    /**
     * 最后登录时间
     */
    private Date lastLogin;

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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getTestAttendCount() {
        return testAttendCount;
    }

    public void setTestAttendCount(Integer testAttendCount) {
        this.testAttendCount = testAttendCount;
    }

    public Integer getSelectedCount() {
        return selectedCount;
    }

    public void setSelectedCount(Integer selectedCount) {
        this.selectedCount = selectedCount;
    }

    public Integer getUploadReportCount() {
        return uploadReportCount;
    }

    public void setUploadReportCount(Integer uploadReportCount) {
        this.uploadReportCount = uploadReportCount;
    }

    public Integer getActivityAttendCount() {
        return activityAttendCount;
    }

    public void setActivityAttendCount(Integer activityAttendCount) {
        this.activityAttendCount = activityAttendCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserhead() {
        return userhead;
    }

    public void setUserhead(String userhead) {
        this.userhead = userhead;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getHistoryTotalScore() {
        return historyTotalScore;
    }

    public void setHistoryTotalScore(Integer historyTotalScore) {
        this.historyTotalScore = historyTotalScore;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getIntroducerId() {
        return introducerId;
    }

    public void setIntroducerId(Integer introducerId) {
        this.introducerId = introducerId;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
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

    public String getMiniOpenid() {
        return miniOpenid;
    }

    public void setMiniOpenid(String miniOpenid) {
        this.miniOpenid = miniOpenid;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public Integer getFistBuy() {
        return fistBuy;
    }

    public void setFistBuy(Integer fistBuy) {
        this.fistBuy = fistBuy;
    }

    public String phoneDesensitization() {
        if (StringUtils.isNotBlank(this.phone)) {
            return this.phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", userNo='" + userNo + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userhead='" + userhead + '\'' +
                ", openid='" + openid + '\'' +
                ", miniOpenid='" + miniOpenid + '\'' +
                ", unionid='" + unionid + '\'' +
                ", phone='" + phone + '\'' +
                ", qrcode='" + qrcode + '\'' +
                ", score=" + score +
                ", historyTotalScore=" + historyTotalScore +
                ", sex=" + sex +
                ", fistBuy=" + fistBuy +
                ", status=" + status +
                ", deptid=" + deptid +
                ", agentId=" + agentId +
                ", introducerId=" + introducerId +
                ", testAttendCount=" + testAttendCount +
                ", selectedCount=" + selectedCount +
                ", uploadReportCount=" + uploadReportCount +
                ", activityAttendCount=" + activityAttendCount +
                ", lastLogin=" + lastLogin +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", recordStatus=" + recordStatus +
                '}';
    }
}
