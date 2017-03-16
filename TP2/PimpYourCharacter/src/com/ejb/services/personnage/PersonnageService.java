package com.ejb.services.personnage;

import java.util.List;

import com.jpa.entities.personnage.Personnage;

public interface PersonnageService 
{
	public void ajouterPersonnage(Personnage p);
	public void modifierPersonnage(Personnage p);
	public void supprimerPersonnage(int id);
	public List<Personnage> getPersonnages();
}
