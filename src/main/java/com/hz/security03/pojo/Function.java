package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 功能表(function)(控制到按钮待定)
 */
@Data
public class Function implements Serializable {
    private Integer functionId;//功能ID
    private Integer permId;//权限ID
    private String functionName;//功能名称
    private String functionLogo;//功能标识


}
