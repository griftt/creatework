package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 二维码
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@TableName("sa_qrcode")
public class Qrcode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 编号
     */
    private String qrcode;

    /**
     * 二维码URL
     */
    private String url;

    private String goodsNo;

    private Integer goodsId;


    /**
     * 备注
     */
    private String remark;

    /**
     * 代理商id
     */
    private Integer agentId;

    /**
     * 扫码次数
     */
    private Integer scanNum;

    /**
     * 状态
     */
    private Integer recordStatus;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Integer getScanNum() {
        return scanNum;
    }

    public void setScanNum(Integer scanNum) {
        this.scanNum = scanNum;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
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

    @Override
    public String toString() {
        return "Qrcode{" +
        "id=" + id +
        ", qrcode=" + qrcode +
        ", url=" + url +
        ", remark=" + remark +
        ", agentId=" + agentId +
        ", scanNum=" + scanNum +
        ", recordStatus=" + recordStatus +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
