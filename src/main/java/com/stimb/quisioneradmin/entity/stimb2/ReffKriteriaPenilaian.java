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
 * A ReffKriteriaPenilaian.
 */
@Entity
@Table(name = "REFF_KRITERIA_PENILAIAN")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReffKriteriaPenilaian implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nilai")
    private String nilai;
    
    @Column(name = "range_nilai")
    private String rangeNilai;

    @OneToOne
    private NilaiMahasiswa nilaiMahasiswa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getRangeNilai() {
        return rangeNilai;
    }

    public void setRangeNilai(String rangeNilai) {
        this.rangeNilai = rangeNilai;
    }

    public NilaiMahasiswa getNilaiMahasiswa() {
        return nilaiMahasiswa;
    }

    public void setNilaiMahasiswa(NilaiMahasiswa nilaiMahasiswa) {
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReffKriteriaPenilaian reffKriteriaPenilaian = (ReffKriteriaPenilaian) o;

        if ( ! Objects.equals(id, reffKriteriaPenilaian.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReffKriteriaPenilaian{" +
                "id=" + id +
                ", nilai='" + nilai + "'" +
                ", rangeNilai='" + rangeNilai + "'" +
                '}';
    }
}
