package com.stimb.quisioneradmin.ReleaseClass;


import com.stimb.quisioneradmin.entity.stimb2.KartuRencanaStudi;

import java.io.Serializable;

/**
 * Created by Yusfia Hafid A on 12/30/2015.
 */
public class ReleaseListAktifitasPerkuliahan implements Serializable {
    private String kode_mata_kuliah;
    private String nama_matakuliah;
    private boolean presensi1;
    private boolean presensi2;
    private boolean presensi3;
    private boolean presensi4;
    private boolean presensi5;
    private boolean presensi6;
    private boolean presensi7;
    private boolean presensiUTS;
    private boolean presensi8;
    private boolean presensi9;
    private boolean presensi10;
    private boolean presensi11;
    private boolean presensi12;
    private boolean presensi13;
    private boolean presensi14;
    private boolean presensiUAS;
    private String presensi1_tgl;
    private String presensi2_tgl;
    private String presensi3_tgl;
    private String presensi4_tgl;
    private String presensi5_tgl;
    private String presensi6_tgl;
    private String presensi7_tgl;
    private String presensiUTS_tgl;
    private String presensi8_tgl;
    private String presensi9_tgl;
    private String presensi10_tgl;
    private String presensi11_tgl;
    private String presensi12_tgl;
    private String presensi13_tgl;
    private String presensi14_tgl;
    private String presensiUAS_tgl;
    private int totalKehadiran = 0;

    public ReleaseListAktifitasPerkuliahan(KartuRencanaStudi krs) {
        kode_mata_kuliah = krs.getKelasPerkuliahan().getMasterMatakuliah().getKodeMatakuliah();
        nama_matakuliah = krs.getKelasPerkuliahan().getMasterMatakuliah().getNamaMatakuliah();
        presensi1 = krs.getListAktifitasPerkuliahan().isStatusPertemuan1_mhs();
        presensi2 = krs.getListAktifitasPerkuliahan().isStatusPertemuan2_mhs();
        presensi3 = krs.getListAktifitasPerkuliahan().isStatusPertemuan3_mhs();
        presensi4 = krs.getListAktifitasPerkuliahan().isStatusPertemuan4_mhs();
        presensi5 = krs.getListAktifitasPerkuliahan().isStatusPertemuan5_mhs();
        presensi6 = krs.getListAktifitasPerkuliahan().isStatusPertemuan6_mhs();
        presensi7 = krs.getListAktifitasPerkuliahan().isStatusPertemuan7_mhs();
        presensiUTS = krs.getListAktifitasPerkuliahan().isStatusPertemuanUTS_mhs();
        presensi8 = krs.getListAktifitasPerkuliahan().isStatusPertemuan8_mhs();
        presensi9 = krs.getListAktifitasPerkuliahan().isStatusPertemuan9_mhs();
        presensi10 = krs.getListAktifitasPerkuliahan().isStatusPertemuan10_mhs();
        presensi11 = krs.getListAktifitasPerkuliahan().isStatusPertemuan11_mhs();
        presensi12 = krs.getListAktifitasPerkuliahan().isStatusPertemuan12_mhs();
        presensi13 = krs.getListAktifitasPerkuliahan().isStatusPertemuan13_mhs();
        presensi14 = krs.getListAktifitasPerkuliahan().isStatusPertemuan14_mhs();
        presensiUAS = krs.getListAktifitasPerkuliahan().isStatusPertemuanUAS_mhs();
        presensi1_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan1();
        presensi2_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan2();
        presensi3_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan3();
        presensi4_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan4();
        presensi5_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan5();
        presensi6_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan6();
        presensi7_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan7();
        presensiUTS_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuanUTS();
        presensi8_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan8();
        presensi9_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan9();
        presensi10_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan10();
        presensi11_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan11();
        presensi12_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan12();
        presensi13_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan13();
        presensi14_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuan14();
        presensiUAS_tgl = krs.getListAktifitasPerkuliahan().getTanggalPertemuanUAS();
        if (presensi1) totalKehadiran = totalKehadiran + 1;
        if (presensi2) totalKehadiran = totalKehadiran + 1;
        if (presensi3) totalKehadiran = totalKehadiran + 1;
        if (presensi4) totalKehadiran = totalKehadiran + 1;
        if (presensi5) totalKehadiran = totalKehadiran + 1;
        if (presensi6) totalKehadiran = totalKehadiran + 1;
        if (presensi7) totalKehadiran = totalKehadiran + 1;
        if (presensi8) totalKehadiran = totalKehadiran + 1;
        if (presensi9) totalKehadiran = totalKehadiran + 1;
        if (presensi10) totalKehadiran = totalKehadiran + 1;
        if (presensi11) totalKehadiran = totalKehadiran + 1;
        if (presensi12) totalKehadiran = totalKehadiran + 1;
        if (presensi13) totalKehadiran = totalKehadiran + 1;
        if (presensi14) totalKehadiran = totalKehadiran + 1;
    }

