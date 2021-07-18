package com.stimb.quisioneradmin.entity.stimb2;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A ListJadwalPerkuliahan.
 */
@Entity
@Table(name = "LIST_JADWAL_PERKULIAHAN")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ListJadwalPerkuliahan implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "hari")
    private String hari;
    
    @Column(name = "waktu")
    private String waktu;

    @ManyToOne
    private KelasPerkuliahan kelasPerkuliahan;
    
    @OneToOne
    private ListKehadiranDosen listKehadiranDosen;

    //@OneToOne(mappedBy = "listJadwalPerkuliahan")
    //@JsonIgnore
    //private MasterDosen masterDosen;

    //@OneToOne(mappedBy = "listJadwalPerkuliahan")
    //@JsonIgnore
    //private ReffRuangKelas reffRuangKelas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public KelasPerkuliahan getKelasPerkuliahan() {
        return kelasPerkuliahan;
    }

    public void setKelasPerkuliahan(KelasPerkuliahan kelasPerkuliahan) {
        this.kelasPerkuliahan = kelasPerkuliahan;
    }
    
    /*
    public MasterDosen getMasterDosen() {
        return masterDosen;
    }

    public void setMasterDosen(MasterDosen masterDosen) {
        this.masterDosen = masterDosen;
    }

    public ReffRuangKelas getReffRuangKelas() {
        return reffRuangKelas;
    }

    public void setReffRuangKelas(ReffRuangKelas reffRuangKelas) {
        this.reffRuangKelas = reffRuangKelas;
    }
    */

    public ListKehadiranDosen getListKehadiranDosen() {
		return listKehadiranDosen;
	}

	public void setListKehadiranDosen(ListKehadiranDosen listKehadiranDosen) {
		this.listKehadiranDosen = listKehadiranDosen;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ListJadwalPerkuliahan listJadwalPerkuliahan = (ListJadwalPerkuliahan) o;

        if ( ! Objects.equals(id, listJadwalPerkuliahan.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "ListJadwalPerkuliahan [id=" + id + ", hari=" + hari
				+ ", waktu=" + waktu + ", kelasPerkuliahan=" + kelasPerkuliahan
				+ ", listKehadiranDosen=" + listKehadiranDosen + "]";
	}   
}
