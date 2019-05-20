package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 众测与活动
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@TableName("sa_activity")
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 项目类型 1：众测 2：活动
     */
    private Integer type;

    /**
     * 内容
     */
    private String content;

    /**
     * 商品id
     */
    private Integer goodsId;
    /**
     * 标识
     */
    private Integer mark;

    /**
     * 活动名称
     */
    private String title;

    /**
     * 发布人id
     */
    private Long adminId;

    /**
     * 奖励方式
     */
    private String rewardWay;

    /**
     * 申请方式
     */
    private String applyWay;

    /**
     * 最大参与人数
     */
    private Integer maxAttendCount;

    /**
     * 最大报名人数
     */
    private Integer maxApplicantsCount;
    /**
     * 产品数量
     */
    private Integer amount;

    /**
     * 已报名人数
     */
    private Integer alreadyApplicationsCount;


    /**
     * 最终参与人数
     */
    private Integer finalAttendCount;

    /**
     * 申请方式的开关
     */
    private Integer swParticipationWay;

    /**
     * 奖励名单的开关
     */
    private Integer swRewardList;

    /**
     * 测评报告的开关
     */
    private Integer swReport;

    /**
     * 试用名单的开关
     */
    private Integer swTestList;

    /**
     * 点赞数
     */
    private Integer praise;

    /**
     * 浏览量
     */
    private Integer watch;

    /**
     * 状态 1：待审核 2： 报名中 3:截止报名 4：投稿中 5：活动结束 6：不通过
     */
    private Integer status;

    /**
     * 开始报名时间
     */
    private Date beginApplyTime;

    /**
     * 结束报名时间
     */
    private Date endApplyTime;

    /**
     * 开始投稿时间
     */
    private Date beginSubmissionTime;

    /**
     * 结束投稿时间
     */
    private Date endSubmissionTime;

    /**
     * 活动结束时间
     */
    private Date activityEndTime;

    /**
     * 活动下线时间
     */
    private Date offlineTime;

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

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getRewardWay() {
        return rewardWay;
    }

    public void setRewardWay(String rewardWay) {
        this.rewardWay = rewardWay;
    }

    public String getApplyWay() {
        return applyWay;
    }

    public void setApplyWay(String applyWay) {
        this.applyWay = applyWay;
    }

    public Integer getMaxAttendCount() {
        return maxAttendCount;
    }

    public void setMaxAttendCount(Integer maxAttendCount) {
        this.maxAttendCount = maxAttendCount;
    }

    public Integer getMaxApplicantsCount() {
        return maxApplicantsCount;
    }

    public void setMaxApplicantsCount(Integer maxApplicantsCount) {
        this.maxApplicantsCount = maxApplicantsCount;
    }

    public Integer getAlreadyApplicationsCount() {
        return alreadyApplicationsCount;
    }

    public void setAlreadyApplicationsCount(Integer alreadyApplicationsCount) {
        this.alreadyApplicationsCount = alreadyApplicationsCount;
    }

    public Integer getFinalAttendCount() {
        return finalAttendCount;
    }

    public void setFinalAttendCount(Integer finalAttendCount) {
        this.finalAttendCount = finalAttendCount;
    }

    public Integer getSwParticipationWay() {
        return swParticipationWay;
    }

    public void setSwParticipationWay(Integer swParticipationWay) {
        this.swParticipationWay = swParticipationWay;
    }

    public Integer getSwRewardList() {
        return swRewardList;
    }

    public void setSwRewardList(Integer swRewardList) {
        this.swRewardList = swRewardList;
    }

    public Integer getSwReport() {
        return swReport;
    }

    public void setSwReport(Integer swReport) {
        this.swReport = swReport;
    }

    public Integer getSwTestList() {
        return swTestList;
    }

    public void setSwTestList(Integer swTestList) {
        this.swTestList = swTestList;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public Integer getWatch() {
        return watch;
    }

    public void setWatch(Integer watch) {
        this.watch = watch;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getBeginApplyTime() {
        return beginApplyTime;
    }

    public void setBeginApplyTime(Date beginApplyTime) {
        this.beginApplyTime = beginApplyTime;
    }

    public Date getEndApplyTime() {
        return endApplyTime;
    }

    public void setEndApplyTime(Date endApplyTime) {
        this.endApplyTime = endApplyTime;
    }

    public Date getBeginSubmissionTime() {
        return beginSubmissionTime;
    }

    public void setBeginSubmissionTime(Date beginSubmissionTime) {
        this.beginSubmissionTime = beginSubmissionTime;
    }

    public Date getEndSubmissionTime() {
        return endSubmissionTime;
    }

    public void setEndSubmissionTime(Date endSubmissionTime) {
        this.endSubmissionTime = endSubmissionTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
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
        return "Activity{" +
                "id=" + id +
                ", type=" + type +
                ", content='" + content + '\'' +
                ", goodsId=" + goodsId +
                ", mark=" + mark +
                ", title='" + title + '\'' +
                ", adminId=" + adminId +
                ", rewardWay='" + rewardWay + '\'' +
                ", applyWay='" + applyWay + '\'' +
                ", maxAttendCount=" + maxAttendCount +
                ", maxApplicantsCount=" + maxApplicantsCount +
                ", amount=" + amount +
                ", alreadyApplicationsCount=" + alreadyApplicationsCount +
                ", finalAttendCount=" + finalAttendCount +
                ", swParticipationWay=" + swParticipationWay +
                ", swRewardList=" + swRewardList +
                ", swReport=" + swReport +
                ", swTestList=" + swTestList +
                ", praise=" + praise +
                ", watch=" + watch +
                ", status=" + status +
                ", beginApplyTime=" + beginApplyTime +
                ", endApplyTime=" + endApplyTime +
                ", beginSubmissionTime=" + beginSubmissionTime +
                ", endSubmissionTime=" + endSubmissionTime +
                ", activityEndTime=" + activityEndTime +
                ", offlineTime=" + offlineTime +
                ", deptid=" + deptid +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", recordStatus=" + recordStatus +
                '}';
    }
}
