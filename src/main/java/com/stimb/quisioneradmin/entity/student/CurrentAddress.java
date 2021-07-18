package com.stimb.quisioneradmin.entity.student;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CurrentAddress implements Serializable 
{	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(nullable = true, length = 100)
	private String street;
	
	@Column(nullable = true, length = 50)
	private String province;
	
	@Column(nullable = true, length = 30)
	private String city;
	
	@Column(nullable = true, length = 30)
	private String disctrict;
	
	@Column(nullable = true, length = 30)
	private String subdistrict;
	
	@Column(nullable = true)
	private int postalcode;
	
	@Column(nullable = true, length = 20)
	private String homephone;
	
	@Column(nullable = true, length = 10)
	private String rt;
	
	@Column(nullable = true, length = 10)
	private String rw;
	
	
	public CurrentAddress()
	{
		
	}

	public CurrentAddress(String street, String province, String city,
			String disctrict, String subdistrict, int postalcode,
			String homephone, String rt, String rw) 
	{	
		this.street = street;
		this.province = province;
		this.city = city;
		this.disctrict = disctrict;
		this.subdistrict = subdistrict;
		this.postalcode = postalcode;
		this.homephone = homephone;
		this.rt = rt;
		this.rw = rw;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
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
}
