package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.*;

public interface VmainService {

	public void ajouterVmain(Vmain vp);
	public void modifierVmain(Vmain vp);
	public void supprimerVmain(int id);
	public List<Vmain> getVmains();
	
}
