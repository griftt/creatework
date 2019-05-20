package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 支付账单
 * </p>
 *
 * @author hyf
 * @since 2019-03-21
 */
@TableName("sa_payment")
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 购买人ID
     */
    private Integer playerId;

    /**
     * 唯一字符id unique_id
     */
    private String uniqueId;

    /**
     * 支付方式
     */
    private String payType;

    /**
     * 支付方式  1：公众号h5，2： 微信小程序
     */
    private int payMethod;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 应用ID
     */
    private String appid;

    /**
     * 收银宝平台的交易流水号
     */
    private String trxid;

    /**
     * 微信支付订单号
     */
    private String transactionId;

    /**
     * 附加数据-唯一
     */
    private String attach;

    /**
     * 微信生成的预支付会话标识
     */
    private String prepayId;

    /**
     * 微信支付串
     */
    private String payinfo;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付状态
     */
    private Integer payStatus;

    /**
     * 部门id
     */
    private Integer deptid;


    /**
     * 订单金额金钱
     */
    private BigDecimal orderPayPrice;

    /**
     * 实际支付金钱
     */
    private BigDecimal amount;

    /**
     * 微信支付的时间戳
     */
    private String timeStamp;

    /**
     * 微信支付的随机字符串
     */
    private String nonceStr;

    /**
     * sign
     */
    private String sign;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
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

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getTrxid() {
        return trxid;
    }

    public void setTrxid(String trxid) {
        this.trxid = trxid;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getPayinfo() {
        return payinfo;
    }

    public void setPayinfo(String payinfo) {
        this.payinfo = payinfo;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(int payMethod) {
        this.payMethod = payMethod;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public BigDecimal getOrderPayPrice() {
        return orderPayPrice;
    }

    public void setOrderPayPrice(BigDecimal orderPayPrice) {
        this.orderPayPrice = orderPayPrice;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", playerId=" + playerId +
                ", uniqueId='" + uniqueId + '\'' +
                ", payType='" + payType + '\'' +
                ", payMethod=" + payMethod +
                ", orderId=" + orderId +
                ", appid='" + appid + '\'' +
                ", trxid='" + trxid + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", attach='" + attach + '\'' +
                ", prepayId='" + prepayId + '\'' +
                ", payinfo='" + payinfo + '\'' +
                ", payTime=" + payTime +
                ", payStatus=" + payStatus +
                ", deptid=" + deptid +
                ", orderPayPrice=" + orderPayPrice +
                ", amount=" + amount +
                ", timeStamp='" + timeStamp + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                ", sign='" + sign + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", recordStatus=" + recordStatus +
                '}';
    }
}