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
import javax.persistence.Table;

/**
 * A MasterKurikulum.
 */
@Entity
@Table(name = "MASTER_KURIKULUM")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MasterKurikulum implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	
    @Column(name = "nama_kurikulum")
    private String namaKurikulum;
    
    @Column(name = "mulai_berlaku")
    private String mulaiBerlaku;
    
    @Column(name = "aturan_skslulus")
    private Integer aturanSKSLulus;
    
    @Column(name = "aturan_skswajib")
    private Integer aturanSKSWajib;
    
    @Column(name = "aturan_skspilihan")
    private Integer aturanSKSPilihan;
    
    @Column(name = "sks_mata_kuliah_wajib")
    private Integer sksMataKuliahWajib;
    
    @Column(name = "sks_mata_kuliah_pilihan")
    private Integer sksMataKuliahPilihan;

    @ManyToOne
    private ReffProgramStudi reffProgramStudi;

    @OneToMany(mappedBy = "masterKurikulum")
    //@JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ListMatakuliah> listMataKuliahs = new HashSet<>();

    @OneToMany(mappedBy = "masterKurikulum")
    //@JsonIgnore
    //@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<ListSemesterPerkuliahan> listSemesterPerkuliahans = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaKurikulum() {
        return namaKurikulum;
    }

    public void setNamaKurikulum(String namaKurikulum) {
        this.namaKurikulum = namaKurikulum;
    }

    public String getMulaiBerlaku() {
        return mulaiBerlaku;
    }

    public void setMulaiBerlaku(String mulaiBerlaku) {
        this.mulaiBerlaku = mulaiBerlaku;
    }

    public Integer getAturanSKSLulus() {
        return aturanSKSLulus;
    }

    public void setAturanSKSLulus(Integer aturanSKSLulus) {
        this.aturanSKSLulus = aturanSKSLulus;
    }

    public Integer getAturanSKSWajib() {
        return aturanSKSWajib;
    }

    public void setAturanSKSWajib(Integer aturanSKSWajib) {
        this.aturanSKSWajib = aturanSKSWajib;
    }

    public Integer getAturanSKSPilihan() {
        return aturanSKSPilihan;
    }

    public void setAturanSKSPilihan(Integer aturanSKSPilihan) {
        this.aturanSKSPilihan = aturanSKSPilihan;
    }

    public Integer getSksMataKuliahWajib() {
        return sksMataKuliahWajib;
    }

    public void setSksMataKuliahWajib(Integer sksMataKuliahWajib) {
        this.sksMataKuliahWajib = sksMataKuliahWajib;
    }

    public Integer getSksMataKuliahPilihan() {
        return sksMataKuliahPilihan;
    }

    public void setSksMataKuliahPilihan(Integer sksMataKuliahPilihan) {
        this.sksMataKuliahPilihan = sksMataKuliahPilihan;
    }

    public ReffProgramStudi getReffProgramStudi() {
        return reffProgramStudi;
    }

    public void setReffProgramStudi(ReffProgramStudi reffProgramStudi) {
        this.reffProgramStudi = reffProgramStudi;
    }

    public Set<ListMatakuliah> getListMataKuliahs() {
        return listMataKuliahs;
    }

    public void setListMataKuliahs(Set<ListMatakuliah> listMatakuliahs) {
        this.listMataKuliahs = listMatakuliahs;
    }

    public Set<ListSemesterPerkuliahan> getListSemesterPerkuliahans() {
        return listSemesterPerkuliahans;
    }

    public void setListSemesterPerkuliahans(Set<ListSemesterPerkuliahan> listSemesterPerkuliahans) {
        this.listSemesterPerkuliahans = listSemesterPerkuliahans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MasterKurikulum masterKurikulum = (MasterKurikulum) o;

        if ( ! Objects.equals(id, masterKurikulum.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MasterKurikulum{" +
                "id=" + id +
                ", namaKurikulum='" + namaKurikulum + "'" +
                ", mulaiBerlaku='" + mulaiBerlaku + "'" +
                ", aturanSKSLulus='" + aturanSKSLulus + "'" +
                ", aturanSKSWajib='" + aturanSKSWajib + "'" +
                ", aturanSKSPilihan='" + aturanSKSPilihan + "'" +
                ", sksMataKuliahWajib='" + sksMataKuliahWajib + "'" +
                ", sksMataKuliahPilihan='" + sksMataKuliahPilihan + "'" +
                '}';
    }
}
