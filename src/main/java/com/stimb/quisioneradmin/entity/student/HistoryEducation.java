package com.stimb.quisioneradmin.entity.student;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class HistoryEducation implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(nullable = true, length = 30)
	private String kindergarten;
	
	@Column(nullable = true, length = 20)
	private String addressKindergarten;
	
	@Column(nullable = true)
	private int yearGraduatedKindergarten;
	
	@Column(nullable = true, length = 30)
	private String elementarySchool;
	
	@Column(nullable = true, length = 20)
	private String addressElementarySchool;
	
	@Column(nullable = true)
	private int yearGraduatedElementarySchool;
	
	@Column(nullable = true, length = 30)
	private String juniorHighSchool;
	
	@Column(nullable = true, length = 20)
	private String addressJuniorHighSchool;
	
	@Column(nullable = true)
	private int yearGraduatedJuniorHighSchool;
	
	@Column(nullable = true, length = 30)
	private String seniorHighSchool;
	
	@Column(nullable = true, length = 30)
	private String FieldStudySeniorHighSchool;
	
	@Column(nullable = true, length = 20)
	private String addressSeniorHighSchool;
	
	@Column(nullable = true)
	private int yearGraduatedSeniorHighSchool;
	
	@Column(nullable = true, length = 30)
	private String universityName;
	
	@Column(nullable = true, length = 30)
	private String FieldStudyUniversity;
	
	@Column(nullable = true, length = 20)
	private String addressUniversity;
	
	@Column(nullable = true)
	private int yearGraduatedUniversity;
	
	public HistoryEducation()
	{
		
	}
	
	public HistoryEducation(String kindergarten, String addressKindergarten,
			int yearGraduatedKindergarten, String elementarySchool,
			String addressElementarySchool, int yearGraduatedElementarySchool,
			String juniorHighSchool, String addressJuniorHighSchool,
			int yearGraduatedJuniorHighSchool, String seniorHighSchool,
			String fieldStudySeniorHighSchool, String addressSeniorHighSchool,
			int yearGraduatedSeniorHighSchool, String universityName,
			String fieldStudyUniversity, String addressUniversity,
			int yearGraduatedUniversity) 
	{
		this.kindergarten = kindergarten;
		this.addressKindergarten = addressKindergarten;
		this.yearGraduatedKindergarten = yearGraduatedKindergarten;
		this.elementarySchool = elementarySchool;
		this.addressElementarySchool = addressElementarySchool;
		this.yearGraduatedElementarySchool = yearGraduatedElementarySchool;
		this.juniorHighSchool = juniorHighSchool;
		this.addressJuniorHighSchool = addressJuniorHighSchool;
		this.yearGraduatedJuniorHighSchool = yearGraduatedJuniorHighSchool;
		this.seniorHighSchool = seniorHighSchool;
		FieldStudySeniorHighSchool = fieldStudySeniorHighSchool;
		this.addressSeniorHighSchool = addressSeniorHighSchool;
		this.yearGraduatedSeniorHighSchool = yearGraduatedSeniorHighSchool;
		this.universityName = universityName;
		FieldStudyUniversity = fieldStudyUniversity;
		this.addressUniversity = addressUniversity;
		this.yearGraduatedUniversity = yearGraduatedUniversity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(String kindergarten) {
		this.kindergarten = kindergarten;
	}

	public String getAddressKindergarten() {
		return addressKindergarten;
	}

	public void setAddressKindergarten(String addressKindergarten) {
		this.addressKindergarten = addressKindergarten;
	}

	public int getYearGraduatedKindergarten() {
		return yearGraduatedKindergarten;
	}

	public void setYearGraduatedKindergarten(int yearGraduatedKindergarten) {
		this.yearGraduatedKindergarten = yearGraduatedKindergarten;
	}

	public String getElementarySchool() {
		return elementarySchool;
	}

	public void setElementarySchool(String elementarySchool) {
		this.elementarySchool = elementarySchool;
	}

	public String getAddressElementarySchool() {
		return addressElementarySchool;
	}

	public void setAddressElementarySchool(String addressElementarySchool) {
		this.addressElementarySchool = addressElementarySchool;
	}

	public int getYearGraduatedElementarySchool() {
		return yearGraduatedElementarySchool;
	}

	public void setYearGraduatedElementarySchool(int yearGraduatedElementarySchool) {
		this.yearGraduatedElementarySchool = yearGraduatedElementarySchool;
	}

	public String getJuniorHighSchool() {
		return juniorHighSchool;
	}

	public void setJuniorHighSchool(String juniorHighSchool) {
		this.juniorHighSchool = juniorHighSchool;
	}

	public String getAddressJuniorHighSchool() {
		return addressJuniorHighSchool;
	}

	public void setAddressJuniorHighSchool(String addressJuniorHighSchool) {
		this.addressJuniorHighSchool = addressJuniorHighSchool;
	}

	public int getYearGraduatedJuniorHighSchool() {
		return yearGraduatedJuniorHighSchool;
	}

	public void setYearGraduatedJuniorHighSchool(int yearGraduatedJuniorHighSchool) {
		this.yearGraduatedJuniorHighSchool = yearGraduatedJuniorHighSchool;
	}

	public String getSeniorHighSchool() {
		return seniorHighSchool;
	}

	public void setSeniorHighSchool(String seniorHighSchool) {
		this.seniorHighSchool = seniorHighSchool;
	}

	public String getFieldStudySeniorHighSchool() {
		return FieldStudySeniorHighSchool;
	}

	public void setFieldStudySeniorHighSchool(String fieldStudySeniorHighSchool) {
		FieldStudySeniorHighSchool = fieldStudySeniorHighSchool;
	}

	public String getAddressSeniorHighSchool() {
		return addressSeniorHighSchool;
	}

	public void setAddressSeniorHighSchool(String addressSeniorHighSchool) {
		this.addressSeniorHighSchool = addressSeniorHighSchool;
	}

	public int getYearGraduatedSeniorHighSchool() {
		return yearGraduatedSeniorHighSchool;
	}

	public void setYearGraduatedSeniorHighSchool(int yearGraduatedSeniorHighSchool) {
		this.yearGraduatedSeniorHighSchool = yearGraduatedSeniorHighSchool;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getFieldStudyUniversity() {
		return FieldStudyUniversity;
	}

	public void setFieldStudyUniversity(String fieldStudyUniversity) {
		FieldStudyUniversity = fieldStudyUniversity;
	}

	public String getAddressUniversity() {
		return addressUniversity;
	}

	public void setAddressUniversity(String addressUniversity) {
		this.addressUniversity = addressUniversity;
	}

	public int getYearGraduatedUniversity() {
		return yearGraduatedUniversity;
	}

	public void setYearGraduatedUniversity(int yearGraduatedUniversity) {
		this.yearGraduatedUniversity = yearGraduatedUniversity;
	}

}
