package com.griftt.biz.model.params;


import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 标签表 
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@Data
public class LabelParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */
    private Integer id;

    /**
     * 标签名称
     */
    private String labelName;

    /**
     * 是否展示，1：展示，0：不展示
     */
    private Integer isShow;

   /**
     * 图标
     */
    private String icon;

    /**
     * 排序权重
     */
    private Integer weigh;

    /**
     * 乐观锁
     */
    private Integer revision;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 记录状态 默认：0已删除、1：正常
     */
    private Integer recordStatus;

    @Override
    public String checkParam() {
        return null;
    }

}
