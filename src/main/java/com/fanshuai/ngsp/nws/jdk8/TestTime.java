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
        String clockTime = "19:15,21:30,18:53,21:52,20:50,18:00,21:05,21:50,18:52,21:23,20:55,18:30,20:40,21:22,18:15";
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
