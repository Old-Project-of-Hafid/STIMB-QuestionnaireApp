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
 * A StatusMahasiswa.
 */
@Entity
@Table(name = "STATUS_MAHASISWA")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class StatusMahasiswa implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "npm")
    private String npm;
    
    @Column(name = "nama_mahasiswa")
    private String namaMahasiswa;
    
    @Column(name = "status_masuk")
    private String statusMasuk;
    
    @Column(name = "status_semester")
    private String statusSemester;
    
    @Column(name = "instrumen_mayor")
    private String instrumenMayor;
    
    @Column(name = "batas_studi")
    private Integer batasStudi;
    
    @Column(name = "penerima_kps")
    private String penerimaKPS;
    
    @Column(name = "string")
    private Float string;

    @OneToOne
    private MasterMahasiswa masterMahasiswa;

    @OneToOne(mappedBy = "statusMahasiswa")
    //@JsonIgnore
    private ReffStatusMahasiswa reffStatusMahasiswa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getStatusMasuk() {
        return statusMasuk;
    }

    public void setStatusMasuk(String statusMasuk) {
        this.statusMasuk = statusMasuk;
    }

    public String getStatusSemester() {
        return statusSemester;
    }

    public void setStatusSemester(String statusSemester) {
        this.statusSemester = statusSemester;
    }

    public String getInstrumenMayor() {
        return instrumenMayor;
    }

    public void setInstrumenMayor(String instrumenMayor) {
        this.instrumenMayor = instrumenMayor;
    }

    public Integer getBatasStudi() {
        return batasStudi;
    }

    public void setBatasStudi(Integer batasStudi) {
        this.batasStudi = batasStudi;
    }

    public String getPenerimaKPS() {
        return penerimaKPS;
    }

    public void setPenerimaKPS(String penerimaKPS) {
        this.penerimaKPS = penerimaKPS;
    }

    public Float getString() {
        return string;
    }

    public void setString(Float string) {
        this.string = string;
    }

    public MasterMahasiswa getMasterMahasiswa() {
        return masterMahasiswa;
    }

    public void setMasterMahasiswa(MasterMahasiswa masterMahasiswa) {
        this.masterMahasiswa = masterMahasiswa;
    }

    public ReffStatusMahasiswa getReffStatusMahasiswa() {
        return reffStatusMahasiswa;
    }

    public void setReffStatusMahasiswa(ReffStatusMahasiswa reffStatusMahasiswa) {
        this.reffStatusMahasiswa = reffStatusMahasiswa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StatusMahasiswa statusMahasiswa = (StatusMahasiswa) o;

        if ( ! Objects.equals(id, statusMahasiswa.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "StatusMahasiswa{" +
                "id=" + id +
                ", npm='" + npm + "'" +
                ", namaMahasiswa='" + namaMahasiswa + "'" +
                ", statusMasuk='" + statusMasuk + "'" +
                ", statusSemester='" + statusSemester + "'" +
                ", instrumenMayor='" + instrumenMayor + "'" +
                ", batasStudi='" + batasStudi + "'" +
                ", penerimaKPS='" + penerimaKPS + "'" +
                ", string='" + string + "'" +
                '}';
    }
}
