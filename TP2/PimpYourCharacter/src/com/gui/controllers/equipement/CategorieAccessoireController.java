package com.gui.controllers.equipement;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.equipement.CategorieAccessoireService;
import com.jpa.entities.equipement.CategorieAccessoire;

@ManagedBean
public class CategorieAccessoireController 
{
	private CategorieAccessoire categorieAccessoire = new CategorieAccessoire();
	
	@EJB
	private CategorieAccessoireService service;
	
	public CategorieAccessoire getCategorieAccessoire()
	{
		return categorieAccessoire;
	}
	
	public void setCategorieAccessoire(CategorieAccessoire ca)
	{
		this.categorieAccessoire = ca;
	}
	
	public void ajouterCategorieAccessoire(CategorieAccessoire ca)
	{
		service.ajouterCategorieAccessoire(ca);
	}
	
	public void modifierCategorieAccessoire(CategorieAccessoire ca)
	{
		service.modifierCategorieAccessoire(ca);
	}
	
	public void supprimerCategorieAccessoire(CategorieAccessoire c)
	{				
		service.supprimerCategorieAccessoire(c.getId_categorie_accessoire());
	}
	
	public List<CategorieAccessoire> getCategorieAccessoires()
	{
		return service.getCategorieAccessoires();
	}
}
