package com.stimb.quisioneradmin.entity.stimb2;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Yusfia Hafid A on 1/8/2016.
 */

@Entity
@Table(name = "KOMENTAR_SARAN")

public class KomentarSaran implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    @OneToOne()
    private KartuRencanaStudi kartuRencanaStudi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public KartuRencanaStudi getKartuRencanaStudi() {
        return kartuRencanaStudi;
    }

    public void setKartuRencanaStudi(KartuRencanaStudi kartuRencanaStudi) {
        this.kartuRencanaStudi = kartuRencanaStudi;
    }
}
