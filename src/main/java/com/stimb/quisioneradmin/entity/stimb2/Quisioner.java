package com.stimb.quisioneradmin.entity.stimb2;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Yusfia Hafid A on 1/2/2016.
 */
@Entity
@Table(name = "QUISIONER")
public class Quisioner implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pertanyaan;
    private String keterangan;
    private boolean aktifasi;

    @OneToMany(mappedBy = "quisioner")
    private List<QuisionerLog> quisionerLogs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public boolean isAktifasi() {
        return aktifasi;
    }

    public void setAktifasi(boolean aktifasi) {
        this.aktifasi = aktifasi;
    }

    public List<QuisionerLog> getQuisionerLogs() {
        return quisionerLogs;
    }

    public void setQuisionerLogs(List<QuisionerLog> quisionerLogs) {
        this.quisionerLogs = quisionerLogs;
    }
}
