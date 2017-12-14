package com.yunqi.service.impl;

import com.yunqi.entity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 未定义
 * @date 2017/12/15 1:35
 * @Email eijito@foxmail.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductServiceImpl productService;
    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest = new PageRequest(0,1);
        System.out.println(productService.findAll(pageRequest).getTotalElements());
    }

    @Test
    public void findOne() throws Exception {
    }

    @Test
    public void findUpAll() throws Exception {
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(2);
        productInfo.setCreateTime(new Date());
        productInfo.setProductDescription("喝起来还不错");
        productInfo.setProductId("100041");
        productInfo.setProductIcon("http://www.baiddd.com");
        productInfo.setProductName("皮蛋瘦肉粥");
        productInfo.setProductPrice(new BigDecimal(2.5));
        productInfo.setProductStock(10);
        productInfo.setProductStatus(0);
        productService.save(productInfo);
    }

}