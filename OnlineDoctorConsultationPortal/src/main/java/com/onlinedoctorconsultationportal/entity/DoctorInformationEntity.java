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
@Table(name="DoctorInformation")
public class DoctorInformationEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="doctorId")
	private int doctorId;
	
	@Column(name="doctorName")
	private String doctorName;
	
	@Column(name="doctormailId")
	private String doctormailId;

	@Column(name="password")
	private String password;
	
	@Column(name="doctorlocation")
	private String doctorlocation;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="doctorCategory")
	private String doctorCategory;
	
	@Column(name="doctorTimeing")
	private String doctorTimeing;

	@Column(name="doctorfees")
	private int doctorfees;
	
	@Column(name="doctorExperienceYear")
	private float doctorExperienceYear;

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctormailId() {
		return doctormailId;
	}

	public void setDoctormailId(String doctormailId) {
		this.doctormailId = doctormailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDoctorlocation() {
		return doctorlocation;
	}

	public void setDoctorlocation(String doctorlocation) {
		this.doctorlocation = doctorlocation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDoctorCategory() {
		return doctorCategory;
	}

	public void setDoctorCategory(String doctorCategory) {
		this.doctorCategory = doctorCategory;
	}

	public String getDoctorTimeing() {
		return doctorTimeing;
	}

	public void setDoctorTimeing(String doctorTimeing) {
		this.doctorTimeing = doctorTimeing;
	}

	public int getDoctorfees() {
		return doctorfees;
	}

	public void setDoctorfees(int doctorfees) {
		this.doctorfees = doctorfees;
	}

	public float getDoctorExperienceYear() {
		return doctorExperienceYear;
	}

	public void setDoctorExperienceYear(float doctorExperienceYear)
	{
		this.doctorExperienceYear = doctorExperienceYear;
	}
}
