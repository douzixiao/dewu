package com.youkeda.dewu.control;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @program: dewu.app
 * @description: 测试
 * @author: douzi
 * @create: 2021-03-29 13:20
 **/

public class TestController {
    public static void main(String[] args) {

        Instant now = Instant.now();  //不带时区的时间点
        ZonedDateTime zonedDateTime = now.atZone(ZoneId.systemDefault()); //获取系统默认点时区
        System.out.println(zonedDateTime);
        System.out.println(now);

        Date date1 = new Date();
        System.out.println(date1.toInstant());
        System.out.println(date1);
        // 日期格式的转换
        Date date = new Date();   //默认的时间是按国家标准时间来的
        System.out.println(date);
        System.out.println(new Date(date.getTime()));
        System.out.println(new Date(date.getTime()+8*60*60*1000L));
        System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
        /*System.out.println(date.toString());
        System.out.println(date);
        System.out.println(date.toInstant());

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String  str = "2018/9/23";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String format = dateTimeFormatter.format(now);

       // LocalDateTime parse = LocalDateTime.parse(str,dateTimeFormatter);

        // java.util.Date 转 LocalDate
        System.out.println("#########");
        Date date2 = new java.util.Date();
       // System.out.println(date2.toInstant());
       // System.out.println(new Date(date2.getTime()));
        Date date1 = new Date(date2.getTime());
        System.out.println(new Date(date1.getTime()));
       // System.out.println(new Date(date2.getTime()+8*60*60*1000L));
        Instant instant = date2.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        localDateTime.toLocalDate();
        localDateTime.toLocalTime();
        System.out.println(localDateTime);*/


    }
}
