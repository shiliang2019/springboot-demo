package com.portal.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.portal.base.controller.HelloController;

import junit.framework.TestCase;

@SpringBootTest(classes=HelloController.class)
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloControllerTest {
	
	@Autowired
	private HelloController controller;
	

	@Test
	public void testIndex(){
		String result = controller.index();
		System.out.println(result);
		//TestCase.assertEquals("Hello World Roy bbbbbbb !!!", result);
	}
}
