package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.TeteService;
import com.jpa.entities.morphologie.Bouche;
import com.jpa.entities.morphologie.Nez;
import com.jpa.entities.morphologie.Tete;
import com.jpa.entities.morphologie.Yeux;

@Stateless
public class TeteServiceImpl implements TeteService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterTete(Tete t)
	{
		Bouche bouche = (Bouche)em.find(Bouche.class, t.getBouche().getId_bouche());
		if (bouche != null)
		{
			Nez nez = (Nez)em.find(Nez.class, t.getNez().getId_nez());
			if (nez != null)
			{
				Yeux yeux = (Yeux)em.find(Yeux.class, t.getYeux().getId_yeux());
				if (yeux != null)
				{
					t.setBouche(bouche);
					t.setNez(nez);
					t.setYeux(yeux);
					em.persist(t);
				}
			}
		}
	}

	@Override
	public void modifierTete(Tete t) 
	{
		Tete tete = (Tete)em.find(Tete.class, t.getId_tete());
		if (tete != null)
		{
			Bouche bouche = (Bouche)em.find(Bouche.class, t.getBouche().getId_bouche());
			if (bouche != null)
			{
				Nez nez = (Nez)em.find(Nez.class, t.getNez().getId_nez());
				if (nez != null)
				{
					Yeux yeux = (Yeux)em.find(Yeux.class, t.getYeux().getId_yeux());
					if (yeux != null)
					{
						tete.setBouche(bouche);
						tete.setForme(t.getForme());
						tete.setHauteur(t.getHauteur());
						tete.setLargeur(t.getLargeur());
						tete.setNez(nez);
						tete.setYeux(yeux);
				
						em.persist(tete);
					}
				}
			}
		}
	}

	@Override
	public void supprimerTete(int id) 
	{
		Tete tete = (Tete)em.find(Tete.class, id);
		
		if (tete != null)
		{
			em.remove(tete);
		}
	}

	@Override
	public List<Tete> getTetes() 
	{
		return (List<Tete>)em.createQuery("from Tete").getResultList();
	}
	
	public List<Tete> getSearchTetes(String research) {
		return (List<Tete>)em.createQuery(research).getResultList();
	}

}
