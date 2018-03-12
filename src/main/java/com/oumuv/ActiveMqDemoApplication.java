package com.oumuv;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;
import javax.jms.Topic;

@SpringBootApplication
@EnableJms
public class ActiveMqDemoApplication {
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("mytest.queue");
	}
	@Bean
	public Topic topic() {
		return new ActiveMQTopic("mytest.topic");
	}
	public static void main(String[] args) {
		SpringApplication.run(ActiveMqDemoApplication.class, args);
	}


}
