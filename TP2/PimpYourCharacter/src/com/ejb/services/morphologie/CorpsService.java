package com.ejb.services.morphologie;

import java.util.List;

import com.jpa.entities.morphologie.Corps;

public interface CorpsService 
{
	public void ajouterCorps(Corps c);
	public void modifierCorps(Corps c);
	public void supprimerCorps(int id);
	public List<Corps> getListCorps();
	public List<Corps> getSearchCorps(String research);
	public List<Corps> getCorps(String id, String taille, String bras, String jambes, String buste, String tete);
}
