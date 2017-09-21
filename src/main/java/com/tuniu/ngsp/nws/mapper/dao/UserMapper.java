package com.tuniu.ngsp.nws.mapper.dao;

import com.tuniu.ngsp.nws.mapper.dto.User;

/**
 * Created by fanshuai on 2017/9/20.
 * dao层的操作
 */
public interface UserMapper {

    public User findUserInfo();

    public Integer inserUserInfo(User dto);

    public Integer updateUserInfo(User dto);

    public Integer delUserInfo(User dto);
}
