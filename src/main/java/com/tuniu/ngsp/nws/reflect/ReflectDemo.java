package com.tuniu.ngsp.nws.reflect;

import com.tuniu.ngsp.nws.mongodb.dto.DemoInfo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by fanshuai on 2017/9/29.
 * <p>
 * 发射相关操作
 */
public class ReflectDemo {
    public static void main(String[] args) {
        //第一种方式：
        try {
            Class c1 = Class.forName("com.tuniu.ngsp.nws.mongodb.dto.DemoInfo");//需要完整的包名和类名
//            Object o = c1.newInstance();
            //获取所有的属性?
            Field[] fs = c1.getDeclaredFields();
            StringBuffer sb = new StringBuffer();
            //通过追加的方法，将每个属性拼接到此字符串中
            //最外边的public定义
            sb.append(Modifier.toString(c1.getModifiers()) + " class " + c1.getSimpleName() + "{\n");
            //里边的每一个属性
            for (Field field : fs) {
                sb.append("\t");//空格
                sb.append(Modifier.toString(field.getModifiers()) + " ");//获得属性的修饰符，例如public，static等等
                sb.append(field.getType().getSimpleName() + " ");//属性的类型的名字
                sb.append(field.getName() + ";\n");//属性的名字+回车
            }
            sb.append("}");
            System.out.println(sb);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第二种方式：
        //java中每个类型都有class 属性.
        Class c2 = DemoInfo.class;

        //第三种方式：
        //java语言中任何一个java对象都有getClass 方法
        DemoInfo e = new DemoInfo();
        Class c3 = e.getClass(); //c3是运行时类 (e的运行时类是Employee)
    }

}
