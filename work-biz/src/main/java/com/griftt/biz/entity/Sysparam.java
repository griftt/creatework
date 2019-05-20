package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统参数
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@TableName("sa_sysparam")
public class Sysparam implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 配置key
     */
    private String paramKey;

    /**
     * 配置value
     */
    private String paramValue;

    /**
     * 配置code
     */
    private String paramCode;

    /**
     * 类型
     */
    private String paramType;

    /**
     * 备注
     */
    private String paramRemark;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamCode() {
        return paramCode;
    }

    public void setParamCode(String paramCode) {
        this.paramCode = paramCode;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public String getParamRemark() {
        return paramRemark;
    }

    public void setParamRemark(String paramRemark) {
        this.paramRemark = paramRemark;
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
        return "Sysparam{" +
        "id=" + id +
        ", paramKey=" + paramKey +
        ", paramValue=" + paramValue +
        ", paramCode=" + paramCode +
        ", paramType=" + paramType +
        ", paramRemark=" + paramRemark +
        ", recordStatus=" + recordStatus +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
