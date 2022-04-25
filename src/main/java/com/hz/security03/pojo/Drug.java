package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 药品信息管理
 */
@Data
public class Drug implements Serializable {
    private Integer drugId;//药品ID
    private String drugName;//药品名称
    private String drugUnit;//药品单位
    private String drugDosage;//药品剂量单位
    private int drugStock;//库存   (0有 1 无)
    private Integer hospitalId;//医院ID
    private int drugMoney;//药品单价
    private Integer drugTypeId;//药品分类ID

}
