package com.smartway.smartwaydepservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmartwayDepServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartwayDepServiceApplication.class, args);
	}

}
