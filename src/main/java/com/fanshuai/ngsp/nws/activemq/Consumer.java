package com.fanshuai.ngsp.nws.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by fanshuai on 2017/9/23.
 * mq消息队列消费者
 */
@Component
public class Consumer {
    //对于消息队列的监听器
    @JmsListener(destination = "sample.queue")
    public void receiveQueue(String text) {
        System.out.println(text);
    }
}
