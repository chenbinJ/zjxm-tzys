package com.springboot.util.chenbin;

import com.springboot.util.TimeUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class IDUtil {
    public static String getBinID() {
        StringBuffer sb = new StringBuffer();
        sb.append("Bin-").append(new SimpleDateFormat("yyMMddHHmmss").format(new Date())).append("-")
                .append(UUID.randomUUID().toString().substring(0, 8).toUpperCase());
        return sb.toString();
    }


    public static String getExceptionId() {
        String date = TimeUtil.getDateString(new Date());
        return "EXCE-" + date.replaceAll("-", "") + "-" + UUID.randomUUID().toString().substring(0, 12).replaceAll("-", "").toUpperCase();
    }

    public static String getFinstId() {
        String date = TimeUtil.getDateString(new Date());
        return "FINST-" + date.replaceAll("-", "") + "-" + UUID.randomUUID().toString().substring(0, 12).replaceAll("-", "").toUpperCase();
    }
}
