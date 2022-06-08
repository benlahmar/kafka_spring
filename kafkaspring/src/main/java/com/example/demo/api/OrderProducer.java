package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderDto;

@RestController
public class OrderProducer {

	@Autowired
	KafkaTemplate<String, OrderDto> template;
	
	@PostMapping("/order")
	public String addorder(@RequestBody OrderDto order)
	{
		
		 template.send("order_events",order);
		
		return "aa";
	}
}
