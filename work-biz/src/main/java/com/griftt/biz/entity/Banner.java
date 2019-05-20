package com.griftt.biz.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * banner表
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@TableName("sa_banner")
public class Banner implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 副标题
     */
    private String subTitle;

    /**
     * 图片
     */
    private String image;

    /**
     * 富文本
     */
    private String content;

    /**
     * 链接
     */
    private String url;

    /**
     * 是否首页banner（1：社区首页,2:首页，0：无）BannerTypeEnum
     */
    @TableField("is_banner")
    private Integer isBanner;

    /**
     * 是否视频流
     */
    @TableField("is_video")
    private Integer isVideo;

    /**
     * 跳转的方向
     */
    @TableField("link_way")
    private Integer linkWay;

    /**
     * 商品ID
     */
    @TableField("goods_id")
    private Integer goodsId;

    /**
     * 排序
     */
    private Integer weigh;

    /**
     * 状态:1-显示,0-隐藏
     */
    private Boolean status;

    /**
     * 编辑人
     */
    @TableField("admin_id")
    private Integer adminId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getWeigh() {
        return weigh;
    }

    public void setWeigh(Integer weigh) {
        this.weigh = weigh;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getLinkWay() {
        return linkWay;
    }

    public void setLinkWay(Integer linkWay) {
        this.linkWay = linkWay;
    }

    public Integer getIsBanner() {
        return isBanner;
    }

    public void setIsBanner(Integer isBanner) {
        this.isBanner = isBanner;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Integer getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Integer isVideo) {
        this.isVideo = isVideo;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", sub_title='" + subTitle + '\'' +
                ", image='" + image + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", isBanner=" + isBanner +
                ", isVideo=" + isVideo +
                ", linkWay=" + linkWay +
                ", goodsId=" + goodsId +
                ", weigh=" + weigh +
                ", status=" + status +
                ", adminId=" + adminId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
