package com.springboot.util.chenbin;

import com.alibaba.fastjson.JSONArray;
import org.apache.commons.lang3.StringUtils;

public class TestRun {
    public static void main(String[] args) {
        getIdTypeNumber("身份证", "身份证,1$社会信用统一代码,8$组织机构代码,6");
    }

    public static String getIdTypeNumber(String idName, String idTypess) {
        if (StringUtils.isBlank(idName)) {
            return "1";//或者抛异常
        }
        String idd = "99";
        String[] idTypes = idTypess.split("$");
        System.err.println(JSONArray.toJSONString(idTypes));
        for (int i = 0; i < idTypes.length; i++) {
            String idType = idTypes[i];
            System.out.println("整体：" + idType);
            String[] id_ = idType.split(",");
            String idTypeName = id_[0];
            System.out.println("本次待比较：" + idTypeName);
            System.out.println("本次传入：" + idName);
            if (idType.contains(idName)) {
                System.out.println("为：" + id_[1]);
                idd = id_[1];
            }
        }
        return idd;
    }
}
