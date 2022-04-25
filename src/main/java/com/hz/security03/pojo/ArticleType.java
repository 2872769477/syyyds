package com.hz.security03.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 文章类型表
 */
@Data
public class ArticleType implements Serializable {
    private Integer typeId;//文章类型ID
    private String typeName;//文章名称
    private Integer parentId;//父级ID


}
