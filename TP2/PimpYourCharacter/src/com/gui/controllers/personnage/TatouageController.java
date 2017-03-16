package com.gui.controllers.personnage;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.personnage.TatouageService;
import com.jpa.entities.personnage.Tatouage;

@ManagedBean
public class TatouageController 
{
	private Tatouage tatouage = new Tatouage();
	
	@EJB
	private TatouageService service;
	
	public Tatouage getTatouage()
	{
		return tatouage;
	}
	
	public void setTatouage(Tatouage t)
	{
		this.tatouage = t;
	}
	
	public void ajouterTatouage(Tatouage t)
	{
		service.ajouterTatouage(t);
	}
	
	public void modifierTatouage(Tatouage t)
	{
		service.modifierTatouage(t);
	}
	
	public void supprimerTatouage(int idTatouage)
	{				
		service.supprimerTatouage(idTatouage);
	}
	
	public List<Tatouage> getTatouages()
	{
		return service.getTatouages();
	}
}
