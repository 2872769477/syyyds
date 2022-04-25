package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 医院账户交易表
 */
@Data
public class HospitalTrading implements Serializable {
    private Integer htId;//交易ID
    private String htDesc;//交易描述（订单编号为XXXXX的信息，XXX科室，XXX主人，外出看病）（月底薪资结算）
    private Integer hospitalId;//医院ID
    private String htTime;//交易时间
    private int htType;//交易类型（0收入  1支出）
    private int htLastAmout;//原始账户余额
    private int htAmout;//交易金额
    private int htAfterAmout;//交易后账户余额
    private long adminId;//操作人ID（管理员ID）s

}
