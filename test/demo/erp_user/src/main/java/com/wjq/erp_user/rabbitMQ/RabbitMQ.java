package com.wjq.erp_user.rabbitMQ;

import com.wjq.erp_user.utils.RabbitMQUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rabbitMQ")
public class RabbitMQ {

    @Autowired
    private RabbitMQUtil rabbitMQUtil;

    @RequestMapping("rabbitMQ")
    public void testRabbitMQ(){
        System.out.println("进入方法");
        rabbitMQUtil.testRabbitMQ();
    }
}
