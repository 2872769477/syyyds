package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 医师资质管理
 */
@Data
public class DoctorAptitude implements Serializable {
    private Integer doctorAptitudeId;//资质ID
    private String doctorAptitudeLicense;//资质图片
    private Integer pyhsDoctorId;//医师ID
    private String doctorAptitudeDesc;//图片描述


}
