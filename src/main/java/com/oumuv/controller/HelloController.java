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

    @RequestMapping("/queue")
    public String say1(){
        SenderMessagesQueue();
        return "success";
    }

    @RequestMapping("/topic")
    public String say2(){
        SenderMessagesTopic();
        return "success";
    }

    public void SenderMessagesQueue() {
        for(int i=0; i<10; i++){
            producer.sendMessageQueue("myname is queue!!!"+i);
        }
    }

    public void SenderMessagesTopic() {
        for(int i=0; i<10; i++){
            producer.sendMessageTopic("myname is topic!!!"+i);
        }
    }

}

