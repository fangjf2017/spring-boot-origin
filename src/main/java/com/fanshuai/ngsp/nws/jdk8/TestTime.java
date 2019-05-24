package com.fanshuai.ngsp.nws.jdk8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fan on 2019/3/21.
 * 计算工时
 */
public class TestTime {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        int minutes = 0;
        //打卡时间
        String clockTime = "21:14,18:41,20:25,23:01,21:48,19:43,20:30,18:10,20:20,20:17,20:20,19:51,20:20,20:19,21:55,20:20";
        //下班标准时间
        String rule = "20:15";
        try {
            List<String> list = Arrays.asList(clockTime.split(","));
            for (String str : list) {
                minutes += (sdf.parse(str).getTime() - sdf.parse(rule).getTime())/60000;
            }
            System.out.println("多余工时:" + minutes);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}
