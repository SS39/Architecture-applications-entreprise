package com.ejb.services;

import java.util.List;

import com.jpa.entities.Couleur;

public interface CouleurService 
{
	public void ajouterCouleur(Couleur c);
	public void modifierCouleur(Couleur c);
	public void supprimerCouleur(int id);
	public List<Couleur> getCouleurs();
}