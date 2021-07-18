package com.stimb.quisioneradmin.entity.student;


import com.stimb.quisioneradmin.entity.account.User;
import com.stimb.quisioneradmin.entity.fieldstudy.FieldOfStudy;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Student implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //for autonumber
	private int id;
	
	@Column(nullable = true, length = 20, unique=true)
	private String nim;
	
	@Column(nullable = true)
	private int yearLevel; 
	
	@Column(nullable = true, length = 25)
	private String fieldStudy;
	
	@Column(nullable = true, length = 20)
	private String statusEntry;
	
	@Column(nullable = true, length = 20)
	private String limitStudy;
	
	@Column(nullable = true, length = 5)
	private String prodiName;
	
	@OneToOne
	private CardAddress cardAddress;
	
	@OneToOne
	private StudentDetail studentDetail;
	
	@OneToOne
	private CurrentAddress currentAddress;
	
	@OneToOne
	private ParentStudent parentStudent;
	
	@OneToOne
	private StepParentStudent stepParentStudent;
	
	@OneToOne
	private HistoryEducation historyEducation;
	
	@OneToOne
	private User user;
	
	@ManyToOne
    private FieldOfStudy fieldOfStudy;
	
	//@OneToOne
	//private FieldOfStudy fieldOfStudy;
	
	//@OneToOne
	//private LevelAcademicYear academicYear;
	
	//@OneToOne
	//private AccountStudent accountStudent;
	
	public Student()
	{
		
	}
	

	public Student(String nim, int yearLevel, String fieldStudy,
			String statusEntry, String limitStudy, String prodiName,
			CardAddress cardAddress, StudentDetail studentDetail,
			CurrentAddress currentAddress, ParentStudent parentStudent,
			StepParentStudent stepParentStudent,
			HistoryEducation historyEducation, User user,
			FieldOfStudy fieldOfStudy) 
	{
		this.nim = nim;
		this.yearLevel = yearLevel;
		this.fieldStudy = fieldStudy;
		this.statusEntry = statusEntry;
		this.limitStudy = limitStudy;
		this.prodiName = prodiName;
		this.cardAddress = cardAddress;
		this.studentDetail = studentDetail;
		this.currentAddress = currentAddress;
		this.parentStudent = parentStudent;
		this.stepParentStudent = stepParentStudent;
		this.historyEducation = historyEducation;
		this.user = user;
		this.fieldOfStudy = fieldOfStudy;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public int getYearLevel() {
		return yearLevel;
	}

	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}

	public String getFieldStudy() {
		return fieldStudy;
	}

	public void setFieldStudy(String fieldStudy) {
		this.fieldStudy = fieldStudy;
	}

	public String getStatusEntry() {
		return statusEntry;
	}

	public void setStatusEntry(String statusEntry) {
		this.statusEntry = statusEntry;
	}

	public String getLimitStudy() {
		return limitStudy;
	}

	public void setLimitStudy(String limitStudy) {
		this.limitStudy = limitStudy;
	}

	public String getProdiName() {
		return prodiName;
	}

	public void setProdiName(String prodiName) {
		this.prodiName = prodiName;
	}

	public CardAddress getCardAddress() {
		return cardAddress;
	}

	public void setCardAddress(CardAddress cardAddress) {
		this.cardAddress = cardAddress;
	}

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

	public CurrentAddress getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(CurrentAddress currentAddress) {
		this.currentAddress = currentAddress;
	}

	public ParentStudent getParentStudent() {
		return parentStudent;
	}

	public void setParentStudent(ParentStudent parentStudent) {
		this.parentStudent = parentStudent;
	}

	public StepParentStudent getStepParentStudent() {
		return stepParentStudent;
	}

	public void setStepParentStudent(StepParentStudent stepParentStudent) {
		this.stepParentStudent = stepParentStudent;
	}

	public HistoryEducation getHistoryEducation() {
		return historyEducation;
	}

	public void setHistoryEducation(HistoryEducation historyEducation) {
		this.historyEducation = historyEducation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public FieldOfStudy getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(FieldOfStudy fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}
	
	//@Column private int basedIdCardAddressId; // foreignKey
	//@Column private int currentAddressId; // foreignKey
	//@Column private int parentId; // foreignKey
	//@Column private int stepParentId; // foreignKey
	//@Column private int educationHistory; // foreignKey
	
}
