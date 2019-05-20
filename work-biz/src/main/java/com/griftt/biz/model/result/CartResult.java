package com.griftt.biz.model.result;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 购物车
 * </p>
 *
 * @author
 * @since 2019-04-02
 */
@Data
public class CartResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 商品中文名
     */
    private String name;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * Skuid
     */
    private Integer skuId;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 规格名称
     */
    private String skuName;

    /**
     * 商品购买数量
     */
    private Integer count;

    /**
     * 购买用户id
     */
    private Integer playerId;

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
