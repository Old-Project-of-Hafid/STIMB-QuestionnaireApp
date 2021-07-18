package com.stimb.quisioneradmin.entity.stimb2;

import java.util.List;

public class ListAktifitasPerkuliahanForm {
	
	private List<ListAktifitasPerkuliahan> listAktifitasPerkuliahans;
	
	private List<KelasPerkuliahan> kelasPerkuliahans;
	
	private List<KartuRencanaStudi> kartuRencanaStudis;
	
	private ListKehadiranDosen listKehadiranDosens;
	
	private List<NilaiMahasiswa> nilaiMahasiswas;
	
	public List<ListAktifitasPerkuliahan> getListAktifitasPerkuliahans() {
		return listAktifitasPerkuliahans;
	}

	public void setListAktifitasPerkuliahans(
			List<ListAktifitasPerkuliahan> listAktifitasPerkuliahans) {
		this.listAktifitasPerkuliahans = listAktifitasPerkuliahans;
	}

	public List<KelasPerkuliahan> getKelasPerkuliahans() {
		return kelasPerkuliahans;
	}

	public void setKelasPerkuliahans(List<KelasPerkuliahan> kelasPerkuliahans) {
		this.kelasPerkuliahans = kelasPerkuliahans;
	}

	public List<KartuRencanaStudi> getKartuRencanaStudis() {
		return kartuRencanaStudis;
	}

	public void setKartuRencanaStudis(List<KartuRencanaStudi> kartuRencanaStudis) {
		this.kartuRencanaStudis = kartuRencanaStudis;
	}

	public ListKehadiranDosen getListKehadiranDosens() {
		return listKehadiranDosens;
	}

	public void setListKehadiranDosens(ListKehadiranDosen listKehadiranDosens) {
		this.listKehadiranDosens = listKehadiranDosens;
	}

	public List<NilaiMahasiswa> getNilaiMahasiswas() {
		return nilaiMahasiswas;
	}

	public void setNilaiMahasiswas(List<NilaiMahasiswa> nilaiMahasiswas) {
		this.nilaiMahasiswas = nilaiMahasiswas;
	}
}
