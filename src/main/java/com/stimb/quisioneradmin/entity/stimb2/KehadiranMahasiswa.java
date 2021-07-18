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
 * A KehadiranMahasiswa.
 */
@Entity
@Table(name = "KEHADIRAN_MAHASISWA")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class KehadiranMahasiswa implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "status_kehadiran")
    private Boolean statusKehadiran;
    
    @Column(name = "jumlah_kehadiran_mahasiswa")
    private Integer jumlahKehadiranMahasiswa;

    @ManyToOne
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

    public Integer getJumlahKehadiranMahasiswa() {
        return jumlahKehadiranMahasiswa;
    }

    public void setJumlahKehadiranMahasiswa(Integer jumlahKehadiranMahasiswa) {
        this.jumlahKehadiranMahasiswa = jumlahKehadiranMahasiswa;
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

        KehadiranMahasiswa kehadiranMahasiswa = (KehadiranMahasiswa) o;

        if ( ! Objects.equals(id, kehadiranMahasiswa.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "KehadiranMahasiswa{" +
                "id=" + id +
                ", statusKehadiran='" + statusKehadiran + "'" +
                ", jumlahKehadiranMahasiswa='" + jumlahKehadiranMahasiswa + "'" +
                '}';
    }
}
