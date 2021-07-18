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
 * A ListMatakuliah.
 */
@Entity
@Table(name = "LIST_MATAKULIAH")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ListMatakuliah implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "semester")
    private Integer semester;
    
    @Column(name = "mata_kuliah_wajib")
    private Boolean mataKuliahWajib;

    @ManyToOne
    private MasterKurikulum masterKurikulum;

    @ManyToOne
    private MasterMatakuliah masterMatakuliah;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Boolean getMataKuliahWajib() {
        return mataKuliahWajib;
    }

    public void setMataKuliahWajib(Boolean mataKuliahWajib) {
        this.mataKuliahWajib = mataKuliahWajib;
    }

    public MasterKurikulum getMasterKurikulum() {
        return masterKurikulum;
    }

    public void setMasterKurikulum(MasterKurikulum masterKurikulum) {
        this.masterKurikulum = masterKurikulum;
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

        ListMatakuliah listMatakuliah = (ListMatakuliah) o;

        if ( ! Objects.equals(id, listMatakuliah.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ListMatakuliah{" +
                "id=" + id +
                ", semester='" + semester + "'" +
                ", mataKuliahWajib='" + mataKuliahWajib + "'" +
                '}';
    }
}
