package com.example.demo.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;


@Service
public class OrderConsumer {

	@KafkaListener(topics = {"order_events"},groupId = "group-invontory")
	public void consume(String data)
	{
		
		if(data!="ggg")
			System.out.println("quantity not avaliable");
		else
			System.out.println("quantity is avaliable");
	}
	
}
