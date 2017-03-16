package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.CategorieAccessoire;

public interface CategorieAccessoireService 
{
	public void ajouterCategorieAccessoire(CategorieAccessoire ca);
	public void modifierCategorieAccessoire(CategorieAccessoire ca);
	public void supprimerCategorieAccessoire(int id);
	public List<CategorieAccessoire> getCategorieAccessoires();
}
