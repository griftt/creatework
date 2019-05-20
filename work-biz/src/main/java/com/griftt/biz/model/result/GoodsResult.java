package com.griftt.biz.model.result;


import lombok.Data;

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
@Data
public class GoodsResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
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
    private String priceRange;

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
     * 部门id
     */
    private Integer deptid;

    /**
     * 1 - 上架；0 - 下架；
     */
    private Integer status;

    /**
     * 新增时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 记录状态
     */
    private Integer recordStatus;

}
