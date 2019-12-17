package com.wjq.erp_user.utils;

import com.alibaba.fastjson.JSON;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class RabbitMQUtil {

    @Autowired
    private RabbitMessagingTemplate rabbitMessagingTemplate;

    public void testRabbitMQ(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("age",18);
        map.put("sex","男");
        try {
            rabbitMessagingTemplate.convertAndSend("demo","demo", JSON.toJSONString(map));
            System.out.println("发送成功");
        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("发送失败");
        }
    }
}
