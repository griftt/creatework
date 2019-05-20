package com.griftt.biz.model.params;


import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 图文内容管理
 * </p>
 *
 * @author griftt
 * @since 2019-04-19
 */
@Data
public class GraphicParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * id
     */
    private Integer id;

    /**
     * 条目id
     */
    private Integer itemId;

    /**
     * 资料类型 1：晒物 2：众测 3：测评报告
     */
    private Integer contentType;

    /**
     * 图片
     */
    private String img;

    /**
     * 内容
     */
    private String content;

    /**
     * 发布人id
     */
    private Long pubId;

    /**
     * 状态
     */
    private Integer status;

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
