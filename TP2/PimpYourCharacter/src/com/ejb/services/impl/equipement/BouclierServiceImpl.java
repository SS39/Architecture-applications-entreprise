package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.BouclierService;
import com.jpa.entities.equipement.Bouclier;

@Stateless
public class BouclierServiceImpl implements BouclierService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterBouclier(Bouclier b) 
	{
		em.persist(b);
	}

	@Override
	public void modifierBouclier(Bouclier b) 
	{
		Bouclier bouclier = (Bouclier)em.find(Bouclier.class, b.getId_bouclier());

		if (bouclier != null)
		{
			bouclier.setLabel(b.getLabel());
			bouclier.setPoids(b.getPoids());
			
			em.persist(bouclier);
		}
	}

	@Override
	public void supprimerBouclier(int id) 
	{
		Bouclier bouclier = (Bouclier)em.find(Bouclier.class, id);
		
		if (bouclier != null)
		{
			em.remove(bouclier);
		}
	}

	@Override
	public List<Bouclier> getBoucliers() 
	{
		return (List<Bouclier>)em.createQuery("from Bouclier").getResultList();
	}

}
