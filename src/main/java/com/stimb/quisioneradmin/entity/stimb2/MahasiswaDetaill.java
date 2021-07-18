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
 * A MahasiswaDetaill.
 */
@Entity
@Table(name = "MAHASISWA_DETAILL")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MahasiswaDetaill implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    
    @Column(name = "tanggal_lahir")
    private String tanggalLahir;
    
    @Column(name = "agama")
    private String agama;
    
    @Column(name = "kewarganegaraan")
    private String kewarganegaraan;
    
    @Column(name = "alamat")
    private String alamat;
    
    @Column(name = "dusun")
    private String dusun;
    
    @Column(name = "kelurahan")
    private String kelurahan;
    
    @Column(name = "kecamatan")
    private String kecamatan;
    
    @Column(name = "rt")
    private Integer rt;
    
    @Column(name = "rw")
    private Integer rw;
    
    @Column(name = "no_telp_rumah")
    private String noTelpRumah;
    
    @Column(name = "no_hp")
    private String noHp;
    
    @Column(name = "alamat_email")
    private String alamatEmail;
    
    @Column(name = "kota")
    private String kota;
    
    @Column(name = "jenis_tinggal")
    private String jenisTinggal;
    
    @Column(name = "usia")
    private String usia;
    
    @Column(name = "nama_bank")
    private String namaBank;
    
    @Column(name = "no_rek")
    private Integer noRek;
    
    @Column(name = "atas_nama")
    private String atasNama;
    
    @Column(name = "anak_ke")
    private String anakKe;
    
    @Column(name = "jumlah_saudara")
    private String jumlahSaudara;
    
    @Column(name = "pekerjaan")
    private String pekerjaan;

    @OneToOne
    private MasterMahasiswa masterMahasiswa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
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

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
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

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getJenisTinggal() {
        return jenisTinggal;
    }

    public void setJenisTinggal(String jenisTinggal) {
        this.jenisTinggal = jenisTinggal;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    public Integer getNoRek() {
        return noRek;
    }

    public void setNoRek(Integer noRek) {
        this.noRek = noRek;
    }

    public String getAtasNama() {
        return atasNama;
    }

    public void setAtasNama(String atasNama) {
        this.atasNama = atasNama;
    }

    public String getAnakKe() {
        return anakKe;
    }

    public void setAnakKe(String anakKe) {
        this.anakKe = anakKe;
    }

    public String getJumlahSaudara() {
        return jumlahSaudara;
    }

    public void setJumlahSaudara(String jumlahSaudara) {
        this.jumlahSaudara = jumlahSaudara;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
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

        MahasiswaDetaill mahasiswaDetaill = (MahasiswaDetaill) o;

        if ( ! Objects.equals(id, mahasiswaDetaill.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MahasiswaDetaill{" +
                "id=" + id +
                ", tempatLahir='" + tempatLahir + "'" +
                ", jenisKelamin='" + jenisKelamin + "'" +
                ", tanggalLahir='" + tanggalLahir + "'" +
                ", agama='" + agama + "'" +
                ", kewarganegaraan='" + kewarganegaraan + "'" +
                ", alamat='" + alamat + "'" +
                ", dusun='" + dusun + "'" +
                ", kelurahan='" + kelurahan + "'" +
                ", kecamatan='" + kecamatan + "'" +
                ", rt='" + rt + "'" +
                ", rw='" + rw + "'" +
                ", noTelpRumah='" + noTelpRumah + "'" +
                ", noHp='" + noHp + "'" +
                ", alamatEmail='" + alamatEmail + "'" +
                ", kota='" + kota + "'" +
                ", jenisTinggal='" + jenisTinggal + "'" +
                ", usia='" + usia + "'" +
                ", namaBank='" + namaBank + "'" +
                ", noRek='" + noRek + "'" +
                ", atasNama='" + atasNama + "'" +
                ", anakKe='" + anakKe + "'" +
                ", jumlahSaudara='" + jumlahSaudara + "'" +
                ", pekerjaan='" + pekerjaan + "'" +
                '}';
    }
}
