package com.example.demo.converts;


import org.apache.kafka.common.serialization.Deserializer;

import com.example.demo.model.StockDto;
import com.fasterxml.jackson.databind.ObjectMapper;


public class StockDtoDeserialize implements Deserializer<StockDto>{

	@Override
	public StockDto deserialize(String topic, byte[] data) {
		
		ObjectMapper mapper = new ObjectMapper();
		StockDto object = null;
        try {
        		object = mapper.readValue(data, StockDto.class);
        } catch (Exception exception) {
        		System.out.println("Error in deserializing bytes "
        + exception);
        }
        
		return object;
	}

}
