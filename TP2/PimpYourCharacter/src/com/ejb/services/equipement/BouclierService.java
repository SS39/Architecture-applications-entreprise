package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.Bouclier;

public interface BouclierService 
{
	public void ajouterBouclier(Bouclier b);
	public void modifierBouclier(Bouclier b);
	public void supprimerBouclier(int id);
	public List<Bouclier> getBoucliers();
}
