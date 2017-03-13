package com.ejb.services.morphologie;

import java.util.List;

import com.jpa.entities.morphologie.Tete;

public interface TeteService 
{
	public void ajouterTete(Tete t);
	public void modifierTete(Tete t);
	public void supprimerTete(int id);
	public List<Tete> getTetes();
}
