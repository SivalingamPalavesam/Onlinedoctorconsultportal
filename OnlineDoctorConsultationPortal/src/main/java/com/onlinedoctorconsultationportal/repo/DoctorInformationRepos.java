package com.onlinedoctorconsultationportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinedoctorconsultationportal.entity.DoctorInformationEntity;

/**
 * 
 * @author Sivalingam 
 * @version 05/04/2022
 */
@Repository
public interface DoctorInformationRepos  extends JpaRepository<DoctorInformationEntity, Integer> 

{
	
}
