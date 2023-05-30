package com.rakesh.microservicesintercommunication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//for feign
@EnableFeignClients
public class MicroservicesIntercommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesIntercommunicationApplication.class, args);
	}

}
