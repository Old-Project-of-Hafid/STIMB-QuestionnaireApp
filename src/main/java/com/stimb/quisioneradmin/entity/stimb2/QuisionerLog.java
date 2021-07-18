package com.stimb.quisioneradmin.entity.stimb2;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Yusfia Hafid A on 1/2/2016.
 */
@Entity
@Table(name = "QUISIONER_LOG")
public class QuisionerLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer nilai;

    @ManyToOne()
    private Quisioner quisioner;

    @ManyToOne()
    private KartuRencanaStudi kartuRencanaStudi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNilai() {
        return nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }

    public Quisioner getQuisioner() {
        return quisioner;
    }

    public void setQuisioner(Quisioner quisioner) {
        this.quisioner = quisioner;
    }

    public KartuRencanaStudi getKartuRencanaStudi() {
        return kartuRencanaStudi;
    }

    public void setKartuRencanaStudi(KartuRencanaStudi kartuRencanaStudi) {
        this.kartuRencanaStudi = kartuRencanaStudi;
    }
}
