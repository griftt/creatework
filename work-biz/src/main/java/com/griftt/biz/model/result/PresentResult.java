package com.griftt.biz.model.result;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户晒物
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@Data
public class PresentResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer goodsId;
    /**
     * 商品名
     */
    private String goodsName;
    /**
     * 获取商品编号
     */
    private String goodsNo;


    /**
     * 用户id
     */
    private Integer playerId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 内容
     */
    private String text;

    /**
     * 浏览量
     */
    private Integer watch;

    /**
     * 点赞数
     */
    private Integer praise;

    /**
     * 标识(置顶/)
     */
    private Integer mark;

    /**
     * 状态（显示/屏蔽）
     */
    private Integer status;

    /**
     * 下线时间
     */
    private Date offlineTime;

    /**
     * 处理人
     */
    private Long handlePerson;

    /**
     * 备注
     */
    private String content;

    /**
     * 处理时间
     */
    private Date handleTime;

    /**
     * 部门id
     */
    private Integer deptid;

    /**
     * 新增时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 记录状态
     */
    private Integer recordStatus;

}
