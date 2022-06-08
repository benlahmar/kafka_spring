package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@SpringBootApplication
public class KafkaspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaspringApplication.class, args);
	}

	@Bean
	public NewTopic createtopic()
	{
		NewTopic tp = TopicBuilder.name("order_events")
		.partitions(5)
		.replicas(1)
		.build();
		return tp;
	}
//	
//	@Bean
//	public NewTopic createtopic2()
//	{
//		NewTopic tp = TopicBuilder.name("beta")
//		.partitions(4)
//		.replicas(1)
//		.build();
//		return tp;
//	}
//	
//	@Bean
//	public ApplicationRunner exec(KafkaTemplate<String, String> template)
//	{
//		System.out.println("gggggggggg");
//		return x ->{
//			template.send("alpha", "salut");
//		};
//	}
//	
//	
//	/*@Bean
//	public Map<String, Object> producerConfigs3() {
//	    Map<String, Object> props = new HashMap<>();
//	    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//	    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//	    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//	    // See https://kafka.apache.org/documentation/#producerconfigs for more properties
//	    return props;
//	}
//
//	 @Bean
//		public ProducerFactory<String, String> producerFactory3() {
//		    return new DefaultKafkaProducerFactory<>(producerConfigs3());
//		}
//	 
//	 
////	//@Bean
////	public KafkaTemplate<String, String> kafkaTemplate() {
////	    return new KafkaTemplate<String, String>(producerFactory3());
////	}
//	*/
}
