package com.ejb.services.impl.personnage;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.personnage.TatouageService;
import com.jpa.entities.personnage.Tatouage;

@Stateless
public class TatouageServiceImpl implements TatouageService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterTatouage(Tatouage t) 
	{
		em.persist(t);
	}

	@Override
	public void modifierTatouage(Tatouage t) 
	{
		Tatouage tatouage = (Tatouage)em.find(Tatouage.class, t.getId_tatouage());

		if (tatouage != null)
		{
			tatouage.setLabel(t.getLabel());
			em.persist(tatouage);
		}
	}

	@Override
	public void supprimerTatouage(int id) 
	{
		Tatouage tatouage = (Tatouage)em.find(Tatouage.class, id);
		
		if (tatouage != null)
		{
			em.remove(tatouage);
		}
	}

	@Override
	public List<Tatouage> getTatouages() 
	{
		return (List<Tatouage>)em.createQuery("from Tatouage").getResultList();
	}

}
