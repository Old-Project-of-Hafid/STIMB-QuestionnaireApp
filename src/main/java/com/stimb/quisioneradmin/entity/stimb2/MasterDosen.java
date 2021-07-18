package com.stimb.quisioneradmin.entity.stimb2;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A MasterDosen.
 */
@Entity
@Table(name = "MASTER_DOSEN")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MasterDosen implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nama_dosen")
    private String nama;
    
    @Column(name = "nidn")
    private String nidn;
    
    @Column(name = "niy")
    private String niy;
    
    @Column(name = "nik")
    private String nik;
    
    @Column(name = "bidang_keahlian")
    private String bidangKeahlian;
    
    @Column(name = "pendidikan_terakhir")
    private String pendidikanTerakhir;

    @OneToOne
    private DosenBiodata dosenBiodata;

    //@OneToMany(mappedBy = "masterDosen")
    //@JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    //private Set<ListDosenWali> listDosenWalis = new HashSet<>();

    @OneToOne
    private ListJadwalPerkuliahan listJadwalPerkuliahan;

    @OneToOne
    private DosenPendidikan dosenPendidikan;

    @OneToOne
    private DosenStatus dosenStatus;

    @OneToOne
    private DosenDataKeluarga dosenDataKeluarga;

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

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNiy() {
        return niy;
    }

    public void setNiy(String niy) {
        this.niy = niy;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getBidangKeahlian() {
        return bidangKeahlian;
    }

    public void setBidangKeahlian(String bidangKeahlian) {
        this.bidangKeahlian = bidangKeahlian;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public DosenBiodata getDosenBiodata() {
        return dosenBiodata;
    }

    public void setDosenBiodata(DosenBiodata dosenBiodata) {
        this.dosenBiodata = dosenBiodata;
    }
    /*
    public Set<ListDosenWali> getListDosenWalis() {
        return listDosenWalis;
    }

    public void setListDosenWalis(Set<ListDosenWali> listDosenWalis) {
        this.listDosenWalis = listDosenWalis;
    }
    */
    public ListJadwalPerkuliahan getListJadwalPerkuliahan() {
        return listJadwalPerkuliahan;
    }

    public void setListJadwalPerkuliahan(ListJadwalPerkuliahan listJadwalPerkuliahan) {
        this.listJadwalPerkuliahan = listJadwalPerkuliahan;
    }

    public DosenPendidikan getDosenPendidikan() {
        return dosenPendidikan;
    }

    public void setDosenPendidikan(DosenPendidikan dosenPendidikan) {
        this.dosenPendidikan = dosenPendidikan;
    }

    public DosenStatus getDosenStatus() {
        return dosenStatus;
    }

    public void setDosenStatus(DosenStatus dosenStatus) {
        this.dosenStatus = dosenStatus;
    }

    public DosenDataKeluarga getDosenDataKeluarga() {
        return dosenDataKeluarga;
    }

    public void setDosenDataKeluarga(DosenDataKeluarga dosenDataKeluarga) {
        this.dosenDataKeluarga = dosenDataKeluarga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MasterDosen masterDosen = (MasterDosen) o;

        if ( ! Objects.equals(id, masterDosen.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MasterDosen{" +
                "id=" + id +
                ", nama='" + nama + "'" +
                ", nidn='" + nidn + "'" +
                ", niy='" + niy + "'" +
                ", nik='" + nik + "'" +
                ", bidangKeahlian='" + bidangKeahlian + "'" +
                ", pendidikanTerakhir='" + pendidikanTerakhir + "'" +
                '}';
    }
}
