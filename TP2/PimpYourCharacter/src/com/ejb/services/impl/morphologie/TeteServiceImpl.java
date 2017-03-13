package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.TeteService;
import com.jpa.entities.morphologie.Tete;

@Stateless
public class TeteServiceImpl implements TeteService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterTete(Tete t)
	{
		em.persist(t);
	}

	@Override
	public void modifierTete(Tete t) 
	{
		Tete tete = (Tete)em.find(Tete.class, t.getIdTete());

		if (tete != null)
		{
			tete.setBouche(t.getBouche());
			tete.setForme(t.getForme());
			tete.setHauteur(t.getHauteur());
			tete.setLargeur(t.getLargeur());
			tete.setNez(t.getNez());
			tete.setYeux(t.getYeux());
	
			em.persist(tete);
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

}
