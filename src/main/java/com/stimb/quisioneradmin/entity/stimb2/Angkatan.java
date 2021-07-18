package com.stimb.quisioneradmin.entity.stimb2;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ANGKATAN")
public class Angkatan implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String nama;
	
	String tahun;
	
	String keterangan;
	
	@OneToOne
	MasterDosen masterDosen;
	
	@ManyToOne
	MasterMahasiswa masterMahasiswa;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getTahun() {
		return tahun;
	}

	public void setTahun(String tahun) {
		this.tahun = tahun;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	public MasterDosen getMasterDosen() {
		return masterDosen;
	}

	public void setMasterDosen(MasterDosen masterDosen) {
		this.masterDosen = masterDosen;
	}

	public MasterMahasiswa getMasterMahasiswa() {
		return masterMahasiswa;
	}

	public void setMasterMahasiswa(MasterMahasiswa masterMahasiswa) {
		this.masterMahasiswa = masterMahasiswa;
	}
	
	@Override
	public boolean equals(Object o) 
	{
	     if (this == o) 
	     {
	         return true;
	     }
	     if (o == null || getClass() != o.getClass()) 
	     {
	         return false;
	     }
	     Angkatan angkatan = (Angkatan) o;

	     if ( ! Objects.equals(id, angkatan.id)) return false;

	    return true;
	}

	@Override
	public int hashCode() 
	{
	    return Objects.hashCode(id);
	}
	

}
