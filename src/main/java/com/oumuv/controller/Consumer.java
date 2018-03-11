package com.oumuv.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @JmsListener(destination = "mytest.queue")
    public void receiQueue(String text) {
        System.out.println("接收到消息："+text);
    }
}
