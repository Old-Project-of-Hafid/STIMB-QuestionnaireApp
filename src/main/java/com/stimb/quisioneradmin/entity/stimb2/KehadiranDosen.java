package com.stimb.quisioneradmin.entity.stimb2;

//import com.fasterxml.jackson.annotation.JsonIgnore;
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
 * A KehadiranDosen.
 */
@Entity
@Table(name = "KEHADIRAN_DOSEN")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class KehadiranDosen implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "status_kehadiran")
    private Boolean statusKehadiran;
    
    @Column(name = "jumlah_kehadiran_dosen")
    private Integer jumlahKehadiranDosen;

    @OneToOne(mappedBy = "kehadiranDosen")
    //@JsonIgnore
    private AktifitasPerkuliahan aktifitasPerkuliahan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getStatusKehadiran() {
        return statusKehadiran;
    }

    public void setStatusKehadiran(Boolean statusKehadiran) {
        this.statusKehadiran = statusKehadiran;
    }

    public Integer getJumlahKehadiranDosen() {
        return jumlahKehadiranDosen;
    }

    public void setJumlahKehadiranDosen(Integer jumlahKehadiranDosen) {
        this.jumlahKehadiranDosen = jumlahKehadiranDosen;
    }

    public AktifitasPerkuliahan getAktifitasPerkuliahan() {
        return aktifitasPerkuliahan;
    }

    public void setAktifitasPerkuliahan(AktifitasPerkuliahan aktifitasPerkuliahan) {
        this.aktifitasPerkuliahan = aktifitasPerkuliahan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        KehadiranDosen kehadiranDosen = (KehadiranDosen) o;

        if ( ! Objects.equals(id, kehadiranDosen.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "KehadiranDosen{" +
                "id=" + id +
                ", statusKehadiran='" + statusKehadiran + "'" +
                ", jumlahKehadiranDosen='" + jumlahKehadiranDosen + "'" +
                '}';
    }
}
