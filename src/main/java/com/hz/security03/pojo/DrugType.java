package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 药品分类管理
 */
@Data
public class DrugType implements Serializable {
    private Integer drugTypeId;//药品分类ID
    private String drugTypeName;//药品名称(中药,西药,中成药)  要修改
    private Integer parentId;//父级ID


}
