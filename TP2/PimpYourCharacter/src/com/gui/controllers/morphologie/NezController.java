package com.gui.controllers.morphologie;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.morphologie.NezService;
import com.jpa.entities.morphologie.Nez;

@ManagedBean
public class NezController 
{
	private Nez nez = new Nez();
	
	@EJB
	private NezService service;
	
	public Nez getNez()
	{
		return nez;
	}
	
	public void setNez(Nez n)
	{
		this.nez = n;
	}
	
	public void ajouterNez(Nez n)
	{
		service.ajouterNez(n);
	}
	
	public void modifierNez(Nez n)
	{
		service.modifierNez(n);
	}
	
	public void supprimerNez(int idNez)
	{				
		service.supprimerNez(idNez);
	}
	
	public List<Nez> getListNez()
	{
		return service.getListNez();
	}
}
