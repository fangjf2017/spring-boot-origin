package com.tuniu.ngsp.nws.service.impl;

import com.tuniu.ngsp.nws.mapper.dao.UserMapper;
import com.tuniu.ngsp.nws.mapper.dto.User;
import com.tuniu.ngsp.nws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by fanshuai on 2017/9/20.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    public User getUserInfo() {
        return userMapper.findUserInfo();
    }

    @Override
    public Integer inserUserInfo(User dto) {
        return userMapper.inserUserInfo(dto);
    }

    @Override
    public Integer updateUserInfo(User dto) {
        return userMapper.updateUserInfo(dto);
    }

    @Override
    public Integer delUserInfo(User dto) {
        return userMapper.delUserInfo(dto);
    }

}
