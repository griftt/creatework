package com.griftt.biz.model.params;


import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 评论
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@Data
public class CommentParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 评论类型
     */
    private Integer commentType;



    /**
     * 主题内容的id
     */
    private Integer item;

    /**
     * 主题内容发布人
     */
    private Integer belong;

    /**
     * 评论人
     */
    private Integer commentId;

    /**
     * 被回复人id
     */
    private Integer beReplyId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 标识 （精品，置顶）
     */
    private Integer mark;

    /**
     * 点赞数
     */
    private Integer praise;

    /**
     * 管理员
     */
    private Long handlePerson;

    /**
     * 状态 1：显示 ,0 ：隐藏
     */
    private Integer status;

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

    private String userName;

    private String userNo;

    private String createTimeMin;
    private String createTimeMax;

    @Override
    public String checkParam() {
        return null;
    }

}
