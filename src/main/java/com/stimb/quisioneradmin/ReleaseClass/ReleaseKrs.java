package com.stimb.quisioneradmin.ReleaseClass;

import com.stimb.quisioneradmin.entity.stimb2.KartuRencanaStudi;
import com.stimb.quisioneradmin.entity.stimb2.ListDosenKelas;
import com.stimb.quisioneradmin.entity.stimb2.ListJadwalPerkuliahan;
import org.apache.wicket.util.io.IClusterable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Yusfia Hafid A on 12/26/2015.
 */
public class ReleaseKrs implements IClusterable, Serializable {
    private static final Logger log = LoggerFactory.getLogger(ReleaseKrs.class);
    @Inject
    public Environment env;
    private Long idKrs;
    private Long idKelas;
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private Integer sksMataKuliah;
    private String tahunAjaran;
    private String semester;
    private String nama_instrumen_mayor;
    private String kode_instrumen_mayor;
    private String prodi_instrumen_mayor;
    private String instrumenMayor;
    private String namaDosen;
    private String namaDosenRaw = "";
    private String jadwalkuliah = "";
    //private Integer sksPraktekLapangan;
    //private Integer sksPraktikum;
    //private Integer sksSimulasi;
    //private Integer sksTatapMuka;
    //private String nilai;

    public ReleaseKrs(KartuRencanaStudi kartuRencanaStudi, ListDosenKelas ldk, List<ListJadwalPerkuliahan> listJadwalPerkuliahans) {
        idKrs = kartuRencanaStudi.getId();
        idKelas = kartuRencanaStudi.getKelasPerkuliahan().getId();
        kodeMataKuliah = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getKodeMatakuliah();
        namaMataKuliah = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getNamaMatakuliah();
        sksMataKuliah = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getSksMatakuliah();
        tahunAjaran = kartuRencanaStudi.getReffTahunAjaran().getNamaTahunAjaran();
        semester = kartuRencanaStudi.getReffTahunAjaran().getPeriode();
        if (kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor() != null) {
            nama_instrumen_mayor = kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor().getNamaInstrumentMayor();
            kode_instrumen_mayor = kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor().getKodeInstrumentMayor();
            prodi_instrumen_mayor = kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor().getProdiInstrumentMayor();
            instrumenMayor = "(" + getNama_instrumen_mayor() + " " + getKode_instrumen_mayor() + ")";
        } else {
            nama_instrumen_mayor = "";
            kode_instrumen_mayor = "";
            prodi_instrumen_mayor = "";
            instrumenMayor = "";
        }
        if (ldk != null) {
            namaDosen = ldk.getMasterDosen().getNama();
            namaDosenRaw = namaDosen;
            String gelarS1 = ldk.getMasterDosen().getDosenPendidikan().getGelarAkademikS1();
            String gelarS2 = ldk.getMasterDosen().getDosenPendidikan().getGelarAkademikS2();
            String gelarS3 = ldk.getMasterDosen().getDosenPendidikan().getGelarAkademikS3();
            if (!gelarS1.equals("")) {
                namaDosen = namaDosen + ", " + gelarS1 + ".";
            }
            if (!gelarS2.equals("")) {
                namaDosen = namaDosen + ", " + gelarS2 + ".";
            }
            if (!gelarS3.equals("")) {
                namaDosen = namaDosen + ", " + gelarS3 + ".";
            }
        }
        for (int i = 0; i < listJadwalPerkuliahans.size(); i++) {
            if (i < listJadwalPerkuliahans.size() - 1) {
                jadwalkuliah = jadwalkuliah + listJadwalPerkuliahans.get(i).getHari() + ", " + listJadwalPerkuliahans.get(i).getWaktu() + "<br>";
            } else {
                jadwalkuliah = jadwalkuliah + listJadwalPerkuliahans.get(i).getHari() + ", " + listJadwalPerkuliahans.get(i).getWaktu();
            }
        }
    }

    public ReleaseKrs(KartuRencanaStudi kartuRencanaStudi) {
        idKrs = kartuRencanaStudi.getId();
        kodeMataKuliah = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getKodeMatakuliah();
        namaMataKuliah = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getNamaMatakuliah();
        sksMataKuliah = kartuRencanaStudi.getKelasPerkuliahan().getMasterMatakuliah().getSksMatakuliah();
        tahunAjaran = kartuRencanaStudi.getReffTahunAjaran().getNamaTahunAjaran();
        semester = kartuRencanaStudi.getReffTahunAjaran().getPeriode();
        if (kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor() != null) {
            nama_instrumen_mayor = kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor().getNamaInstrumentMayor();
            kode_instrumen_mayor = kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor().getKodeInstrumentMayor();
            prodi_instrumen_mayor = kartuRencanaStudi.getKelasPerkuliahan().getInstrumentMayor().getProdiInstrumentMayor();
            instrumenMayor = "(" + getNama_instrumen_mayor() + " " + getKode_instrumen_mayor() + ")";
        } else {
            nama_instrumen_mayor = "";
            kode_instrumen_mayor = "";
            prodi_instrumen_mayor = "";
            instrumenMayor = "";
        }
    }

    public ReleaseKrs() {
    }

    public Long getIdKrs() {
        return idKrs;
    }

    public Long getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(Long idKelas) {
        this.idKelas = idKelas;
    }

    public void setIdKrs(Long idKrs) {
        this.idKrs = idKrs;
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

    public String getTahunAjaran() {
        return tahunAjaran;
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

    public String getSemester() {
        return semester;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public void setSemester(String semester) {
        this.semester = semester;
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

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getJadwalkuliah() {
        return jadwalkuliah;
    }

    public void setJadwalkuliah(String jadwalkuliah) {
        this.jadwalkuliah = jadwalkuliah;
    }

    public String toString() {
        return "(" + kodeMataKuliah + ") " + namaMataKuliah;
    }

    public String getNamaDosenRaw() {
        return namaDosenRaw;
    }

    public void setNamaDosenRaw(String namaDosenRaw) {
        this.namaDosenRaw = namaDosenRaw;
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

    public String getNilai() {
        return nilai;
    }
    */
}
