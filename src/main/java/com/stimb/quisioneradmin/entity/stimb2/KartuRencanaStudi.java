package com.stimb.quisioneradmin.entity.stimb2;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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
 * A KartuRencanaStudi.
 */
@Entity
@Table(name = "KARTU_RENCANA_STUDI")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class KartuRencanaStudi implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "status_perubahan")
    private String statusPerubahan;
    
    @Column(name = "keterangan")
    private String keterangan;
    
    @Column(name = "statuspkrs")
    private String statusPKRS = "PKRS belum disetujui";
    
    @Column(name = "periode")
    private String periode;
    
    @Column(name = "statusambil")
    private Integer statusambil = 1;
    
    @Column(name = "ambilpkrs")
    private Integer ambilpkrs = 0;

    @Column(name = "isiquisioner")
    private boolean isiquisioner = false;

    @ManyToOne
    private KelasPerkuliahan kelasPerkuliahan;

    //@OneToOne
    //private AktifitasPerkuliahan aktifitasPerkuliahan;

    @OneToOne()
    private MasterMahasiswa masterMahasiswa;
    
    @OneToOne()
    private ReffTahunAjaran reffTahunAjaran;
    
    @OneToOne()
    private NilaiMahasiswa nilaiMahasiswa;

    @OneToOne()
    private ListAktifitasPerkuliahan listAktifitasPerkuliahan;
    
    @OneToMany(mappedBy = "kartuRencanaStudi")
    private List<QuisionerLog> quisionerLogs;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusPerubahan() {
        return statusPerubahan;
    }

    public void setStatusPerubahan(String statusPerubahan) {
        this.statusPerubahan = statusPerubahan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public KelasPerkuliahan getKelasPerkuliahan() {
        return kelasPerkuliahan;
    }

    public void setKelasPerkuliahan(KelasPerkuliahan kelasPerkuliahan) {
        this.kelasPerkuliahan = kelasPerkuliahan;
    }
    /*
    public AktifitasPerkuliahan getAktifitasPerkuliahan() {
        return aktifitasPerkuliahan;
    }

    public void setAktifitasPerkuliahan(AktifitasPerkuliahan aktifitasPerkuliahan) {
        this.aktifitasPerkuliahan = aktifitasPerkuliahan;
    }
    */
    public MasterMahasiswa getMasterMahasiswa() {
        return masterMahasiswa;
    }

    public void setMasterMahasiswa(MasterMahasiswa masterMahasiswa) {
        this.masterMahasiswa = masterMahasiswa;
    }
  
    public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	public ReffTahunAjaran getReffTahunAjaran() {
		return reffTahunAjaran;
	}

	public void setReffTahunAjaran(ReffTahunAjaran reffTahunAjaran) {
		this.reffTahunAjaran = reffTahunAjaran;
	}
	
	public NilaiMahasiswa getNilaiMahasiswa() {
		return nilaiMahasiswa;
	}

	public void setNilaiMahasiswa(NilaiMahasiswa nilaiMahasiswa) {
		this.nilaiMahasiswa = nilaiMahasiswa;
	}
	
	public String getStatusPKRS() {
		return statusPKRS;
	}

	public void setStatusPKRS(String statusPKRS) {
		this.statusPKRS = statusPKRS;
	}
	
	public Integer getStatusambil() {
		return statusambil;
	}

	public void setStatusambil(Integer statusambil) {
		this.statusambil = statusambil;
	}

	public Integer getAmbilpkrs() {
		return ambilpkrs;
	}

	public void setAmbilpkrs(Integer ambilpkrs) {
		this.ambilpkrs = ambilpkrs;
	}
	
	public ListAktifitasPerkuliahan getListAktifitasPerkuliahan() {
		return listAktifitasPerkuliahan;
	}

	public void setListAktifitasPerkuliahan(
			ListAktifitasPerkuliahan listAktifitasPerkuliahan) {
		this.listAktifitasPerkuliahan = listAktifitasPerkuliahan;
	}

	public List<QuisionerLog> getQuisionerLogs() {
		return quisionerLogs;
	}

	public void setQuisionerLogs(List<QuisionerLog> quisionerLogs) {
		this.quisionerLogs = quisionerLogs;
	}

    public boolean isiquisioner() {
        return isiquisioner;
    }

    public void setIsiquisioner(boolean isiquisioner) {
        this.isiquisioner = isiquisioner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        KartuRencanaStudi kartuRencanaStudi = (KartuRencanaStudi) o;

        if ( ! Objects.equals(id, kartuRencanaStudi.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "KartuRencanaStudi [id=" + id + ", statusPerubahan="
				+ statusPerubahan + ", keterangan=" + keterangan
				+ ", statusPKRS=" + statusPKRS + ", periode=" + periode
				+ ", statusambil=" + statusambil + ", ambilpkrs=" + ambilpkrs
				+ ", kelasPerkuliahan=" + kelasPerkuliahan
				+ ", masterMahasiswa=" + masterMahasiswa + ", reffTahunAjaran="
				+ reffTahunAjaran + ", nilaiMahasiswa=" + nilaiMahasiswa
				+ ", listAktifitasPerkuliahan=" + listAktifitasPerkuliahan
				+ ", quisionerLogs=" + quisionerLogs + "]";
	}		
}
