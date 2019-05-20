package com.griftt.biz.model.params;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 优惠券发放
 * </p>
 *
 * @author griftt
 * @since 2019-05-14
 */
@Data
public class DiscountReleaseParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 领取人id
     */
    private Integer playerId;

    /**
     * 优惠券id
     */
    private Integer discountId;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 使用状态
     */
    private Integer useStatus;

    /**
     * 使用时间
     */
    private Date useTime;

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
