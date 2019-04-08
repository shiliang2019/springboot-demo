package com.portal.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.portal.base.domain.User;
import com.portal.base.mapper.UserMapper;

import junit.framework.TestCase;

@SpringBootTest(classes=Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MybatisTest {
	
	@Autowired
	private UserMapper userMapper;
	

	@Test
	public void testInsert(){
		int num = this.userMapper.insert("张小三", 25, "湖南省长沙市岳麓区xxx", "1232323");
		TestCase.assertEquals(1, num);
	}
	
	@Test
	public void testFindById(){
		User user = this.userMapper.findById(1);
		System.out.println(user);
		TestCase.assertEquals("张小三", user.getName());
		
	}
}
