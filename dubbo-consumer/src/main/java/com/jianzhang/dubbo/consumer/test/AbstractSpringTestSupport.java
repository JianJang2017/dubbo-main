package com.jianzhang.dubbo.consumer.test;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @Description:
 * @author Jian Jang
 * @version 1.0 2018/2/2
 */
@ContextConfiguration(locations = "classpath:/spring-basic.xml")
@Log4j2
public class AbstractSpringTestSupport extends AbstractJUnit4SpringContextTests {
	@Rule
	public TestName name = new TestName();

	@Before
	public void setUp() {
		log.info("调用测试方法: {}" + new Object[] { name.getMethodName() });
	}

	@After
	public void tearDown() {
		// TODO ...
	}

	public void logObject(Object obj) {
		if (obj == null) {
			log.debug("select null object");
		} else {
			log.debug(">>>>>>>>>>>>>>>>>>>>>>>" + ReflectionToStringBuilder.toString(obj));
		}
	}

}
