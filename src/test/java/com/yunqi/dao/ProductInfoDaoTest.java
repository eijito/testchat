package com.yunqi.dao;

import com.yunqi.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 未定义
 * @date 2017/12/15 1:04
 * @Email eijito@foxmail.com
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoDaoTest {

    @Autowired
    ProductInfoDao productInfoDao;

    @Test
    public void findByProductStatus() throws Exception {

        List<ProductInfo> product = productInfoDao.findByProductStatus(0);
        Assert.assertNotEquals(0,product);
    }

    @Test
    public void test01() {

        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(2);
        productInfo.setCreateTime(new Date());
        productInfo.setProductDescription("好吃的不得了");
        productInfo.setProductId("21312312");
        productInfo.setProductIcon("http://dasdsa.com");
        productInfo.setProductName("萝卜牛郎");
        productInfo.setProductPrice(new BigDecimal(12.5));
        productInfo.setProductStock(100);
        productInfo.setProductStatus(0);
        productInfoDao.save(productInfo);

    }

}