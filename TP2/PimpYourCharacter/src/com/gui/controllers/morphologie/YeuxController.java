package com.gui.controllers.morphologie;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.morphologie.YeuxService;
import com.jpa.entities.morphologie.Yeux;

@ManagedBean
public class YeuxController 
{
	private Yeux yeux = new Yeux();
	
	@EJB
	private YeuxService service;
	
	public Yeux getYeux()
	{
		return yeux;
	}
	
	public void setYeux(Yeux y)
	{
		this.yeux = y;
	}
	
	public void ajouterYeux(Yeux y)
	{
		service.ajouterYeux(y);
	}
	
	public void modifierYeux(Yeux y)
	{
		service.modifierYeux(y);
	}
	
	public void supprimerYeux(Yeux y)
	{				
		service.supprimerYeux(y.getId_yeux());
	}
	
	public List<Yeux> getListYeux()
	{
		return service.getListYeux();
	}
	
	public List<Yeux> getSearchYeux(String research) {
		return service.getSearchYeux(research);
	}

}
