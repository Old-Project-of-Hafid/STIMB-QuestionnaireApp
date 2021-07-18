package com.stimb.quisioneradmin.entity.stimb2;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "LIST_KEHADIRAN_DOSEN")
public class ListKehadiranDosen implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
	private String tanggalPertemuan1;
	    
	private boolean statusPertemuan1_dsn;
	
	private String tanggalPertemuan2;
    
	private boolean statusPertemuan2_dsn;
	
	private String tanggalPertemuan3;
    
	private boolean statusPertemuan3_dsn;
	
	private String tanggalPertemuan4;
    
	private boolean statusPertemuan4_dsn;
	
	private String tanggalPertemuan5;
    
	private boolean statusPertemuan5_dsn;
	
	private String tanggalPertemuan6;
    
	private boolean statusPertemuan6_dsn;
	
	private String tanggalPertemuan7;
    
	private boolean statusPertemuan7_dsn;
	
	private String tanggalPertemuanUTS;
    
	private boolean statusPertemuanUTS_dsn;
	
	private String tanggalPertemuan8;
    
	private boolean statusPertemuan8_dsn;
	
	private String tanggalPertemuan9;
    
	private boolean statusPertemuan9_dsn;
	
	private String tanggalPertemuan10;
    
	private boolean statusPertemuan10_dsn;
	
	private String tanggalPertemuan11;
    
	private boolean statusPertemuan11_dsn;
	
	private String tanggalPertemuan12;
    
	private boolean statusPertemuan12_dsn;
	
	private String tanggalPertemuan13;
    
	private boolean statusPertemuan13_dsn;
	
	private String tanggalPertemuan14;
    
	private boolean statusPertemuan14_dsn;
	
	private String tanggalPertemuanUAS;
    
	private boolean statusPertemuanUAS_dsn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (statusPertemuan10_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan11_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan12_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan13_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan14_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan1_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan2_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan3_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan4_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan5_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan6_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan7_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan8_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuan9_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuanUAS_dsn ? 1231 : 1237);
		result = prime * result + (statusPertemuanUTS_dsn ? 1231 : 1237);
		result = prime
				* result
				+ ((tanggalPertemuan1 == null) ? 0 : tanggalPertemuan1
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan10 == null) ? 0 : tanggalPertemuan10
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan11 == null) ? 0 : tanggalPertemuan11
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan12 == null) ? 0 : tanggalPertemuan12
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan13 == null) ? 0 : tanggalPertemuan13
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan14 == null) ? 0 : tanggalPertemuan14
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan2 == null) ? 0 : tanggalPertemuan2
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan3 == null) ? 0 : tanggalPertemuan3
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan4 == null) ? 0 : tanggalPertemuan4
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan5 == null) ? 0 : tanggalPertemuan5
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan6 == null) ? 0 : tanggalPertemuan6
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan7 == null) ? 0 : tanggalPertemuan7
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan8 == null) ? 0 : tanggalPertemuan8
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuan9 == null) ? 0 : tanggalPertemuan9
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuanUAS == null) ? 0 : tanggalPertemuanUAS
						.hashCode());
		result = prime
				* result
				+ ((tanggalPertemuanUTS == null) ? 0 : tanggalPertemuanUTS
						.hashCode());
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
		ListKehadiranDosen other = (ListKehadiranDosen) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (statusPertemuan10_dsn != other.statusPertemuan10_dsn)
			return false;
		if (statusPertemuan11_dsn != other.statusPertemuan11_dsn)
			return false;
		if (statusPertemuan12_dsn != other.statusPertemuan12_dsn)
			return false;
		if (statusPertemuan13_dsn != other.statusPertemuan13_dsn)
			return false;
		if (statusPertemuan14_dsn != other.statusPertemuan14_dsn)
			return false;
		if (statusPertemuan1_dsn != other.statusPertemuan1_dsn)
			return false;
		if (statusPertemuan2_dsn != other.statusPertemuan2_dsn)
			return false;
		if (statusPertemuan3_dsn != other.statusPertemuan3_dsn)
			return false;
		if (statusPertemuan4_dsn != other.statusPertemuan4_dsn)
			return false;
		if (statusPertemuan5_dsn != other.statusPertemuan5_dsn)
			return false;
		if (statusPertemuan6_dsn != other.statusPertemuan6_dsn)
			return false;
		if (statusPertemuan7_dsn != other.statusPertemuan7_dsn)
			return false;
		if (statusPertemuan8_dsn != other.statusPertemuan8_dsn)
			return false;
		if (statusPertemuan9_dsn != other.statusPertemuan9_dsn)
			return false;
		if (statusPertemuanUAS_dsn != other.statusPertemuanUAS_dsn)
			return false;
		if (statusPertemuanUTS_dsn != other.statusPertemuanUTS_dsn)
			return false;
		if (tanggalPertemuan1 == null) {
			if (other.tanggalPertemuan1 != null)
				return false;
		} else if (!tanggalPertemuan1.equals(other.tanggalPertemuan1))
			return false;
		if (tanggalPertemuan10 == null) {
			if (other.tanggalPertemuan10 != null)
				return false;
		} else if (!tanggalPertemuan10.equals(other.tanggalPertemuan10))
			return false;
		if (tanggalPertemuan11 == null) {
			if (other.tanggalPertemuan11 != null)
				return false;
		} else if (!tanggalPertemuan11.equals(other.tanggalPertemuan11))
			return false;
		if (tanggalPertemuan12 == null) {
			if (other.tanggalPertemuan12 != null)
				return false;
		} else if (!tanggalPertemuan12.equals(other.tanggalPertemuan12))
			return false;
		if (tanggalPertemuan13 == null) {
			if (other.tanggalPertemuan13 != null)
				return false;
		} else if (!tanggalPertemuan13.equals(other.tanggalPertemuan13))
			return false;
		if (tanggalPertemuan14 == null) {
			if (other.tanggalPertemuan14 != null)
				return false;
		} else if (!tanggalPertemuan14.equals(other.tanggalPertemuan14))
			return false;
		if (tanggalPertemuan2 == null) {
			if (other.tanggalPertemuan2 != null)
				return false;
		} else if (!tanggalPertemuan2.equals(other.tanggalPertemuan2))
			return false;
		if (tanggalPertemuan3 == null) {
			if (other.tanggalPertemuan3 != null)
				return false;
		} else if (!tanggalPertemuan3.equals(other.tanggalPertemuan3))
			return false;
		if (tanggalPertemuan4 == null) {
			if (other.tanggalPertemuan4 != null)
				return false;
		} else if (!tanggalPertemuan4.equals(other.tanggalPertemuan4))
			return false;
		if (tanggalPertemuan5 == null) {
			if (other.tanggalPertemuan5 != null)
				return false;
		} else if (!tanggalPertemuan5.equals(other.tanggalPertemuan5))
			return false;
		if (tanggalPertemuan6 == null) {
			if (other.tanggalPertemuan6 != null)
				return false;
		} else if (!tanggalPertemuan6.equals(other.tanggalPertemuan6))
			return false;
		if (tanggalPertemuan7 == null) {
			if (other.tanggalPertemuan7 != null)
				return false;
		} else if (!tanggalPertemuan7.equals(other.tanggalPertemuan7))
			return false;
		if (tanggalPertemuan8 == null) {
			if (other.tanggalPertemuan8 != null)
				return false;
		} else if (!tanggalPertemuan8.equals(other.tanggalPertemuan8))
			return false;
		if (tanggalPertemuan9 == null) {
			if (other.tanggalPertemuan9 != null)
				return false;
		} else if (!tanggalPertemuan9.equals(other.tanggalPertemuan9))
			return false;
		if (tanggalPertemuanUAS == null) {
			if (other.tanggalPertemuanUAS != null)
				return false;
		} else if (!tanggalPertemuanUAS.equals(other.tanggalPertemuanUAS))
			return false;
		if (tanggalPertemuanUTS == null) {
			if (other.tanggalPertemuanUTS != null)
				return false;
		} else if (!tanggalPertemuanUTS.equals(other.tanggalPertemuanUTS))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ListKehadiranDosen [id=" + id + ", tanggalPertemuan1="
				+ tanggalPertemuan1 + ", statusPertemuan1_dsn="
				+ statusPertemuan1_dsn + ", tanggalPertemuan2="
				+ tanggalPertemuan2 + ", statusPertemuan2_dsn="
				+ statusPertemuan2_dsn + ", tanggalPertemuan3="
				+ tanggalPertemuan3 + ", statusPertemuan3_dsn="
				+ statusPertemuan3_dsn + ", tanggalPertemuan4="
				+ tanggalPertemuan4 + ", statusPertemuan4_dsn="
				+ statusPertemuan4_dsn + ", tanggalPertemuan5="
				+ tanggalPertemuan5 + ", statusPertemuan5_dsn="
				+ statusPertemuan5_dsn + ", tanggalPertemuan6="
				+ tanggalPertemuan6 + ", statusPertemuan6_dsn="
				+ statusPertemuan6_dsn + ", tanggalPertemuan7="
				+ tanggalPertemuan7 + ", statusPertemuan7_dsn="
				+ statusPertemuan7_dsn + ", tanggalPertemuanUTS="
				+ tanggalPertemuanUTS + ", statusPertemuanUTS_dsn="
				+ statusPertemuanUTS_dsn + ", tanggalPertemuan8="
				+ tanggalPertemuan8 + ", statusPertemuan8_dsn="
				+ statusPertemuan8_dsn + ", tanggalPertemuan9="
				+ tanggalPertemuan9 + ", statusPertemuan9_dsn="
				+ statusPertemuan9_dsn + ", tanggalPertemuan10="
				+ tanggalPertemuan10 + ", statusPertemuan10_dsn="
				+ statusPertemuan10_dsn + ", tanggalPertemuan11="
				+ tanggalPertemuan11 + ", statusPertemuan11_dsn="
				+ statusPertemuan11_dsn + ", tanggalPertemuan12="
				+ tanggalPertemuan12 + ", statusPertemuan12_dsn="
				+ statusPertemuan12_dsn + ", tanggalPertemuan13="
				+ tanggalPertemuan13 + ", statusPertemuan13_dsn="
				+ statusPertemuan13_dsn + ", tanggalPertemuan14="
				+ tanggalPertemuan14 + ", statusPertemuan14_dsn="
				+ statusPertemuan14_dsn + ", tanggalPertemuanUAS="
				+ tanggalPertemuanUAS + ", statusPertemuanUAS_dsn="
				+ statusPertemuanUAS_dsn + "]";
	}
}
