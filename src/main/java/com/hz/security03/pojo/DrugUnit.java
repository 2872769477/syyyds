package com.hz.security03.pojo;


import lombok.Data;

import java.io.Serializable;

/**
 * 药品单位管理
 */
@Data
public class DrugUnit implements Serializable {
    private int drugUnitId;//单位ID
    private double drugUnitMg;//单位名称
    private String drugUnitType;//单位类型   （0药品单位  1剂量单位）

}
