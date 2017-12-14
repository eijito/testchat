package com.yunqi.utils.Enums;

import lombok.Getter;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 商品状态的枚举
 * @date 2017/12/15 1:25
 * @Email eijito@foxmail.com
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"上架中"),//上架中
    DOWN(1,"下架了")//下架
    ;
    private Integer code;

    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
