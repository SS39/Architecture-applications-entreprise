package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.Vbas;

public interface VbasService 
{
	public void ajouterVbas(Vbas vp);
	public void modifierVbas(Vbas vp);
	public void supprimerVbas(int id);
	public List<Vbas> getListVbas();
}
