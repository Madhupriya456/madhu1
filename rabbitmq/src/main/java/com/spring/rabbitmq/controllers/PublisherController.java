package com.spring.rabbitmq.controllers;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rabbitmq.beans.Message;
import com.spring.rabbitmq.configuration.ProducerConfig;

@RestController
public class PublisherController 
{
	
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping("/publish")
    public String publishMessage(@RequestBody Message bean)
    {
    	bean.setId(UUID.randomUUID().toString());
    	bean.setMeassageDate(new Date());
    	template.convertAndSend(ProducerConfig.EXCHANGE, ProducerConfig.ROUTING_KEY, bean);
    	return "Message Published";
    }
}
