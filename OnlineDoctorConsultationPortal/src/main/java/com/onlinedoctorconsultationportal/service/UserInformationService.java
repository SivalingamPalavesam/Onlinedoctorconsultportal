package com.onlinedoctorconsultationportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.onlinedoctorconsultationportal.entity.UserInformationEntity;
import com.onlinedoctorconsultationportal.repo.UserInformationRepos;

@Service
public class UserInformationService
{
	@Autowired
	UserInformationRepos userinformationrepos;
	public boolean patientinsertData(UserInformationEntity userinformationentity)
	{
			boolean flag =false;
			userinformationrepos.save(userinformationentity);
			flag = true;
			return flag;
	}
	public List<UserInformationEntity> getPatientData()
	{
		List<UserInformationEntity> userVal = userinformationrepos.findAll();
		return userVal;
	}
	public boolean updatePatientData(UserInformationEntity userinformationentity) 
	{
		boolean flag = false;
		userinformationrepos.saveAndFlush(userinformationentity);
		flag = true;
		return flag;
	}
	public boolean deletePatientData(int patientsId) {
		boolean flag =false;
		userinformationrepos.deleteById(patientsId);
		flag= true;
		return flag;
	}
	public UserInformationEntity findByPatientMailId(UserInformationEntity patientMailId )
	{
		return userinformationrepos.findByPatientMailId(patientMailId.getPatientMailId());
		
	}
}
