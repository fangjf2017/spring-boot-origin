package com.tuniu.ngsp.nws.test;

import com.tuniu.ngsp.nws.controller.Application;
import com.tuniu.ngsp.nws.mapper.dto.User;
import com.tuniu.ngsp.nws.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by fanshuai on 2017/9/20.
 * 测试CRUD的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)// 指定spring-boot的启动类
public class SpringBootJdbcTest {

    @Autowired
    private UserService userService;

    //查询
    @Test
    public void getUserInfo() {
        User user = userService.getUserInfo();
        System.out.println(user.getName() + user.getAge());
    }

    //插入
    @Test
    public void inserUserInfo() {
        User user = new User();
        user.setName("fan");
        user.setAge(30);
        user.setPassword("2017");
        System.out.println(userService.inserUserInfo(user));
    }

    //更新
    @Test
    public void updateUserInfo() {
        User user = new User();
        user.setId(2);
        user.setName("demo");
        System.out.println("更新的行数:"+userService.updateUserInfo(user));
    }

    //删除
    @Test
    public void delUserInfo() {
        User user = new User();
        user.setId(2);
        System.out.println("更新的行数:"+userService.delUserInfo(user));
    }

}
