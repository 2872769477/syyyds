package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色表(role)
 */

@Data
public class Role implements Serializable {
    private Integer roleId;//角色ID
    private String roleName;//角色名称
    private String roleDesc;//角色描述
    private Integer createPersonId;//创建人ID
    private String roleCreateTime;//创建时间
    private int roleStatus;//状态(0启用1禁用 默认0)


}
