package com.stimb.quisioneradmin.entity.stimb2;

//import com.fasterxml.jackson.annotation.JsonIgnore;
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
 * A KalenderAkademik.
 */
@Entity
@Table(name = "KALENDER_AKADEMIK")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class KalenderAkademik implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "kegiatan")
    private String kegiatan;
    
    @Column(name = "tanggal")
    private String tanggal;

    @OneToOne(mappedBy = "kalenderAkademik")
    //@JsonIgnore
    private ReffTahunAjaran reffTahunAjaran;

    @OneToOne(mappedBy = "kalenderAkademik")
    //@JsonIgnore
    private ReffJenisSemester reffJenisSemester;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public ReffTahunAjaran getReffTahunAjaran() {
        return reffTahunAjaran;
    }

    public void setReffTahunAjaran(ReffTahunAjaran reffTahunAjaran) {
        this.reffTahunAjaran = reffTahunAjaran;
    }

    public ReffJenisSemester getReffJenisSemester() {
        return reffJenisSemester;
    }

    public void setReffJenisSemester(ReffJenisSemester reffJenisSemester) {
        this.reffJenisSemester = reffJenisSemester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        KalenderAkademik kalenderAkademik = (KalenderAkademik) o;

        if ( ! Objects.equals(id, kalenderAkademik.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "KalenderAkademik{" +
                "id=" + id +
                ", kegiatan='" + kegiatan + "'" +
                ", tanggal='" + tanggal + "'" +
                '}';
    }
}
