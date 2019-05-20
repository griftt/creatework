package com.griftt.biz.model.result;

import lombok.Data;

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
@Data
public class ActivityResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
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
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 记录状态
     */
    private Integer recordStatus;

}
