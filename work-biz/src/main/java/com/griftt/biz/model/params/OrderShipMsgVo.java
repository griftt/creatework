package com.griftt.biz.model.params;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;

@Data
public class OrderShipMsgVo implements Serializable, BaseValidatingParam {

    private String time;
    private String status;

    @Override
    public String checkParam() {
        return null;
    }
}
