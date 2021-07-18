package com.stimb.quisioneradmin.entity.kurikulum;



import com.stimb.quisioneradmin.entity.stimb2.MasterMatakuliah;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A PrequisiteMatakuliah.
 */
@Entity
@Table(name = "PREQUISITEMATAKULIAH")
public class PrequisiteMatakuliah implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   
    @Column(name = "nama_matakuliah_prequisite")
    private String namaMatakuliahPrequisite;

    @ManyToOne
    private MasterMatakuliah masterMatakuliah;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaMatakuliahPrequisite() {
        return namaMatakuliahPrequisite;
    }

    public void setNamaMatakuliahPrequisite(String namaMatakuliahPrequisite) {
        this.namaMatakuliahPrequisite = namaMatakuliahPrequisite;
    }

    public MasterMatakuliah getMasterMatakuliah() {
        return masterMatakuliah;
    }

    public void setMasterMatakuliah(MasterMatakuliah masterMatakuliah) {
        this.masterMatakuliah = masterMatakuliah;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PrequisiteMatakuliah prequisiteMatakuliah = (PrequisiteMatakuliah) o;

        if ( ! Objects.equals(id, prequisiteMatakuliah.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PrequisiteMatakuliah{" +
                "id=" + id +
                ", namaMatakuliahPrequisite='" + namaMatakuliahPrequisite + "'" +
                '}';
    }
}
