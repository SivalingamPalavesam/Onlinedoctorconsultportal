package com.onlinedoctorconsultationportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author Sivalingam 
 * @version 05/04/2022
 */
@Entity
@Table(name="AdminInformation")
public class AdminInformationEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="adminID")
	private int adminID;
	
	@Column(name="adminUserName")
	private String adminUserName;
	
	@Column(name="password")
	private String password;
	
	@OneToOne
	@JoinColumn(name ="doctorId" )
	private DoctorInformationEntity doctorInformationEntity;
	

	@OneToOne
	@JoinColumn(name ="patientsId" )
	private UserInformationEntity userInformationEntity;
	
	

	public DoctorInformationEntity getDoctorInformationEntity() {
		return doctorInformationEntity;
	}

	public void setDoctorInformationEntity(DoctorInformationEntity doctorInformationEntity) {
		this.doctorInformationEntity = doctorInformationEntity;
	}

	public UserInformationEntity getUserInformationEntity() {
		return userInformationEntity;
	}

	public void setUserInformationEntity(UserInformationEntity userInformationEntity) {
		this.userInformationEntity = userInformationEntity;
	}

	public int getAdminID() 
	{
		return adminID;
	}

	public void setAdminID(int adminID)
	{
		this.adminID = adminID;
	}

	public String getAdminUserName() 
	{
		return adminUserName;
	}

	public void setAdminUserName(String adminUserName) 
	{
		this.adminUserName = adminUserName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	
	
}
