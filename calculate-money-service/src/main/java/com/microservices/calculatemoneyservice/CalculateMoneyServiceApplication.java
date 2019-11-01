package com.microservices.calculatemoneyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservices.calculatemoneyservice.service.proxy")
@EnableEurekaClient
public class CalculateMoneyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculateMoneyServiceApplication.class, args);
	}

}
