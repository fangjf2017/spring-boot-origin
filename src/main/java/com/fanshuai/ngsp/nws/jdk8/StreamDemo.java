package com.fanshuai.ngsp.nws.jdk8;

import com.fanshuai.ngsp.nws.mapper.dto.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by fanshuai on 2018/2/7.
 * 流处理集合示例
 */
public class StreamDemo {

    public static void test() {
        User u = new User(123, "name", 30, "password");
        List<User> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(u);
        }
        Stream<User> s1 = list.stream();
        String[] array = {"asf", "fsfsffss", "fsffasfas"};
        Stream<String> s2 = Arrays.stream(array);
        Stream<String> s3 = Stream.of("ssss", "sffsafas", "fsafsafafsa");
        list.stream().distinct().collect(Collectors.toList());
        list.stream().limit(3).skip(2).forEach(p -> System.out.println(p.getName()));
        list.stream().map(User::getName).collect(Collectors.toList());
        Optional<User> person = list.stream().findFirst();//只存1个或0个元素(归约)将集合中的所有元素经过指定运算，折叠成一个元素输出
        System.out.println(person.get().getName());
        //StringJoiner 字符串拼接
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("foo");
        joiner.add("bar");
        joiner.add("baz");
        String joined = joiner.toString(); // "foo,bar,baz"
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        test();
    }

}
