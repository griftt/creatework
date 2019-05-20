package com.griftt.biz.model.params;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 二维码
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@Data
public class QrcodeParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 编号
     */
    private String qrcode;

    /**
     * 二维码URL
     */
    private String url;

    /**
     * 备注
     */
    private String remark;

    /**
     * 代理商id
     */
    private Integer agentId;

    private String goodsNo;
    private Integer goodsId;
    /**
     * 扫码次数
     */
    private Integer scanNum;

    /**
     * 状态
     */
    private Integer recordStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    @Override
    public String checkParam() {
        return null;
    }

}
