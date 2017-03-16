package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.BusteService;
import com.jpa.entities.morphologie.Buste;

@Stateless
public class BusteServiceImpl implements BusteService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterBuste(Buste b) 
	{
		em.persist(b);
	}

	@Override
	public void modifierBuste(Buste b) 
	{
		Buste buste = (Buste)em.find(Buste.class, b.getId_buste());

		if (buste != null)
		{
			buste.setCorpulence(b.getCorpulence());
			buste.setHauteur(b.getHauteur());
			buste.setLargeur(b.getLargeur());
			
			em.persist(buste);
		}
	}

	@Override
	public void supprimerBuste(int id) 
	{
		Buste buste = (Buste)em.find(Buste.class, id);
		
		if (buste != null)
		{
			em.remove(buste);
		}
	}

	@Override
	public List<Buste> getBustes() 
	{
		return (List<Buste>)em.createQuery("from Buste").getResultList();
	}
	
	public List<Buste> getSearchBustes(String research) {
		return (List<Buste>)em.createQuery(research).getResultList();
	}

}
