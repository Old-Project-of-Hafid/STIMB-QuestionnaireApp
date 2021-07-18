package com.stimb.quisioneradmin.entity.stimb2;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * A ListPrequisiteMatakuliah.
 */
@Entity
@Table(name = "LIST_PREQUISITE_MATAKULIAH")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ListPrequisiteMatakuliah implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "prequisite_matakuliah")
    private String prequisiteMatakuliah;

    //@Column(name = "syarat_matakuliah")
    @ManyToOne
    private MasterMatakuliah masterMatakuliahPrequisite;
    
    @ManyToOne
    private MasterMatakuliah masterMatakuliah;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrequisiteMatakuliah() {
        return prequisiteMatakuliah;
    }

    public void setPrequisiteMatakuliah(String prequisiteMatakuliah) {
        this.prequisiteMatakuliah = prequisiteMatakuliah;
    }

    public MasterMatakuliah getMasterMatakuliah() {
        return masterMatakuliah;
    }

    public void setMasterMatakuliah(MasterMatakuliah masterMatakuliah) {
        this.masterMatakuliah = masterMatakuliah;
    }
    
    public MasterMatakuliah getMasterMatakuliahPrequisite() {
		return masterMatakuliahPrequisite;
	}

	public void setMasterMatakuliahPrequisite(
			MasterMatakuliah masterMatakuliahPrequisite) {
		this.masterMatakuliahPrequisite = masterMatakuliahPrequisite;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ListPrequisiteMatakuliah listPrequisiteMatakuliah = (ListPrequisiteMatakuliah) o;

        if ( ! Objects.equals(id, listPrequisiteMatakuliah.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "ListPrequisiteMatakuliah [id=" + id + ", prequisiteMatakuliah="
				+ prequisiteMatakuliah + ", masterMatakuliahPrequisite="
				+ masterMatakuliahPrequisite + ", masterMatakuliah="
				+ masterMatakuliah + "]";
	}
}
