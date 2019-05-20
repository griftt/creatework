package com.griftt.biz.model.result;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 商品规格
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@Data
public class GoodsSkuResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 规格名称
     */
    private String skuName;

    /**
     * 规格描述
     */
    private String skuDesc;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 成本
     */
    private BigDecimal cost;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 重量
     */
    private BigDecimal weight;

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
