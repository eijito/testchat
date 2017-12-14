package com.yunqi.dao;

import com.yunqi.entity.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 未定义
 * @date 2017/12/14 23:48
 * @Email eijito@foxmail.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    ProductCategoryDao productCategoryDao;

    @Test
    public void  testFindOne(){
        ProductCategory one = productCategoryDao.findOne(1);
        System.out.println(one);
    }
    @Test
    @Transactional //测试成功  数据库不生成测试数据
    public void testAdd(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategorId(2);
        productCategory.setCategorName("最受小孩青睐");
        productCategory.setCategoryType(3);
        productCategory.setCreateTime(new Date());
        ProductCategory save = productCategoryDao.save(productCategory);
        Assert.assertNotNull(save);
    }

    @Test
    public void test02(){
        List<Integer> list = Arrays.asList(2,3);
        List<ProductCategory> lis = productCategoryDao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0,lis.size());

    }

}