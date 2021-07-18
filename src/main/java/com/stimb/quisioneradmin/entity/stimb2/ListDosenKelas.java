package com.stimb.quisioneradmin.entity.stimb2;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * A ListDosenKelas.
 */
@Entity
@Table(name = "LIST_DOSENKELAS")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ListDosenKelas implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private MasterDosen masterDosen;

    @ManyToOne
    private KelasPerkuliahan kelasPerkuliahan;
    
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MasterDosen getMasterDosen() {
		return masterDosen;
	}

	public void setMasterDosen(MasterDosen masterDosen) {
		this.masterDosen = masterDosen;
	}

	public KelasPerkuliahan getKelasPerkuliahan() {
		return kelasPerkuliahan;
	}

	public void setKelasPerkuliahan(KelasPerkuliahan kelasPerkuliahan) {
		this.kelasPerkuliahan = kelasPerkuliahan;
	}


	@Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListDosenKelas other = (ListDosenKelas) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (kelasPerkuliahan == null) {
			if (other.kelasPerkuliahan != null)
				return false;
		} else if (!kelasPerkuliahan.equals(other.kelasPerkuliahan))
			return false;
		if (masterDosen == null) {
			if (other.masterDosen != null)
				return false;
		} else if (!masterDosen.equals(other.masterDosen))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ListDosenKelas [id=" + id + ", masterDosen=" + masterDosen
				+ ", kelasPerkuliahan=" + kelasPerkuliahan + "]";
	}
}
