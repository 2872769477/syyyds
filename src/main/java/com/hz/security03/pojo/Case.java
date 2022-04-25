package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户病例表(
 */
@Data
public class Case implements Serializable {
    private Integer caseId;//病例ID
    private Integer userId;//用户ID
    private String caseName;//病例名称
    private String caseDesc;//病例描述
    private String caseImage;//病例图片(可以传多个)


}
