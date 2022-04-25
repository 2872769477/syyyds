package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;


/**
 * 科室门诊管理表
 */
@Data
public class Department implements Serializable {
    private Integer departmentId;//科室ID
    private String departmentName;//科室名称
    private Integer hospitalId;//所属医院ID
    private Integer parentId;//父级ID


}
