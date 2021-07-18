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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A MasterMahasiswa.
 */
@Entity
@Table(name = "MASTER_MAHASISWA")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MasterMahasiswa implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "npm")
    private String npm;
    
    @Column(name = "nama")
    private String nama;
    
    @Column(name = "angkatan")
    private String angkatan;
    
    @Column(name = "pilihan_jenjang_pendidikan")
    private String pilihanJenjangPendidikan;

    @OneToOne
    private MahasiswaDetaill mahasiswaDetaill;

    @OneToOne
    private StatusMahasiswa statusMahasiswa;
    
    @OneToOne
    private ReffProgramStudi reffProgramStudi;
    
    @OneToOne
    private ReffInstrumentMayor reffInstrumentMayor;

    @OneToMany(mappedBy = "masterMahasiswa")
    //@JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    //private Set<ListDosenWali> listDosenWalis = new HashSet<>();

    @OneToOne
    private KartuRencanaStudi kartuRencanaStudi;

    @OneToOne
    private MahasiswaDataKeluarga mahasiswaDataKeluarga;

    @OneToOne
    private MahasiswaDataWali mahasiswaDataWali;

    @OneToOne
    private MahasiswaDataAsalPendidikan mahasiswaDataAsalPendidikan;
    
    @ManyToOne
    private Angkatan angkatann;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getPilihanJenjangPendidikan() {
        return pilihanJenjangPendidikan;
    }

    public void setPilihanJenjangPendidikan(String pilihanJenjangPendidikan) {
        this.pilihanJenjangPendidikan = pilihanJenjangPendidikan;
    }

    public MahasiswaDetaill getMahasiswaDetaill() {
        return mahasiswaDetaill;
    }

    public void setMahasiswaDetaill(MahasiswaDetaill mahasiswaDetaill) {
        this.mahasiswaDetaill = mahasiswaDetaill;
    }

    public StatusMahasiswa getStatusMahasiswa() {
        return statusMahasiswa;
    }

    public void setStatusMahasiswa(StatusMahasiswa statusMahasiswa) {
        this.statusMahasiswa = statusMahasiswa;
    }
    
    /*
    public Set<ListDosenWali> getListDosenWalis() {
        return listDosenWalis;
    }

    public void setListDosenWalis(Set<ListDosenWali> listDosenWalis) {
        this.listDosenWalis = listDosenWalis;
    }
    */

    public KartuRencanaStudi getKartuRencanaStudi() {
        return kartuRencanaStudi;
    }

    public void setKartuRencanaStudi(KartuRencanaStudi kartuRencanaStudi) {
        this.kartuRencanaStudi = kartuRencanaStudi;
    }

    public MahasiswaDataKeluarga getMahasiswaDataKeluarga() {
        return mahasiswaDataKeluarga;
    }

    public void setMahasiswaDataKeluarga(MahasiswaDataKeluarga mahasiswaDataKeluarga) {
        this.mahasiswaDataKeluarga = mahasiswaDataKeluarga;
    }

    public MahasiswaDataWali getMahasiswaDataWali() {
        return mahasiswaDataWali;
    }

    public void setMahasiswaDataWali(MahasiswaDataWali mahasiswaDataWali) {
        this.mahasiswaDataWali = mahasiswaDataWali;
    }

    public MahasiswaDataAsalPendidikan getMahasiswaDataAsalPendidikan() {
        return mahasiswaDataAsalPendidikan;
    }

    public void setMahasiswaDataAsalPendidikan(MahasiswaDataAsalPendidikan mahasiswaDataAsalPendidikan) {
        this.mahasiswaDataAsalPendidikan = mahasiswaDataAsalPendidikan;
    }
    
	public ReffProgramStudi getReffProgramStudi() {
		return reffProgramStudi;
	}

	public void setReffProgramStudi(ReffProgramStudi reffProgramStudi) {
		this.reffProgramStudi = reffProgramStudi;
	}

	public ReffInstrumentMayor getReffInstrumentMayor() {
		return reffInstrumentMayor;
	}

	public void setReffInstrumentMayor(ReffInstrumentMayor reffInstrumentMayor) {
		this.reffInstrumentMayor = reffInstrumentMayor;
	}
	
	public Angkatan getAngkatann() {
		return angkatann;
	}

	public void setAngkatann(Angkatan angkatann) {
		this.angkatann = angkatann;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MasterMahasiswa masterMahasiswa = (MasterMahasiswa) o;

        if ( ! Objects.equals(id, masterMahasiswa.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "MasterMahasiswa [id=" + id + ", npm=" + npm + ", nama=" + nama
				+ ", angkatan=" + angkatan + ", pilihanJenjangPendidikan="
				+ pilihanJenjangPendidikan + ", mahasiswaDetaill="
				+ mahasiswaDetaill + ", statusMahasiswa=" + statusMahasiswa
				+ ", reffProgramStudi=" + reffProgramStudi
				+ ", reffInstrumentMayor=" + reffInstrumentMayor
				+ ", kartuRencanaStudi=" + kartuRencanaStudi
				+ ", mahasiswaDataKeluarga=" + mahasiswaDataKeluarga
				+ ", mahasiswaDataWali=" + mahasiswaDataWali
				+ ", mahasiswaDataAsalPendidikan="
				+ mahasiswaDataAsalPendidikan + ", angkatann=" + angkatann
				+ "]";
	}
}
