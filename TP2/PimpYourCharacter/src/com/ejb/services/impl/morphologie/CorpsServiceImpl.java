package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.CorpsService;
import com.jpa.entities.morphologie.Corps;
import com.jpa.entities.morphologie.Tete;

@Stateless
public class CorpsServiceImpl implements CorpsService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterCorps(Corps c) 
	{
		em.persist(c);
	}

	@Override
	public void modifierCorps(Corps c) 
	{
		Corps corps = (Corps)em.find(Corps.class, c.getId_corps());

		if (corps != null)
		{
			corps.setBras(c.getBras());
			corps.setBuste(c.getBuste());
			corps.setJambes(c.getJambes());
			corps.setTaille(c.getTaille());
			corps.setTete(c.getTete());
	
			em.persist(corps);
		}
	}

	@Override
	public void supprimerCorps(int id) 
	{
		Corps corps = (Corps)em.find(Corps.class, id);
		
		if (corps != null)
		{
			em.remove(corps);
		}
	}

	@Override
	public List<Corps> getListCorps() 
	{
		return (List<Corps>)em.createQuery("from Corps").getResultList();
	}
	
	public List<Corps> getSearchCorps(String research) {
		return (List<Corps>)em.createQuery(research).getResultList();
	}
}
