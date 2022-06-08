package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaspringinvotoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaspringinvotoryApplication.class, args);
	}

}
