package com.onlinedoctorconsultationportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.onlinedoctorconsultationportal.entity.AdminInformationEntity;
import com.onlinedoctorconsultationportal.repo.AdminInformationRepos;
/**
 * 
 * @author Sivalingam 
 * @version 05/04/2022
 */
@Service
public class AdminInformationService 
{
	@Autowired
	AdminInformationRepos admininformationrepos;
	
	
	public boolean adminInsertData(AdminInformationEntity admininformationentity)
	{
		boolean value=false;
		admininformationrepos.save(admininformationentity);
		value = true;
		return value;
	}
	public List<AdminInformationEntity> getAdminData() {
		return admininformationrepos.findAll();
	}

}
