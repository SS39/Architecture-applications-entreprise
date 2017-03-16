package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.YeuxService;
import com.jpa.entities.morphologie.Yeux;

@Stateless
public class YeuxServiceImpl implements YeuxService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterYeux(Yeux y) 
	{
		em.persist(y);
	}

	@Override
	public void modifierYeux(Yeux y) 
	{
		Yeux yeux = (Yeux)em.find(Yeux.class, y.getId_yeux());

		if (yeux != null)
		{
			yeux.setForme(y.getForme());
			yeux.setHauteur(y.getHauteur());
			yeux.setLargeur(y.getLargeur());
			yeux.setProfondeur(y.getProfondeur());
			yeux.setEcartement(y.getEcartement());
			yeux.setCouleur(y.getCouleur());
		
			em.persist(yeux);
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

}
