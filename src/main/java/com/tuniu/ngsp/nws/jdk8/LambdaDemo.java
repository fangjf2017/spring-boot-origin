package com.tuniu.ngsp.nws.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by fanshuai on 2017/9/25.
 * Lambda 表达式 jdk 1.8
 */
public class LambdaDemo {

    static List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    //集合排序
    public void sortFunction1() {
        //jdk 1.6 的写法
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        names.forEach(System.out::println);
        //jdk 1.8的写法,Java编译器可以自动推导出参数类型
        Collections.sort(names, (a, b) -> a.compareTo(b));
        names.forEach(System.out::println);
    }

}
