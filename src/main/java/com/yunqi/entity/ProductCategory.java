package com.yunqi.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
/**
 * 商品类目实体
 */
@Entity
@Data
public class ProductCategory {

    //类目ID
    @Id
    @GeneratedValue //自增类型
    private Integer categorId;

    //类目名称
    private String categorName;
    //类目编号
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}