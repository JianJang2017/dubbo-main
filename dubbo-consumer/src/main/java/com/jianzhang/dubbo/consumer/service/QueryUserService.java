package com.jianzhang.dubbo.consumer.service;

import com.jianzhang.dubbo.message.User;

import java.util.List;

/**
 * @Description: 用户信息查询
 * @author Jian Jang
 * @version 1.0 2018/2/2
 */
public interface QueryUserService {
    /***
     * 用户信息查询
     * @param user
     * @return
     */
    List<User> queryUsers(User user);
}
