package com.stimb.quisioneradmin.entity.stimb2;

import java.util.List;


public class KartuRencanaStudiForm 
{
	private List<KartuRencanaStudi> kartuRencanaStudis;
	
	private List<KelasPerkuliahan> kelasPerkuliahans;
	
	private List<ListMatakuliah> listMatakuliahs;

	public List<KartuRencanaStudi> getKartuRencanaStudis() {
		return kartuRencanaStudis;
	}

	public void setKartuRencanaStudis(List<KartuRencanaStudi> kartuRencanaStudis) {
		this.kartuRencanaStudis = kartuRencanaStudis;
	}

	public List<KelasPerkuliahan> getKelasPerkuliahans() {
		return kelasPerkuliahans;
	}

	public void setKelasPerkuliahans(List<KelasPerkuliahan> kelasPerkuliahans) {
		this.kelasPerkuliahans = kelasPerkuliahans;
	}

	public List<ListMatakuliah> getListMatakuliahs() {
		return listMatakuliahs;
	}

	public void setListMatakuliahs(List<ListMatakuliah> listMatakuliahs) {
		this.listMatakuliahs = listMatakuliahs;
	}
}
