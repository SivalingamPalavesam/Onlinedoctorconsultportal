package com.onlinedoctorconsultationportal.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.onlinedoctorconsultationportal.entity.AdminInformationEntity;
import com.onlinedoctorconsultationportal.entity.Mail;
import com.onlinedoctorconsultationportal.service.AdminInformationService;
/**
 * 
 * @author Sivalingam 
 * @version 05/04/2022
 */
@RestController
public class AdminInformationController
{
	/**
	 * @Autowired the  AdminInformationService
	 */
	@Autowired
	AdminInformationService admininformationservice;
	@Autowired
	RestTemplate resttemplate;
	
	/**
	 * Insert the Admin  details
	 * Data insert Success boolean value return then
	 * @return String value "Admin Register Successfully"
	 */
	@RequestMapping(value="/adminRegData",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String adminInsertData(@RequestBody AdminInformationEntity admininformationentity)
	{
		boolean status = admininformationservice.adminInsertData(admininformationentity);
		
		if(status)
			return "Admin Register Successfully";
		else
			return "Invalid Data"; 
	}
	/**
	 * Method use in GET
	 * Get the all Admin details
	 * @return List
	 */
	@RequestMapping(value="/adminGetData",method = RequestMethod.GET)
	public List<AdminInformationEntity> getAdminData()
	{
		List<AdminInformationEntity> userval = admininformationservice.getAdminData();
		return userval;
	}
	/**
	 * microservices  hystrix used
	 * @return String
	 */	
	@PostMapping(value="/sendmail")
//	@HystrixCommand(fallbackMethod = "getFallBack")
	public ResponseEntity<String> callmailservicetogetdata(@RequestBody Mail mail) {
		ResponseEntity<String> res=resttemplate.postForEntity("http://localhost:8097/sendmail", mail, String.class);
		return res ;
	}
	public ResponseEntity<String> getFallBack(Mail mail) {
		return new ResponseEntity<String>("Mail Service is down....Please try after sometime", HttpStatus.ACCEPTED);
	}
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
