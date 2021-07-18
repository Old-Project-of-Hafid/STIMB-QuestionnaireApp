package com.stimb.quisioneradmin.ReleaseClass;


import com.stimb.quisioneradmin.entity.stimb2.ListKalenderAkademik;
import com.stimb.quisioneradmin.entity.stimb2.ReffTahunAjaran;

import java.io.Serializable;

/**
 * Created by Yusfia Hafid A on 12/30/2015.
 */
public class ReleaseKalenderAkademik implements Serializable {
    private String tahunajar;
    private String kegiatan;
    private String tanggal;
    private String semester;

    public ReleaseKalenderAkademik(ReffTahunAjaran reffTahunAjaran){
        tahunajar = reffTahunAjaran.getNamaTahunAjaran();
        kegiatan = reffTahunAjaran.getKalenderAkademik().getKegiatan();
        tanggal = reffTahunAjaran.getKalenderAkademik().getTanggal();
        semester = reffTahunAjaran.getPeriode();
    }

    public ReleaseKalenderAkademik(ListKalenderAkademik listKalenderAkademik){
        tahunajar = listKalenderAkademik.getReffTahunAjaran().getNamaTahunAjaran();
        kegiatan = listKalenderAkademik.getKegiatan();
        tanggal = listKalenderAkademik.getTanggal();
        semester = listKalenderAkademik.getReffTahunAjaran().getPeriode();
    }

    public ReleaseKalenderAkademik(String kegiatan, String tanggal, String semester) {
        this.kegiatan = kegiatan;
        this.tanggal = tanggal;
        this.semester = semester;
    }

    public ReleaseKalenderAkademik() {
    }

    public String getTahunajar() {
        return tahunajar;
    }

    public void setTahunajar(String tahunajar) {
        this.tahunajar = tahunajar;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
