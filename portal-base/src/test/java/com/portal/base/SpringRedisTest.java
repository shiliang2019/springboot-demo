package com.portal.base;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = Application.class)
//@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SpringRedisTest {
	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Test
	public void testRedis() throws Exception {
		ValueOperations<String, String> ops = redisTemplate.opsForValue();
		ops.set("name111", "zhangsan");
		String value = ops.get("name111");
		System.out.println(value);
		TestCase.assertEquals("zhangsan", value);
	}
}