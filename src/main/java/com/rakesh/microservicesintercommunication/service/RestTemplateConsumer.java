package com.rakesh.microservicesintercommunication.service;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.rakesh.microservicesintercommunication.model.Users;

@Component
public class RestTemplateConsumer {
	
	private static final  String user_url="https://api.github.com/users/amila";

	public Users getForEntity() {
		  RestTemplate restTemplate = new RestTemplate();
		  ResponseEntity<Users> response= restTemplate.getForEntity(user_url, Users.class);
		  return response.getBody();
		 }
		 
		 public Users getForObject() {
		  RestTemplate restTemplate = new RestTemplate();
		  Users users= restTemplate.getForObject(user_url, Users.class);
		  return users;
		 }
		 
		 public Map<String, String> getHeaders() {
		  RestTemplate restTemplate = new RestTemplate();
		  org.springframework.http.HttpHeaders httpHeaders = restTemplate.headForHeaders(user_url);
		  Map<String, String> headerContent=new HashMap<>();
		  httpHeaders.forEach((key, value) -> {
		   headerContent.put(String.format(
		            "Header '%s'", key),String.format( value.stream().collect(Collectors.joining("|"))));
		      });
		  return headerContent;
		 }
}
