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
 * A DosenStatus.
 */
@Entity
@Table(name = "DOSEN_STATUS")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DosenStatus implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "status_aktif")
    private String statusAktif;
    
    @Column(name = "ikatan_kerja")
    private String ikatanKerja;
    
    @Column(name = "status_pegawai")
    private String statusPegawai;
    
    @Column(name = "jenis_pegawai")
    private String jenisPegawai;
    
    @Column(name = "no_sk_cpns")
    private String noSkCpns;
    
    @Column(name = "no_sk_pengangkatan")
    private String noSkPengangkatan;
    
    @Column(name = "lembaga_pengangkatan")
    private String lembagaPengangkatan;
    
    @Column(name = "pangkat_golongan")
    private String pangkatGolongan;
    
    @Column(name = "jabatan_akademik")
    private String jabatanAkademik;

    @OneToOne
    private MasterDosen listDosenWali;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusAktif() {
        return statusAktif;
    }

    public void setStatusAktif(String statusAktif) {
        this.statusAktif = statusAktif;
    }

    public String getIkatanKerja() {
        return ikatanKerja;
    }

    public void setIkatanKerja(String ikatanKerja) {
        this.ikatanKerja = ikatanKerja;
    }

    public String getStatusPegawai() {
        return statusPegawai;
    }

    public void setStatusPegawai(String statusPegawai) {
        this.statusPegawai = statusPegawai;
    }

    public String getJenisPegawai() {
        return jenisPegawai;
    }

    public void setJenisPegawai(String jenisPegawai) {
        this.jenisPegawai = jenisPegawai;
    }

    public String getNoSkCpns() {
        return noSkCpns;
    }

    public void setNoSkCpns(String noSkCpns) {
        this.noSkCpns = noSkCpns;
    }

    public String getNoSkPengangkatan() {
        return noSkPengangkatan;
    }

    public void setNoSkPengangkatan(String noSkPengangkatan) {
        this.noSkPengangkatan = noSkPengangkatan;
    }

    public String getLembagaPengangkatan() {
        return lembagaPengangkatan;
    }

    public void setLembagaPengangkatan(String lembagaPengangkatan) {
        this.lembagaPengangkatan = lembagaPengangkatan;
    }

    public String getPangkatGolongan() {
        return pangkatGolongan;
    }

    public void setPangkatGolongan(String pangkatGolongan) {
        this.pangkatGolongan = pangkatGolongan;
    }

    public String getJabatanAkademik() {
        return jabatanAkademik;
    }

    public void setJabatanAkademik(String jabatanAkademik) {
        this.jabatanAkademik = jabatanAkademik;
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

        DosenStatus dosenStatus = (DosenStatus) o;

        if ( ! Objects.equals(id, dosenStatus.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DosenStatus{" +
                "id=" + id +
                ", statusAktif='" + statusAktif + "'" +
                ", ikatanKerja='" + ikatanKerja + "'" +
                ", statusPegawai='" + statusPegawai + "'" +
                ", jenisPegawai='" + jenisPegawai + "'" +
                ", noSkCpns='" + noSkCpns + "'" +
                ", noSkPengangkatan='" + noSkPengangkatan + "'" +
                ", lembagaPengangkatan='" + lembagaPengangkatan + "'" +
                ", pangkatGolongan='" + pangkatGolongan + "'" +
                ", jabatanAkademik='" + jabatanAkademik + "'" +
                '}';
    }
}
