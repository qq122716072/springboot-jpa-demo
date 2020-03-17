package com.bjnangle.webservice.helper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: nics
 * @description: ${description}
 * @author: weixd
 * @createTime: 2019-07-15 14:43
 **/
public class DateHelper {

    public static DateFormat getDateFormat () {
        return new SimpleDateFormat("yyyy-MM-dd");
    }


    /**
     * @Author weixd
     * @Description 间隔天数
     **/
    public static String getDateTime () {
        return getDateFormat().format(new Date());
    }

}
