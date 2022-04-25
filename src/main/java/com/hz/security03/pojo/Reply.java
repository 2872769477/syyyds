package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 文章用户回复表
 */
@Data
public class Reply implements Serializable {
    private Integer replyId;//文章回复ID
    private String replyContent;//文章回复内容
    private String replyTime;//文章回复时间
    private Integer contentId;//文章内容ID


}
