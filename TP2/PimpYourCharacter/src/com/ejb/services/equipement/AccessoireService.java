package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.Accessoire;

public interface AccessoireService 
{
	public void ajouterAccessoire(Accessoire a);
	public void modifierAccessoire(Accessoire a);
	public void supprimerAccessoire(int id);
	public List<Accessoire> getAccessoires();
}
