package com.rakesh.microservicesintercommunication.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import com.rakesh.microservicesintercommunication.model.Users;

@FeignClient(value = "userDetails",url = "https://api.github.com")
public interface FeignClientConsumer {
	
   @GetMapping( 
		   value = "/users/amila", 
		   produces= "application/json") 
   Users getUserByFeign(); 
}
