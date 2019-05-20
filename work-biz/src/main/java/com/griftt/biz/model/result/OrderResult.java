package com.griftt.biz.model.result;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单信息
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@Data
public class OrderResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 购买人ID
     */
    private Integer playerId;

    /**
     * 订单总金额
     */
    private BigDecimal totalPrice;

    /**
     * 支付现金
     */
    private BigDecimal payPrice;

    /**
     * 支付积分
     */
    private Integer payScore;

    /**
     * 积分抵扣金额
     */
    private BigDecimal payScorePrice;

    /**
     * 运费
     */
    private BigDecimal shipFee;

    /**
     * 收货人
     */
    private String receiverName;

    /**
     * 收货电话
     */
    private String receiverPhone;

    /**
     * 收货地址
     */
    private String receiverAddr;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 支付状态
     */
    private Integer payStatus;

    /**
     * 支付方式
     */
    private String payType;

    /**
     * 物流公司
     */
    private String shipCompany;

    /**
     * 物流单号
     */
    private String shipNo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 代理商id
     */
    private Integer agentId;

    /**
     * 部门id
     */
    private Integer deptid;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date shipTime;

    /**
     * 收货时间
     */
    private Date receiveTime;

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
