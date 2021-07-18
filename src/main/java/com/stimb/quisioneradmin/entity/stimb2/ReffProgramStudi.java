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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A ReffProgramStudi.
 */
@Entity
@Table(name = "REFF_PROGRAM_STUDI")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReffProgramStudi implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nama_program_studi")
    private String namaProgramStudi;
    
    @OneToOne
    private MasterDosen ketuaProdi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaProgramStudi() {
        return namaProgramStudi;
    }

    public void setNamaProgramStudi(String namaProgramStudi) {
        this.namaProgramStudi = namaProgramStudi;
    }

    public MasterDosen getKetuaProdi() {
		return ketuaProdi;
	}

	public void setKetuaProdi(MasterDosen ketuaProdi) {
		this.ketuaProdi = ketuaProdi;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReffProgramStudi reffProgramStudi = (ReffProgramStudi) o;

        if ( ! Objects.equals(id, reffProgramStudi.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "ReffProgramStudi [id=" + id + ", namaProgramStudi="
				+ namaProgramStudi + ", ketuaProdi=" + ketuaProdi + "]";
	}
}
