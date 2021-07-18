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
import javax.persistence.Table;


/**
 * A ReffMayor.
 */
@Entity
@Table(name = "REFF_INSTRUMENT_MAYOR")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReffInstrumentMayor implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nama_instrument_mayor")
    private String namaInstrumentMayor;

    @Column(name = "kode_instrument_mayor")
    private String kodeInstrumentMayor;
    
    @Column(name = "prodi_instrument_mayor")
    private String prodiInstrumentMayor;
    
    /*
    @OneToMany(mappedBy = "reffInstrumentMayor")
    @JsonIgnore
    private Set<ListInstrumentMayor> instrumentMayors = new HashSet<>();
    */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamaInstrumentMayor() {
		return namaInstrumentMayor;
	}

	public void setNamaInstrumentMayor(String namaInstrumentMayor) {
		this.namaInstrumentMayor = namaInstrumentMayor;
	}
	
	public String getKodeInstrumentMayor() {
		return kodeInstrumentMayor;
	}

	public void setKodeInstrumentMayor(String kodeInstrumentMayor) {
		this.kodeInstrumentMayor = kodeInstrumentMayor;
	}

	public String getProdiInstrumentMayor() {
		return prodiInstrumentMayor;
	}

	public void setProdiInstrumentMayor(String prodiInstrumentMayor) {
		this.prodiInstrumentMayor = prodiInstrumentMayor;
	}
	/*
	public Set<ListInstrumentMayor> getListMayors() {
		return instrumentMayors;
	}

	public void setListMayors(Set<ListInstrumentMayor> listInstrumentMayors) {
		this.instrumentMayors = listInstrumentMayors;
	}
	*/
	/*
	@Override
	public String toString() {
		return "ReffInstrumentMayor [id=" + id + ", namaInstrumentMayor="
				+ namaInstrumentMayor + ", instrumentMayors=" + instrumentMayors + "]";
	
	*/
	@Override
	public String toString() {
		return "ReffInstrumentMayor [id=" + id + ", namaInstrumentMayor="
				+ namaInstrumentMayor + ", kodeInstrumentMayor="
				+ kodeInstrumentMayor + ", prodiInstrumentMayor="
				+ prodiInstrumentMayor + ", instrumentMayors="
				+ null + "]";
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
		ReffInstrumentMayor other = (ReffInstrumentMayor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		/*
		if (instrumentMayors == null) {
			if (other.instrumentMayors != null)
				return false;
		} else if (!instrumentMayors.equals(other.instrumentMayors))
			return false;*/
		if (kodeInstrumentMayor == null) {
			if (other.kodeInstrumentMayor != null)
				return false;
		} else if (!kodeInstrumentMayor.equals(other.kodeInstrumentMayor))
			return false;
		if (namaInstrumentMayor == null) {
			if (other.namaInstrumentMayor != null)
				return false;
		} else if (!namaInstrumentMayor.equals(other.namaInstrumentMayor))
			return false;
		if (prodiInstrumentMayor == null) {
			if (other.prodiInstrumentMayor != null)
				return false;
		} else if (!prodiInstrumentMayor.equals(other.prodiInstrumentMayor))
			return false;
		return true;
	}
	
	
}
