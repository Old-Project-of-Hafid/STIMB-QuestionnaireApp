package com.stimb.quisioneradmin.entity.kurikulum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/**
 * A ReffMayor.
 */
@Entity
@Table(name = "REFFMAYOR")
public class ReffMayor implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
        
    @Column(name = "nama_mayor")
    private String namaMayor;

    @OneToMany(mappedBy = "reffMayor")
    //@JsonIgnore
    private Set<ListMatakuliahMayor> listMatakuliahMayors = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaMayor() {
        return namaMayor;
    }

    public void setNamaMayor(String namaMayor) {
        this.namaMayor = namaMayor;
    }

    public Set<ListMatakuliahMayor> getListMatakuliahMayors() {
        return listMatakuliahMayors;
    }

    public void setListMatakuliahMayors(Set<ListMatakuliahMayor> listMatakuliahMayors) {
        this.listMatakuliahMayors = listMatakuliahMayors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReffMayor reffMayor = (ReffMayor) o;

        if ( ! Objects.equals(id, reffMayor.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReffMayor{" +
                "id=" + id +
                ", namaMayor='" + namaMayor + "'" +
                '}';
    }
}
