package com.ejb.services.impl.personnage;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.personnage.EthnieService;
import com.jpa.entities.personnage.Ethnie;

@Stateless
public class EthnieServiceImpl implements EthnieService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterEthnie(Ethnie e) 
	{
		em.persist(e);
	}

	@Override
	public void modifierEthnie(Ethnie e) 
	{
		Ethnie ethnie = (Ethnie)em.find(Ethnie.class, e.getId_ethnie());

		if (ethnie != null)
		{
			ethnie.setLabel(e.getLabel());
			em.persist(ethnie);
		}
	}

	@Override
	public void supprimerEthnie(int id) 
	{
		Ethnie ethnie = (Ethnie)em.find(Ethnie.class, id);
		
		if (ethnie != null)
		{
			em.remove(ethnie);
		}
	}

	@Override
	public List<Ethnie> getEthnies() 
	{
		return (List<Ethnie>)em.createQuery("from Ethnie").getResultList();
	}

}
