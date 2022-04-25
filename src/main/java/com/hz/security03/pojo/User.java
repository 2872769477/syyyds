package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户基础信息表
 */
@Data
public class User implements Serializable {
    private Integer userId;//用户ID
    private String userName;//用户名
    private String userPassword;//用户密码
    private String userPhone;//手机号
    private String userIcon;//用户头像
    private int userSex;//用户性别
    private String userBirthday;//用户生日
    private Integer userAddressId;//地区ID
    private String userRegister;//用户注册时间
    private String userStatus;//用户账号状态


}
