package com.griftt.biz.model.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName ScoreCountResult
 * @Description TODO
 * @Autor wushaohong
 * @Date 2019/4/2
 * @Version 1.0
 */
@Data
public class ScoreCountResult implements Serializable {
    private Integer allScore=0;
    private Integer consumeScore=0;
    private Integer unUseScore=0;

}
