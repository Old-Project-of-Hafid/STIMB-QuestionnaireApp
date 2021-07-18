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
 * A ListMayor.
 */
@Entity
@Table(name = "LIST_INSTRUMENT_MAYOR")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ListInstrumentMayor implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private MasterMatakuliah masterMatakuliah;

    @ManyToOne
    private ReffInstrumentMayor reffInstrumentMayor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MasterMatakuliah getMasterMatakuliah() {
        return masterMatakuliah;
    }

    public void setMasterMatakuliah(MasterMatakuliah masterMatakuliah) {
        this.masterMatakuliah = masterMatakuliah;
    }

    public ReffInstrumentMayor getReffInstrumentMayor() {
        return reffInstrumentMayor;
    }

    public void setReffInstrumentMayor(ReffInstrumentMayor reffInstrumentMayor) {
        this.reffInstrumentMayor = reffInstrumentMayor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ListInstrumentMayor listInstrumentMayor = (ListInstrumentMayor) o;

        if ( ! Objects.equals(id, listInstrumentMayor.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ListInstrumentMayor{" +
                "id=" + id +
                '}';
    }
}
