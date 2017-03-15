package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.JambesService;
import com.jpa.entities.morphologie.Jambes;

@Stateless
public class JambesServiceImpl implements JambesService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterJambes(Jambes j) 
	{
		em.persist(j);
	}

	@Override
	public void modifierJambes(Jambes j) 
	{
		Jambes jambes = (Jambes)em.find(Jambes.class, j.getIdJambes());

		if (jambes != null)
		{
			jambes.setForme(j.getForme());
			jambes.setHauteur(j.getHauteur());
			
			em.persist(jambes);
		}
	}

	@Override
	public void supprimerJambes(int id) 
	{
		Jambes jambes = (Jambes)em.find(Jambes.class, id);
		
		if (jambes != null)
		{
			em.remove(jambes);
		}
	}

	@Override
	public List<Jambes> getListJambes() 
	{
		return (List<Jambes>)em.createQuery("from Jambes").getResultList();
	}
}
