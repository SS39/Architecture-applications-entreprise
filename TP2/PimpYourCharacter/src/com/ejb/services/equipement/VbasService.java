package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.*;

public interface VbasService {

	public void ajouterVbas(Vbas vp);
	public void modifierVbas(Vbas vp);
	public void supprimerVbas(int id);
	public List<Vbas> getVbass();
	
}
