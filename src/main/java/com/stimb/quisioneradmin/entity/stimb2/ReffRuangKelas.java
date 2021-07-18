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
 * A ReffRuangKelas.
 */
@Entity
@Table(name = "REFF_RUANG_KELAS")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReffRuangKelas implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "nama_ruang")
    private String namaRuang;

    @OneToOne
    private ListJadwalPerkuliahan listJadwalPerkuliahan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaRuang() {
        return namaRuang;
    }

    public void setNamaRuang(String namaRuang) {
        this.namaRuang = namaRuang;
    }

    public ListJadwalPerkuliahan getListJadwalPerkuliahan() {
        return listJadwalPerkuliahan;
    }

    public void setListJadwalPerkuliahan(ListJadwalPerkuliahan listJadwalPerkuliahan) {
        this.listJadwalPerkuliahan = listJadwalPerkuliahan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReffRuangKelas reffRuangKelas = (ReffRuangKelas) o;

        if ( ! Objects.equals(id, reffRuangKelas.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReffRuangKelas{" +
                "id=" + id +
                ", namaRuang='" + namaRuang + "'" +
                '}';
    }
}
