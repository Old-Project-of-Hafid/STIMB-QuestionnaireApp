package com.stimb.quisioneradmin.entity.stimb2;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A ListSemesterPerkuliahan.
 */
@Entity
@Table(name = "LIST_SEMESTER_PERKULIAHAN")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ListSemesterPerkuliahan implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "status_semester")
    private Boolean statusSemester = false;

    @ManyToOne
    private MasterKurikulum masterKurikulum;

    @OneToMany(mappedBy = "listSemesterPerkuliahan")
    //@JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<KelasPerkuliahan> kelasPerkuliahans = new HashSet<>();

    @OneToOne
    //@JsonIgnore
    private ReffJenisSemester reffJenisSemester;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getStatusSemester() {
        return statusSemester;
    }

    public void setStatusSemester(Boolean statusSemester) {
        this.statusSemester = statusSemester;
    }

    public MasterKurikulum getMasterKurikulum() {
        return masterKurikulum;
    }

    public void setMasterKurikulum(MasterKurikulum masterKurikulum) {
        this.masterKurikulum = masterKurikulum;
    }

    public Set<KelasPerkuliahan> getKelasPerkuliahans() {
        return kelasPerkuliahans;
    }

    public void setKelasPerkuliahans(Set<KelasPerkuliahan> kelasPerkuliahans) {
        this.kelasPerkuliahans = kelasPerkuliahans;
    }

    public ReffJenisSemester getReffJenisSemester() {
        return reffJenisSemester;
    }

    public void setReffJenisSemester(ReffJenisSemester reffJenisSemester) {
        this.reffJenisSemester = reffJenisSemester;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ListSemesterPerkuliahan listSemesterPerkuliahan = (ListSemesterPerkuliahan) o;

        if ( ! Objects.equals(id, listSemesterPerkuliahan.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ListSemesterPerkuliahan{" +
                "id=" + id +
                ", statusSemester='" + statusSemester + "'" +
                '}';
    }
}
