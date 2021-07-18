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
 * A DosenBiodata.
 */
@Entity
@Table(name = "DOSEN_BIODATA")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DosenBiodata implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "no_ktp")
    private String noKtp;
    
    @Column(name = "npwp")
    private String npwp;
    
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    
    @Column(name = "tanggal_lahir")
    private String tanggalLahir;
    
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    
    @Column(name = "agama")
    private String agama;
    
    @Column(name = "sumber_gaji")
    private String sumberGaji;
    
    @Column(name = "alamat")
    private String alamat;
    
    @Column(name = "dusun")
    private String dusun;
    
    @Column(name = "kelurahan")
    private String kelurahan;
    
    @Column(name = "rt")
    private Integer rt;
    
    @Column(name = "rw")
    private Integer rw;
    
    @Column(name = "kecamatan")
    private String kecamatan;
    
    @Column(name = "no_telp_rumah")
    private String noTelpRumah;
    
    @Column(name = "no_hp")
    private String noHp;
    
    @Column(name = "alamat_email")
    private String alamatEmail;

    @OneToOne
    private MasterDosen listDosenWali;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getSumberGaji() {
        return sumberGaji;
    }

    public void setSumberGaji(String sumberGaji) {
        this.sumberGaji = sumberGaji;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDusun() {
        return dusun;
    }

    public void setDusun(String dusun) {
        this.dusun = dusun;
    }

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public Integer getRt() {
        return rt;
    }

    public void setRt(Integer rt) {
        this.rt = rt;
    }

    public Integer getRw() {
        return rw;
    }

    public void setRw(Integer rw) {
        this.rw = rw;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getNoTelpRumah() {
        return noTelpRumah;
    }

    public void setNoTelpRumah(String noTelpRumah) {
        this.noTelpRumah = noTelpRumah;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }

    public MasterDosen getListDosenWali() {
        return listDosenWali;
    }

    public void setListDosenWali(MasterDosen masterDosen) {
        this.listDosenWali = masterDosen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DosenBiodata dosenBiodata = (DosenBiodata) o;

        if ( ! Objects.equals(id, dosenBiodata.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DosenBiodata{" +
                "id=" + id +
                ", noKtp='" + noKtp + "'" +
                ", npwp='" + npwp + "'" +
                ", tempatLahir='" + tempatLahir + "'" +
                ", tanggalLahir='" + tanggalLahir + "'" +
                ", jenisKelamin='" + jenisKelamin + "'" +
                ", agama='" + agama + "'" +
                ", sumberGaji='" + sumberGaji + "'" +
                ", alamat='" + alamat + "'" +
                ", dusun='" + dusun + "'" +
                ", kelurahan='" + kelurahan + "'" +
                ", rt='" + rt + "'" +
                ", rw='" + rw + "'" +
                ", kecamatan='" + kecamatan + "'" +
                ", noTelpRumah='" + noTelpRumah + "'" +
                ", noHp='" + noHp + "'" +
                ", alamatEmail='" + alamatEmail + "'" +
                '}';
    }
}
