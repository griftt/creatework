package com.griftt.biz.model.vo;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;

/**
 * @author griftt
 * 存放拼接起来的标签
 */


@Data
public class ConcatLabel implements Serializable, BaseValidatingParam {

    /**
     * 存放标签名，且用英文逗号隔开
     */

    private String lableNameStr;
    /**
     * 存放标签id，且用逗号隔开
     */
    private String lableIdStr;


    @Override
    public String checkParam() {
        return null;
    }
}
