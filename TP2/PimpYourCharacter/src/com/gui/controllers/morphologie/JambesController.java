package com.gui.controllers.morphologie;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.morphologie.JambesService;
import com.jpa.entities.morphologie.Jambes;

@ManagedBean
public class JambesController 
{
	private Jambes jambes = new Jambes();
	
	@EJB
	private JambesService service;
	
	public Jambes getJambes()
	{
		return jambes;
	}
	
	public void setJambes(Jambes j)
	{
		this.jambes = j;
	}
	
	public void ajouterJambes(Jambes j)
	{
		service.ajouterJambes(j);
	}
	
	public void modifierJambes(Jambes j)
	{
		service.modifierJambes(j);
	}
	
	public void supprimerJambes(Jambes j)
	{				
		service.supprimerJambes(j.getId_jambe());
	}
	
	public List<Jambes> getListJambes()
	{
		return service.getListJambes();
	}
	
	public List<Jambes> getSearchJambes(String research) {
		return service.getSearchJambes(research);
	}
}
