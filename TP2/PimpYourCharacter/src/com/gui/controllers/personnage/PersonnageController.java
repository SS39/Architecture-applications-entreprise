package com.gui.controllers.personnage;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.personnage.PersonnageService;
import com.jpa.entities.personnage.Personnage;

@ManagedBean
public class PersonnageController 
{
	private Personnage personnage = new Personnage();
	
	@EJB
	private PersonnageService service;
	
	public Personnage getPersonnage()
	{
		return personnage;
	}
	
	public void setPersonnage(Personnage p)
	{
		this.personnage = p;
	}
	
	public void ajouterPersonnage(Personnage p)
	{
		service.ajouterPersonnage(p);
	}
	
	public void modifierPersonnage(Personnage p)
	{
		service.modifierPersonnage(p);
	}
	
	public void supprimerPersonnage(int idPersonnage)
	{				
		service.supprimerPersonnage(idPersonnage);
	}
	
	public List<Personnage> getPersonnages()
	{
		return service.getPersonnages();
	}
}
