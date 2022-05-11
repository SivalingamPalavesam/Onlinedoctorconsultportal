package com.onlinedoctorconsultationportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinedoctorconsultationportal.entity.UserInformationEntity;
import com.onlinedoctorconsultationportal.service.UserInformationService;
/**
 * 
 * @author Sivalingam 
 * @version 05/04/2022
 */
@RestController
public class UserInformationcontroller
{
	/**
	 * Autowired the UserInformationService class
	 */
	@Autowired
	UserInformationService userinformationservice;
	
	/**
	 * Insert the all Patient details
	 * @return String value "Data insert Successfully"
	 */
	@RequestMapping(value="/insertdata",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String patientinsertData(@RequestBody UserInformationEntity userinformationentity)
	{
		boolean status = userinformationservice.patientinsertData(userinformationentity);

		if(status)
			return "Data insert Successfully";
		else
			return "Invalid Data"; 
	}
	
	/**
	 * Method use in PUT
	 * Update the Patient details
	 * @return boolean value return then String value return The "update data is Successfully"
	 */
	@RequestMapping(value = "updateData",method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String updatePatientData(@RequestBody UserInformationEntity userinformationentity )
	{
		boolean status = userinformationservice.updatePatientData(userinformationentity);
		if(status)
			return "The update data is Successfully";
		else
			return "Invalid Data";
	}
	
	/**
	 * Method use in GET
	 * Get the all Patient details
	 * @return List
	 */
	@RequestMapping(value="/getallData",method = RequestMethod.GET )
	public List<UserInformationEntity> getPatientData()
	{
		List<UserInformationEntity> userval = userinformationservice.getPatientData();
		return userval;
	}
	
	/**
	 * Method use in DELETE
	 * @param id
	 * @return boolean value return then value is delete String value is return "Data delete is successfully"
	 */
	@RequestMapping(value="/deleteData",method = RequestMethod.DELETE)
	public String deletePatientData(@RequestParam ("patientsId")int id)
	{
		boolean status = userinformationservice.deletePatientData(id);
		if(status)
			return "Data delete is successfully";
		else
			return "Invalid data";
	}
	
	/**
	 * Method use in GET
	 * FindByPatientMailId use in patient Register or not check
	 * @return patient all details display
	 */
	@RequestMapping(value="/getMailId",method = RequestMethod.GET)
	public UserInformationEntity findByPatientMailId(@RequestBody UserInformationEntity userinformation )
	{
		return userinformationservice.findByPatientMailId(userinformation);	
	}		
}
