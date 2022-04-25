package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单评论管理
 */
@Data
public class OrderDiscuss implements Serializable {
    private Integer orderDiscussId;//订单评论ID
    private String orderDiscussConetnt;//评论内容
    private String orderDiscussTime;//评论时间
    private Integer userId;//用户ID
    private Integer bookingId;//预约ID
    private Integer pyhsDoctorId;//医师ID


}
