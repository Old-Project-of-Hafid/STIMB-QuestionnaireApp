package com.stimb.quisioneradmin.entity.student;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class ParentStudent implements Serializable  
{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(nullable = true, length = 40)
	private String fatherName; 
	
	@Column(nullable = true, length = 15)
	private String fatherStatus;
	
	@Column(nullable = true, length = 40)
	private String motherName;
	
	@Column(nullable = true, length = 15)
	private String motherStatus;
	
	@Column(nullable = true, length = 20)
	private String placeBirthFather;
	
	@Column(nullable = true, length = 20)
	private String placeBirthMother;
	
	private Date dateBirthFather;
	
	private Date dateBirthMother;
	
	@Column(nullable = true, length = 25)
	private String occupacyFather;
	
	@Column(nullable = true, length = 25)
	private String occupacyMother;
	
	@Column(nullable = true, length = 15)
	private String salaryFather;
	
	@Column(nullable = true, length = 15)
	private String salaryMother;
	
	@Column(nullable = true, length = 20)
	private String lastEducationFather;
	
	@Column(nullable = true, length = 20)
	private String lastEducationMother;
	
	@Column(nullable = true, length = 15)
	private String religion;
	
	@Column(nullable = true, length = 70)
	private String address;
	
	@Column(nullable = true, length = 10)
	private String rt;
	
	@Column(nullable = true, length = 10)
	private String rw;
	
	@Column(nullable = true, length = 50)
	private String province;
	
	@Column(nullable = true, length = 30)
	private String city;
	
	@Column(nullable = true, length = 30)
	private String disctrict;
	
	@Column(nullable = true, length = 30)
	private String subdistrict;
	
	@Column(nullable = true, length = 50)
	private int postalcode;
	
	@Column(nullable = true, length = 20)
	private String mobilePhone1;
	
	@Column(nullable = true, length = 20)
	private String mobilePhone2;
	
	@Column(nullable = true, length = 30)
	private String email;
	
	@Column(nullable = true, length = 30)
	private String email2;
	
	
	public ParentStudent()
	{
		
	}
	
	public ParentStudent(String fatherName, String fatherStatus,
			String motherName, String motherStatus, String placeBirthFather,
			String placeBirthMother, Date dateBirthFather,
			Date dateBirthMother, String occupacyFather, String occupacyMother,
			String salaryFather, String salaryMother,
			String lastEducationFather, String lastEducationMother,
			String religion, String address, String rt, String rw,
			String province, String city, String disctrict, String subdistrict,
			int postalcode, String mobilePhone1, String mobilePhone2,
			String email, String email2) 
	{
		this.fatherName = fatherName;
		this.fatherStatus = fatherStatus;
		this.motherName = motherName;
		this.motherStatus = motherStatus;
		this.placeBirthFather = placeBirthFather;
		this.placeBirthMother = placeBirthMother;
		this.dateBirthFather = dateBirthFather;
		this.dateBirthMother = dateBirthMother;
		this.occupacyFather = occupacyFather;
		this.occupacyMother = occupacyMother;
		this.salaryFather = salaryFather;
		this.salaryMother = salaryMother;
		this.lastEducationFather = lastEducationFather;
		this.lastEducationMother = lastEducationMother;
		this.religion = religion;
		this.address = address;
		this.rt = rt;
		this.rw = rw;
		this.province = province;
		this.city = city;
		this.disctrict = disctrict;
		this.subdistrict = subdistrict;
		this.postalcode = postalcode;
		this.mobilePhone1 = mobilePhone1;
		this.mobilePhone2 = mobilePhone2;
		this.email = email;
		this.email2 = email2;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getFatherStatus() {
		return fatherStatus;
	}


	public void setFatherStatus(String fatherStatus) {
		this.fatherStatus = fatherStatus;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public String getMotherStatus() {
		return motherStatus;
	}


	public void setMotherStatus(String motherStatus) {
		this.motherStatus = motherStatus;
	}


	public String getPlaceBirthFather() {
		return placeBirthFather;
	}


	public void setPlaceBirthFather(String placeBirthFather) {
		this.placeBirthFather = placeBirthFather;
	}


	public String getPlaceBirthMother() {
		return placeBirthMother;
	}


	public void setPlaceBirthMother(String placeBirthMother) {
		this.placeBirthMother = placeBirthMother;
	}


	public Date getDateBirthFather() {
		return dateBirthFather;
	}


	public void setDateBirthFather(Date dateBirthFather) {
		this.dateBirthFather = dateBirthFather;
	}


	public Date getDateBirthMother() {
		return dateBirthMother;
	}


	public void setDateBirthMother(Date dateBirthMother) {
		this.dateBirthMother = dateBirthMother;
	}


	public String getOccupacyFather() {
		return occupacyFather;
	}


	public void setOccupacyFather(String occupacyFather) {
		this.occupacyFather = occupacyFather;
	}


	public String getOccupacyMother() {
		return occupacyMother;
	}


	public void setOccupacyMother(String occupacyMother) {
		this.occupacyMother = occupacyMother;
	}


	public String getSalaryFather() {
		return salaryFather;
	}


	public void setSalaryFather(String salaryFather) {
		this.salaryFather = salaryFather;
	}


	public String getSalaryMother() {
		return salaryMother;
	}


	public void setSalaryMother(String salaryMother) {
		this.salaryMother = salaryMother;
	}


	public String getLastEducationFather() {
		return lastEducationFather;
	}


	public void setLastEducationFather(String lastEducationFather) {
		this.lastEducationFather = lastEducationFather;
	}


	public String getLastEducationMother() {
		return lastEducationMother;
	}


	public void setLastEducationMother(String lastEducationMother) {
		this.lastEducationMother = lastEducationMother;
	}


	public String getReligion() {
		return religion;
	}


	public void setReligion(String religion) {
		this.religion = religion;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getRt() {
		return rt;
	}


	public void setRt(String rt) {
		this.rt = rt;
	}


	public String getRw() {
		return rw;
	}


	public void setRw(String rw) {
		this.rw = rw;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDisctrict() {
		return disctrict;
	}


	public void setDisctrict(String disctrict) {
		this.disctrict = disctrict;
	}


	public String getSubdistrict() {
		return subdistrict;
	}


	public void setSubdistrict(String subdistrict) {
		this.subdistrict = subdistrict;
	}


	public int getPostalcode() {
		return postalcode;
	}


	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}


	public String getMobilePhone1() {
		return mobilePhone1;
	}


	public void setMobilePhone1(String mobilePhone1) {
		this.mobilePhone1 = mobilePhone1;
	}


	public String getMobilePhone2() {
		return mobilePhone2;
	}


	public void setMobilePhone2(String mobilePhone2) {
		this.mobilePhone2 = mobilePhone2;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmail2() {
		return email2;
	}


	public void setEmail2(String email2) {
		this.email2 = email2;
	}
}
