package com.gui.controllers.morphologie;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.morphologie.BrasService;
import com.jpa.entities.morphologie.Bras;

@ManagedBean
public class BrasController 
{
	private Bras bras = new Bras();
	
	@EJB
	private BrasService service;
	
	public Bras getBras()
	{
		return bras;
	}
	
	public void setBras(Bras b)
	{
		this.bras = b;
	}
	
	public void ajouterBras(Bras b)
	{
		service.ajouterBras(b);
	}
	
	public void modifierBras(Bras b)
	{
		service.modifierBras(b);
	}
	
	public void supprimerBras(Bras b)
	{				
		service.supprimerBras(b.getId_bras());
	}
	
	public List<Bras> getListBras()
	{
		return service.getListBras();
	}
	
	public List<Bras> getSearchBras(String research) {
		return service.getSearchBras(research);
	}
}
