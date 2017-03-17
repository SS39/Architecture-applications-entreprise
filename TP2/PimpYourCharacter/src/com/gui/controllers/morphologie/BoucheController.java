package com.gui.controllers.morphologie;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.morphologie.BoucheService;
import com.jpa.entities.morphologie.Bouche;

@ManagedBean
public class BoucheController 
{
	private Bouche bouche = new Bouche();
	
	@EJB
	private BoucheService service;
	
	public Bouche getBouche()
	{
		return bouche;
	}
	
	public void setBouche(Bouche b)
	{
		this.bouche = b;
	}

	public void ajouterBouche(Bouche b)
	{
		service.ajouterBouche(b);
	}
	
	public void modifierBouche(Bouche b)
	{
		service.modifierBouche(b);
	}
	
	public void supprimerBouche(Bouche b)
	{				
		service.supprimerBouche(b.getId_bouche());
	}
	
	public List<Bouche> getBouches()
	{
		return service.getBouches();
	}
	
	public List<Bouche> getSearchBouches(String research) {
		return service.getSearchBouches(research);
	}
}