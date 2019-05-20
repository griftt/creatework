package com.griftt.biz.model.params;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName OrderMoreParam
 * @Description TODO
 * @Autor wushaohong
 * @Date 2019/3/26
 * @Version 1.0
 */
@Data
public class OrderMoreParam implements Serializable, BaseValidatingParam {

    private String userName;
    private String totalPriceMin;
    private String totalPriceMax;
    private String payTimeMin;
    private String payTimeMax;
    private String userNo;
    private String payNo;



    @Override
    public String checkParam() {
        return null;
    }
}
