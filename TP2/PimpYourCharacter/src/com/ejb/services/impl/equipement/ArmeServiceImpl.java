package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.ArmeService;
import com.jpa.entities.equipement.Arme;

@Stateless
public class ArmeServiceImpl implements ArmeService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterArme(Arme a) 
	{
		em.persist(a);
	}

	@Override
	public void modifierArme(Arme a) 
	{
		Arme arme = (Arme)em.find(Arme.class, a.getId_arme());

		if (arme != null)
		{
			arme.setLabel(a.getLabel());
			arme.setPoids(a.getPoids());
			arme.setCategorieArme(a.getCategorieArme());
			
			em.persist(arme);
		}
	}

	@Override
	public void supprimerArme(int id)
	{
		Arme arme = (Arme)em.find(Arme.class, id);
		
		if (arme != null)
		{
			em.remove(arme);
		}
	}

	@Override
	public List<Arme> getArmes() 
	{
		return (List<Arme>)em.createQuery("from Arme").getResultList();
	}

}
