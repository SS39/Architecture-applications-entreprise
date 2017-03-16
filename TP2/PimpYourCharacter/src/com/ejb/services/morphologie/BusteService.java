package com.ejb.services.morphologie;

import java.util.List;

import com.jpa.entities.morphologie.Buste;

public interface BusteService 
{
	public void ajouterBuste(Buste b);
	public void modifierBuste(Buste b);
	public void supprimerBuste(int id);
	public List<Buste> getBustes();
	public List<Buste> getSearchBustes(String research);
}
