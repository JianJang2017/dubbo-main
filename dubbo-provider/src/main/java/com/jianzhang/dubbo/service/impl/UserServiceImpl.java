package com.jianzhang.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.jianzhang.dubbo.message.User;
import com.jianzhang.dubbo.message.UserRequest;
import com.jianzhang.dubbo.message.UserResponse;
import com.jianzhang.dubbo.service.UserService;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author Jian Jang
 * @version 1.0 2018/2/2
 */
@Log4j2
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
	@Override
	public UserResponse queryUsers(UserRequest userRequest) {
		Gson gson = new Gson();
		log.info("request:{}", gson.toJson(userRequest, UserRequest.class));
		List<User> userList = new ArrayList<>();
		User user = new User();
		user.setId(2001l);
		user.setUsername("张三");
		user.setEmail("zhangan@qq.com");
		user.setAge(25);
		userList.add(user);
		User user1 = new User();
		user1.setId(2002l);
		user1.setUsername("李四");
		user1.setEmail("lisi@qq.com");
		user1.setAge(23);
		userList.add(user1);
		UserResponse response = new UserResponse();
		response.setUserList(userList);
		log.info("response:{}", JSONObject.toJSONString(response));
		return response;
	}
}
