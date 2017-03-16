package com.ejb.services.morphologie;

import java.util.List;

import com.jpa.entities.morphologie.Yeux;

public interface YeuxService 
{
	public void ajouterYeux(Yeux y);
	public void modifierYeux(Yeux y);
	public void supprimerYeux(int id);
	public List<Yeux> getListYeux();
	public List<Yeux> getSearchYeux(String research);
}
