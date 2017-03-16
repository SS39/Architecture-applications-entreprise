package com.gui.controllers.morphologie;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.morphologie.BusteService;
import com.jpa.entities.morphologie.Buste;

@ManagedBean
public class BusteController 
{
	private Buste buste = new Buste();
	
	@EJB
	private BusteService service;
	
	public Buste getBuste()
	{
		return buste;
	}
	
	public void setBuste(Buste b)
	{
		this.buste = b;
	}
	
	public void ajouterBuste(Buste b)
	{
		service.ajouterBuste(b);
	}
	
	public void modifierBuste(Buste b)
	{
		service.modifierBuste(b);
	}
	
	public void supprimerBuste(Buste b)
	{				
		service.supprimerBuste(b.getId_buste());
	}
	
	public List<Buste> getBustes()
	{
		return service.getBustes();
	}
	
	public List<Buste> getSearchBustes(String research) {
		return service.getSearchBustes(research);
	}
}
