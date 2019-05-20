package com.griftt.biz.model.params;


import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 标签商品关联 
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@Data
public class GoodsLabelParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 标签id
     */
    private Integer labelId;

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
