package com.stimb.quisioneradmin.entity.stimb2;

import java.util.List;


public class ListMatakuliahForm 
{
	private List<ListMatakuliah> listMatakuliahs;
	
	private List<MasterMatakuliah> masterMatakuliahs;

	public List<ListMatakuliah> getListMatakuliahs() {
		return listMatakuliahs;
	}

	public void setListMatakuliahs(List<ListMatakuliah> listMatakuliahs) {
		this.listMatakuliahs = listMatakuliahs;
	}

	public List<MasterMatakuliah> getMasterMatakuliahs() {
		return masterMatakuliahs;
	}

	public void setMasterMatakuliahs(List<MasterMatakuliah> MasterMatakuliahs) {
		masterMatakuliahs = MasterMatakuliahs;
	}
	
	
}
