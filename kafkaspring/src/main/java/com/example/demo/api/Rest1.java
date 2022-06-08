package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest1 {
	
	@Autowired
	KafkaTemplate<String, String> template;

	@GetMapping("/test/{msg}")
	public String abc(@PathVariable String msg)
	{
		template.send("alpha",msg);
		
		return "test rest api";
	}
}
