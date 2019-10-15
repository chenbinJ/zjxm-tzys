package com.springboot.util;

import java.util.HashMap;
import java.util.Map;

public class ReturnMsgUtil {

    /**
     * 返回封装信息（Map）
     *
     * @param msg    消息
     * @param result 消息
     * @return Map<Object   ,       Object> {flag:'',msg:''}
     */
    public static Map<Object, Object> setAndReturnDataAPP(Object msg, Object result) {
        Map<Object, Object> retMap = new HashMap<Object, Object>();
        retMap.put("flag", "200");
        retMap.put("msg", msg);
        retMap.put("result", result);
        return retMap;
    }

    /**
     * 返回封装信息（Map）
     *
     * @param flag flag/true
     * @param msg  消息
     * @return Map<Object   ,       Object> {flag:'',msg:''}
     */
    public static Map<Object, Object> setAndReturn(Boolean flag, Object msg) {
        Map<Object, Object> retMap = new HashMap<Object, Object>();
        retMap.put("flag", flag);
        retMap.put("msg", msg);
        return retMap;
    }

    /**
     * 返回封装信息（Map）
     *
     * @param flag   flag/true
     * @param msg    消息
     * @param result 对象
     * @return Map<Object   ,       Object> {flag:'',msg:'',result:''}
     */
    public static Map<Object, Object> setAndReturnData(Boolean flag, Object msg, Object result) {
        Map<Object, Object> retMap = new HashMap<Object, Object>();
        retMap.put("flag", flag);
        retMap.put("msg", msg);
        retMap.put("result", result);
        return retMap;
    }

    public static Map<Object, Object> operateresult(Integer num) {
        if (num == 0) {
            return setAndReturn(true, "操作成功!");
        } else if (num == 1) {
            return setAndReturn(false, "操作失败!");
        }
        return setAndReturn(false, "有相同编码,请重新填写!");
    }


    /**
     * 修改、新增、删除操作返回信息
     *
     * @param num 修改、新增、删除的行数
     * @return Map{flag,msg}
     */
    public static Map<Object, Object> operateReturn(Integer num) {
        if (num > 0) {
            return setAndReturn(true, "操作成功!");
        }
        return setAndReturn(false, "操作失败!");
    }

}
