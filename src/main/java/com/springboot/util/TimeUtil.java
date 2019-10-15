package com.springboot.util;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    private static SimpleDateFormat format_date = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat format_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getDateString(Date date) {
        if (date != null) {
            return format_date.format(date);
        }
        return null;
    }

    public static Date getDateFromString(String date_str) throws ParseException {
        if (!StringUtils.isBlank(date_str)) {
            if (date_str.length() == 19) {
                return format_date.parse(date_str.substring(0, 10));
            } else if (date_str.length() == 10) {
                return format_date.parse(date_str);
            }
        }
        return null;
    }

    public static String getTimeString(Date date) {
        if (date != null) {
            return format_time.format(date);
        }
        return null;
    }

    public static Date getTimeFromString(String time_str) throws ParseException {
        if (!StringUtils.isBlank(time_str)) {
            if (time_str.length() == 10) {
                return format_time.parse(time_str + " 00:00:00");
            } else if (time_str.length() == 19) {
                return format_time.parse(time_str);
            }
        }
        return null;
    }
}
