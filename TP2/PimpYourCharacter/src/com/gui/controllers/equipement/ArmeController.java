package com.gui.controllers.equipement;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.equipement.ArmeService;
import com.jpa.entities.equipement.Arme;

@ManagedBean
public class ArmeController 
{
	private Arme arme = new Arme();
	
	@EJB
	private ArmeService service;
	
	public Arme getArme()
	{
		return arme;
	}
	
	public void seArme(Arme a)
	{
		this.arme = a;
	}
	
	public void ajouterArme(Arme a)
	{
		service.ajouterArme(a);
	}
	
	public void modifierArme(Arme a)
	{
		service.modifierArme(a);
	}
	
	public void supprimerArme(Arme a)
	{				
		service.supprimerArme(a.getId_arme());
	}
	
	public List<Arme> getArmes()
	{
		return service.getArmes();
	}
}
