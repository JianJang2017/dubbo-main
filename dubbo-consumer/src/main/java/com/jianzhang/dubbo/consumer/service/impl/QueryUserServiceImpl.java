/**
 * Copyright 2017 by FREEMYPAL. Tianhua Information Technology Park (South) Building 4, 4th Floor,
 * Longtian Road 195,Shanghai, P.R. China，200235. All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of FREEMYPAL
 * ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with FREEMYPAL.
 */
package com.jianzhang.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jianzhang.dubbo.consumer.service.QueryUserService;
import com.jianzhang.dubbo.message.User;
import com.jianzhang.dubbo.message.UserRequest;
import com.jianzhang.dubbo.message.UserResponse;
import com.jianzhang.dubbo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 服务实现类
 * @author Jian Jang
 * @version 1.0 2018/2/2
 */
@Service
public class QueryUserServiceImpl implements QueryUserService {
	@Reference(version = "1.0.0")
	private UserService userService;

	@Override
	public List<User> queryUsers(User user) {
		UserRequest request = new UserRequest();
		request.setId(2001l);
		request.setUsername("xxxx");
		UserResponse response = userService.queryUsers(request);
		if (response != null) {
			return response.getUserList();
		}
		return null;
	}
}
