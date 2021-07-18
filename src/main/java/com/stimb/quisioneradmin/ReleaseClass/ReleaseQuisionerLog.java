package com.stimb.quisioneradmin.ReleaseClass;


import com.stimb.quisioneradmin.entity.stimb2.KartuRencanaStudi;
import com.stimb.quisioneradmin.entity.stimb2.Quisioner;
import com.stimb.quisioneradmin.entity.stimb2.QuisionerLog;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yusfia Hafid A on 1/3/2016.
 */
public class ReleaseQuisionerLog implements Serializable {
    private Long quisionerId;
    private Long krsId;
    private String kodematkul;
    private String question;
    private String keterangan;
    private final List<Integer> TYPES = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
    private Integer selectedChoice = 3;
    private KartuRencanaStudi krs;
    private Quisioner quisioner;

    public ReleaseQuisionerLog(KartuRencanaStudi krs, Quisioner quisioner) {
        quisionerId = quisioner.getId();
        krsId = krs.getId();
        question = quisioner.getPertanyaan();
        keterangan = quisioner.getKeterangan();
        kodematkul = krs.getKelasPerkuliahan().getMasterMatakuliah().getKodeMatakuliah();
        this.krs = krs;
        this.quisioner = quisioner;
    }

    public Long getQuisionerId() {
        return quisionerId;
    }

    public void setQuisionerId(Long quisionerId) {
        this.quisionerId = quisionerId;
    }

    public Long getKrsId() {
        return krsId;
    }

    public void setKrsId(Long krsId) {
        this.krsId = krsId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public List<Integer> getTYPES() {
        return TYPES;
    }

    public Integer getSelectedChoice() {
        return selectedChoice;
    }

    public void setSelectedChoice(Integer selectedChoice) {
        this.selectedChoice = selectedChoice;
    }

    public String getKodematkul() {
        return kodematkul;
    }

    public void setKodematkul(String kodematkul) {
        this.kodematkul = kodematkul;
    }

    public QuisionerLog getQuisionerLog(){
        QuisionerLog quisionerLog = new QuisionerLog();
        quisionerLog.setKartuRencanaStudi(krs);
        quisionerLog.setQuisioner(quisioner);
        quisionerLog.setNilai(getSelectedChoice());
        return quisionerLog;
    }
}
