package com.griftt.biz.model.params;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 支付账单
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@Data
public class PaymentParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 购买人ID
     */
    private Integer playerId;

    /**
     * 支付方式
     */
    private String payType;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 微信支付订单号
     */
    private String transactionId;

    /**
     * 微信支付交易号
     */
    private String trxid;

    /**
     * 附加数据-唯一
     */
    private String attach;

    /**
     * 微信生成的预支付会话标识
     */
    private String prepayId;

    /**
     * 支付时间
     */
    private Date payTime;
    /**
     * 支付金额
     */
    private BigDecimal amount;
    /**
     * 支付状态
     */
    private Integer payStatus;

    /**
     * 部门id
     */
    private Integer deptid;

    /**
     * 微信支付的时间戳
     */
    private String timeStamp;

    /**
     * 微信支付的随机字符串
     */
    private String nonceStr;

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


    private String orderNo;

    private String nickname;

    /**
     *
     * @return
     */

    @Override
    public String checkParam() {
        return null;
    }

}
