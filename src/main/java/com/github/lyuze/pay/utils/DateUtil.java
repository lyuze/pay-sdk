package com.github.lyuze.pay.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0 2017/3/1
 * @auther <a href="mailto:253630756@qq.com">lyuze</a>
 * @since 1.0
 */
public class DateUtil {

    /**
     * 将yyyy-mm-dd HH:mm:ss格式的日期转换为Date格式
     * @param dateString
     * @return
     * @throws Exception
     */
    public static Date toDate(String dateString) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(dateString);
    }
}
