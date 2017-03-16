package com.gui.controllers.equipement;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.equipement.CategorieArmeService;
import com.jpa.entities.equipement.CategorieArme;

@ManagedBean
public class CategorieArmeController 
{
	private CategorieArme categorieArme = new CategorieArme();
	
	@EJB
	private CategorieArmeService service;
	
	public CategorieArme getCategorieArme()
	{
		return categorieArme;
	}
	
	public void setCategorieArme(CategorieArme ca)
	{
		this.categorieArme = ca;
	}
	
	public void ajouterCategorieArme(CategorieArme ca)
	{
		service.ajouterCategorieArme(ca);
	}
	
	public void modifierCategorieArme(CategorieArme ca)
	{
		service.modifierCategorieArme(ca);
	}
	
	public void supprimerCategorieArme(int idCategorieArme)
	{				
		service.supprimerCategorieArme(idCategorieArme);
	}
	
	public List<CategorieArme> getCategorieArmes()
	{
		return service.getCategorieArmes();
	}
}
