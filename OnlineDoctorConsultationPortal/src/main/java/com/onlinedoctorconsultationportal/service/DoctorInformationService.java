package com.onlinedoctorconsultationportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinedoctorconsultationportal.entity.DoctorInformationEntity;
import com.onlinedoctorconsultationportal.repo.DoctorInformationRepos;
/**
 * 
 * @author Sivalingam 
 * @version 05/04/2022
 */
@Service
public class DoctorInformationService
{
	@Autowired
	DoctorInformationRepos doctorinformationrepos;
	public boolean doctorinsertData(DoctorInformationEntity doctorinformation)
	{
				boolean flag =false;
				doctorinformationrepos.save(doctorinformation);
				flag = true;
				return flag;
	}
	public boolean updateDoctorData(DoctorInformationEntity doctorinformation)
	{
		boolean flag = false;
		doctorinformationrepos.saveAndFlush(doctorinformation);
		flag = true;
		return flag;
	}
	public List<DoctorInformationEntity> getDoctorData()
	{
			List<DoctorInformationEntity> userVal = doctorinformationrepos.findAll();
			return userVal;
	}
	public boolean deleteDoctorData(int doctorId)
	{
		boolean flag =false;
		doctorinformationrepos.deleteById(doctorId);
		flag= true;
		return flag;
		
	}
	

}
