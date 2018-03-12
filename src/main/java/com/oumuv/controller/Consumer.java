package com.oumuv.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @JmsListener(destination = "mytest.queue")
    public void receiQueue(String text) {
        System.out.println("Queue接收到消息："+text);
    }
//
//    @JmsListener(destination = "mytest.topic")
//    public void receiTopic(String text) {
//        System.out.println("Topic接收到消息："+text);
//    }
}
