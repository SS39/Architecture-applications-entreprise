package com.gui.controllers.personnage;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.personnage.EthnieService;
import com.jpa.entities.personnage.Ethnie;

@ManagedBean
public class EthnieController 
{
	private Ethnie ethnie = new Ethnie();
	
	@EJB
	private EthnieService service;
	
	public Ethnie getEthnie()
	{
		return ethnie;
	}
	
	public void setEthnie(Ethnie e)
	{
		this.ethnie = e;
	}
	
	public void ajouterEthnie(Ethnie e)
	{
		service.ajouterEthnie(e);
	}
	
	public void modifierEthnie(Ethnie e)
	{
		service.modifierEthnie(e);
	}
	
	public void supprimerEthnie(Ethnie e)
	{				
		service.supprimerEthnie(e.getId_ethnie());
	}
	
	public List<Ethnie> getEthnies()
	{
		return service.getEthnies();
	}
}
