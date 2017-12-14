package com.yunqi.service;

import com.yunqi.entity.ProductCategory;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 未定义
 * @date 2017/12/15 0:40
 * @Email eijito@foxmail.com
 */
public interface CategroyService {

    ProductCategory findOne(Integer categroyId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);



}
