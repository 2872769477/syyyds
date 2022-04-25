package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 退单记录表
 */
@Data
public class Chargeback implements Serializable {
    private Integer chargebackId;//退单ID
    private Integer bookingId;//预约ID
    private String chargebackDesc;//退单说明
    private Integer userId;//用户ID
    private Integer pyhsDoctorId;//医师ID
    private int chargebackUser;//用户选择（0确定   1否定）
    private int chargebackDoctor;//医生选择（0确定   1否定）

}
