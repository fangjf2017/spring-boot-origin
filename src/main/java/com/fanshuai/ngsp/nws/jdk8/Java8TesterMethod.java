package com.fanshuai.ngsp.nws.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fan on 2019/3/21.
 */
public class Java8TesterMethod {
    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        //jdk8的新特性，方法的引用
        names.forEach(System.out::println);
    }
}
