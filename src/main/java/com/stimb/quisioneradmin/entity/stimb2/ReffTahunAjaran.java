package com.stimb.quisioneradmin.entity.stimb2;
import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A ReffTahunAjaran.
 */
@Entity
@Table(name = "REFF_TAHUN_AJARAN")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReffTahunAjaran implements Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nama_tahun_ajaran")
    private String namaTahunAjaran;
    
    @Column(name = "periodeTa")
    private String periode;
    
    @Column(name = "aktivasi")
    private boolean aktivasi;

    @OneToOne
    private KalenderAkademik kalenderAkademik;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaTahunAjaran() {
        return namaTahunAjaran;
    }

    public void setNamaTahunAjaran(String namaTahunAjaran) {
        this.namaTahunAjaran = namaTahunAjaran;
    }

    public KalenderAkademik getKalenderAkademik() {
        return kalenderAkademik;
    }

    public void setKalenderAkademik(KalenderAkademik kalenderAkademik) {
        this.kalenderAkademik = kalenderAkademik;
    }
    
    public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}
	
	public boolean isAktivasi() {
		return aktivasi;
	}

	public void setAktivasi(boolean aktivasi) {
		this.aktivasi = aktivasi;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReffTahunAjaran reffTahunAjaran = (ReffTahunAjaran) o;

        if ( ! Objects.equals(id, reffTahunAjaran.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReffTahunAjaran{" +
                "id=" + id +
                ", namaTahunAjaran='" + namaTahunAjaran + "'" +
                '}';
    }
}
