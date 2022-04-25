package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 处方筏表
 */
@Data
public class PrescriptionRaft implements Serializable {
    private Integer raftId;//处方筏ID
    private Integer pyhsDoctorId;//医师ID
    private String raftTime;//创建时间
    private String raftImage;//预约ID
    private String raftDesc;//说明
    private int raftMoney;//总价


}
