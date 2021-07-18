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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A KelasPerkuliahan.
 */
@Entity
@Table(name = "KELAS_PERKULIAHAN")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class KelasPerkuliahan implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "semester")
    private String semester;
    
    @Column(name = "tgl_mulai")
    private String tanggalMulai;
    
    @Column(name = "tgl_akhir")
    private String tanggalAkhir;
    
    @Column(name = "peserta_kelas")
    private Integer pesertaKelas;
    
    @Column(name = "nama_kelas")
    private Integer namaKelas;
    
    @Column(name = "jumlah_dosen_pengajar")
    private Integer jumlahDosenPengajar;

    @ManyToOne
    private ListSemesterPerkuliahan listSemesterPerkuliahan;

    @ManyToOne
    private MasterMatakuliah masterMatakuliah;
    
    @ManyToOne
    private MasterKurikulum masterKurikulum;
    
    @ManyToOne
    private MasterDosen masterDosen;
    
    @ManyToOne
    private ReffInstrumentMayor instrumentMayor;
    
    @OneToOne
    private ReffProgramStudi programStudi;
    
    @OneToOne
    private ReffTahunAjaran reffTahunAjaran;
    
    @Column(name = "statusOpen")
    private String statusopen;
    
    @OneToMany()
    //@JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ListJadwalPerkuliahan> listJadwalPerkuliahans = new HashSet<>();

    @OneToMany()
    //@JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<KartuRencanaStudi> kartuRencanaStudis = new HashSet<>();
    
    @OneToMany()
    //@JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ListInstrumentMayor> instrumentMayors = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public Integer getNamaKelas() {
		return namaKelas;
	}

	public void setNamaKelas(Integer namaKelas) {
		this.namaKelas = namaKelas;
	}
	
	public ReffProgramStudi getProgramStudi() {
		return programStudi;
	}

	public void setProgramStudi(ReffProgramStudi programStudi) {
		this.programStudi = programStudi;
	}
	
	public ReffTahunAjaran getReffTahunAjaran() {
		return reffTahunAjaran;
	}

	public void setReffTahunAjaran(ReffTahunAjaran reffTahunAjaran) {
		this.reffTahunAjaran = reffTahunAjaran;
	}

	public Integer getPesertaKelas() {
        return pesertaKelas;
    }

    public void setPesertaKelas(Integer pesertaKelas) {
        this.pesertaKelas = pesertaKelas;
    }

    public Integer getJumlahDosenPengajar() {
        return jumlahDosenPengajar;
    }

    public void setJumlahDosenPengajar(Integer jumlahDosenPengajar) {
        this.jumlahDosenPengajar = jumlahDosenPengajar;
    }

    public ListSemesterPerkuliahan getListSemesterPerkuliahan() {
        return listSemesterPerkuliahan;
    }

    public void setListSemesterPerkuliahan(ListSemesterPerkuliahan listSemesterPerkuliahan) {
        this.listSemesterPerkuliahan = listSemesterPerkuliahan;
    }

    public Set<ListJadwalPerkuliahan> getListJadwalPerkuliahans() {
        return listJadwalPerkuliahans;
    }

    public void setListJadwalPerkuliahans(Set<ListJadwalPerkuliahan> listJadwalPerkuliahans) {
        this.listJadwalPerkuliahans = listJadwalPerkuliahans;
    }

    public Set<KartuRencanaStudi> getKartuRencanaStudis() {
        return kartuRencanaStudis;
    }

    public void setKartuRencanaStudis(Set<KartuRencanaStudi> kartuRencanaStudis) {
        this.kartuRencanaStudis = kartuRencanaStudis;
    }
      
    public Set<ListInstrumentMayor> getInstrumentMayors() {
		return instrumentMayors;
	}

	public void setInstrumentMayors(Set<ListInstrumentMayor> instrumentMayors) {
		this.instrumentMayors = instrumentMayors;
	}

	public MasterMatakuliah getMasterMatakuliah() {
		return masterMatakuliah;
	}

	public void setMasterMatakuliah(MasterMatakuliah masterMatakuliah) {
		this.masterMatakuliah = masterMatakuliah;
	}
	
	public MasterKurikulum getMasterKurikulum() {
		return masterKurikulum;
	}

	public void setMasterKurikulum(MasterKurikulum masterKurikulum) {
		this.masterKurikulum = masterKurikulum;
	}

	public MasterDosen getMasterDosen() {
		return masterDosen;
	}

	public void setMasterDosen(MasterDosen masterDosen) {
		this.masterDosen = masterDosen;
	}

	public String getTanggalMulai() {
		return tanggalMulai;
	}

	public void setTanggalMulai(String tanggalMulai) {
		this.tanggalMulai = tanggalMulai;
	}

	public String getTanggalAkhir() {
		return tanggalAkhir;
	}

	public void setTanggalAkhir(String tanggalAkhir) {
		this.tanggalAkhir = tanggalAkhir;
	}
	
	public ReffInstrumentMayor getInstrumentMayor() {
		return instrumentMayor;
	}

	public void setInstrumentMayor(ReffInstrumentMayor instrumentMayor) {
		this.instrumentMayor = instrumentMayor;
	}

	public String getStatusopen() {
		return statusopen;
	}

	public void setStatusopen(String statusopen) {
		this.statusopen = statusopen;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        KelasPerkuliahan kelasPerkuliahan = (KelasPerkuliahan) o;

        if ( ! Objects.equals(id, kelasPerkuliahan.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "KelasPerkuliahan [id=" + id + ", semester=" + semester
				+ ", tanggalMulai=" + tanggalMulai + ", tanggalAkhir="
				+ tanggalAkhir + ", pesertaKelas=" + pesertaKelas
				+ ", namaKelas=" + namaKelas + ", jumlahDosenPengajar="
				+ jumlahDosenPengajar + ", listSemesterPerkuliahan="
				+ listSemesterPerkuliahan + ", masterMatakuliah="
				+ masterMatakuliah + ", masterKurikulum=" + masterKurikulum
				+ ", masterDosen=" + masterDosen + ", instrumentMayor="
				+ instrumentMayor + ", programStudi=" + programStudi
				+ ", reffTahunAjaran=" + reffTahunAjaran + ", statusopen="
				+ statusopen + ", listJadwalPerkuliahans="
				+ listJadwalPerkuliahans + ", kartuRencanaStudis="
				+ kartuRencanaStudis + ", instrumentMayors=" + instrumentMayors
				+ "]";
	}
}
