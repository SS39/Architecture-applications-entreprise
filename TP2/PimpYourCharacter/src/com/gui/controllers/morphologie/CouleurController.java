package com.gui.controllers.morphologie;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.morphologie.CouleurService;
import com.jpa.entities.morphologie.Couleur;

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
		List list = getCouleurs();
		
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
	
	public void supprimerCouleur(int idCouleur)
	{				
		service.supprimerCouleur(idCouleur);
	}
	
	public List<Couleur> getCouleurs()
	{
		return service.getCouleurs();
	}
}