package com.griftt.biz.model.result;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统参数
 * </p>
 *
 * @author griftt
 * @since 2019-03-06
 */
@Data
public class SysparamResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Long id;

    /**
     * 配置key
     */
    private String paramKey;

    /**
     * 配置value
     */
    private String paramValue;

    /**
     * 配置code
     */
    private String paramCode;

    /**
     * 类型
     */
    private String paramType;

    /**
     * 备注
     */
    private String paramRemark;

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
