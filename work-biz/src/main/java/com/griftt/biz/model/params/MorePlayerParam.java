package com.griftt.biz.model.params;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName MorePlayerParam
 * @Description TODO
 * @Autor wushaohong
 * @Date 2019/3/28
 * @Version 1.0
 */
@Data
public class MorePlayerParam implements Serializable, BaseValidatingParam {

    private String introNickname;
    private String introUserNo;
    private String createTimeMin;
    private String createTimeMax;

    /**
     * 用户消费统计
     */
    private Integer id;
    private String userName;
    private String userNo;
    private BigDecimal amountMin;
    private BigDecimal amountMax;
    private Integer introCountMin;
    private Integer introCountMax;
    private Integer OrderMin;
    private Integer OrderMax;
    private Integer allScoreMin;
    private Integer allScoreMax;
    private Integer unUseScoreMin;
    private Integer unUseScoreMax;





    @Override
    public String checkParam() {
        return null;
    }
}
