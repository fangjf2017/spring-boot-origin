package com.fanshuai.ngsp.nws.service;

import com.fanshuai.ngsp.nws.mapper.dto.User;

/**
 * Created by fanshuai on 2017/9/20.
 */
public interface UserService {

    public User getUserInfo();

    public Integer inserUserInfo(User dto);

    public Integer updateUserInfo(User dto);

    public Integer delUserInfo(User dto);

}
