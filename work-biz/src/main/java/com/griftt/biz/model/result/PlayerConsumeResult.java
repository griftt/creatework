package com.griftt.biz.model.result;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName PlayerConsumeResult
 * @Description TODO
 * @Autor wushaohong
 * @Date 2019/3/28
 * @Version 1.0
 */
@Data

public class PlayerConsumeResult implements Serializable {

    private Integer id;
    private String userNo;
    private String userName ;
    //总金额
    private BigDecimal amount;
    //现金支付
    private BigDecimal payCashAmount;
    //积分抵扣的金额数
    private BigDecimal  payScoreAmount;

    private Integer  orderCount;
    private Integer shareUserCount;
    private Integer allScore;
    private Integer unUseScore;


}
