package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 图文内容管理
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@TableName("sa_graphic")
public class Graphic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 条目id
     */
    private Integer itemId;

    /**
     * 资料类型 1：晒物 2：众测 3：测评报告
     */
    private Integer contentType;

    /**
     * 图片
     */
    private String img;

    /**
     * 内容
     */
    private String content;

    /**
     * 排序
     */
    private Integer weigh;

    /**
     * 发布人id
     */
    private Long pubId;

    /**
     * 状态
     */
    private Integer status;

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

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getPubId() {
        return pubId;
    }

    public void setPubId(Long pubId) {
        this.pubId = pubId;
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

    public Integer getWeigh() {
        return weigh;
    }

    public void setWeigh(Integer weigh) {
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return "Graphic{" +
        "id=" + id +
        ", itemId=" + itemId +
        ", contentType=" + contentType +
        ", img=" + img +
        ", content=" + content +
        ", pubId=" + pubId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", recordStatus=" + recordStatus +
        "}";
    }
}
