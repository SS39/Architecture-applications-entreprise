package com.gui.controllers.equipement;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.equipement.BouclierService;
import com.jpa.entities.equipement.Bouclier;

@ManagedBean
public class BouclierController 
{
	private Bouclier bouclier = new Bouclier();
	
	@EJB
	private BouclierService service;
	
	public Bouclier getBouclier()
	{
		return bouclier;
	}
	
	public void setBouclier(Bouclier b)
	{
		this.bouclier = b;
	}
	
	public void ajouterBouclier(Bouclier b)
	{
		service.ajouterBouclier(b);
	}
	
	public void modifierBouclier(Bouclier b)
	{
		service.modifierBouclier(b);
	}
	
	public void supprimerBouclier(Bouclier b)
	{				
		service.supprimerBouclier(b.getId_bouclier());
	}
	
	public List<Bouclier> getBoucliers()
	{
		return service.getBoucliers();
	}
}
