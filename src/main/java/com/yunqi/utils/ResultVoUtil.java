package com.yunqi.utils;

import com.yunqi.entity.ViewObject.ResultVo;

/**
 * @author Administrator
 * @version 1.0.0
 * @description 未定义
 * @date 2017/12/15 17:13
 * @Email eijito@foxmail.com
 */
public class ResultVoUtil {
    /**
     * 成功的返回 0
     * @param obj
     * @return
     */
    public static ResultVo success(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setData(obj);
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }

    public static ResultVo success(){
        return success(null);
    }

    public static ResultVo error(Integer code,String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
