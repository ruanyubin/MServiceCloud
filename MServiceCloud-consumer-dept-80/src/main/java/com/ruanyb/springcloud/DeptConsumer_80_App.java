package com.ruanyb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer_80_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_80_App.class, args);
	}
}
