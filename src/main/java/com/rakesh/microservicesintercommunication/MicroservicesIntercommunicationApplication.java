package com.rakesh.microservicesintercommunication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
//for feign
//@EnableFeignClients
//for webclient
//@EnableWebFlux

public class MicroservicesIntercommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesIntercommunicationApplication.class, args);
	}

}
