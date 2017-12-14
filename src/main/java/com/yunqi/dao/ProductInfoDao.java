package com.yunqi.dao;

import com.yunqi.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 未定义
 * @date 2017/12/15 1:02
 * @Email eijito@foxmail.com
 */
public interface ProductInfoDao extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
