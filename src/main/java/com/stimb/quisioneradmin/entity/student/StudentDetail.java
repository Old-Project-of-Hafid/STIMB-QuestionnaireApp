package com.stimb.quisioneradmin.entity.student;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class StudentDetail implements Serializable  
{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(nullable = true, length = 30)
	private String ktpNumber;
	
	@Column(nullable = true, length = 15)
	private String firstname; 
	
	@Column(nullable = true, length = 15)
	private String midlename;
	
	@Column(nullable = true, length = 15)
	private String lastname;
	
	@Column(nullable = true, length = 10)
	private String nickname;
	
	@Column(nullable = true, length = 10)
	private String sex;
	
	@Column(nullable = true, length = 20)
	private String mobilePhone;
	
	@Column(nullable = true, length = 30)
	private String email;
	
	@Column(nullable = true, length = 20)
	private String placeBirth;
	
	@Column(nullable = true, length = 20)
	private String maritalstatus;
	
	@Column(nullable = true, length = 15)
	private String religion;
	
	@Column(nullable = true, length = 20)
	private String nationality;
	
	private Date dateBirth;
	
	public StudentDetail()
	{
		
	}

	public StudentDetail(String ktpNumber, String firstname, String midlename,
			String lastname, String nickname, String sex, String mobilePhone,
			String email, String placeBirth, String maritalstatus,
			String religion, String nationality, Date dateBirth) 
	{
		this.ktpNumber = ktpNumber;
		this.firstname = firstname;
		this.midlename = midlename;
		this.lastname = lastname;
		this.nickname = nickname;
		this.sex = sex;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.placeBirth = placeBirth;
		this.maritalstatus = maritalstatus;
		this.religion = religion;
		this.nationality = nationality;
		this.dateBirth = dateBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKtpNumber() {
		return ktpNumber;
	}

	public void setKtpNumber(String ktpNumber) {
		this.ktpNumber = ktpNumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMidlename() {
		return midlename;
	}

	public void setMidlename(String midlename) {
		this.midlename = midlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlaceBirth() {
		return placeBirth;
	}

	public void setPlaceBirth(String placeBirth) {
		this.placeBirth = placeBirth;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

}
