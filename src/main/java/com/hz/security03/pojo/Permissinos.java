package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 权限表（菜单表）(permissinos)
 */

@Data
public class Permissinos implements Serializable {
    private Integer permId;//权限ID
    private String permName;//权限名称
    private String permIcon;//图标
    private String permUrl;//controller路径
    private Integer parentId;//父级ID

}
