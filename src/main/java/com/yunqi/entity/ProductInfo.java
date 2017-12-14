package com.yunqi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    //商品名称
    private String productName;
    //商品单价
    private BigDecimal productPrice;
    //商品库存
    private Integer productStock;
    //商品描述
    private String productDescription;
    //商品的图片 是链接地址
    private String productIcon;
    //商品的状态
    private Integer productStatus;
    //商品的类目编号
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}