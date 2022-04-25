package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * 文章内容表
 */
@Data
public class ArticleContent implements Serializable {
    private Integer contentId;//文章内容ID
    private String contentName;//文章内容名称
    private String contentCreateTime;//创建时间
    private String contentPublishTime;//文章内容
    private Integer pyhsDoctorId;//医师ID
    private Integer typeId;//文章类型ID


}
