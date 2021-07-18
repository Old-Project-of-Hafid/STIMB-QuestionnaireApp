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
 * A DosenPendidikan.
 */
@Entity
@Table(name = "DOSEN_PENDIDIKAN")
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DosenPendidikan implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "perguruan_tinggi_asal_s1")
    private String perguruanTinggiAsalS1;
    
    @Column(name = "gelar_akademik_s1")
    private String gelarAkademikS1;
    
    @Column(name = "jurusan_s1")
    private String jurusanS1;
    
    @Column(name = "tahun_lulus_s1")
    private Integer tahunLulusS1;
    
    @Column(name = "kota_s1")
    private String kotaS1;
    
    @Column(name = "perguruan_tinggi_asal_s2")
    private String perguruanTinggiAsalS2;
    
    @Column(name = "gelar_akademik_s2")
    private String gelarAkademikS2;
    
    @Column(name = "jurusan_s2")
    private String jurusanS2;
    
    @Column(name = "tahun_lulus_s2")
    private Integer tahunLulusS2;
    
    @Column(name = "kota_s2")
    private String kotaS2;
    
    @Column(name = "perguruan_tinggi_asal_s3")
    private String perguruanTinggiAsalS3;
    
    @Column(name = "gelar_akademik_s3")
    private String gelarAkademikS3;
    
    @Column(name = "jurusan_s3")
    private String jurusanS3;
    
    @Column(name = "tahun_lulus_s3")
    private Integer tahunLulusS3;
    
    @Column(name = "kota_s3")
    private String kotaS3;

    @Column(name = "ijazah_s1")
    private String ijazahS1;
    
    @Column(name = "ijazah_s2")
    private String ijazahS2;
    
    @Column(name = "ijazah_s3")
    private String ijazahS3;
    
    @Column(name = "transkrip_s1")
    private String transkripS1;
    
    @Column(name = "transkrip_s2")
    private String transkripS2;
    
    @Column(name = "transkrip_s3")
    private String transkripS3;
    
    @OneToOne
    private MasterDosen listDosenWali;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPerguruanTinggiAsalS1() {
        return perguruanTinggiAsalS1;
    }

    public void setPerguruanTinggiAsalS1(String perguruanTinggiAsalS1) {
        this.perguruanTinggiAsalS1 = perguruanTinggiAsalS1;
    }

    public String getGelarAkademikS1() {
        return gelarAkademikS1;
    }

    public void setGelarAkademikS1(String gelarAkademikS1) {
        this.gelarAkademikS1 = gelarAkademikS1;
    }

    public String getJurusanS1() {
        return jurusanS1;
    }

    public void setJurusanS1(String jurusanS1) {
        this.jurusanS1 = jurusanS1;
    }

    public Integer getTahunLulusS1() {
        return tahunLulusS1;
    }

    public void setTahunLulusS1(Integer tahunLulusS1) {
        this.tahunLulusS1 = tahunLulusS1;
    }

    public String getKotaS1() {
        return kotaS1;
    }

    public void setKotaS1(String kotaS1) {
        this.kotaS1 = kotaS1;
    }

    public String getPerguruanTinggiAsalS2() {
        return perguruanTinggiAsalS2;
    }

    public void setPerguruanTinggiAsalS2(String perguruanTinggiAsalS2) {
        this.perguruanTinggiAsalS2 = perguruanTinggiAsalS2;
    }

    public String getGelarAkademikS2() {
        return gelarAkademikS2;
    }

    public void setGelarAkademikS2(String gelarAkademikS2) {
        this.gelarAkademikS2 = gelarAkademikS2;
    }

    public String getJurusanS2() {
        return jurusanS2;
    }

    public void setJurusanS2(String jurusanS2) {
        this.jurusanS2 = jurusanS2;
    }

    public Integer getTahunLulusS2() {
        return tahunLulusS2;
    }

    public void setTahunLulusS2(Integer tahunLulusS2) {
        this.tahunLulusS2 = tahunLulusS2;
    }

    public String getKotaS2() {
        return kotaS2;
    }

    public void setKotaS2(String kotaS2) {
        this.kotaS2 = kotaS2;
    }

    public String getPerguruanTinggiAsalS3() {
        return perguruanTinggiAsalS3;
    }

    public void setPerguruanTinggiAsalS3(String perguruanTinggiAsalS3) {
        this.perguruanTinggiAsalS3 = perguruanTinggiAsalS3;
    }

    public String getGelarAkademikS3() {
        return gelarAkademikS3;
    }

    public void setGelarAkademikS3(String gelarAkademikS3) {
        this.gelarAkademikS3 = gelarAkademikS3;
    }

    public String getJurusanS3() {
        return jurusanS3;
    }

    public void setJurusanS3(String jurusanS3) {
        this.jurusanS3 = jurusanS3;
    }

    public Integer getTahunLulusS3() {
        return tahunLulusS3;
    }

    public void setTahunLulusS3(Integer tahunLulusS3) {
        this.tahunLulusS3 = tahunLulusS3;
    }

    public String getKotaS3() {
        return kotaS3;
    }

    public void setKotaS3(String kotaS3) {
        this.kotaS3 = kotaS3;
    }

    public MasterDosen getListDosenWali() {
        return listDosenWali;
    }

    public void setListDosenWali(MasterDosen masterDosen) {
        this.listDosenWali = masterDosen;
    }
    
    public String getIjazahS1() {
		return ijazahS1;
	}

	public void setIjazahS1(String ijazahS1) {
		this.ijazahS1 = ijazahS1;
	}

	public String getIjazahS2() {
		return ijazahS2;
	}

	public void setIjazahS2(String ijazahS2) {
		this.ijazahS2 = ijazahS2;
	}

	public String getIjazahS3() {
		return ijazahS3;
	}

	public void setIjazahS3(String ijazahS3) {
		this.ijazahS3 = ijazahS3;
	}

	public String getTranskripS1() {
		return transkripS1;
	}

	public void setTranskripS1(String transkripS1) {
		this.transkripS1 = transkripS1;
	}

	public String getTranskripS2() {
		return transkripS2;
	}

	public void setTranskripS2(String transkripS2) {
		this.transkripS2 = transkripS2;
	}

	public String getTranskripS3() {
		return transkripS3;
	}

	public void setTranskripS3(String transkripS3) {
		this.transkripS3 = transkripS3;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DosenPendidikan dosenPendidikan = (DosenPendidikan) o;

        if ( ! Objects.equals(id, dosenPendidikan.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

	@Override
	public String toString() {
		return "DosenPendidikan [id=" + id + ", perguruanTinggiAsalS1="
				+ perguruanTinggiAsalS1 + ", gelarAkademikS1="
				+ gelarAkademikS1 + ", jurusanS1=" + jurusanS1
				+ ", tahunLulusS1=" + tahunLulusS1 + ", kotaS1=" + kotaS1
				+ ", perguruanTinggiAsalS2=" + perguruanTinggiAsalS2
				+ ", gelarAkademikS2=" + gelarAkademikS2 + ", jurusanS2="
				+ jurusanS2 + ", tahunLulusS2=" + tahunLulusS2 + ", kotaS2="
				+ kotaS2 + ", perguruanTinggiAsalS3=" + perguruanTinggiAsalS3
				+ ", gelarAkademikS3=" + gelarAkademikS3 + ", jurusanS3="
				+ jurusanS3 + ", tahunLulusS3=" + tahunLulusS3 + ", kotaS3="
				+ kotaS3 + ", ijazahS1=" + ijazahS1 + ", ijazahS2=" + ijazahS2
				+ ", ijazahS3=" + ijazahS3 + ", transkripS1=" + transkripS1
				+ ", transkripS2=" + transkripS2 + ", transkripS3="
				+ transkripS3 + ", listDosenWali=" + listDosenWali + "]";
	}
}
