package com.stimb.quisioneradmin.entity.stimb2;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 */
@Entity
@Table(name = "LIST_AKTIFITAS_PERKULIAHAN")

public class ListAktifitasPerkuliahan implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private ListJadwalPerkuliahan listJadwalPerkuliahan;
    
    private MasterMahasiswa masterMahasiswa;
    
   
    private boolean statusPertemuan1_mhs;

    private String tanggalPertemuan1;
    
    private boolean statusPertemuan1_dsn;
    
    ///
    
    private boolean statusPertemuan2_mhs;

    private String tanggalPertemuan2;
    
    private boolean statusPertemuan2_dsn;
    
    ///
    
    private boolean statusPertemuan3_mhs;

    private String tanggalPertemuan3;
    
    private boolean statusPertemuan3_dsn;
    
    ///
    
    private boolean statusPertemuan4_mhs;

    private String tanggalPertemuan4;
    
    private boolean statusPertemuan4_dsn;
    
    ///
    
    private boolean statusPertemuan5_mhs;

    private String tanggalPertemuan5;
    
    private boolean statusPertemuan5_dsn;
    
    ///
    
    private boolean statusPertemuan6_mhs;

    private String tanggalPertemuan6;
    
    private boolean statusPertemuan6_dsn;
    
    ///
    
    private boolean statusPertemuan7_mhs;

    private String tanggalPertemuan7;
    
    private boolean statusPertemuan7_dsn;
    
    ///
    
    private boolean statusPertemuanUTS_mhs;

    private String tanggalPertemuanUTS;
    
    private boolean statusPertemuanUTS_dsn;
    
    ///
    
    private boolean statusPertemuan8_mhs;

    private String tanggalPertemuan8;
    
    private boolean statusPertemuan8_dsn;
    
    ///
    
    private boolean statusPertemuan9_mhs;

    private String tanggalPertemuan9;
    
    private boolean statusPertemuan9_dsn;
    
    ///
    
    private boolean statusPertemuan10_mhs;

    private String tanggalPertemuan10;
    
    private boolean statusPertemuan10_dsn;
    
    ///
    
    private boolean statusPertemuan11_mhs;

    private String tanggalPertemuan11;
    
    private boolean statusPertemuan11_dsn;
    
    ///
    
    private boolean statusPertemuan12_mhs;

    private String tanggalPertemuan12;
    
    private boolean statusPertemuan12_dsn;
    
    ///
    
    private boolean statusPertemuan13_mhs;

    private String tanggalPertemuan13;
    
    private boolean statusPertemuan13_dsn;
    
    ///
    
    private boolean statusPertemuan14_mhs;

    private String tanggalPertemuan14;
    
    private boolean statusPertemuan14_dsn;
    
    ///
    
    private boolean statusPertemuanUAS_mhs;

    private String tanggalPertemuanUAS;
    
    private boolean statusPertemuanUAS_dsn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ListJadwalPerkuliahan getListJadwalPerkuliahan() {
		return listJadwalPerkuliahan;
	}

	public void setListJadwalPerkuliahan(ListJadwalPerkuliahan listJadwalPerkuliahan) {
		this.listJadwalPerkuliahan = listJadwalPerkuliahan;
	}

	public MasterMahasiswa getMasterMahasiswa() {
		return masterMahasiswa;
	}

	public void setMasterMahasiswa(MasterMahasiswa masterMahasiswa) {
		this.masterMahasiswa = masterMahasiswa;
	}

	public boolean isStatusPertemuan1_mhs() {
		return statusPertemuan1_mhs;
	}

	public void setStatusPertemuan1_mhs(boolean statusPertemuan1_mhs) {
		this.statusPertemuan1_mhs = statusPertemuan1_mhs;
	}

	public String getTanggalPertemuan1() {
		return tanggalPertemuan1;
	}

	public void setTanggalPertemuan1(String tanggalPertemuan1) {
		this.tanggalPertemuan1 = tanggalPertemuan1;
	}

	public boolean isStatusPertemuan1_dsn() {
		return statusPertemuan1_dsn;
	}

	public void setStatusPertemuan1_dsn(boolean statusPertemuan1_dsn) {
		this.statusPertemuan1_dsn = statusPertemuan1_dsn;
	}

	public boolean isStatusPertemuan2_mhs() {
		return statusPertemuan2_mhs;
	}

	public void setStatusPertemuan2_mhs(boolean statusPertemuan2_mhs) {
		this.statusPertemuan2_mhs = statusPertemuan2_mhs;
	}

	public String getTanggalPertemuan2() {
		return tanggalPertemuan2;
	}

	public void setTanggalPertemuan2(String tanggalPertemuan2) {
		this.tanggalPertemuan2 = tanggalPertemuan2;
	}

	public boolean isStatusPertemuan2_dsn() {
		return statusPertemuan2_dsn;
	}

	public void setStatusPertemuan2_dsn(boolean statusPertemuan2_dsn) {
		this.statusPertemuan2_dsn = statusPertemuan2_dsn;
	}

	public boolean isStatusPertemuan3_mhs() {
		return statusPertemuan3_mhs;
	}

	public void setStatusPertemuan3_mhs(boolean statusPertemuan3_mhs) {
		this.statusPertemuan3_mhs = statusPertemuan3_mhs;
	}

	public String getTanggalPertemuan3() {
		return tanggalPertemuan3;
	}

	public void setTanggalPertemuan3(String tanggalPertemuan3) {
		this.tanggalPertemuan3 = tanggalPertemuan3;
	}

	public boolean isStatusPertemuan3_dsn() {
		return statusPertemuan3_dsn;
	}

	public void setStatusPertemuan3_dsn(boolean statusPertemuan3_dsn) {
		this.statusPertemuan3_dsn = statusPertemuan3_dsn;
	}

	public boolean isStatusPertemuan4_mhs() {
		return statusPertemuan4_mhs;
	}

	public void setStatusPertemuan4_mhs(boolean statusPertemuan4_mhs) {
		this.statusPertemuan4_mhs = statusPertemuan4_mhs;
	}

	public String getTanggalPertemuan4() {
		return tanggalPertemuan4;
	}

	public void setTanggalPertemuan4(String tanggalPertemuan4) {
		this.tanggalPertemuan4 = tanggalPertemuan4;
	}

	public boolean isStatusPertemuan4_dsn() {
		return statusPertemuan4_dsn;
	}

	public void setStatusPertemuan4_dsn(boolean statusPertemuan4_dsn) {
		this.statusPertemuan4_dsn = statusPertemuan4_dsn;
	}

	public boolean isStatusPertemuan5_mhs() {
		return statusPertemuan5_mhs;
	}

	public void setStatusPertemuan5_mhs(boolean statusPertemuan5_mhs) {
		this.statusPertemuan5_mhs = statusPertemuan5_mhs;
	}

	public String getTanggalPertemuan5() {
		return tanggalPertemuan5;
	}

	public void setTanggalPertemuan5(String tanggalPertemuan5) {
		this.tanggalPertemuan5 = tanggalPertemuan5;
	}

	public boolean isStatusPertemuan5_dsn() {
		return statusPertemuan5_dsn;
	}

	public void setStatusPertemuan5_dsn(boolean statusPertemuan5_dsn) {
		this.statusPertemuan5_dsn = statusPertemuan5_dsn;
	}

	public boolean isStatusPertemuan6_mhs() {
		return statusPertemuan6_mhs;
	}

	public void setStatusPertemuan6_mhs(boolean statusPertemuan6_mhs) {
		this.statusPertemuan6_mhs = statusPertemuan6_mhs;
	}

	public String getTanggalPertemuan6() {
		return tanggalPertemuan6;
	}

	public void setTanggalPertemuan6(String tanggalPertemuan6) {
		this.tanggalPertemuan6 = tanggalPertemuan6;
	}

	public boolean isStatusPertemuan6_dsn() {
		return statusPertemuan6_dsn;
	}

	public void setStatusPertemuan6_dsn(boolean statusPertemuan6_dsn) {
		this.statusPertemuan6_dsn = statusPertemuan6_dsn;
	}

	public boolean isStatusPertemuan7_mhs() {
		return statusPertemuan7_mhs;
	}

	public void setStatusPertemuan7_mhs(boolean statusPertemuan7_mhs) {
		this.statusPertemuan7_mhs = statusPertemuan7_mhs;
	}

	public String getTanggalPertemuan7() {
		return tanggalPertemuan7;
	}

	public void setTanggalPertemuan7(String tanggalPertemuan7) {
		this.tanggalPertemuan7 = tanggalPertemuan7;
	}

	public boolean isStatusPertemuan7_dsn() {
		return statusPertemuan7_dsn;
	}

	public void setStatusPertemuan7_dsn(boolean statusPertemuan7_dsn) {
		this.statusPertemuan7_dsn = statusPertemuan7_dsn;
	}

	public boolean isStatusPertemuanUTS_mhs() {
		return statusPertemuanUTS_mhs;
	}

	public void setStatusPertemuanUTS_mhs(boolean statusPertemuanUTS_mhs) {
		this.statusPertemuanUTS_mhs = statusPertemuanUTS_mhs;
	}

	public String getTanggalPertemuanUTS() {
		return tanggalPertemuanUTS;
	}

	public void setTanggalPertemuanUTS(String tanggalPertemuanUTS) {
		this.tanggalPertemuanUTS = tanggalPertemuanUTS;
	}

	public boolean isStatusPertemuanUTS_dsn() {
		return statusPertemuanUTS_dsn;
	}

	public void setStatusPertemuanUTS_dsn(boolean statusPertemuanUTS_dsn) {
		this.statusPertemuanUTS_dsn = statusPertemuanUTS_dsn;
	}

	public boolean isStatusPertemuan8_mhs() {
		return statusPertemuan8_mhs;
	}

	public void setStatusPertemuan8_mhs(boolean statusPertemuan8_mhs) {
		this.statusPertemuan8_mhs = statusPertemuan8_mhs;
	}

	public String getTanggalPertemuan8() {
		return tanggalPertemuan8;
	}

	public void setTanggalPertemuan8(String tanggalPertemuan8) {
		this.tanggalPertemuan8 = tanggalPertemuan8;
	}

	public boolean isStatusPertemuan8_dsn() {
		return statusPertemuan8_dsn;
	}

	public void setStatusPertemuan8_dsn(boolean statusPertemuan8_dsn) {
		this.statusPertemuan8_dsn = statusPertemuan8_dsn;
	}

	public boolean isStatusPertemuan9_mhs() {
		return statusPertemuan9_mhs;
	}

	public void setStatusPertemuan9_mhs(boolean statusPertemuan9_mhs) {
		this.statusPertemuan9_mhs = statusPertemuan9_mhs;
	}

	public String getTanggalPertemuan9() {
		return tanggalPertemuan9;
	}

	public void setTanggalPertemuan9(String tanggalPertemuan9) {
		this.tanggalPertemuan9 = tanggalPertemuan9;
	}

	public boolean isStatusPertemuan9_dsn() {
		return statusPertemuan9_dsn;
	}

	public void setStatusPertemuan9_dsn(boolean statusPertemuan9_dsn) {
		this.statusPertemuan9_dsn = statusPertemuan9_dsn;
	}

	public boolean isStatusPertemuan10_mhs() {
		return statusPertemuan10_mhs;
	}

	public void setStatusPertemuan10_mhs(boolean statusPertemuan10_mhs) {
		this.statusPertemuan10_mhs = statusPertemuan10_mhs;
	}

	public String getTanggalPertemuan10() {
		return tanggalPertemuan10;
	}

	public void setTanggalPertemuan10(String tanggalPertemuan10) {
		this.tanggalPertemuan10 = tanggalPertemuan10;
	}

	public boolean isStatusPertemuan10_dsn() {
		return statusPertemuan10_dsn;
	}

	public void setStatusPertemuan10_dsn(boolean statusPertemuan10_dsn) {
		this.statusPertemuan10_dsn = statusPertemuan10_dsn;
	}

	public boolean isStatusPertemuan11_mhs() {
		return statusPertemuan11_mhs;
	}

	public void setStatusPertemuan11_mhs(boolean statusPertemuan11_mhs) {
		this.statusPertemuan11_mhs = statusPertemuan11_mhs;
	}

	public String getTanggalPertemuan11() {
		return tanggalPertemuan11;
	}

	public void setTanggalPertemuan11(String tanggalPertemuan11) {
		this.tanggalPertemuan11 = tanggalPertemuan11;
	}

	public boolean isStatusPertemuan11_dsn() {
		return statusPertemuan11_dsn;
	}

	public void setStatusPertemuan11_dsn(boolean statusPertemuan11_dsn) {
		this.statusPertemuan11_dsn = statusPertemuan11_dsn;
	}

	public boolean isStatusPertemuan12_mhs() {
		return statusPertemuan12_mhs;
	}

	public void setStatusPertemuan12_mhs(boolean statusPertemuan12_mhs) {
		this.statusPertemuan12_mhs = statusPertemuan12_mhs;
	}

	public String getTanggalPertemuan12() {
		return tanggalPertemuan12;
	}

	public void setTanggalPertemuan12(String tanggalPertemuan12) {
		this.tanggalPertemuan12 = tanggalPertemuan12;
	}

	public boolean isStatusPertemuan12_dsn() {
		return statusPertemuan12_dsn;
	}

	public void setStatusPertemuan12_dsn(boolean statusPertemuan12_dsn) {
		this.statusPertemuan12_dsn = statusPertemuan12_dsn;
	}

	public boolean isStatusPertemuan13_mhs() {
		return statusPertemuan13_mhs;
	}

	public void setStatusPertemuan13_mhs(boolean statusPertemuan13_mhs) {
		this.statusPertemuan13_mhs = statusPertemuan13_mhs;
	}

	public String getTanggalPertemuan13() {
		return tanggalPertemuan13;
	}

	public void setTanggalPertemuan13(String tanggalPertemuan13) {
		this.tanggalPertemuan13 = tanggalPertemuan13;
	}

	public boolean isStatusPertemuan13_dsn() {
		return statusPertemuan13_dsn;
	}

	public void setStatusPertemuan13_dsn(boolean statusPertemuan13_dsn) {
		this.statusPertemuan13_dsn = statusPertemuan13_dsn;
	}

	public boolean isStatusPertemuan14_mhs() {
		return statusPertemuan14_mhs;
	}

	public void setStatusPertemuan14_mhs(boolean statusPertemuan14_mhs) {
		this.statusPertemuan14_mhs = statusPertemuan14_mhs;
	}

	public String getTanggalPertemuan14() {
		return tanggalPertemuan14;
	}

	public void setTanggalPertemuan14(String tanggalPertemuan14) {
		this.tanggalPertemuan14 = tanggalPertemuan14;
	}

	public boolean isStatusPertemuan14_dsn() {
		return statusPertemuan14_dsn;
	}

	public void setStatusPertemuan14_dsn(boolean statusPertemuan14_dsn) {
		this.statusPertemuan14_dsn = statusPertemuan14_dsn;
	}

	public boolean isStatusPertemuanUAS_mhs() {
		return statusPertemuanUAS_mhs;
	}

	public void setStatusPertemuanUAS_mhs(boolean statusPertemuanUAS_mhs) {
		this.statusPertemuanUAS_mhs = statusPertemuanUAS_mhs;
	}

	public String getTanggalPertemuanUAS() {
		return tanggalPertemuanUAS;
	}

	public void setTanggalPertemuanUAS(String tanggalPertemuanUAS) {
		this.tanggalPertemuanUAS = tanggalPertemuanUAS;
	}

	public boolean isStatusPertemuanUAS_dsn() {
		return statusPertemuanUAS_dsn;
	}

	public void setStatusPertemuanUAS_dsn(boolean statusPertemuanUAS_dsn) {
		this.statusPertemuanUAS_dsn = statusPertemuanUAS_dsn;
	}
	
	@Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "ListAktifitasPerkuliahan [id=" + id
				+ ", listJadwalPerkuliahan=" + listJadwalPerkuliahan
				+ ", masterMahasiswa=" + masterMahasiswa
				+ ", statusPertemuan1_mhs=" + statusPertemuan1_mhs
				+ ", tanggalPertemuan1=" + tanggalPertemuan1
				+ ", statusPertemuan1_dsn=" + statusPertemuan1_dsn
				+ ", statusPertemuan2_mhs=" + statusPertemuan2_mhs
				+ ", tanggalPertemuan2=" + tanggalPertemuan2
				+ ", statusPertemuan2_dsn=" + statusPertemuan2_dsn
				+ ", statusPertemuan3_mhs=" + statusPertemuan3_mhs
				+ ", tanggalPertemuan3=" + tanggalPertemuan3
				+ ", statusPertemuan3_dsn=" + statusPertemuan3_dsn
				+ ", statusPertemuan4_mhs=" + statusPertemuan4_mhs
				+ ", tanggalPertemuan4=" + tanggalPertemuan4
				+ ", statusPertemuan4_dsn=" + statusPertemuan4_dsn
				+ ", statusPertemuan5_mhs=" + statusPertemuan5_mhs
				+ ", tanggalPertemuan5=" + tanggalPertemuan5
				+ ", statusPertemuan5_dsn=" + statusPertemuan5_dsn
				+ ", statusPertemuan6_mhs=" + statusPertemuan6_mhs
				+ ", tanggalPertemuan6=" + tanggalPertemuan6
				+ ", statusPertemuan6_dsn=" + statusPertemuan6_dsn
				+ ", statusPertemuan7_mhs=" + statusPertemuan7_mhs
				+ ", tanggalPertemuan7=" + tanggalPertemuan7
				+ ", statusPertemuan7_dsn=" + statusPertemuan7_dsn
				+ ", statusPertemuanUTS_mhs=" + statusPertemuanUTS_mhs
				+ ", tanggalPertemuanUTS=" + tanggalPertemuanUTS
				+ ", statusPertemuanUTS_dsn=" + statusPertemuanUTS_dsn
				+ ", statusPertemuan8_mhs=" + statusPertemuan8_mhs
				+ ", tanggalPertemuan8=" + tanggalPertemuan8
				+ ", statusPertemuan8_dsn=" + statusPertemuan8_dsn
				+ ", statusPertemuan9_mhs=" + statusPertemuan9_mhs
				+ ", tanggalPertemuan9=" + tanggalPertemuan9
				+ ", statusPertemuan9_dsn=" + statusPertemuan9_dsn
				+ ", statusPertemuan10_mhs=" + statusPertemuan10_mhs
				+ ", tanggalPertemuan10=" + tanggalPertemuan10
				+ ", statusPertemuan10_dsn=" + statusPertemuan10_dsn
				+ ", statusPertemuan11_mhs=" + statusPertemuan11_mhs
				+ ", tanggalPertemuan11=" + tanggalPertemuan11
				+ ", statusPertemuan11_dsn=" + statusPertemuan11_dsn
				+ ", statusPertemuan12_mhs=" + statusPertemuan12_mhs
				+ ", tanggalPertemuan12=" + tanggalPertemuan12
				+ ", statusPertemuan12_dsn=" + statusPertemuan12_dsn
				+ ", statusPertemuan13_mhs=" + statusPertemuan13_mhs
				+ ", tanggalPertemuan13=" + tanggalPertemuan13
				+ ", statusPertemuan13_dsn=" + statusPertemuan13_dsn
				+ ", statusPertemuan14_mhs=" + statusPertemuan14_mhs
				+ ", tanggalPertemuan14=" + tanggalPertemuan14
				+ ", statusPertemuan14_dsn=" + statusPertemuan14_dsn
				+ ", statusPertemuanUAS_mhs=" + statusPertemuanUAS_mhs
				+ ", tanggalPertemuanUAS=" + tanggalPertemuanUAS
				+ ", statusPertemuanUAS_dsn=" + statusPertemuanUAS_dsn + "]";
	}
    
}
