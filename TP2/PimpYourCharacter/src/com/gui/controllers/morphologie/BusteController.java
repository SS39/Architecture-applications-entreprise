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
	
	public void supprimerBuste(int idBuste)
	{				
		service.supprimerBuste(idBuste);
	}
	
	public List<Buste> getBustes()
	{
		return service.getBustes();
	}
}
