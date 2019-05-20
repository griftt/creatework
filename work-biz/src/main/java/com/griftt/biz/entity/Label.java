package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 标签表 
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@TableName("sa_label")
public class Label implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标签名称
     */
    private String labelName;

    /**
     * 图标
     */
    private String icon;

    /**
     * 是否展示，1：展示，0：不展示
     */
    private Integer isShow;

    /**
     * 排序权重
     */
    private Integer weigh;

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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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

    public Integer getWeigh() {
        return weigh;
    }

    public void setWeigh(Integer weigh) {
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return "Label{" +
                "id=" + id +
                ", labelName='" + labelName + '\'' +
                ", icon='" + icon + '\'' +
                ", revision=" + revision +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", recordStatus=" + recordStatus +
                '}';
    }
}
