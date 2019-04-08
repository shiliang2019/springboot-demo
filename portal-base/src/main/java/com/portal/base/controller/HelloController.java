package com.portal.base.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




//@EnableAutoConfiguration
@Controller
public class HelloController {

	// private final Logger logger = LoggerFactory.getLogger(HelloController.class);

	private  final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/log")
	@ResponseBody
	public Object testLog(){
		
		logger.debug("this is debug level");
		logger.info("this is info level ");
		logger.warn("this is warn level ");
		logger.error("this is error level");
		return "log";
	}
	
	@Value("${teacher.id}")
	private String id;

	@Value("${teacher.name}")
	private String name;

	@Value("${teacher.info}")
	private String info;

	@Value("${random.string}")
	private String ran;

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Test:  " + info;
		// return "Hello World";
	}

	@RequestMapping("/abc")
	@ResponseBody
	public String index2() {
		return "Test2:  " + ran;
	}

	// @ResponseBody
	@RequestMapping("/testThymeleaf")
	public String testThymeleaf(ModelMap map) {
		// 设置属性
		map.addAttribute("name", "roy");
		System.out.println("---testThymeleaf1");
		// testThymeleaf 表示模板文件的名称
		// 默认找src/main/resources/templates/testThymeleaf.html
		return "testThymeleaf";// 最好不要和URL一样
	}

	@RequestMapping("/testFreemarker")
	public String testFreemarker(Map<String, String> map) {
		map.put("name", "张小三");
		return "hello"; // 默认为src/main/resources/templates/hello.ftl
	}

	@RequestMapping("/exception")
	public String hello() throws Exception {
		throw new Exception("发生错误");
	}

//	public static void main(String[] args) {
//		SpringApplication.run(HelloController.class, args);
//	}
}
