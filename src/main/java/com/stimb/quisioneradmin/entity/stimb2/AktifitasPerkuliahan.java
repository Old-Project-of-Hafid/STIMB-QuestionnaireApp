package com.stimb.quisioneradmin.entity.stimb2;

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
 * A AktifitasPerkuliahan.
 */
@Entity
@Table(name = "AKTIFITAS_PERKULIAHAN")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class AktifitasPerkuliahan implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "tanggal_perkuliahan")
    private String tanggalPerkuliahan;

    //@OneToOne(mappedBy = "aktifitasPerkuliahan")
    //@JsonIgnore
    private KartuRencanaStudi kartuRencanaStudi;

    //@OneToMany(mappedBy = "aktifitasPerkuliahan")
    //@JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    //private Set<KehadiranMahasiswa> kehadiranMahasiswas = new HashSet<>();

    @OneToOne
    private KehadiranDosen kehadiranDosen;

    @OneToOne
    private NilaiMahasiswa nilaiMahasiswa;

    //@OneToOne(mappedBy = "aktifitasPerkuliahan")
    //@JsonIgnore
    private ReffPertemuan reffPertemuan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTanggalPerkuliahan() {
        return tanggalPerkuliahan;
    }

    public void setTanggalPerkuliahan(String tanggalPerkuliahan) {
        this.tanggalPerkuliahan = tanggalPerkuliahan;
    }

    public KartuRencanaStudi getKartuRencanaStudi() {
        return kartuRencanaStudi;
    }

    public void setKartuRencanaStudi(KartuRencanaStudi kartuRencanaStudi) {
        this.kartuRencanaStudi = kartuRencanaStudi;
    }
    /*
    public Set<KehadiranMahasiswa> getKehadiranMahasiswas() {
        return kehadiranMahasiswas;
    }

    public void setKehadiranMahasiswas(Set<KehadiranMahasiswa> kehadiranMahasiswas) {
        this.kehadiranMahasiswas = kehadiranMahasiswas;
    }
    */
    public KehadiranDosen getKehadiranDosen() {
        return kehadiranDosen;
    }

    public void setKehadiranDosen(KehadiranDosen kehadiranDosen) {
        this.kehadiranDosen = kehadiranDosen;
    }

    public NilaiMahasiswa getNilaiMahasiswa() {
        return nilaiMahasiswa;
    }

    public void setNilaiMahasiswa(NilaiMahasiswa nilaiMahasiswa) {
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    public ReffPertemuan getReffPertemuan() {
        return reffPertemuan;
    }

    public void setReffPertemuan(ReffPertemuan reffPertemuan) {
        this.reffPertemuan = reffPertemuan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AktifitasPerkuliahan aktifitasPerkuliahan = (AktifitasPerkuliahan) o;

        if ( ! Objects.equals(id, aktifitasPerkuliahan.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "AktifitasPerkuliahan{" +
                "id=" + id +
                ", tanggalPerkuliahan='" + tanggalPerkuliahan + "'" +
                '}';
    }
}
