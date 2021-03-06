package com.ejb.services.morphologie;

import java.util.List;

import com.jpa.entities.morphologie.Jambes;

public interface JambesService 
{
	public void ajouterJambes(Jambes j);
	public void modifierJambes(Jambes j);
	public void supprimerJambes(int id);
	public List<Jambes> getListJambes();
	public List<Jambes> getSearchJambes(String research);
	public List<Jambes> getJambes(String id, String hauteur, String forme);
}
