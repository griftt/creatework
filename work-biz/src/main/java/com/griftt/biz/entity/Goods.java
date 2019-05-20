package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 商品信息
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@TableName("sa_goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品编号
     */
    private String goodsNo;

    /**
     * 商品中文名
     */
    private String name;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品主图
     */
    private String headpic;

    /**
     * 批次号
     */
    private String batchNo;

    /**
     * 图文详情
     */
    private String description;

    /**
     * 排序权重
     */
    private Integer weigh;

    /**
     * 使用说明内容id
     */
    private Integer instructionsId;

    /**
     * 溯源内容id
     */
    private Integer traceabilityId;

    /**
     * 微信公众号内容id
     */
    private Integer weixinId;

    /**
     * 运费
     */
    private BigDecimal shipFee;
    /**
     * 价格范围
     */
    private String priceRange;

    /**
     * 部门id
     */
    private Integer deptid;

    /**
     * 1 - 上架；0 - 下架；
     */
    private Integer status;

    /**
     * 热销商品
     */
    @TableField("product_hot")
    private Integer productHot;

    /**
     * 新品
     */
    @TableField("product_new")
    private Integer productNew;

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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWeigh() {
        return weigh;
    }

    public void setWeigh(Integer weigh) {
        this.weigh = weigh;
    }

    public Integer getInstructionsId() {
        return instructionsId;
    }

    public void setInstructionsId(Integer instructionsId) {
        this.instructionsId = instructionsId;
    }

    public Integer getTraceabilityId() {
        return traceabilityId;
    }

    public void setTraceabilityId(Integer traceabilityId) {
        this.traceabilityId = traceabilityId;
    }

    public Integer getWeixinId() {
        return weixinId;
    }

    public void setWeixinId(Integer weixinId) {
        this.weixinId = weixinId;
    }

    public BigDecimal getShipFee() {
        return shipFee;
    }

    public void setShipFee(BigDecimal shipFee) {
        this.shipFee = shipFee;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public Integer getProductHot() {
        return productHot;
    }

    public void setProductHot(Integer productHot) {
        this.productHot = productHot;
    }

    public Integer getProductNew() {
        return productNew;
    }

    public void setProductNew(Integer productNew) {
        this.productNew = productNew;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsNo='" + goodsNo + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", headpic='" + headpic + '\'' +
                ", batchNo='" + batchNo + '\'' +
                ", description='" + description + '\'' +
                ", weigh=" + weigh +
                ", instructionsId=" + instructionsId +
                ", traceabilityId=" + traceabilityId +
                ", weixinId=" + weixinId +
                ", shipFee=" + shipFee +
                ", priceRange='" + priceRange + '\'' +
                ", deptid=" + deptid +
                ", status=" + status +
                ", productHot=" + productHot +
                ", productNew=" + productNew +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", recordStatus=" + recordStatus +
                '}';
    }
}
