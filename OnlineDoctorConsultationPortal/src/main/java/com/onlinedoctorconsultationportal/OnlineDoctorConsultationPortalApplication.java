package com.onlinedoctorconsultationportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
@EnableCircuitBreaker
public class OnlineDoctorConsultationPortalApplication {

	public static void main(String[] args)
	{ 
		SpringApplication.run(OnlineDoctorConsultationPortalApplication.class, args);
	}

}
