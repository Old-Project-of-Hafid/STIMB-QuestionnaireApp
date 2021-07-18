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
 * A KartuHasilStudi.
 */
@Entity
@Table(name = "KARTU_HASIL_STUDI")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class KartuHasilStudi implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "semester")
    private String semester;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "ips")
    private Float ips;
    
    @Column(name = "ipk")
    private Float ipk;
    
    @Column(name = "sks_semester")
    private Integer sksSemester;
    
    @Column(name = "sks_total")
    private Integer sksTotal;
    
    @Column(name = "kumulatif_nilai")
    private String kumulatifNilai;

    @ManyToOne
    private NilaiMahasiswa nilaiMahasiswa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getIps() {
        return ips;
    }

    public void setIps(Float ips) {
        this.ips = ips;
    }

    public Float getIpk() {
        return ipk;
    }

    public void setIpk(Float ipk) {
        this.ipk = ipk;
    }

    public Integer getSksSemester() {
        return sksSemester;
    }

    public void setSksSemester(Integer sksSemester) {
        this.sksSemester = sksSemester;
    }

    public Integer getSksTotal() {
        return sksTotal;
    }

    public void setSksTotal(Integer sksTotal) {
        this.sksTotal = sksTotal;
    }

    public String getKumulatifNilai() {
        return kumulatifNilai;
    }

    public void setKumulatifNilai(String kumulatifNilai) {
        this.kumulatifNilai = kumulatifNilai;
    }

    public NilaiMahasiswa getNilaiMahasiswa() {
        return nilaiMahasiswa;
    }

    public void setNilaiMahasiswa(NilaiMahasiswa nilaiMahasiswa) {
        this.nilaiMahasiswa = nilaiMahasiswa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        KartuHasilStudi kartuHasilStudi = (KartuHasilStudi) o;

        if ( ! Objects.equals(id, kartuHasilStudi.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "KartuHasilStudi{" +
                "id=" + id +
                ", semester='" + semester + "'" +
                ", status='" + status + "'" +
                ", ips='" + ips + "'" +
                ", ipk='" + ipk + "'" +
                ", sksSemester='" + sksSemester + "'" +
                ", sksTotal='" + sksTotal + "'" +
                ", kumulatifNilai='" + kumulatifNilai + "'" +
                '}';
    }
}
