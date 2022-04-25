package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 医师管理表
 */
@Data
public class PhysicianManagement implements Serializable {
    private Integer pyhsDoctorId;//医师ID
    private Integer hospitalId;//医院ID
    private Integer departmentId;//科室ID
    private String pyhsDoctorType;//医师职称(主治医师、副主任医师、主任医师,护士,护师,主管护师,副主任护师,主任护师,)
    private String pyhsName;//医师名称
    private int pyhsSex;//医师性别
    private int pyhsAge;//医师年龄
    private String pyhsPhone;//电话
    private String pyhsCard;//身份证
    private int pyhsStatus;//状态(0待审核   1正常  2禁用  3审核失败 ) 默认0
    private String pyhsBerif;//简介
    private String pyhsImage;//头像图片
    private Integer adminId;//审核人ID（管理员ID）


}
