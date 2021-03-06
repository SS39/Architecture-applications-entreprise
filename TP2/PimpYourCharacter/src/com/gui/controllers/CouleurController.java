package com.gui.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.CouleurService;
import com.jpa.entities.Couleur;

@ManagedBean
public class CouleurController 
{
	private Couleur couleur = new Couleur();
	
	@EJB
	private CouleurService service;
	
	public Couleur getCouleur()
	{
		return couleur;
	}
	
	public void setCouleur(Couleur c)
	{
		this.couleur = c;
	}
	
	public void ajouterCouleur(Couleur c)
	{
		int j = 0;
		boolean find = false;
		List<Couleur> list = getCouleurs();
		
		while (j < list.size() && !find) 
		{
			Couleur c2 = (Couleur)list.get(j);
			if (c.getLabel().equals(c2.getLabel()))
			{
				find = true;
			}
			j++;
		}
		
		if (!find)
		{
			service.ajouterCouleur(c);
		}
	}
	
	public void modifierCouleur(Couleur c)
	{
		service.modifierCouleur(c);
	}
	
	public void supprimerCouleur(Couleur c)
	{				
		service.supprimerCouleur(c.getId_couleur());
	}
	
	public List<Couleur> getCouleurs()
	{
		return service.getCouleurs();
	}
	
	public List<Couleur> getSearchCouleur(String research) {
		return service.getSearchCouleurs(research);
	}
}