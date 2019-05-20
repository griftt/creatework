package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 标签商品关联 
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@TableName("sa_goods_label")
public class GoodsLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 标签id
     */
    private Integer labelId;

    /**
     * 乐观锁
     */
    private Integer revision;

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
     * 记录状态 默认：0已删除、1：正常
     */
    private Integer recordStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(Integer revision) {
        this.revision = revision;
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
        return "GoodsLabel{" +
        "id=" + id +
        ", goodsId=" + goodsId +
        ", labelId=" + labelId +
        ", revision=" + revision +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", recordStatus=" + recordStatus +
        "}";
    }
}
