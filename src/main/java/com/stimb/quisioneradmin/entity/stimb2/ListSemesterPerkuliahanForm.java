package com.stimb.quisioneradmin.entity.stimb2;

import java.util.List;


public class ListSemesterPerkuliahanForm 
{
	private List<ListSemesterPerkuliahan> listSemesterPerkuliahans;
	
	private List<ListSemesterPerkuliahan> listSemesterPerkuliahansd3;
	
	private List<MasterKurikulum> masterKurikulums;

	public List<ListSemesterPerkuliahan> getListSemesterPerkuliahans() {
		return listSemesterPerkuliahans;
	}

	public void setListSemesterPerkuliahans(
			List<ListSemesterPerkuliahan> listSemesterPerkuliahans) {
		this.listSemesterPerkuliahans = listSemesterPerkuliahans;
	}

	public List<MasterKurikulum> getMasterKurikulums() {
		return masterKurikulums;
	}

	public void setMasterKurikulums(List<MasterKurikulum> masterKurikulums) {
		this.masterKurikulums = masterKurikulums;
	}

	public List<ListSemesterPerkuliahan> getListSemesterPerkuliahansd3() {
		return listSemesterPerkuliahansd3;
	}

	public void setListSemesterPerkuliahansd3(
			List<ListSemesterPerkuliahan> listSemesterPerkuliahansd3) {
		this.listSemesterPerkuliahansd3 = listSemesterPerkuliahansd3;
	}
}
