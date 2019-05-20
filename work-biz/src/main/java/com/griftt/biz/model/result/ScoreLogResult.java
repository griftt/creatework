package com.griftt.biz.model.result;

import lombok.Data;

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
@Data
public class ScoreLogResult implements Serializable {

    private static final long serialVersionUID = 1L;


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
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 记录状态:1-正常；0-删除；
     */
    private Integer recordStatus;

}
