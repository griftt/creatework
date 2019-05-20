package com.griftt.biz.model.params;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName OrderShipParam
 * @Description TODO
 * @Autor wushaohong
 * @Date 2019/3/27
 * @Version 1.0
 */
@Data
public class OrderShipParam implements Serializable, BaseValidatingParam {

    private Integer id;
    /**
     * 收货人
     */
    private String receiverName;
    /**
     * 发货人
     */
    private String handlePerson;
    private BigDecimal totalGoodsPrice;
    private BigDecimal shipFee;
    private BigDecimal originalTotalGoodsPrice;

    private BigDecimal totalPrice;

    /**
     * 收货电话
     */
    private String receiverPhone;

    /**
     * 收货地址
     */
    private String receiverAddr;

    /**
     * 订单状态
     */
    private Integer orderStatus;



    /**
     * 物流公司
     */
    private String shipCompany;

    /**
     * 物流单号
     */
    private String shipNo;

    /**
     * 备注
     */
    private String remark;



    @Override
    public String checkParam() {
        return null;
    }
}
