package com.griftt.biz.model.params;

import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户名单
 * </p>
 *
 * @author griftt
 * @since 2019-05-10
 */
@Data
public class JoinParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    private Integer id;

    /**
     * 活动众测id
     */
    private Integer activityId;

    /**
     * 类型
     */
    private Integer projectType;

    /**
     * 用户id
     */
    private Integer playerId;

    /**
     * 用户名
     */
    private String playerName;

    /**
     * 地址
     */
    private String address;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 入选状态 0: 未入选  1: 入选 
     */
    private Integer selectedStatus;

    /**
     * 得奖 0:不得奖1：得奖
     */
    private Integer sortStatus;

    /**
     * 是否提交作品
     */
    private String submissionWorks;

    /**
     * 处理时间
     */
    private Date handleTime;

    /**
     * 处理人
     */
    private String handlePerson;

    /**
     * 处理人备注
     */
    private String remark;

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

    @Override
    public String checkParam() {
        return null;
    }

}
