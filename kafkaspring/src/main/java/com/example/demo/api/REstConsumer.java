package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class REstConsumer {

	@GetMapping("/test/consom")
	public void consom()
	{
		//consommation
	}
}
