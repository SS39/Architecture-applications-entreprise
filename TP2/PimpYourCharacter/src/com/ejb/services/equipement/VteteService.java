package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.Vtete;

public interface VteteService 
{
	public void ajouterVtete(Vtete vt);
	public void modifierVtete(Vtete vt);
	public void supprimerVtete(int id);
	public List<Vtete> getVtetes();	
}
