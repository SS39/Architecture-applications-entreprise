package com.ejb.services.morphologie;

import java.util.List;

import com.jpa.entities.morphologie.Bouche;

public interface BoucheService 
{
	public void ajouterBouche(Bouche b);
	public void modifierBouche(Bouche b);
	public void supprimerBouche(int id);
	public List<Bouche> getBouches();
}