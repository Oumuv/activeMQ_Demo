package com.oumuv;

import com.sun.xml.internal.ws.resources.SenderMessages;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Destination;
import javax.jms.Queue;

@SpringBootApplication
@EnableJms
public class ActiveMqDemoApplication {
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("mytest.queue");
	}
	public static void main(String[] args) {
		SpringApplication.run(ActiveMqDemoApplication.class, args);
	}


}
