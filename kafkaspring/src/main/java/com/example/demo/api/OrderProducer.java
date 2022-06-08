package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderDto;
import com.example.demo.model.StockDto;

@RestController
public class OrderProducer {

	@Autowired
	KafkaTemplate<String, OrderDto> template;
	
	 static StockDto datainput=null;;
	
	@PostMapping("/order")
	public OrderDto addorder(@RequestBody OrderDto order)
	{
		
		ListenableFuture<SendResult<String, OrderDto>> ff = template.send("order_events",order);
		 
		 System.out.println( datainput.getFlag());
		 
		 
		return order;
	}
	
	@KafkaListener(topics = "inventory_events", groupId = "inventory_id")
	public StockDto recive(StockDto data  )
	{
		this.datainput=data;
		if(data.getFlag().equals("not-avaliable"))
				{
					System.out.println(" message de stock:  product is not-avaliable");
					return data;
				}
		else
		{
			System.out.println(" message de stock:  product is valiable");
			return data;
		}
		
		
	}
}
