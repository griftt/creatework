package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

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
@TableName("sa_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
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
     * 订单商品总金额
     */
    private BigDecimal totalGoodsPrice;


    /**
     * 原始订单商品总金额  original_total_goods_price
     */
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
     * 收货电话
     */
    private String receiverPhone;

    /**
     * 收货地址
     */
    private String receiverAddr;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品主图
     */
    private String headpic;

    /**
     * Sku组装信息
     */
    private String skus;

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
     * 物流新增信息
     */
    private String shipDeliveryStatus;
    private String shipMsg;
    private String shipInfo;
    private Date shipQueryTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 二维码
     */
    private String qrcode;

    /**
     * 代理商id
     */
    private Integer agentId;

    /**
     * 部门id
     */
    private Integer deptid;

    /**
     * 过期时间
     */
    private Date expireDate;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date shipTime;

    private String handlePerson;

    /**
     * 收货时间
     */
    private Date receiveTime;

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
     * 记录状态 0- 删除 1- 正常 2- 前端不显示
     */
    private Integer recordStatus;

    public String getShipMsg() {
        return shipMsg;
    }

    public void setShipMsg(String shipMsg) {
        this.shipMsg = shipMsg;
    }

    public String getShipDeliveryStatus() {
        return shipDeliveryStatus;
    }

    public void setShipDeliveryStatus(String shipDeliveryStatus) {
        this.shipDeliveryStatus = shipDeliveryStatus;
    }

    public String getShipInfo() {
        return shipInfo;
    }

    public void setShipInfo(String shipInfo) {
        this.shipInfo = shipInfo;
    }

    public Date getShipQueryTime() {
        return shipQueryTime;
    }

    public void setShipQueryTime(Date shipQueryTime) {
        this.shipQueryTime = shipQueryTime;
    }

    public BigDecimal getOriginalTotalGoodsPrice() {
        return originalTotalGoodsPrice;
    }

    public void setOriginalTotalGoodsPrice(BigDecimal originalTotalGoodsPrice) {
        this.originalTotalGoodsPrice = originalTotalGoodsPrice;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getHandlePerson() {
        return handlePerson;
    }

    public void setHandlePerson(String handlePerson) {
        this.handlePerson = handlePerson;
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

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public String getSkus() {
        return skus;
    }

    public void setSkus(String skus) {
        this.skus = skus;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public BigDecimal getTotalGoodsPrice() {
        return totalGoodsPrice;
    }

    public void setTotalGoodsPrice(BigDecimal totalGoodsPrice) {
        this.totalGoodsPrice = totalGoodsPrice;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", playerId=" + playerId +
                ", totalPrice=" + totalPrice +
                ", totalGoodsPrice=" + totalGoodsPrice +
                ", originalTotalGoodsPrice=" + originalTotalGoodsPrice +
                ", payPrice=" + payPrice +
                ", payScore=" + payScore +
                ", payScorePrice=" + payScorePrice +
                ", shipFee=" + shipFee +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", receiverAddr='" + receiverAddr + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", headpic='" + headpic + '\'' +
                ", skus='" + skus + '\'' +
                ", orderStatus=" + orderStatus +
                ", payStatus=" + payStatus +
                ", payType='" + payType + '\'' +
                ", shipCompany='" + shipCompany + '\'' +
                ", shipNo='" + shipNo + '\'' +
                ", shipDeliveryStatus='" + shipDeliveryStatus + '\'' +
                ", shipMsg='" + shipMsg + '\'' +
                ", shipInfo='" + shipInfo + '\'' +
                ", shipQueryTime=" + shipQueryTime +
                ", remark='" + remark + '\'' +
                ", qrcode='" + qrcode + '\'' +
                ", agentId=" + agentId +
                ", deptid=" + deptid +
                ", expireDate=" + expireDate +
                ", payTime=" + payTime +
                ", shipTime=" + shipTime +
                ", handlePerson='" + handlePerson + '\'' +
                ", receiveTime=" + receiveTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", recordStatus=" + recordStatus +
                '}';
    }
}
