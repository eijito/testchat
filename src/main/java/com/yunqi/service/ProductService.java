package com.yunqi.service;

import com.yunqi.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 未定义
 * @date 2017/12/15 1:15
 * @Email eijito@foxmail.com
 */
public interface ProductService {

    //spring-data分页
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo findOne(String productId);

    //查询所有上架的商品
    List<ProductInfo> findUpAll();

    //更新保存商品
    ProductInfo save(ProductInfo productInfo);
    //加库存

    //减库存


}
