package com.griftt.biz.model.result;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName PlayerSpreadResult 用户推广统计
 * @Description TODO
 * @Autor wushaohong
 * @Date 2019/4/1
 * @Version 1.0
 */
@Data
public class PlayerSpreadResult implements Serializable {
    private Integer id;
    private String userNo;
    private Long agentId;
    private Integer deptid;
    private Integer spreadCount=0;
    private Integer scanCount=0;
    private BigDecimal amount=BigDecimal.ZERO;
    private BigDecimal scoreAmount=BigDecimal.ZERO;
    private BigDecimal payAmount=BigDecimal.ZERO;




}
