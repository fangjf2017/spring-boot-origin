package com.fanshuai.ngsp.nws.controller;

import com.fanshuai.ngsp.nws.mapper.dto.User;
import com.fanshuai.ngsp.nws.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fanshuai on 2017/9/20.
 */
@Controller
public class UserController {
    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /*
     *  http://localhost:8080/getUserInfo
     */

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if (user != null) {
            System.out.println("user.getName():" + user.getName());
            logger.info("user.getAge():" + user.getAge());
        }
        return user;
    }

    /**
     * 页面展示示例
     * @return
     */
    @RequestMapping(value = "/showUserInfo",method = RequestMethod.GET)
    public String showUserInfo(Model model) {
        User user = userService.getUserInfo();
        model.addAttribute("user", user);
        return "userInfo";
    }


}
