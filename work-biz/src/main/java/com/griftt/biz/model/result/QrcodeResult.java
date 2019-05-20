package com.griftt.biz.model.result;

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
public class QrcodeResult implements Serializable {

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

}
