package com.griftt.biz.model.result;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 系统消息 
 * </p>
 *
 * @author griftt
 * @since 2019-04-25
 */
@Data
public class MessageResult implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * ID
     */
    private Integer id;

    /**
     * 收信人id
     */
    private Integer receiverId;

    /**
     * 发信人id
     */
    private Integer senderId;

    /**
     * 消息标题
     */
    private String title;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 已读
     */
    private Integer isRead;

    /**
     * 阅读时间
     */
    private Date readTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 记录状态
     */
    private Integer recordStatus;

}
