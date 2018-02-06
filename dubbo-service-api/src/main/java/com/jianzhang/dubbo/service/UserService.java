package com.jianzhang.dubbo.service;

import com.jianzhang.dubbo.message.UserRequest;
import com.jianzhang.dubbo.message.UserResponse;

/**
 * @Description: 用户服务接口
 * @author Jian Jang
 * @version 1.0 2018/2/2
 */
public interface UserService {
    /**
     * 用户信息查询接口
     * @param request
     * @return
     */
    UserResponse queryUsers(UserRequest request);
}
