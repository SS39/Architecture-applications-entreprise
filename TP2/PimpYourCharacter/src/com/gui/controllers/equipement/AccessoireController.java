package com.gui.controllers.equipement;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.equipement.AccessoireService;
import com.jpa.entities.equipement.Accessoire;

@ManagedBean
public class AccessoireController 
{
	private Accessoire accessoire = new Accessoire();
	
	@EJB
	private AccessoireService service;
	
	public Accessoire getAccessoire()
	{
		return accessoire;
	}
	
	public void setAccessoire(Accessoire a)
	{
		this.accessoire = a;
	}
	
	public void ajouterAccessoire(Accessoire a)
	{
		service.ajouterAccessoire(a);
	}
	
	public void modifierAccessoire(Accessoire a)
	{
		service.modifierAccessoire(a);
	}
	
	public void supprimerAccessoire(Accessoire a)
	{				
		service.supprimerAccessoire(a.getId_accessoire());
	}
	
	public List<Accessoire> getAccessoires()
	{
		return service.getAccessoires();
	}
}
