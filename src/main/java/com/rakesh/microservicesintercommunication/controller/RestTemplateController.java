package com.rakesh.microservicesintercommunication.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.microservicesintercommunication.model.Users;
import com.rakesh.microservicesintercommunication.service.RestTemplateConsumer;

@RestController
@RequestMapping("/api/users")
public class RestTemplateController {

	@Autowired
	 private RestTemplateConsumer restTemplateConsumer;
	 
	 @GetMapping("/getForEntity")
	 public Users getForEntity(){
	  return restTemplateConsumer.getForEntity();
	 }
	 
	 @GetMapping("/getForObject")
	 public Users getForObject(){
	  return restTemplateConsumer.getForObject();
	 }
	 
	 @GetMapping("/getHeaders")
	 public Map<String, String> getHeaders(){
	  return restTemplateConsumer.getHeaders();
	 }
}
