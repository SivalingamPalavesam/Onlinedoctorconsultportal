package com.onlinedoctorconsultationportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Sivalingam 
 * @version 05/04/2022
 */
@Entity
@Table(name="userinformation")
public class UserInformationEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="patientsId")
	private int patientsId;
	
	@Column(name="patientName")
	private String patientName;	
	
	@Column(name="password")
	private String password;
	
	@Column(name="patientGender")
	private String patientGender;
	
	@Column(name="patientlocation")
	private String patientlocation;
	
	@Column(name="patientMailId")
	private String patientMailId;
	
	@Column(name="patientProblem")
	private String patientProblem;

	public int getPatientsId() {
		return patientsId;
	}

	public void setPatientsId(int patientsId) {
		this.patientsId = patientsId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientlocation() {
		return patientlocation;
	}

	public void setPatientlocation(String patientlocation) {
		this.patientlocation = patientlocation;
	}

	public String getPatientMailId() {
		return patientMailId;
	}

	public void setPatientMailId(String patientMailId) {
		this.patientMailId = patientMailId;
	}

	public String getPatientProblem() {
		return patientProblem;
	}

	public void setPatientProblem(String patientProblem) {
		this.patientProblem = patientProblem;
	}
	
	
}
