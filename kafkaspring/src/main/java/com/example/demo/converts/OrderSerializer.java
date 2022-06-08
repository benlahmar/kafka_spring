package com.example.demo.converts;

import org.apache.kafka.common.serialization.Serializer;

import com.example.demo.model.OrderDto;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OrderSerializer implements Serializer<OrderDto>{

	@Override
	public byte[] serialize(String topic, OrderDto data) {
		byte[] retVal = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
        	retVal = objectMapper.writeValueAsString(data).getBytes();
        	
        } catch (Exception exception) {
        	System.out.println("Error in serializing object"+ data);
        }
        return retVal;
	}

}
