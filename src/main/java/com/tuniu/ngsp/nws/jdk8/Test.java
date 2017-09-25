package com.tuniu.ngsp.nws.jdk8;

import com.tuniu.ngsp.nws.mapper.dto.User;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by fanshuai on 2017/9/25.
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("==========begin");
        DefaultMethod d = new DefaultMethod() {
            @Override
            public void fun1() {
                sayHi("测试");
            }
        };
        d.sayHi("测试");
        System.out.println("==========end");
        new LambdaDemo().sortFunction1();
        //函数式接口
        LambdaFunctionDemo<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);
        //方法与构造函数引用
        LambdaFunctionDemo<String, Integer> converter2 = Integer::valueOf;
        //Predicate接口
        Predicate<String> predicate = (s) -> s.length() > 0;
        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false
        Predicate<Boolean> nonNull = Objects::nonNull;
        //function接口
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");     // "123"
        //Supplier 接口 返回一个任意范型的值
        Supplier<User> personSupplier = User::new;
        System.out.println("Supplier:" + personSupplier.get().getName());// new Person
        //Consumer 接口
        Consumer<User> greeter = (p) -> System.out.println("Hello, " + p.getName());
        greeter.accept(new User("Luke", "测试"));
        //Comparator 接口
        Comparator<User> comparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
        User p1 = new User("John", "Doe");
        User p2 = new User("Alice", "Wonderland");
        System.out.println(comparator.compare(p1, p2));// > 0
        System.out.println(comparator.reversed().compare(p1, p2));// < 0
        //Optional 接口
        Optional<String> optional = Optional.of("bam");
        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
        //Stream 接口
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            //存在性检查
            map.putIfAbsent(i, "val" + i);
        }
        //删除指定key
        map.getOrDefault(42, "not found");
        //map值的合并
        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
    }
}
