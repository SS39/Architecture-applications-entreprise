package com.ejb.services;

import java.util.List;

import com.jpa.entities.Couleur;

public interface CouleurService 
{
	public void ajouterCouleur(Couleur c);
	public void modifierCouleur(Couleur c);
	public void supprimerCouleur(int id);
	public List<Couleur> getCouleurs();
	public List<Couleur> getSearchCouleurs(String research);
	public List<Couleur> getCouleurs(String id,String label);
}