package com.stimb.quisioneradmin.entity.courses;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Curriculum implements Serializable  
{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(nullable = false)
	private int creditCourse;
	
	@Column(nullable = true)
	private int faceToface;
	
	@Column(nullable = true)
	private int practicum;
	
	@Column(nullable = true)
	private int practice;
	
	@Column(nullable = true)
	private int practiceField;
	
	@Column(nullable = true)
	private int simulation;
	
	@Column(nullable = false, length = 5)
	private String semester;
	
	public Curriculum()
	{
		
	}
	
	public Curriculum(int creditCourse, int faceToface, int practicum,
			int practice, int practiceField, int simulation, String semester) 
	{
		this.creditCourse = creditCourse;
		this.faceToface = faceToface;
		this.practicum = practicum;
		this.practice = practice;
		this.practiceField = practiceField;
		this.simulation = simulation;
		this.semester = semester;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreditCourse() {
		return creditCourse;
	}

	public void setCreditCourse(int creditCourse) {
		this.creditCourse = creditCourse;
	}

	public int getFaceToface() {
		return faceToface;
	}

	public void setFaceToface(int faceToface) {
		this.faceToface = faceToface;
	}

	public int getPracticum() {
		return practicum;
	}

	public void setPracticum(int practicum) {
		this.practicum = practicum;
	}

	public int getPractice() {
		return practice;
	}

	public void setPractice(int practice) {
		this.practice = practice;
	}

	public int getPracticeField() {
		return practiceField;
	}

	public void setPracticeField(int practiceField) {
		this.practiceField = practiceField;
	}

	public int getSimulation() {
		return simulation;
	}

	public void setSimulation(int simulation) {
		this.simulation = simulation;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}
}
