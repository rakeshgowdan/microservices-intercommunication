package com.rakesh.microservicesintercommunication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.microservicesintercommunication.model.Users;
import com.rakesh.microservicesintercommunication.service.WebClientConsumer;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/webClient/users")
public class WebClienUsageController {
	
	@Autowired
	private WebClientConsumer consumer;
	
	@GetMapping(value="/getDataByWebClient", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Users> getUser() {
		return consumer.webClientConsumer();
		
	}

}
