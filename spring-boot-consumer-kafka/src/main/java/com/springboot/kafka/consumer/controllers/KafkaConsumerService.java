package com.springboot.kafka.consumer.controllers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springboot.kafka.consumer.entities.User;

@Service
public class KafkaConsumerService {

	
	
	  @KafkaListener(topics="kafkatopic1",
	  containerFactory="kafkaListenerContainerFactory", groupId="string_group")
	  public void stringConsume(String message) {
	  System.out.println("String message consumed!!" +message); }
	 
	 
	  
	  @KafkaListener(topics="kafkatopic2",containerFactory="jsonKafkaListenerContainerFactory", groupId="json_group")
	  public void jsonConsume(User user) { 
		  System.out.println("Json message consumed!!" +user);
	  }
	 
	  
	 
	
}
