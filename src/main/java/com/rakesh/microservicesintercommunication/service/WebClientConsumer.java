package com.rakesh.microservicesintercommunication.service;

import java.time.Duration;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.rakesh.microservicesintercommunication.model.Users;

import reactor.core.publisher.Mono;

@Component
public class WebClientConsumer {

	private static final  String user_url="https://api.github.com/users/amila";
	 public Mono<Users> webClientConsumer(){
		 
		 
		 return WebClient.create()
	         .get()
	         .uri(user_url)
	         .retrieve()
	         .bodyToMono(Users.class)
	         .timeout(Duration.ofSeconds(15));
	 
	 }
}
