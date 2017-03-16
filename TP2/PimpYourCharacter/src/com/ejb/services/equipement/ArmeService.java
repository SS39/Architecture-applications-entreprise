package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.Arme;

public interface ArmeService 
{
	public void ajouterArme(Arme a);
	public void modifierArme(Arme a);
	public void supprimerArme(int id);
	public List<Arme> getArmes();
}
