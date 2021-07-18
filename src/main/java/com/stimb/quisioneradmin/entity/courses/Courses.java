package com.stimb.quisioneradmin.entity.courses;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Courses implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(nullable = false, length = 10, unique = true)
	private String codeCourse;
	
	@Column(nullable = false, length = 30)
	private String nameCourse;
	
	@Column(nullable = true, length = 30)
	private String prerequisite;
	
	@Column(nullable = true, length = 30)
	private String kindOfCourse;
	
	@Column(nullable = true, length = 30)
	private String groupOfCourse;
	
	@Column(nullable = false, length = 10)
	private String levelOfCourse;
	
	@OneToOne
	private Curriculum curriculum;
	
	public Courses()
	{
		
	}

	public Courses(String codeCourse, String nameCourse, String prerequisite,
			String kindOfCourse, String groupOfCourse, String levelOfCourse,
			Curriculum curriculum) 
	{
		this.codeCourse = codeCourse;
		this.nameCourse = nameCourse;
		this.prerequisite = prerequisite;
		this.kindOfCourse = kindOfCourse;
		this.groupOfCourse = groupOfCourse;
		this.levelOfCourse = levelOfCourse;
		this.curriculum = curriculum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodeCourse() {
		return codeCourse;
	}

	public void setCodeCourse(String codeCourse) {
		this.codeCourse = codeCourse;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(String prerequisite) {
		this.prerequisite = prerequisite;
	}

	public String getKindOfCourse() {
		return kindOfCourse;
	}

	public void setKindOfCourse(String kindOfCourse) {
		this.kindOfCourse = kindOfCourse;
	}

	public String getGroupOfCourse() {
		return groupOfCourse;
	}

	public void setGroupOfCourse(String groupOfCourse) {
		this.groupOfCourse = groupOfCourse;
	}

	public String getLevelOfCourse() {
		return levelOfCourse;
	}

	public void setLevelOfCourse(String levelOfCourse) {
		this.levelOfCourse = levelOfCourse;
	}

	public Curriculum getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}
	
}
