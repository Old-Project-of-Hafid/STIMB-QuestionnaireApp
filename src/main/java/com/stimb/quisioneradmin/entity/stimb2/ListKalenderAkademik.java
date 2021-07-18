package com.stimb.quisioneradmin.entity.stimb2;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 */

@Entity
@Table(name = "LIST_KALENDER_AKADEMIK")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ListKalenderAkademik implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String tanggal;
	
	private String kegiatan;

    @OneToOne
    private ReffTahunAjaran reffTahunAjaran;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}

	public String getKegiatan() {
		return kegiatan;
	}

	public void setKegiatan(String kegiatan) {
		this.kegiatan = kegiatan;
	}

	public ReffTahunAjaran getReffTahunAjaran() {
		return reffTahunAjaran;
	}

	public void setReffTahunAjaran(ReffTahunAjaran reffTahunAjaran) {
		this.reffTahunAjaran = reffTahunAjaran;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListKalenderAkademik other = (ListKalenderAkademik) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (kegiatan == null) {
			if (other.kegiatan != null)
				return false;
		} else if (!kegiatan.equals(other.kegiatan))
			return false;
		if (reffTahunAjaran == null) {
			if (other.reffTahunAjaran != null)
				return false;
		} else if (!reffTahunAjaran.equals(other.reffTahunAjaran))
			return false;
		if (tanggal == null) {
			if (other.tanggal != null)
				return false;
		} else if (!tanggal.equals(other.tanggal))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((kegiatan == null) ? 0 : kegiatan.hashCode());
		result = prime * result
				+ ((reffTahunAjaran == null) ? 0 : reffTahunAjaran.hashCode());
		result = prime * result + ((tanggal == null) ? 0 : tanggal.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "ListKalenderAkademik [id=" + id + ", tanggal=" + tanggal
				+ ", kegiatan=" + kegiatan + ", reffTahunAjaran="
				+ reffTahunAjaran + "]";
	}
}
