package com.oumuv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

@Service("producer")
public class Producer {
    @Autowired
    // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;
    @Autowired
    private Topic topic;
    // 发送消息，destination是发送到的队列，message是待发送的消息
    //发送队列消息
    public void sendMessageQueue(/*Destination destination, final*/ String message){
        jmsMessagingTemplate.convertAndSend(queue, message);
    }

    //发送主题消息
    public void sendMessageTopic(/*Destination destination, final*/ String message){
        jmsMessagingTemplate.convertAndSend(topic, message);
    }

}
