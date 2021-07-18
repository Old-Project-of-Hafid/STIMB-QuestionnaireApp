package com.stimb.quisioneradmin.ReleaseClass;

import com.stimb.quisioneradmin.entity.stimb2.KartuRencanaStudi;
import org.apache.wicket.util.io.IClusterable;

import java.io.Serializable;

/**
 * Created by Yusfia Hafid A on 12/27/2015.
 */
public class ReleaseKhs implements IClusterable, Serializable {
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private Integer sksMataKuliah;
    //private Integer sksPraktekLapangan;
    //private Integer sksPraktikum;
    //private Integer sksSimulasi;
    //private Integer sksTatapMuka;
    private String nilai = "-";
    private String nilaiUTS = "-";
    private String nilaiUAS = "-";
    private String nilaiTugas = "-";
    private String nilaiIndeks = "-";
    private String nilaiAkhirAngka = "-";
    private String nama_instrumen_mayor;
    private String kode_instrumen_mayor;
    private String prodi_instrumen_mayor;
    private String instrumenMayor;

    public ReleaseKhs() {
    }

    ;

    public ReleaseKhs(KartuRencanaStudi kartuRencanaStudi) {
        kodeMataKuliah = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getKodeMatakuliah();
        namaMataKuliah = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getNamaMatakuliah();
        sksMataKuliah = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getSksMatakuliah();
        //sksPraktekLapangan = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getSksPraktekLapangan();
        //sksPraktikum = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getSksPraktikum();
        //sksSimulasi = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getSksSimulasi();
        //sksTatapMuka = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getSksTatapMuka();
        nilai = kartuRencanaStudi.getNilaiMahasiswa().getNilaiAkhirHuruf();
        if (kartuRencanaStudi.getNilaiMahasiswa().getNilaiUAS() != null)
            nilaiUTS = kartuRencanaStudi.getNilaiMahasiswa().getNilaiUTS().toString();
        if (kartuRencanaStudi.getNilaiMahasiswa().getNilaiUAS() != null)
            nilaiUAS = kartuRencanaStudi.getNilaiMahasiswa().getNilaiUAS().toString();
        if (kartuRencanaStudi.getNilaiMahasiswa().getNilaiTugas() != null)
            nilaiTugas = kartuRencanaStudi.getNilaiMahasiswa().getNilaiTugas().toString();
        if (kartuRencanaStudi.getNilaiMahasiswa().getNilaiIndeks() != null)
            nilaiIndeks = kartuRencanaStudi.getNilaiMahasiswa().getNilaiIndeks().toString();
        if (kartuRencanaStudi.getNilaiMahasiswa().getNilaiAkhirAngka() != null)
            nilaiAkhirAngka = kartuRencanaStudi.getNilaiMahasiswa().getNilaiAkhirAngka().toString();
        if (kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor()!=null){
            nama_instrumen_mayor = kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor().getNamaInstrumentMayor();
            kode_instrumen_mayor = kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor().getKodeInstrumentMayor();
            prodi_instrumen_mayor = kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor().getProdiInstrumentMayor();
            instrumenMayor = "("+getNama_instrumen_mayor()+" "+getKode_instrumen_mayor()+")";
        }else{
            nama_instrumen_mayor = "";
            kode_instrumen_mayor = "";
            prodi_instrumen_mayor = "";
            instrumenMayor = "";
        }
    }

    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public void setSksMataKuliah(Integer sksMataKuliah) {
        this.sksMataKuliah = sksMataKuliah;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public Integer getSksMataKuliah() {
        return sksMataKuliah;
    }

    public String getNilaiUTS() {
        return nilaiUTS;
    }

    public String getNilaiUAS() {
        return nilaiUAS;
    }

    public String getNilaiTugas() {
        return nilaiTugas;
    }

    public String getNilaiIndeks() {
        return nilaiIndeks;
    }

    public String getNilaiAkhirAngka() {
        return nilaiAkhirAngka;
    }

    public void setNilaiUTS(String nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public void setNilaiUAS(String nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public void setNilaiTugas(String nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public void setNilaiIndeks(String nilaiIndeks) {
        this.nilaiIndeks = nilaiIndeks;
    }

    public void setNilaiAkhirAngka(String nilaiAkhirAngka) {
        this.nilaiAkhirAngka = nilaiAkhirAngka;
    }

    public String getNama_instrumen_mayor() {
        return nama_instrumen_mayor;
    }

    public void setNama_instrumen_mayor(String nama_instrumen_mayor) {
        this.nama_instrumen_mayor = nama_instrumen_mayor;
    }

    public String getKode_instrumen_mayor() {
        return kode_instrumen_mayor;
    }

    public void setKode_instrumen_mayor(String kode_instrumen_mayor) {
        this.kode_instrumen_mayor = kode_instrumen_mayor;
    }

    public String getProdi_instrumen_mayor() {
        return prodi_instrumen_mayor;
    }

    public void setProdi_instrumen_mayor(String prodi_instrumen_mayor) {
        this.prodi_instrumen_mayor = prodi_instrumen_mayor;
    }

    public String getInstrumenMayor() {
        return instrumenMayor;
    }

    public void setInstrumenMayor(String instrumenMayor) {
        this.instrumenMayor = instrumenMayor;
    }

    /*
            public Integer getSksPraktekLapangan() {
                return sksPraktekLapangan;
            }

            public Integer getSksPraktikum() {
                return sksPraktikum;
            }

            public Integer getSksSimulasi() {
                return sksSimulasi;
            }

            public Integer getSksTatapMuka() {
                return sksTatapMuka;
            }
            */
    public String getNilai() {
        return nilai;
    }

}