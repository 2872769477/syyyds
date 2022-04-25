package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 地区表
 */
@Data
public class Area implements Serializable {
    private Integer areaId;//地区ID
    private Integer parentId;//父级ID
    private String areaName;//省市区


}
