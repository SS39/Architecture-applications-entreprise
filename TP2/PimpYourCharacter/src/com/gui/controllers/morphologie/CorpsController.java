package com.gui.controllers.morphologie;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.morphologie.CorpsService;
import com.jpa.entities.morphologie.Corps;

@ManagedBean
public class CorpsController 
{
	private Corps corps = new Corps();
	
	@EJB
	private CorpsService service;
	
	public Corps getCorps()
	{
		return corps;
	}
	
	public void setCorps(Corps c)
	{
		this.corps = c;
	}
	
	public void ajouterCorps(Corps c)
	{
		service.ajouterCorps(c);
	}
	
	public void modifierCorps(Corps c)
	{
		service.modifierCorps(c);
	}
	
	public void supprimerCorps(int idCorps)
	{				
		service.supprimerCorps(idCorps);
	}
	
	public List<Corps> getListCorps()
	{
		return service.getListCorps();
	}
}
