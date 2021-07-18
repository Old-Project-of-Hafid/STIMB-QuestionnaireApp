package com.stimb.quisioneradmin.entity.fieldstudy;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FieldOfStudy implements Serializable 
{	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(nullable = false, length = 30, unique = true)
	private String codeField;
	
	@Column(nullable = false, length = 30)
	private String nameField;
	
	@Column(nullable = true, length = 30)
	private String description;
	
	public FieldOfStudy()
	{}
	
	public FieldOfStudy(String codeField, String nameField, String description) 
	{
		this.codeField = codeField;
		this.nameField = nameField;
		this.description = description;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodeField() {
		return codeField;
	}

	public void setCodeField(String codeField) {
		this.codeField = codeField;
	}

	public String getNameField() {
		return nameField;
	}

	public void setNameField(String nameField) {
		this.nameField = nameField;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
