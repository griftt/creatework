package com.griftt.biz.model.result;

import lombok.Data;

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
@Data
public class OrderGoodsResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
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
