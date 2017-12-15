package com.yunqi.entity.ViewObject;

import lombok.Data;

/**
 * @author Administrator
 * @version 1.0.0
 * @description Http请求返回的最外层对象
 * @date 2017/12/15 16:04
 * @Email eijito@foxmail.com
 */
@Data
public class ResultVo<T> {

    //返回的验证码
    private Integer code;

    //返回的信息
    private String msg;

    //返回的数据
    private T data;
}
