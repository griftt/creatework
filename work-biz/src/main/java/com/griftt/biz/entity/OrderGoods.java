package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单商品
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@TableName("sa_order_goods")
public class OrderGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 商品主图
     */
    private String goodsHeadpic;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 规格id
     */
    private Integer skuId;

    /**
     * 规格名称
     */
    private String skuName;

    /**
     * 规格图片
     */
    private String skuPic;
    /**
     * 商品数量
     */
    private Integer skuCount;

    /**
     * 商品价格
     */
    private BigDecimal skuPrice;

    /**
     * 商品总价格
     */
    private BigDecimal skuTotalPrice;

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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsHeadpic() {
        return goodsHeadpic;
    }

    public void setGoodsHeadpic(String goodsHeadpic) {
        this.goodsHeadpic = goodsHeadpic;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public BigDecimal getSkuTotalPrice() {
        return skuTotalPrice;
    }

    public void setSkuTotalPrice(BigDecimal skuTotalPrice) {
        this.skuTotalPrice = skuTotalPrice;
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

    public String getSkuPic() {
        return skuPic;
    }

    public void setSkuPic(String skuPic) {
        this.skuPic = skuPic;
    }

    @Override
    public String toString() {
        return "OrderGoods{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", goodsId=" + goodsId +
                ", goodsHeadpic='" + goodsHeadpic + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", skuId=" + skuId +
                ", skuName='" + skuName + '\'' +
                ", skuPic='" + skuPic + '\'' +
                ", skuCount=" + skuCount +
                ", skuPrice=" + skuPrice +
                ", skuTotalPrice=" + skuTotalPrice +
                ", deptid=" + deptid +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", recordStatus=" + recordStatus +
                '}';
    }
}
