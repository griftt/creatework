package com.griftt.biz.model.params;


import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 通知
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@Data
public class UserMsgParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer playerId;

    /**
     * 项目id
     */
    private Integer itemId;

    /**
     * 项目类型 1：晒物 2：众测 3：活动
     */
    private Integer itemType;

    /**
     * 模块 1：社区
     */
    private Integer module;

    /**
     * 状态 0:未读  1：已读
     */
    private Integer noticeStatus;

    /**
     * 新增时间
     */
    private Date createTime;

    /**
     * 部门id
     */
    private Integer deptid;

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
