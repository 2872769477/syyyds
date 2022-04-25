package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 管理员表(system_admin)
 */

@Data
public class SystemAdmin implements Serializable {
    private Integer adminId; //管理员ID
    private String adminAccount;//管理员账号
    private String adminPassword;//管理员密码(加密)
    private String adminName;//管理员姓名
    private Integer roleId;//管理员权限(角色IDrole_id)
    private String adminPhone;//管理员手机号
    private String adminCreateTime;//创建时间
    private Integer createPersonId;//创建人ID
    private String adminLastIp;//管理员最后一次登录ip
    private String adminLastTime;//管理员最后一次登录时间
    private int adminStatus;//状态(0启用1禁用 默认0)



}
