package com.wjq.erp_user.utils;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ConsumerRecieverMQ {

    @RabbitHandler
    @RabbitListener(queues = "demo")
    public void testUse(String msg) throws IOException {
        System.out.println(msg);

    }

}
