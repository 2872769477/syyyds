package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户安全信息表
 */
@Data
public class UserSafe implements Serializable {
    private Integer userWalletId;//钱包ID
    private int userWalletBalance;//账户余额
    private int userSafePassword;//支付密码
    private String userSafeCard;//身份证号
    private int userSafeCold;//冻结金额


}
