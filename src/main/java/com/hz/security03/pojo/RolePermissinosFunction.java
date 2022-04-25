package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class RolePermissinosFunction implements Serializable {
    private long rolePermFunId;
    private Long functionId;


}
