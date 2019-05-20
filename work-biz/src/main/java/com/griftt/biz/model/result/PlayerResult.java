package com.griftt.biz.model.result;

import lombok.Data;

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
@Data
public class PlayerResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
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
    private Integer sex;

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
