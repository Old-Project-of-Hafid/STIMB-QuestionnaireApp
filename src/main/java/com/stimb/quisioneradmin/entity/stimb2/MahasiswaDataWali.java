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
 * A MahasiswaDataWali.
 */
@Entity
@Table(name = "MAHASISWA_DATA_WALI")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MahasiswaDataWali implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nama_wali")
    private String namaWali;
    
    @Column(name = "alamat_wali")
    private String alamatWali;

    @OneToOne
    private MasterMahasiswa masterMahasiswa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaWali() {
        return namaWali;
    }

    public void setNamaWali(String namaWali) {
        this.namaWali = namaWali;
    }

    public String getAlamatWali() {
        return alamatWali;
    }

    public void setAlamatWali(String alamatWali) {
        this.alamatWali = alamatWali;
    }

    public MasterMahasiswa getMasterMahasiswa() {
        return masterMahasiswa;
    }

    public void setMasterMahasiswa(MasterMahasiswa masterMahasiswa) {
        this.masterMahasiswa = masterMahasiswa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MahasiswaDataWali mahasiswaDataWali = (MahasiswaDataWali) o;

        if ( ! Objects.equals(id, mahasiswaDataWali.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MahasiswaDataWali{" +
                "id=" + id +
                ", namaWali='" + namaWali + "'" +
                ", alamatWali='" + alamatWali + "'" +
                '}';
    }
}
