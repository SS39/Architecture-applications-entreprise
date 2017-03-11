package com.ejb.services.morphologie;

import java.util.List;

import com.jpa.entities.morphologie.Couleur;

public interface CouleurService 
{
	public void ajouterCouleur(Couleur c);
	public void modifierCouleur(Couleur c);
	public void supprimerCouleur(int id);
	public List<Couleur> getCouleurs();
}