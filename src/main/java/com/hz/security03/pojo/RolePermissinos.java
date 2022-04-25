package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色权限表
 */
@Data
public class RolePermissinos implements Serializable {
    private Integer rolePermId;//角色权限ID
    private Integer roleId;//角色ID
    private Integer permId;//权限ID


}
