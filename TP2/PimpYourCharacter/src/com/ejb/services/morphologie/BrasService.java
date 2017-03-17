package com.ejb.services.morphologie;

import java.util.List;

import com.jpa.entities.morphologie.Bras;

public interface BrasService 
{
	public void ajouterBras(Bras b);
	public void modifierBras(Bras b);
	public void supprimerBras(int id);
	public List<Bras> getListBras();
	public List<Bras> getSearchBras(String research);
	public List<Bras> getBras(String id, String longueur, String forme);
}
