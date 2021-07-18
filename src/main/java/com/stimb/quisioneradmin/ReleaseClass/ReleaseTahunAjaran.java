package com.stimb.quisioneradmin.ReleaseClass;

import java.io.Serializable;

/**
 * Created by Yusfia Hafid A on 12/30/2015.
 */
public class ReleaseTahunAjaran implements Serializable{
    private String tahunAjaran;
    private String value;
    private String semester;

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return tahunAjaran+" "+semester;
    }
}
