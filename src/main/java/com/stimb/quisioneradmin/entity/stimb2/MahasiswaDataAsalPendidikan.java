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
 * A MahasiswaDataAsalPendidikan.
 */
@Entity
@Table(name = "MAHASISWA_DATA_ASAL_PENDIDIKAN")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MahasiswaDataAsalPendidikan implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "asal_smu")
    private String asalSMU;
    
    @Column(name = "jurusan_smu")
    private String jurusanSMU;
    
    @Column(name = "kota_smu")
    private String kotaSMU;
    
    @Column(name = "tahun_ijazah")
    private Integer tahunIjazah;
    
    @Column(name = "alamat_smu")
    private String alamatSMU;
    
    @Column(name = "kabupaten_kota")
    private String kabupatenKota;
    
    @Column(name = "propinsi")
    private String propinsi;
    
    @Column(name = "asal_perguruan_tinggi")
    private String asalPerguruanTinggi;
    
    @Column(name = "asal_prodi")
    private String asalProdi;
    
    @Column(name = "kota_perguruan_tinggi")
    private String kotaPerguruanTinggi;

    @OneToOne
    private MasterMahasiswa masterMahasiswa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAsalSMU() {
        return asalSMU;
    }

    public void setAsalSMU(String asalSMU) {
        this.asalSMU = asalSMU;
    }

    public String getJurusanSMU() {
        return jurusanSMU;
    }

    public void setJurusanSMU(String jurusanSMU) {
        this.jurusanSMU = jurusanSMU;
    }

    public String getKotaSMU() {
        return kotaSMU;
    }

    public void setKotaSMU(String kotaSMU) {
        this.kotaSMU = kotaSMU;
    }

    public Integer getTahunIjazah() {
        return tahunIjazah;
    }

    public void setTahunIjazah(Integer tahunIjazah) {
        this.tahunIjazah = tahunIjazah;
    }

    public String getAlamatSMU() {
        return alamatSMU;
    }

    public void setAlamatSMU(String alamatSMU) {
        this.alamatSMU = alamatSMU;
    }

    public String getKabupatenKota() {
        return kabupatenKota;
    }

    public void setKabupatenKota(String kabupatenKota) {
        this.kabupatenKota = kabupatenKota;
    }

    public String getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }

    public String getAsalPerguruanTinggi() {
        return asalPerguruanTinggi;
    }

    public void setAsalPerguruanTinggi(String asalPerguruanTinggi) {
        this.asalPerguruanTinggi = asalPerguruanTinggi;
    }

    public String getAsalProdi() {
        return asalProdi;
    }

    public void setAsalProdi(String asalProdi) {
        this.asalProdi = asalProdi;
    }

    public String getKotaPerguruanTinggi() {
        return kotaPerguruanTinggi;
    }

    public void setKotaPerguruanTinggi(String kotaPerguruanTinggi) {
        this.kotaPerguruanTinggi = kotaPerguruanTinggi;
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

        MahasiswaDataAsalPendidikan mahasiswaDataAsalPendidikan = (MahasiswaDataAsalPendidikan) o;

        if ( ! Objects.equals(id, mahasiswaDataAsalPendidikan.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MahasiswaDataAsalPendidikan{" +
                "id=" + id +
                ", asalSMU='" + asalSMU + "'" +
                ", jurusanSMU='" + jurusanSMU + "'" +
                ", kotaSMU='" + kotaSMU + "'" +
                ", tahunIjazah='" + tahunIjazah + "'" +
                ", alamatSMU='" + alamatSMU + "'" +
                ", kabupatenKota='" + kabupatenKota + "'" +
                ", propinsi='" + propinsi + "'" +
                ", asalPerguruanTinggi='" + asalPerguruanTinggi + "'" +
                ", asalProdi='" + asalProdi + "'" +
                ", kotaPerguruanTinggi='" + kotaPerguruanTinggi + "'" +
                '}';
    }
}
