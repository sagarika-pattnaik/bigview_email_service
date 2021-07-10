package com.biggview.bgemailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BgemailserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgemailserviceApplication.class, args);
	}

}