    public String getKode_mata_kuliah() {
        return kode_mata_kuliah;
    }

    public void setKode_mata_kuliah(String kode_mata_kuliah) {
        this.kode_mata_kuliah = kode_mata_kuliah;
    }

    public String getNama_matakuliah() {
        return nama_matakuliah;
    }

    public void setNama_matakuliah(String nama_matakuliah) {
        this.nama_matakuliah = nama_matakuliah;
    }

    public boolean isPresensi1() {
        return presensi1;
    }

    public void setPresensi1(boolean presensi1) {
        this.presensi1 = presensi1;
    }

    public boolean isPresensi2() {
        return presensi2;
    }

    public void setPresensi2(boolean presensi2) {
        this.presensi2 = presensi2;
    }

    public boolean isPresensi3() {
        return presensi3;
    }

    public void setPresensi3(boolean presensi3) {
        this.presensi3 = presensi3;
    }

    public boolean isPresensi4() {
        return presensi4;
    }

    public void setPresensi4(boolean presensi4) {
        this.presensi4 = presensi4;
    }

    public boolean isPresensi5() {
        return presensi5;
    }

    public void setPresensi5(boolean presensi5) {
        this.presensi5 = presensi5;
    }

    public boolean isPresensi6() {
        return presensi6;
    }

    public void setPresensi6(boolean presensi6) {
        this.presensi6 = presensi6;
    }

    public boolean isPresensi7() {
        return presensi7;
    }

    public void setPresensi7(boolean presensi7) {
        this.presensi7 = presensi7;
    }

    public boolean isPresensiUTS() {
        return presensiUTS;
    }

    public void setPresensiUTS(boolean presensiUTS) {
        this.presensiUTS = presensiUTS;
    }

    public boolean isPresensi8() {
        return presensi8;
    }

    public void setPresensi8(boolean presensi8) {
        this.presensi8 = presensi8;
    }

    public boolean isPresensi9() {
        return presensi9;
    }

    public void setPresensi9(boolean presensi9) {
        this.presensi9 = presensi9;
    }

    public boolean isPresensi10() {
        return presensi10;
    }

    public void setPresensi10(boolean presensi10) {
        this.presensi10 = presensi10;
    }

    public boolean isPresensi11() {
        return presensi11;
    }

    public void setPresensi11(boolean presensi11) {
        this.presensi11 = presensi11;
    }

    public boolean isPresensi12() {
        return presensi12;
    }

    public void setPresensi12(boolean presensi12) {
        this.presensi12 = presensi12;
    }

    public boolean isPresensi13() {
        return presensi13;
    }

    public void setPresensi13(boolean presensi13) {
        this.presensi13 = presensi13;
    }

    public boolean isPresensi14() {
        return presensi14;
    }

    public void setPresensi14(boolean presensi14) {
        this.presensi14 = presensi14;
    }

