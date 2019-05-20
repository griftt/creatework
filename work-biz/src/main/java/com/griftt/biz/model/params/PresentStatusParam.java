package com.griftt.biz.model.params;

import lombok.Data;

import java.io.Serializable;

@Data
public class PresentStatusParam  implements Serializable {

    private Integer id;

    /**
     * 标识(置顶/)
     */
    private Integer mark;

    /**
     * 状态（显示/屏蔽）
     */
    private Integer status;
    /**
     * 备注
     */
    private String content;
}
