package com.griftt.biz.model.result;

import lombok.Data;

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
@Data
public class BannerResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * ID
     */
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
     * 商品ID
     */
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
    private Integer adminId;

    /**
     * 是否为首页轮播
     */
    private Integer isBanner;

    /**
     * 是否为视频
     */
    private Integer isVideo;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
