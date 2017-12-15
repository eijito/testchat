package com.yunqi.entity.ViewObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yunqi.entity.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 未定义
 * @date 2017/12/15 16:07
 * @Email eijito@foxmail.com
 */
@Data
public class ProductVo {
    //类目名称
    @JsonProperty("name")
    private String categoryName;
    //类目id
    @JsonProperty("type")
    private Integer categoryType;
    //商品详情
    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVoList;

}
