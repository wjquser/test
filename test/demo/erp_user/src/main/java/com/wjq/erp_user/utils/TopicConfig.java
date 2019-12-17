package com.wjq.erp_user.utils;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TopicConfig {

    @Bean
    public Queue coreQueue(){
        return new Queue("demo");
    }

    @Bean
    public TopicExchange coreExchange(){
        return new TopicExchange("demo");
    }

    @Bean
    public Binding bindCoreQueueExchange(Queue coreQueue,TopicExchange coreExchange){
        return BindingBuilder.bind(coreQueue).to(coreExchange).with("demo");
    }

}
