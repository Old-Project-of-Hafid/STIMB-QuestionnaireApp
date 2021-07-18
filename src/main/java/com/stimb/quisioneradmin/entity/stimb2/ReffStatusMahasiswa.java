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
 * A ReffStatusMahasiswa.
 */
@Entity
@Table(name = "REFF_STATUS_MAHASISWA")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReffStatusMahasiswa implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "status_masuk")
    private String statusMasuk;

    @OneToOne
    private StatusMahasiswa statusMahasiswa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusMasuk() {
        return statusMasuk;
    }

    public void setStatusMasuk(String statusMasuk) {
        this.statusMasuk = statusMasuk;
    }

    public StatusMahasiswa getStatusMahasiswa() {
        return statusMahasiswa;
    }

    public void setStatusMahasiswa(StatusMahasiswa statusMahasiswa) {
        this.statusMahasiswa = statusMahasiswa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReffStatusMahasiswa reffStatusMahasiswa = (ReffStatusMahasiswa) o;

        if ( ! Objects.equals(id, reffStatusMahasiswa.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReffStatusMahasiswa{" +
                "id=" + id +
                ", statusMasuk='" + statusMasuk + "'" +
                '}';
    }
}
