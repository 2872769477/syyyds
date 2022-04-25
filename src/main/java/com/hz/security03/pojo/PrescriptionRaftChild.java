package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 处方筏子表
 */
@Data
public class PrescriptionRaftChild implements Serializable {
    private Integer childId;//子表ID
    private Integer raftId;//处方筏ID
    private Integer drugId;//药品ID
    private int childUnit;//单价
    private int childNumber;//药品数量
    private String childFrequency;//每日次数
    private String childDosage;//剂量
    private int childPrice;//总价


}
