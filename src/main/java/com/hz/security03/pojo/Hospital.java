package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 医院管理表
 */
@Data
public class Hospital implements Serializable {
    private Integer hospitalId;//医院ID
    private String hospitalName;//医院名称
    private String hospitalAddress;//医院地址
    private String hospitalBeif;//医院简介
    private String hospitalImage;//医院图片
    private Integer hospitalAreaId;//地区ID
    private String hospitalPhone;//医院电话
    private int hospitalBalance;//账户余额s


}
