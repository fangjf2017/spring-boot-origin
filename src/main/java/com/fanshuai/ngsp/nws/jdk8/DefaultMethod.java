package com.fanshuai.ngsp.nws.jdk8;

/**
 * Created by fanshuai on 2017/9/25.
 * jdk1.8 允许接口定义default 关键字的方法和实现
 */
public interface DefaultMethod {

    public void fun1();

    default void sayHi(String str) {
        System.out.println("你好：" + str);
    }
    // 静态方法
    //Java 8 的另一个特性是接口可以声明（并且可以提供实现）静态方法
    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
}
