package com.griftt.biz.model.params;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
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
public class OrderParam implements Serializable, BaseValidatingParam {

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

    private String userName;
    /**
     * 用户编号
     */
    private String userNo;
    /**
     * 订单总金额
     */
    private BigDecimal totalPrice;

    private BigDecimal totalGoodsPrice;
    private BigDecimal originalTotalGoodsPrice;

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
     * 发货人
     */
    private String handlePerson;

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

    /**
     * 支付编号
     */
    private String trxid;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getPayScore() {
        return payScore;
    }

    public void setPayScore(Integer payScore) {
        this.payScore = payScore;
    }

    public BigDecimal getPayScorePrice() {
        return payScorePrice;
    }

    public void setPayScorePrice(BigDecimal payScorePrice) {
        this.payScorePrice = payScorePrice;
    }

    public BigDecimal getShipFee() {
        return shipFee;
    }

    public void setShipFee(BigDecimal shipFee) {
        this.shipFee = shipFee;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getHandlePerson() {
        return handlePerson;
    }

    public void setHandlePerson(String handlePerson) {
        this.handlePerson = handlePerson;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverAddr() {
        return receiverAddr;
    }

    public void setReceiverAddr(String receiverAddr) {
        this.receiverAddr = receiverAddr;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getShipCompany() {
        return shipCompany;
    }

    public void setShipCompany(String shipCompany) {
        this.shipCompany = shipCompany;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getShipTime() {
        return shipTime;
    }

    public void setShipTime(Date shipTime) {
        this.shipTime = shipTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
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

    public String getTrxid() {
        return trxid;
    }

    public void setTrxid(String trxid) {
        this.trxid = trxid;
    }

    @Override
    public String checkParam() {
        return null;
    }

}
