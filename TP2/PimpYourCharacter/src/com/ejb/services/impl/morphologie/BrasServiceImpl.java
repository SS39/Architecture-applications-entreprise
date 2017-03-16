package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.BrasService;
import com.jpa.entities.morphologie.Bras;

@Stateless
public class BrasServiceImpl implements BrasService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterBras(Bras b) 
	{
		em.persist(b);
	}

	@Override
	public void modifierBras(Bras b) 
	{
		Bras bras = (Bras)em.find(Bras.class, b.getId_bras());

		if (bras != null)
		{
			bras.setForme(b.getForme());
			bras.setLongueur(b.getLongueur());
			
			em.persist(bras);
		}
	}

	@Override
	public void supprimerBras(int id) 
	{
		Bras bras = (Bras)em.find(Bras.class, id);
		
		if (bras != null)
		{
			em.remove(bras);
		}
	}

	@Override
	public List<Bras> getListBras() 
	{
		return (List<Bras>)em.createQuery("from Bras").getResultList();
	}
	
	public List<Bras> getSearchBras(String research) {
		return (List<Bras>)em.createQuery(research).getResultList();
	}

}
