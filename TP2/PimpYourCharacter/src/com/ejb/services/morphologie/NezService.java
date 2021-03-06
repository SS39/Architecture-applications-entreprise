package com.ejb.services.morphologie;

import java.util.List;

import com.jpa.entities.morphologie.Nez;

public interface NezService 
{
	public void ajouterNez(Nez n);
	public void modifierNez(Nez n);
	public void supprimerNez(int id);
	public List<Nez> getListNez();
	public List<Nez> getSearchNez(String research);
	public List<Nez> getNez(String id, String forme, String largeur, String hauteur, String profondeur);
}
