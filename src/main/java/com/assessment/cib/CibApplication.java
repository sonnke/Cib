package com.assessment.cib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CibApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(CibApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate(){
	      return new RestTemplate();
	   }

}
