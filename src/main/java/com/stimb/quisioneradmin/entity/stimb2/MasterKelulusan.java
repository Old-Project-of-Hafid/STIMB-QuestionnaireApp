package com.stimb.quisioneradmin.entity.stimb2;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MASTER_KELULUSAN")
public class MasterKelulusan implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String tanggalLulus;
    
    private String tanggalYudisium;
    
    private String tanggalWisuda;
    
    private String judulTugasAkhir;
    
    private String sks;
    
    private String ipk;
    
    private String predikat;
    
    private String noTranskrip;
    
    private String noIjazah;
     
    private String awalBimbingan;
    
    private String akhirBimbingan;
    
    private String skYudisium;
    
    @OneToOne
    private MasterDosen pembimbing1;
    
    @OneToOne
    private MasterDosen pembimbing2;
    
    @OneToOne
    private MasterMahasiswa masterMahasiswa;
    
    @OneToOne
    private ReffTahunAjaran tahunAjaran;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTanggalLulus() {
		return tanggalLulus;
	}

	public void setTanggalLulus(String tanggalLulus) {
		this.tanggalLulus = tanggalLulus;
	}

	public String getTanggalYudisium() {
		return tanggalYudisium;
	}

	public void setTanggalYudisium(String tanggalYudisium) {
		this.tanggalYudisium = tanggalYudisium;
	}

	public String getTanggalWisuda() {
		return tanggalWisuda;
	}

	public void setTanggalWisuda(String tanggalWisuda) {
		this.tanggalWisuda = tanggalWisuda;
	}

	public String getJudulTugasAkhir() {
		return judulTugasAkhir;
	}

	public void setJudulTugasAkhir(String judulTugasAkhir) {
		this.judulTugasAkhir = judulTugasAkhir;
	}

	public String getSks() {
		return sks;
	}

	public void setSks(String sks) {
		this.sks = sks;
	}

	public String getIpk() {
		return ipk;
	}

	public void setIpk(String ipk) {
		this.ipk = ipk;
	}

	public String getPredikat() {
		return predikat;
	}

	public void setPredikat(String predikat) {
		this.predikat = predikat;
	}

	public String getNoTranskrip() {
		return noTranskrip;
	}

	public void setNoTranskrip(String noTranskrip) {
		this.noTranskrip = noTranskrip;
	}

	public String getNoIjazah() {
		return noIjazah;
	}

	public void setNoIjazah(String noIjazah) {
		this.noIjazah = noIjazah;
	}

	public String getAwalBimbingan() {
		return awalBimbingan;
	}

	public void setAwalBimbingan(String awalBimbingan) {
		this.awalBimbingan = awalBimbingan;
	}

	public String getAkhirBimbingan() {
		return akhirBimbingan;
	}

	public void setAkhirBimbingan(String akhirBimbingan) {
		this.akhirBimbingan = akhirBimbingan;
	}

	public String getSkYudisium() {
		return skYudisium;
	}

	public void setSkYudisium(String skYudisium) {
		this.skYudisium = skYudisium;
	}

	public MasterDosen getPembimbing1() {
		return pembimbing1;
	}

	public void setPembimbing1(MasterDosen pembimbing1) {
		this.pembimbing1 = pembimbing1;
	}

	public MasterDosen getPembimbing2() {
		return pembimbing2;
	}

	public void setPembimbing2(MasterDosen pembimbing2) {
		this.pembimbing2 = pembimbing2;
	}

	public MasterMahasiswa getMasterMahasiswa() {
		return masterMahasiswa;
	}

	public void setMasterMahasiswa(MasterMahasiswa masterMahasiswa) {
		this.masterMahasiswa = masterMahasiswa;
	}

	public ReffTahunAjaran getTahunAjaran() {
		return tahunAjaran;
	}

	public void setTahunAjaran(ReffTahunAjaran tahunAjaran) {
		this.tahunAjaran = tahunAjaran;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((akhirBimbingan == null) ? 0 : akhirBimbingan.hashCode());
		result = prime * result
				+ ((awalBimbingan == null) ? 0 : awalBimbingan.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ipk == null) ? 0 : ipk.hashCode());
		result = prime * result
				+ ((judulTugasAkhir == null) ? 0 : judulTugasAkhir.hashCode());
		result = prime * result
				+ ((masterMahasiswa == null) ? 0 : masterMahasiswa.hashCode());
		result = prime * result
				+ ((noIjazah == null) ? 0 : noIjazah.hashCode());
		result = prime * result
				+ ((noTranskrip == null) ? 0 : noTranskrip.hashCode());
		result = prime * result
				+ ((pembimbing1 == null) ? 0 : pembimbing1.hashCode());
		result = prime * result
				+ ((pembimbing2 == null) ? 0 : pembimbing2.hashCode());
		result = prime * result
				+ ((predikat == null) ? 0 : predikat.hashCode());
		result = prime * result
				+ ((skYudisium == null) ? 0 : skYudisium.hashCode());
		result = prime * result + ((sks == null) ? 0 : sks.hashCode());
		result = prime * result
				+ ((tahunAjaran == null) ? 0 : tahunAjaran.hashCode());
		result = prime * result
				+ ((tanggalLulus == null) ? 0 : tanggalLulus.hashCode());
		result = prime * result
				+ ((tanggalWisuda == null) ? 0 : tanggalWisuda.hashCode());
		result = prime * result
				+ ((tanggalYudisium == null) ? 0 : tanggalYudisium.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MasterKelulusan other = (MasterKelulusan) obj;
		if (akhirBimbingan == null) {
			if (other.akhirBimbingan != null)
				return false;
		} else if (!akhirBimbingan.equals(other.akhirBimbingan))
			return false;
		if (awalBimbingan == null) {
			if (other.awalBimbingan != null)
				return false;
		} else if (!awalBimbingan.equals(other.awalBimbingan))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ipk == null) {
			if (other.ipk != null)
				return false;
		} else if (!ipk.equals(other.ipk))
			return false;
		if (judulTugasAkhir == null) {
			if (other.judulTugasAkhir != null)
				return false;
		} else if (!judulTugasAkhir.equals(other.judulTugasAkhir))
			return false;
		if (masterMahasiswa == null) {
			if (other.masterMahasiswa != null)
				return false;
		} else if (!masterMahasiswa.equals(other.masterMahasiswa))
			return false;
		if (noIjazah == null) {
			if (other.noIjazah != null)
				return false;
		} else if (!noIjazah.equals(other.noIjazah))
			return false;
		if (noTranskrip == null) {
			if (other.noTranskrip != null)
				return false;
		} else if (!noTranskrip.equals(other.noTranskrip))
			return false;
		if (pembimbing1 == null) {
			if (other.pembimbing1 != null)
				return false;
		} else if (!pembimbing1.equals(other.pembimbing1))
			return false;
		if (pembimbing2 == null) {
			if (other.pembimbing2 != null)
				return false;
		} else if (!pembimbing2.equals(other.pembimbing2))
			return false;
		if (predikat == null) {
			if (other.predikat != null)
				return false;
		} else if (!predikat.equals(other.predikat))
			return false;
		if (skYudisium == null) {
			if (other.skYudisium != null)
				return false;
		} else if (!skYudisium.equals(other.skYudisium))
			return false;
		if (sks == null) {
			if (other.sks != null)
				return false;
		} else if (!sks.equals(other.sks))
			return false;
		if (tahunAjaran == null) {
			if (other.tahunAjaran != null)
				return false;
		} else if (!tahunAjaran.equals(other.tahunAjaran))
			return false;
		if (tanggalLulus == null) {
			if (other.tanggalLulus != null)
				return false;
		} else if (!tanggalLulus.equals(other.tanggalLulus))
			return false;
		if (tanggalWisuda == null) {
			if (other.tanggalWisuda != null)
				return false;
		} else if (!tanggalWisuda.equals(other.tanggalWisuda))
			return false;
		if (tanggalYudisium == null) {
			if (other.tanggalYudisium != null)
				return false;
		} else if (!tanggalYudisium.equals(other.tanggalYudisium))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MasterKelulusan [id=" + id + ", tanggalLulus=" + tanggalLulus
				+ ", tanggalYudisium=" + tanggalYudisium + ", tanggalWisuda="
				+ tanggalWisuda + ", judulTugasAkhir=" + judulTugasAkhir
				+ ", sks=" + sks + ", ipk=" + ipk + ", predikat=" + predikat
				+ ", noTranskrip=" + noTranskrip + ", noIjazah=" + noIjazah
				+ ", awalBimbingan=" + awalBimbingan + ", akhirBimbingan="
				+ akhirBimbingan + ", skYudisium=" + skYudisium
				+ ", pembimbing1=" + pembimbing1 + ", pembimbing2="
				+ pembimbing2 + ", masterMahasiswa=" + masterMahasiswa
				+ ", tahunAjaran=" + tahunAjaran + "]";
	}

}
