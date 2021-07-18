package com.stimb.quisioneradmin.entity.stimb2;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A ReffJenisSemester.
 */
@Entity
@Table(name = "REFF_JENIS_SEMESTER")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReffJenisSemester implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nama_semester")
    private String namaSemester;

    @OneToOne
    private ListSemesterPerkuliahan listSemesterPerkuliahan;

    @OneToOne
    private KalenderAkademik kalenderAkademik;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaSemester() {
        return namaSemester;
    }

    public void setNamaSemester(String namaSemester) {
        this.namaSemester = namaSemester;
    }

    public ListSemesterPerkuliahan getListSemesterPerkuliahan() {
        return listSemesterPerkuliahan;
    }

    public void setListSemesterPerkuliahan(ListSemesterPerkuliahan listSemesterPerkuliahan) {
        this.listSemesterPerkuliahan = listSemesterPerkuliahan;
    }

    public KalenderAkademik getKalenderAkademik() {
        return kalenderAkademik;
    }

    public void setKalenderAkademik(KalenderAkademik kalenderAkademik) {
        this.kalenderAkademik = kalenderAkademik;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReffJenisSemester reffJenisSemester = (ReffJenisSemester) o;

        if ( ! Objects.equals(id, reffJenisSemester.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReffJenisSemester{" +
                "id=" + id +
                ", namaSemester='" + namaSemester + "'" +
                '}';
    }
}
