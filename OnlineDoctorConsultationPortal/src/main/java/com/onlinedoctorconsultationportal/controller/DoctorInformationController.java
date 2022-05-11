package com.onlinedoctorconsultationportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinedoctorconsultationportal.entity.DoctorInformationEntity;
import com.onlinedoctorconsultationportal.service.DoctorInformationService;
/**
 * 
 * @author Sivalingam 
 * @version 05/04/2022
 */
@RestController
public class DoctorInformationController 
{
	/**
	 * @Autowired the DoctorInformationService
	 */
	@Autowired
	DoctorInformationService doctorinformationservice;
	
	/**
	 * Insert the all doctor details
	 * Then Doctor details insert boolean value return 
	 * @return String value "Data insert Successfully"
	 */
	@RequestMapping(value="doctorInsertdata",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String doctorinsertData(@RequestBody DoctorInformationEntity doctorinformation)
	{
		boolean status = doctorinformationservice.doctorinsertData(doctorinformation);
		
		if(status)
			return "Data insert Successfully";
		else
			return "Invalid Data"; 
	}
	
	/**
	 * Method use in PUT
	 * Update the doctor details
	 * data is  update boolean value return 
	 * then  String value return The "update data is Successfully"
	 */
	@RequestMapping(value="doctorUpdateData",method = RequestMethod.PUT,consumes =MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateDoctorData(@RequestBody DoctorInformationEntity doctorinformation )
	{
		 boolean status = doctorinformationservice.updateDoctorData(doctorinformation);
		 if(status)
			 	return "The update data is Successfully";
		 else
		 		return "Invalid Data";
	}
	
	/**
	 * Method use in GET
	 * Get the all Doctor details
	 * @return List
	 */
	@RequestMapping(value="doctorGetData",method = RequestMethod.GET)
	public List<DoctorInformationEntity> getDoctorData()
	{
		List<DoctorInformationEntity> docval = doctorinformationservice.getDoctorData();
		return docval;
	}
	
	/**
	 * Method use in DELETE
	 * @param id
	 * data delete success boolean value return
	 * then String value is return "Data delete is successfully"
	 */
	@RequestMapping(value="doctorDeleteData",method = RequestMethod.DELETE)
	public String deleteDoctorData(@RequestParam ("doctorId")int id)
	{
		boolean status = doctorinformationservice.deleteDoctorData(id);
		if(status)
			return "Data delete is successfully";
		else
			return "Invalid data";
	}
	
}
