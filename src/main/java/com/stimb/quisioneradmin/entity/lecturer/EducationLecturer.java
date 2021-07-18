package com.stimb.quisioneradmin.entity.lecturer;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class EducationLecturer implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(nullable = true, length = 30)
	private String universityNames1;
	
	@Column(nullable = true, length = 30)
	private String FieldStudyUniversitys1;
	
	@Column(nullable = true, length = 20)
	private String cityUniversitys1;
	
	@Column(nullable = true)
	private int yearGraduatedUniversitys1;
	
	@Column(nullable = true, length = 10)
	private String degrees1;
	
	//====
	
	@Column(nullable = true, length = 30)
	private String universityNames2;
	
	@Column(nullable = true, length = 30)
	private String FieldStudyUniversitys2;
	
	@Column(nullable = true, length = 20)
	private String cityUniversitys2;
	
	@Column(nullable = true)
	private int yearGraduatedUniversitys2;
	
	@Column(nullable = true, length = 10)
	private String degrees2;
	
	//======
	
	@Column(nullable = true, length = 30)
	private String universityNames3;
	
	@Column(nullable = true, length = 30)
	private String FieldStudyUniversitys3;
	
	@Column(nullable = true, length = 20)
	private String cityUniversitys3;
	
	@Column(nullable = true)
	private int yearGraduatedUniversitys3;
	
	@Column(nullable = true, length = 10)
	private String degrees3;
	
	public EducationLecturer()
	{
		
	}
	
	

	public EducationLecturer(String universityNames1,
			String fieldStudyUniversitys1, String cityUniversitys1,
			int yearGraduatedUniversitys1, String degrees1,
			String universityNames2, String fieldStudyUniversitys2,
			String cityUniversitys2, int yearGraduatedUniversitys2,
			String degrees2, String universityNames3,
			String fieldStudyUniversitys3, String cityUniversitys3,
			int yearGraduatedUniversitys3, String degrees3) 
	{
		this.universityNames1 = universityNames1;
		FieldStudyUniversitys1 = fieldStudyUniversitys1;
		this.cityUniversitys1 = cityUniversitys1;
		this.yearGraduatedUniversitys1 = yearGraduatedUniversitys1;
		this.degrees1 = degrees1;
		this.universityNames2 = universityNames2;
		FieldStudyUniversitys2 = fieldStudyUniversitys2;
		this.cityUniversitys2 = cityUniversitys2;
		this.yearGraduatedUniversitys2 = yearGraduatedUniversitys2;
		this.degrees2 = degrees2;
		this.universityNames3 = universityNames3;
		FieldStudyUniversitys3 = fieldStudyUniversitys3;
		this.cityUniversitys3 = cityUniversitys3;
		this.yearGraduatedUniversitys3 = yearGraduatedUniversitys3;
		this.degrees3 = degrees3;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUniversityNames1() {
		return universityNames1;
	}

	public void setUniversityNames1(String universityNames1) {
		this.universityNames1 = universityNames1;
	}

	public String getFieldStudyUniversitys1() {
		return FieldStudyUniversitys1;
	}

	public void setFieldStudyUniversitys1(String fieldStudyUniversitys1) {
		FieldStudyUniversitys1 = fieldStudyUniversitys1;
	}

	public String getCityUniversitys1() {
		return cityUniversitys1;
	}

	public void setCityUniversitys1(String cityUniversitys1) {
		this.cityUniversitys1 = cityUniversitys1;
	}

	public int getYearGraduatedUniversitys1() {
		return yearGraduatedUniversitys1;
	}

	public void setYearGraduatedUniversitys1(int yearGraduatedUniversitys1) {
		this.yearGraduatedUniversitys1 = yearGraduatedUniversitys1;
	}

	public String getDegrees1() {
		return degrees1;
	}

	public void setDegrees1(String degrees1) {
		this.degrees1 = degrees1;
	}

	public String getUniversityNames2() {
		return universityNames2;
	}

	public void setUniversityNames2(String universityNames2) {
		this.universityNames2 = universityNames2;
	}

	public String getFieldStudyUniversitys2() {
		return FieldStudyUniversitys2;
	}

	public void setFieldStudyUniversitys2(String fieldStudyUniversitys2) {
		FieldStudyUniversitys2 = fieldStudyUniversitys2;
	}

	public String getCityUniversitys2() {
		return cityUniversitys2;
	}

	public void setCityUniversitys2(String cityUniversitys2) {
		this.cityUniversitys2 = cityUniversitys2;
	}

	public int getYearGraduatedUniversitys2() {
		return yearGraduatedUniversitys2;
	}

	public void setYearGraduatedUniversitys2(int yearGraduatedUniversitys2) {
		this.yearGraduatedUniversitys2 = yearGraduatedUniversitys2;
	}

	public String getDegrees2() {
		return degrees2;
	}

	public void setDegrees2(String degrees2) {
		this.degrees2 = degrees2;
	}

	public String getUniversityNames3() {
		return universityNames3;
	}

	public void setUniversityNames3(String universityNames3) {
		this.universityNames3 = universityNames3;
	}

	public String getFieldStudyUniversitys3() {
		return FieldStudyUniversitys3;
	}

	public void setFieldStudyUniversitys3(String fieldStudyUniversitys3) {
		FieldStudyUniversitys3 = fieldStudyUniversitys3;
	}

	public String getCityUniversitys3() {
		return cityUniversitys3;
	}

	public void setCityUniversitys3(String cityUniversitys3) {
		this.cityUniversitys3 = cityUniversitys3;
	}

	public int getYearGraduatedUniversitys3() {
		return yearGraduatedUniversitys3;
	}

	public void setYearGraduatedUniversitys3(int yearGraduatedUniversitys3) {
		this.yearGraduatedUniversitys3 = yearGraduatedUniversitys3;
	}

	public String getDegrees3() {
		return degrees3;
	}

	public void setDegrees3(String degrees3) {
		this.degrees3 = degrees3;
	}
}
