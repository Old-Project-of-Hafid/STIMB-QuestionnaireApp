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
 * A ReffKelompokMatakuliah.
 */
@Entity
@Table(name = "REFF_KELOMPOK_MATAKULIAH")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReffKelompokMatakuliah implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nama_kelompok_matakuliah")
    private String namaKelompokMatakuliah;

    @OneToOne
    private MasterMatakuliah masterMataKuliah;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaKelompokMatakuliah() {
        return namaKelompokMatakuliah;
    }

    public void setNamaKelompokMatakuliah(String namaKelompokMatakuliah) {
        this.namaKelompokMatakuliah = namaKelompokMatakuliah;
    }

    public MasterMatakuliah getMasterMataKuliah() {
        return masterMataKuliah;
    }

    public void setMasterMataKuliah(MasterMatakuliah masterMatakuliah) {
        this.masterMataKuliah = masterMatakuliah;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReffKelompokMatakuliah reffKelompokMatakuliah = (ReffKelompokMatakuliah) o;

        if ( ! Objects.equals(id, reffKelompokMatakuliah.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReffKelompokMatakuliah{" +
                "id=" + id +
                ", namaKelompokMatakuliah='" + namaKelompokMatakuliah + "'" +
                '}';
    }
}
