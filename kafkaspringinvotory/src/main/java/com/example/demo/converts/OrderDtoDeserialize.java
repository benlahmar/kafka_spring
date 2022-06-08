package com.example.demo.converts;


import org.apache.kafka.common.serialization.Deserializer;

import com.example.demo.models.OrderDto;
import com.fasterxml.jackson.databind.ObjectMapper;


public class OrderDtoDeserialize implements Deserializer<OrderDto>{

	@Override
	public OrderDto deserialize(String topic, byte[] data) {
		
		ObjectMapper mapper = new ObjectMapper();
		OrderDto object = null;
        try {
        		object = mapper.readValue(data, OrderDto.class);
        } catch (Exception exception) {
        		System.out.println("Error in deserializing bytes "
        + exception);
        }
        
		return null;
	}

}
