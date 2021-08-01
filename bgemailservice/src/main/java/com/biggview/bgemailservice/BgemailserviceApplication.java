package com.biggview.bgemailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableEurekaClient
public class BgemailserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgemailserviceApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/sendEmail").allowedOrigins("http://localhost:3000","https://biggview.com/","www.biggview.com","https://148.72.244.22:3000","https://148.72.244.22:8080","https://www.biggview.com");
			}
		};
	}



}
