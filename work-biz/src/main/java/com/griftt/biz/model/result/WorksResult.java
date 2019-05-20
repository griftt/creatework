package com.griftt.biz.model.result;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 参与作品
 * </p>
 *
 * @author hyf
 * @since 2019-04-27
 */
@Data
public class WorksResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 活动众测id
     */
    private Integer activityId;

    /**
     * 类型：众测1，活动2
     */
    private Integer projectType;

    /**
     * 用户id
     */
    private Integer playerId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户名称
     */
    private String headPic;

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
     * 状态 1 ：等待 2：发布 3：拒绝 4 下线
     */
    private Integer status;
    /**
     * 名次
     */
    private Integer sort;


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
