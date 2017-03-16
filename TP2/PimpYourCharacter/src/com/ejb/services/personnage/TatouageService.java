package com.ejb.services.personnage;

import java.util.List;

import com.jpa.entities.personnage.Tatouage;

public interface TatouageService 
{
	public void ajouterTatouage(Tatouage t);
	public void modifierTatouage(Tatouage t);
	public void supprimerTatouage(int id);
	public List<Tatouage> getTatouages();
}
