package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.CategorieArme;

public interface CategorieArmeService 
{
	public void ajouterCategorieArme(CategorieArme ca);
	public void modifierCategorieArme(CategorieArme ca);
	public void supprimerCategorieArme(int id);
	public List<CategorieArme> getCategorieArmes();
}