    public boolean isPresensiUAS() {
        return presensiUAS;
    }

    public void setPresensiUAS(boolean presensiUAS) {
        this.presensiUAS = presensiUAS;
    }

    public String getPresensi1_tgl() {
        return presensi1_tgl;
    }

    public void setPresensi1_tgl(String presensi1_tgl) {
        this.presensi1_tgl = presensi1_tgl;
    }

    public String getPresensi2_tgl() {
        return presensi2_tgl;
    }

    public void setPresensi2_tgl(String presensi2_tgl) {
        this.presensi2_tgl = presensi2_tgl;
    }

    public String getPresensi3_tgl() {
        return presensi3_tgl;
    }

    public void setPresensi3_tgl(String presensi3_tgl) {
        this.presensi3_tgl = presensi3_tgl;
    }

    public String getPresensi4_tgl() {
        return presensi4_tgl;
    }

    public void setPresensi4_tgl(String presensi4_tgl) {
        this.presensi4_tgl = presensi4_tgl;
    }

    public String getPresensi5_tgl() {
        return presensi5_tgl;
    }

    public void setPresensi5_tgl(String presensi5_tgl) {
        this.presensi5_tgl = presensi5_tgl;
    }

    public String getPresensi6_tgl() {
        return presensi6_tgl;
    }

    public void setPresensi6_tgl(String presensi6_tgl) {
        this.presensi6_tgl = presensi6_tgl;
    }

    public String getPresensi7_tgl() {
        return presensi7_tgl;
    }

    public void setPresensi7_tgl(String presensi7_tgl) {
        this.presensi7_tgl = presensi7_tgl;
    }

    public String getPresensiUTS_tgl() {
        return presensiUTS_tgl;
    }

    public void setPresensiUTS_tgl(String presensiUTS_tgl) {
        this.presensiUTS_tgl = presensiUTS_tgl;
    }

    public String getPresensi8_tgl() {
        return presensi8_tgl;
    }

    public void setPresensi8_tgl(String presensi8_tgl) {
        this.presensi8_tgl = presensi8_tgl;
    }

    public String getPresensi9_tgl() {
        return presensi9_tgl;
    }

    public void setPresensi9_tgl(String presensi9_tgl) {
        this.presensi9_tgl = presensi9_tgl;
    }

    public String getPresensi10_tgl() {
        return presensi10_tgl;
    }

    public void setPresensi10_tgl(String presensi10_tgl) {
        this.presensi10_tgl = presensi10_tgl;
    }

    public String getPresensi11_tgl() {
        return presensi11_tgl;
    }

    public void setPresensi11_tgl(String presensi11_tgl) {
        this.presensi11_tgl = presensi11_tgl;
    }

    public String getPresensi12_tgl() {
        return presensi12_tgl;
    }

    public void setPresensi12_tgl(String presensi12_tgl) {
        this.presensi12_tgl = presensi12_tgl;
    }

    public String getPresensi13_tgl() {
        return presensi13_tgl;
    }

    public void setPresensi13_tgl(String presensi13_tgl) {
        this.presensi13_tgl = presensi13_tgl;
    }

    public String getPresensi14_tgl() {
        return presensi14_tgl;
    }

    public void setPresensi14_tgl(String presensi14_tgl) {
        this.presensi14_tgl = presensi14_tgl;
    }

    public String getPresensiUAS_tgl() {
        return presensiUAS_tgl;
    }

    public void setPresensiUAS_tgl(String presensiUAS_tgl) {
        this.presensiUAS_tgl = presensiUAS_tgl;
    }

    public int getTotalKehadiran() {
        return totalKehadiran;
    }

    public void setTotalKehadiran(int totalKehadiran) {
        this.totalKehadiran = totalKehadiran;
    }

    public String hadirConverter(boolean ishadir){
        if (ishadir){
            return "Hadir";
        }else{
            return "Tidak Hadir";
        }
    }
}
