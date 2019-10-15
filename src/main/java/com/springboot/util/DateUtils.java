package com.springboot.util;


import com.springboot.config.Msgagger;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Copyright (C),2017, Guangzhou ChangLing info. Co., Ltd.
 * <p>
 * FileName: DatetimeUtils.java
 * <p>
 * 日期格式通用类
 *
 * @author hey
 * @version 1.00
 * @Date 2017年9月20日 下午5:52:21
 */
public class DateUtils {
    /**
     * 格式：EEE, d MMM yyyy HH:mm:ss z
     */
    public static final String ENG_DATE_FROMAT = "EEE, d MMM yyyy HH:mm:ss z";
    public static final String JAVA_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String JAVA_YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    public static final String JAVA_YYYY_MM_DD = "yyyy-MM-dd";
    public static final String JAVA_YYYYMMDD = "yyyyMMdd";
    public static final String JAVA_YYYYMMDD_CH = "yyyy年MM月dd日";
    public static final String JAVA_YYYY_MM = "YYYY-MM";
    public static final String JAVA_YYYY = "yyyy";
    public static final String JAVA_MM = "MM";
    public static final String JAVA_DD = "dd";
    public static final String JAVA_HH_MM_SS = "hh:mm:ss";

    /**
     * 格式化日期对象-DateToDate
     *
     * @param date      待格式化的日期
     * @param formatStr 想要格式化的日期格式
     * @return 根据formatStr的格式，转化为指定格式的date类型
     */
    public static Date parseDate(Date date, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        String str = sdf.format(date);
        try {
            date = sdf.parse(str);
        } catch (Exception e) {
            throw new RuntimeException(Msgagger.DATE_PARSE_EXCEPTION);
        }
        return date;
    }

    /**
     * 时间对象转换成字符串-DateToStr
     *
     * @param date      待格式化日期
     * @param formatStr 日期格式化格式
     * @return 根据formatStr转换为指定字符串
     */
    public static String dateString(Date date, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(date);
    }

    /**
     * sql时间对象转换成字符串
     *
     * @param timestamp 待装换的SQL格式日期
     * @param formatStr 格式化格式
     * @return 根据formatStr的格式，转换为指定字符串
     */
    public static String timestampString(Timestamp timestamp, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(timestamp);
    }

    /**
     * sql时间对象转换成字符串
     *
     * @param time      待装换的SQL格式日期,java.sql.time
     * @param formatStr 格式化格式
     * @return 根据formatStr的格式，转换为指定字符串
     */
    public static String timeString(Time time, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        return sdf.format(time);
    }

    /**
     * 字符串转换成时间对象
     *
     * @param dateString 待装换为date类型的字符串
     * @param formatStr  日期格式化格式
     * @return 根据formatStr的格式，转换为date类型
     */
    public static Date stringToDate(String dateString, String formatStr) {
        Date formateDate = null;
        DateFormat format = new SimpleDateFormat(formatStr);
        try {
            formateDate = format.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(Msgagger.DATE_PARSE_EXCEPTION);
        }
        return formateDate;
    }


    /**
     * Date类型转换为Timestamp类型
     *
     * @param date 待转换的date类型
     * @return 返回Timestamp
     */
    public static Timestamp dateToTimestamp(Date date) {
        if (date == null)
            throw new RuntimeException(Msgagger.DATE_IS_NULL);
        return new Timestamp(date.getTime());
    }

    /**
     * 获得当前年份
     *
     * @return 返回当前年份：YYYY
     */
    public static String getNowYear() {
        SimpleDateFormat sdf = new SimpleDateFormat(JAVA_YYYY);
        return sdf.format(new Date());
    }

    /**
     * 获得当前月份
     *
     * @return 返回当前月份：MM
     */
    public static String getNowMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat(JAVA_MM);
        return sdf.format(new Date());
    }

    /**
     * 获得当前日期中的日
     *
     * @return 返回当前年月日中的日：dd
     */
    public static String getNowDay() {
        SimpleDateFormat sdf = new SimpleDateFormat(JAVA_DD);
        return sdf.format(new Date());
    }

    /**
     * 将格式为：“HH:mm:ss”的字符串转换为time类型
     *
     * @param time 格式为：“HH:mm:ss”
     * @return 返回此格式的time类型
     */
    public static Time getTime(String time) {
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
        try {
            Date d = format.parse(time);
            return new Time(d.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.toString());
        }
    }

    /**
     * 指定时间距离当前时间的中文信息
     *
     * @param time
     * @return
     */
    public static String getLnow(long time) {
        Calendar cal = Calendar.getInstance();
        long timel = cal.getTimeInMillis() - time;
        if (timel / 1000 < 60) {
            return "1分钟以内";
        } else if (timel / 1000 / 60 < 60) {
            return timel / 1000 / 60 + "分钟前";
        } else if (timel / 1000 / 60 / 60 < 24) {
            return timel / 1000 / 60 / 60 + "小时前";
        } else {
            return timel / 1000 / 60 / 60 / 24 + "天前";
        }
    }

    /**
     * 计算两个日期的时间差
     *
     * @param one 开始时间，要求格式：yyyy-MM-dd HH:mm:ss
     * @param two 结束时间，要求格式：yyyy-MM-dd HH:mm:ss
     * @return 返回的字符串格式：小时：分钟：秒钟
     */
    public static String getDistanceTime(Date one, Date two) {
        long day = 0;
        long hour = 0;
        long hour1 = 0;
        long min = 0;
        long sec = 0;
        long time1 = one.getTime();
        long time2 = two.getTime();
        long diff;
        if (time1 < time2) {
            diff = time2 - time1;
        } else {
            diff = time1 - time2;
        }
        day = diff / (24 * 60 * 60 * 1000);
        hour = (diff / (60 * 60 * 1000) - day * 24);
        min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
        sec = (diff / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);

        hour1 = diff / (60 * 60 * 1000);

        return hour1 + ":" + min + ":" + sec;
    }

    /**
     * 获取当前系统时间，返回格式为字符串
     *
     * @return 返回格式：yyyy-MM-dd HH:mm:ss
     */
    public static String getNowSystemDatetimeString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());
    }

    /**
     * 获取当前系统时间，返回格式为字符串
     *
     * @return 返回格式：yyyyMMdd
     */
    public static String getNowSystemDateString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        return df.format(new Date());
    }

    /**
     * 生成10位时间戳
     *
     * @return
     */
    public static String getCurrentTimestamp10() {
        long timeStamp = new Date().getTime() / 1000;
        return String.valueOf(timeStamp);
    }

    /**
     * 生成时间戳
     *
     * @return
     */
    public static String getCurrentTimestamp() {
        long timeStamp = new Date().getTime();
        return String.valueOf(timeStamp);
    }

    /**
     * 生成10位时间戳
     *
     * @return
     */
    public static String getTimeStamp() {
        int time = (int) (System.currentTimeMillis() / 1000);
        return String.valueOf(time);
    }


}
