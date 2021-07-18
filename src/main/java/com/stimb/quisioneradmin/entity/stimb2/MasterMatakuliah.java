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
 * A MasterMatakuliah.
 */
@Entity
@Table(name = "MASTER_MATAKULIAH")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MasterMatakuliah implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "ada_diktat")
    private boolean adaDiktat;
    
    @Column(name = "kode_matakuliah")
    private String kodeMatakuliah;
    
    @Column(name = "nama_matakuliah")
    private String namaMatakuliah;
    
    @Column(name = "jenis_matakuliah")
    private String jenisMatakuliah;
    
    @Column(name = "kelompok_matakuliah")
    private String kelompokMatakuliah;
    
    @Column(name = "sks_matakuliah")
    private Integer sksMatakuliah;
    
    @Column(name = "sks_praktikum")
    private Integer sksPraktikum;
    
    @Column(name = "sks_tatap_muka")
    private Integer sksTatapMuka;
    
    @Column(name = "sks_simulasi")
    private Integer sksSimulasi;
    
    @Column(name = "sks_praktek_lapangan")
    private Integer sksPraktekLapangan;
    
    @Column(name = "metode_kuliah")
    private String metodeKuliah;
    
    @Column(name = "minimal_kelulusan")
    private String minimalKelulusan;
    
    @Column(name = "semester_ke")
    private String semesterKe;
    
    @Column(name = "ada_sap")
    private Boolean adaSAP;
    
    @Column(name = "ada_silabus")
    private Boolean adaSilabus;
    
    @Column(name = "ada_bahan_ajar")
    private Boolean adaBahanAjar;
    
    @Column(name = "ada_acara_praktek")
    private Boolean adaAcaraPraktek;
    
    @Column(name = "ada_instrument_mayor")
    private Boolean adaInstrumentMayor;
    
    /*
    @OneToMany(mappedBy = "masterMatakuliah")
    @JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ListMatakuliah> listMataKuliahs = new HashSet<>();

    @OneToMany(mappedBy = "masterMatakuliah")
    @JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ListInstrumentMayor> listInstrumentMayors = new HashSet<>();

    @OneToMany(mappedBy = "masterMatakuliah")
    @JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ListPrequisiteMatakuliah> listPrequisiteMataKuliahs = new HashSet<>();
    */
    @OneToOne
    private ReffKelompokMatakuliah reffKelompokMatakuliah;

    @OneToOne
    private ReffProgramStudi programStudi;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAdaDiktat() {
        return adaDiktat;
    }

    public void setAdaDiktat(Boolean adaDiktat) {
        this.adaDiktat = adaDiktat;
    }

    public String getKodeMatakuliah() {
        return kodeMatakuliah;
    }

    public void setKodeMatakuliah(String kodeMatakuliah) {
        this.kodeMatakuliah = kodeMatakuliah;
    }

    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public String getJenisMatakuliah() {
        return jenisMatakuliah;
    }

    public void setJenisMatakuliah(String jenisMatakuliah) {
        this.jenisMatakuliah = jenisMatakuliah;
    }

    public String getKelompokMatakuliah() {
        return kelompokMatakuliah;
    }

    public void setKelompokMatakuliah(String kelompokMatakuliah) {
        this.kelompokMatakuliah = kelompokMatakuliah;
    }

    public Integer getSksMatakuliah() {
        return sksMatakuliah;
    }

    public void setSksMatakuliah(Integer sksMatakuliah) {
        this.sksMatakuliah = sksMatakuliah;
    }

    public Integer getSksPraktikum() {
        return sksPraktikum;
    }

    public void setSksPraktikum(Integer sksPraktikum) {
        this.sksPraktikum = sksPraktikum;
    }

    public Integer getSksTatapMuka() {
        return sksTatapMuka;
    }

    public void setSksTatapMuka(Integer sksTatapMuka) {
        this.sksTatapMuka = sksTatapMuka;
    }

    public Integer getSksSimulasi() {
        return sksSimulasi;
    }

    public void setSksSimulasi(Integer sksSimulasi) {
        this.sksSimulasi = sksSimulasi;
    }

    public Integer getSksPraktekLapangan() {
        return sksPraktekLapangan;
    }

    public void setSksPraktekLapangan(Integer sksPraktekLapangan) {
        this.sksPraktekLapangan = sksPraktekLapangan;
    }

    public String getMetodeKuliah() {
        return metodeKuliah;
    }

    public void setMetodeKuliah(String metodeKuliah) {
        this.metodeKuliah = metodeKuliah;
    }
    
    public String getMinimalKelulusan() {
		return minimalKelulusan;
	}

	public void setMinimalKelulusan(String minimalKelulusan) {
		this.minimalKelulusan = minimalKelulusan;
	}
	
	public String getSemesterKe() {
		return semesterKe;
	}

	public void setSemesterKe(String semesterKe) {
		this.semesterKe = semesterKe;
	}

	public Boolean getAdaSAP() {
        return adaSAP;
    }

    public void setAdaSAP(Boolean adaSAP) {
        this.adaSAP = adaSAP;
    }

    public Boolean getAdaSilabus() {
        return adaSilabus;
    }

    public void setAdaSilabus(Boolean adaSilabus) {
        this.adaSilabus = adaSilabus;
    }

    public Boolean getAdaBahanAjar() {
        return adaBahanAjar;
    }

    public void setAdaBahanAjar(Boolean adaBahanAjar) {
        this.adaBahanAjar = adaBahanAjar;
    }

    public Boolean getAdaAcaraPraktek() {
        return adaAcaraPraktek;
    }

    public void setAdaAcaraPraktek(Boolean adaAcaraPraktek) {
        this.adaAcaraPraktek = adaAcaraPraktek;
    }

    public Boolean getAdaInstrumentMayor() {
        return adaInstrumentMayor;
    }

    public void setAdaInstrumentMayor(Boolean adaInstrumentMayor) {
        this.adaInstrumentMayor = adaInstrumentMayor;
    }
    /*
    public Set<ListMatakuliah> getListMataKuliahs() {
        return listMataKuliahs;
    }

    public void setListMataKuliahs(Set<ListMatakuliah> listMatakuliahs) {
        this.listMataKuliahs = listMatakuliahs;
    }

    public Set<ListInstrumentMayor> getListMayors() {
        return listInstrumentMayors;
    }

    public void setListMayors(Set<ListInstrumentMayor> listInstrumentMayors) {
        this.listInstrumentMayors = listInstrumentMayors;
    }

    public Set<ListPrequisiteMatakuliah> getListPrequisiteMataKuliahs() {
        return listPrequisiteMataKuliahs;
    }

    public void setListPrequisiteMataKuliahs(Set<ListPrequisiteMatakuliah> listPrequisiteMatakuliahs) {
        this.listPrequisiteMataKuliahs = listPrequisiteMatakuliahs;
    }
    */
    public ReffKelompokMatakuliah getReffKelompokMatakuliah() {
        return reffKelompokMatakuliah;
    }

    public void setReffKelompokMatakuliah(ReffKelompokMatakuliah reffKelompokMatakuliah) {
        this.reffKelompokMatakuliah = reffKelompokMatakuliah;
    }
    
    public ReffProgramStudi getProgramStudi() {
		return programStudi;
	}

	public void setProgramStudi(ReffProgramStudi programStudi) {
		this.programStudi = programStudi;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MasterMatakuliah masterMatakuliah = (MasterMatakuliah) o;

        if ( ! Objects.equals(id, masterMatakuliah.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "MasterMatakuliah [id=" + id + ", adaDiktat=" + adaDiktat
				+ ", kodeMatakuliah=" + kodeMatakuliah + ", namaMatakuliah="
				+ namaMatakuliah + ", jenisMatakuliah=" + jenisMatakuliah
				+ ", kelompokMatakuliah=" + kelompokMatakuliah
				+ ", sksMatakuliah=" + sksMatakuliah + ", sksPraktikum="
				+ sksPraktikum + ", sksTatapMuka=" + sksTatapMuka
				+ ", sksSimulasi=" + sksSimulasi + ", sksPraktekLapangan="
				+ sksPraktekLapangan + ", metodeKuliah=" + metodeKuliah
				+ ", minimalKelulusan=" + minimalKelulusan + ", semesterKe="
				+ semesterKe + ", adaSAP=" + adaSAP + ", adaSilabus="
				+ adaSilabus + ", adaBahanAjar=" + adaBahanAjar
				+ ", adaAcaraPraktek=" + adaAcaraPraktek
				+ ", adaInstrumentMayor=" + adaInstrumentMayor
				+ ", reffKelompokMatakuliah=" + reffKelompokMatakuliah
				+ ", programStudi=" + programStudi + "]";
	}
}
