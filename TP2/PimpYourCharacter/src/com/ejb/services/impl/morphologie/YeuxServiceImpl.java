package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.YeuxService;
import com.jpa.entities.Couleur;
import com.jpa.entities.morphologie.Yeux;

@Stateless
public class YeuxServiceImpl implements YeuxService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterYeux(Yeux y) 
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, y.getCouleur().getId_couleur());
		if (couleur != null)
		{
			y.setCouleur(couleur);
			em.persist(y);
		}
	}

	@Override
	public void modifierYeux(Yeux y) 
	{
		Yeux yeux = (Yeux)em.find(Yeux.class, y.getId_yeux());
		if (yeux != null)
		{
			Couleur couleur = (Couleur)em.find(Couleur.class, y.getCouleur().getId_couleur());
			if (couleur != null)
			{
				yeux.setForme(y.getForme());
				yeux.setHauteur(y.getHauteur());
				yeux.setLargeur(y.getLargeur());
				yeux.setProfondeur(y.getProfondeur());
				yeux.setEcartement(y.getEcartement());
				yeux.setCouleur(couleur);
			
				em.persist(yeux);
			}
		}
	}

	@Override
	public void supprimerYeux(int id) 
	{
		Yeux yeux = (Yeux)em.find(Yeux.class, id);
		
		if (yeux != null)
		{
			em.remove(yeux);
		}
	}

	@Override
	public List<Yeux> getListYeux() 
	{
		return (List<Yeux>)em.createQuery("from Yeux").getResultList();
	}
	
	public List<Yeux> getSearchYeux(String research) {
		return (List<Yeux>)em.createQuery(research).getResultList();
	}

}
