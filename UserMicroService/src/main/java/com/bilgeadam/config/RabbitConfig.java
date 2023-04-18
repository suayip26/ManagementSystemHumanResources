package com.bilgeadam.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Value("${rabbitmq.queueRegister}")
    private String queueNameRegister;
    @Bean
    Queue registerQueue() {
        return new Queue(queueNameRegister);
    }
    @Value("${rabbitmq.changestatusqueue}")
    private String changeStatusQueue;
    @Bean
    Queue changeStatusQueue() {
        return new Queue(changeStatusQueue);
    }
}