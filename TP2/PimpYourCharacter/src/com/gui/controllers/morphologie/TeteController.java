package com.gui.controllers.morphologie;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.morphologie.TeteService;
import com.jpa.entities.morphologie.Tete;

@ManagedBean
public class TeteController 
{
	private Tete tete = new Tete();
	
	@EJB
	private TeteService service;
	
	public Tete getTete()
	{
		return tete;
	}
	
	public void setTete(Tete t)
	{
		this.tete = t;
	}
	
	public void ajouterTete(Tete t)
	{
		service.ajouterTete(t);
	}
	
	public void modifierTete(Tete t)
	{
		service.modifierTete(t);
	}
	
	public void supprimerTete(int idTete)
	{				
		service.supprimerTete(idTete);
	}
	
	public List<Tete> getTetes()
	{
		return service.getTetes();
	}
	
	public List<Tete> getSearchTetes(String research) {
		return service.getSearchTetes(research);
	}
}