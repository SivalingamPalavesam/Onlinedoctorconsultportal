//package com.onlinedoctorconsultationportal.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//
//@Service
//public class hystrixService 
//{
//	@Autowired
//	private RestTemplate template;
//	
//	@HystrixCommand(fallbackMethod = "getFallBack")
//	public String callPatientServiceAndGetData()
//	{
//		ResponseEntity<List<Object>> list = template.exchange("http://localhost:8082/getallValue",
//				HttpMethod.GET, 
//				null,
//				new ParameterizedTypeReference<List<Object>>() {
//				});
//		Res
//		return "success";
//		
//	}
//	
//	@Bean
//	public RestTemplate getrestTemplate(){
//		return new RestTemplate();
//	}
//	
//	public String getFallBack() {
//		return "SERVICE IS DOWN..TRY AGAIN";
//	}
//}
