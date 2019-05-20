package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 优惠券
 * </p>
 *
 * @author griftt
 * @since 2019-05-14
 */
@TableName("sa_discount")
public class Discount implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类型
     */
    private String type;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 将发放总数
     */
    private Integer amountTotal;

    /**
     * 已发放总数
     */
    private Integer amountOut;

    /**
     * 每人限领
     */
    private Integer amountPer;

    /**
     * 使用期限(天数)
     */
    private Integer termDay;

    /**
     * 满减金额
     */
    private BigDecimal leastPrice;

    /**
     * 优惠金额
     */
    private BigDecimal discountPrice;

    /**
     * 生效时间
     */
    private Date effectiveTime;

    /**
     * 过期时间
     */
    private Date expireTime;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(Integer amountTotal) {
        this.amountTotal = amountTotal;
    }

    public Integer getAmountOut() {
        return amountOut;
    }

    public void setAmountOut(Integer amountOut) {
        this.amountOut = amountOut;
    }

    public Integer getAmountPer() {
        return amountPer;
    }

    public void setAmountPer(Integer amountPer) {
        this.amountPer = amountPer;
    }

    public Integer getTermDay() {
        return termDay;
    }

    public void setTermDay(Integer termDay) {
        this.termDay = termDay;
    }

    public BigDecimal getLeastPrice() {
        return leastPrice;
    }

    public void setLeastPrice(BigDecimal leastPrice) {
        this.leastPrice = leastPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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
        return "Discount{" +
        "id=" + id +
        ", type=" + type +
        ", name=" + name +
        ", description=" + description +
        ", amountTotal=" + amountTotal +
        ", amountOut=" + amountOut +
        ", amountPer=" + amountPer +
        ", termDay=" + termDay +
        ", leastPrice=" + leastPrice +
        ", discountPrice=" + discountPrice +
        ", effectiveTime=" + effectiveTime +
        ", expireTime=" + expireTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", recordStatus=" + recordStatus +
        "}";
    }
}
