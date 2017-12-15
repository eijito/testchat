package com.yunqi.api;

import com.yunqi.entity.ProductCategory;
import com.yunqi.entity.ProductInfo;
import com.yunqi.entity.ViewObject.ProductInfoVo;
import com.yunqi.entity.ViewObject.ProductVo;
import com.yunqi.entity.ViewObject.ResultVo;
import com.yunqi.service.CategroyService;
import com.yunqi.service.ProductService;
import com.yunqi.utils.ResultVoUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 未定义
 * @date 2017/12/15 16:19
 * @Email eijito@foxmail.com
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductApi {

    @Autowired
    private ProductService productService;

    @Autowired
   private CategroyService categroyService;

    @GetMapping("/list")
    public ResultVo list(){
        //查出所有上架的商品
        List<ProductInfo> productInfoList = productService.findUpAll();
        //将查到的商品类目加入到list中
        List<Integer> categroyTypeList = productInfoList.stream().map(a -> a.getCategoryType()).collect(Collectors.toList());
        //根据上架商品查询出类目
        List<ProductCategory> productCategorylist = categroyService.findByCategoryTypeIn(categroyTypeList);
        //数据拼装
        List<ProductVo> productVoList = new ArrayList<ProductVo>();
        for (ProductCategory productCategory : productCategorylist){
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategorName());
            productVo.setCategoryType(productCategory.getCategoryType());
            List<ProductInfoVo> productInfoVoList = new ArrayList<ProductInfoVo>();
            for(ProductInfo productInfo :productInfoList){
                ProductInfoVo productInfoVo = new ProductInfoVo();
                //将相同属性拷贝到另外的对象
                BeanUtils.copyProperties(productInfo,productInfoVo);
                productInfoVoList.add(productInfoVo);
            }
            productVo.setProductInfoVoList(productInfoVoList);
            productVoList.add(productVo);
        }
        return ResultVoUtil.success(productVoList);
    }

}
