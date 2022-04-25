package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 预约信息表
 */
@Data
public class Booking implements Serializable {
    private Integer bookingId;//预约ID
    private String bookingAddress;//详细地址
    private Integer userId;//用户ID
    private int bookingMoney;//支付金额
    private String bookingX;//X坐标
    private String bookingY;//Y坐标
    private String bookingTime;//创建时间
    private String bookingDesc;//描述
    private Integer bookingStatus;//状态（0待上门  2待送药 1已完成  3退单 ）

}
