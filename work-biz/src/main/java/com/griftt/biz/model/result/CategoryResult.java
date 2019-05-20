package com.griftt.biz.model.result;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 商品分类表 
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@Data
public class CategoryResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */
    private Integer id;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 图标
     */
    private String icon;

    /**
     * 分类排序 从1开始
     */
    private String weights;

    /**
     * 级别 一级分类1，二级分类2
     */
    private Integer level;

    /**
     * 上级id 父级id，一级分类为0
     */
    private Integer parentId;

    /**
     * 首页展示
     */
    private Integer isImportant;


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

}
