package com.ht.emos.common.util;

import cn.hutool.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ResultObject
 * @Description TODO: 封装返回数据的统一接口
 * @Author Wuc
 * @Date 2022/7/14 22:40
 */
public class ResultObject extends HashMap<String,Object> {
    /**
     * 返回成功消息，不传递参数
     */
    public ResultObject(){
        put("code", HttpStatus.HTTP_OK);
        put("msg","Success");
    }

    /**
     * 设置返回参数
     * @param key 返回参数的键值
     * @param obj 返回参数的json对象
     * @return ResultObject
     */
    public ResultObject put(String key,Object obj){
        super.put(key,obj);
        return this;
    }

    //返回成功的数据消息
    public static ResultObject isOk(){
        return new ResultObject();
    }

    /**
     * 返回成功的数据消息,
     * @param message 返回的值描述信息
     * @return ResultObject
     */
    public static ResultObject isOk(String message){
        ResultObject resultObject = new ResultObject();
        resultObject.put("msg",message);
        return resultObject;
    }

    /**
     * 返回成功的信息
     * @param map 已经分装好的返回数据格式
     * @return ResultObject
     */
    public static ResultObject isOk(Map<String,Object> map){
        ResultObject resultObject = new ResultObject();
        resultObject.putAll(map);
        return resultObject;
    }

    /**
     * 返回错误数据
     * @param code 错误码
     * @param message 错误信息
     * @return resultObject
     */
    public static ResultObject error(int code,String message){
        ResultObject resultObject = new ResultObject();
        resultObject.put("code",code);
        resultObject.put("msg",message);
        return resultObject;
    }

    public static ResultObject error(String message){
        return error(HttpStatus.HTTP_INTERNAL_ERROR,message);
    }

    public static ResultObject error(){
        return error(HttpStatus.HTTP_INTERNAL_ERROR,"未知的错误");
    }



}
