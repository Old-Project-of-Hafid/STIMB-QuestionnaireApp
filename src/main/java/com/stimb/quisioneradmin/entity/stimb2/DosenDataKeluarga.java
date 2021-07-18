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
 * A DosenDataKeluarga.
 */
@Entity
@Table(name = "DOSEN_DATA_KELUARGA")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DosenDataKeluarga implements Serializable 
{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nama_istri")
    private String namaIstri;
    
    @Column(name = "pekerjaan")
    private String pekerjaan;
    
    @Column(name = "alamat")
    private String alamat;
    
    @Column(name = "rt")
    private Integer rt;
    
    @Column(name = "rw")
    private Integer rw;
    
    @Column(name = "no_telp_rumah")
    private String noTelpRumah;
    
    @Column(name = "no_hp")
    private Integer noHp;
    
    @Column(name = "kode_pos")
    private Integer kodePos;
    
    @Column(name = "jumlah_anak")
    private Integer jumlahAnak;

    @OneToOne
    private MasterDosen listDosenWali;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaIstri() {
        return namaIstri;
    }

    public void setNamaIstri(String namaIstri) {
        this.namaIstri = namaIstri;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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

    public Integer getNoHp() {
        return noHp;
    }

    public void setNoHp(Integer noHp) {
        this.noHp = noHp;
    }

    public Integer getKodePos() {
        return kodePos;
    }

    public void setKodePos(Integer kodePos) {
        this.kodePos = kodePos;
    }

    public Integer getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(Integer jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
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

        DosenDataKeluarga dosenDataKeluarga = (DosenDataKeluarga) o;

        if ( ! Objects.equals(id, dosenDataKeluarga.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DosenDataKeluarga{" +
                "id=" + id +
                ", namaIstri='" + namaIstri + "'" +
                ", pekerjaan='" + pekerjaan + "'" +
                ", alamat='" + alamat + "'" +
                ", rt='" + rt + "'" +
                ", rw='" + rw + "'" +
                ", noTelpRumah='" + noTelpRumah + "'" +
                ", noHp='" + noHp + "'" +
                ", kodePos='" + kodePos + "'" +
                ", jumlahAnak='" + jumlahAnak + "'" +
                '}';
    }
}
