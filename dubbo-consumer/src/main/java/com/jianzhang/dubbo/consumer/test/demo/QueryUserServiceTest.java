package com.jianzhang.dubbo.consumer.test.demo;

import com.alibaba.fastjson.JSONObject;
import com.jianzhang.dubbo.consumer.service.QueryUserService;
import com.jianzhang.dubbo.consumer.test.AbstractSpringTestSupport;
import com.jianzhang.dubbo.message.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
/**
 * @Description:
 * @author Jian Jang
 * @version 1.0 2018/2/2
 */
public class QueryUserServiceTest extends AbstractSpringTestSupport {
	@Autowired
	QueryUserService queryUserService;

	@Test
	public void testQueryUsers() {
		User user = new User();
		user.setId(2001l);
		user.setUsername("xxx");
		List<User> list = queryUserService.queryUsers(user);
		log.info("response:{}", JSONObject.toJSONString(list));
	}
}
