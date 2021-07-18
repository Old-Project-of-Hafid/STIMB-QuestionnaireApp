package com.stimb.quisioneradmin.entity.lecturer;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Lecturer implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //for autonumber
	private int id;
	
	@Column(nullable = false, length = 20)
	private String niy;
	
	@Column(nullable = false, length = 20)
	private String nik;
	
	@Column(nullable = false, length = 20)
	private String nidn;
	
	@Column(nullable = false, length = 25)
	private String noKTP;
	
	@Column(nullable = false, length = 25)
	private String lecturerPoition;
	
	@Column(nullable = false, length = 25)
	private String expertise;
	
	@OneToOne
	private DetailLecturer detailLecturer;
	
	@OneToOne
	private AddressLecturer addressLecturer;
	
	@OneToOne
	private EducationLecturer educationLecturer;
	
	public Lecturer()
	{}

	public Lecturer(String niy, String nik, String nidn, String noKTP,
			String lecturerPoition, String expertise,
			DetailLecturer detailLecturer, AddressLecturer addressLecturer,
			EducationLecturer educationLecturer) 
	{
		this.niy = niy;
		this.nik = nik;
		this.nidn = nidn;
		this.noKTP = noKTP;
		this.lecturerPoition = lecturerPoition;
		this.expertise = expertise;
		this.detailLecturer = detailLecturer;
		this.addressLecturer = addressLecturer;
		this.educationLecturer = educationLecturer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNiy() {
		return niy;
	}

	public void setNiy(String niy) {
		this.niy = niy;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getNidn() {
		return nidn;
	}

	public void setNidn(String nidn) {
		this.nidn = nidn;
	}

	public String getNoKTP() {
		return noKTP;
	}

	public void setNoKTP(String noKTP) {
		this.noKTP = noKTP;
	}

	public String getLecturerPoition() {
		return lecturerPoition;
	}

	public void setLecturerPoition(String lecturerPoition) {
		this.lecturerPoition = lecturerPoition;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public DetailLecturer getDetailLecturer() {
		return detailLecturer;
	}

	public void setDetailLecturer(DetailLecturer detailLecturer) {
		this.detailLecturer = detailLecturer;
	}

	public AddressLecturer getAddressLecturer() {
		return addressLecturer;
	}

	public void setAddressLecturer(AddressLecturer addressLecturer) {
		this.addressLecturer = addressLecturer;
	}

	public EducationLecturer getEducationLecturer() {
		return educationLecturer;
	}

	public void setEducationLecturer(EducationLecturer educationLecturer) {
		this.educationLecturer = educationLecturer;
	}
}
