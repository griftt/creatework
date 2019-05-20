package com.griftt.biz.model.params;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 优惠券
 * </p>
 *
 * @author griftt
 * @since 2019-05-14
 */
@Data
public class DiscountParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 类型
     */
    private String type;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 将发放总数
     */
    private Integer amountTotal;

    /**
     * 已发放总数
     */
    private Integer amountOut;

    /**
     * 每人限领
     */
    private Integer amountPer;

    /**
     * 使用期限(天数)
     */
    private Integer termDay;

    /**
     * 满减金额
     */
    private BigDecimal leastPrice;

    /**
     * 优惠金额
     */
    private BigDecimal discountPrice;

    /**
     * 生效时间
     */
    private Date effectiveTime;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 记录状态
     */
    private Integer recordStatus;

    @Override
    public String checkParam() {
        return null;
    }

}
