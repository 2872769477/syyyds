package com.hz.security03.pojo;


import lombok.Data;

import java.io.Serializable;

/**
 * 用户账户交易表
 */

@Data
public class UserTrading implements Serializable {
    private Integer utId;//交易ID
    private Integer userId;//用户ID
    private int htLastAmout;//原始金额
    private int htType;//交易类型（0支出  1收入）
    private int htAmout;//交易金额
    private String htDesc;//交易描述
    private String htTime;//交易时间


}
