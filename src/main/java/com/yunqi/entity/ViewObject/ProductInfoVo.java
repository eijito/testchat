package com.yunqi.entity.ViewObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 返回给前端的商品信息 ，出于安全新建了一个类
 * @date 2017/12/15 16:12
 * @Email eijito@foxmail.com
 */
@Data
public class ProductInfoVo {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String priductName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;

}
