package com.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceAppApplication.class, args);
	}

}
