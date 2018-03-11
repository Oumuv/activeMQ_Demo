package com.oumuv.controller;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

@RestController
public class HelloController {

    @Autowired
    private Producer producer;

    @RequestMapping("/hello")
    public String say(){
        SenderMessages();
        return "success";
    }

    public void SenderMessages() {
        Destination destination = new ActiveMQQueue("mytest.queue");
        for(int i=0; i<100; i++){
            producer.sendMessage(destination,"myname is chhliu!!!"+i);
        }
    }

}

