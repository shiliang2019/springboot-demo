package com.portal.base.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
	@Bean
	public Queue firstQueue() {
		// 创建一个队列，名称为：first
		return new Queue("first");
	}
}