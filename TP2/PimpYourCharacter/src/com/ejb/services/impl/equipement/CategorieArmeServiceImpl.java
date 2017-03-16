package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.CategorieArmeService;
import com.jpa.entities.equipement.CategorieArme;

@Stateless
public class CategorieArmeServiceImpl implements CategorieArmeService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterCategorieArme(CategorieArme ca) 
	{
		em.persist(ca);
	}

	@Override
	public void modifierCategorieArme(CategorieArme ca) 
	{
		CategorieArme categorieArme = (CategorieArme)em.find(CategorieArme.class, ca.getId_categorie_arme());

		if (categorieArme != null)
		{
			categorieArme.setCategorieArme(ca.getCategorieArme());
			
			em.persist(categorieArme);
		}
	}

	@Override
	public void supprimerCategorieArme(int id) 
	{
		CategorieArme categorieArme = (CategorieArme)em.find(CategorieArme.class, id);
		
		if (categorieArme != null)
		{
			em.remove(categorieArme);
		}
	}

	@Override
	public List<CategorieArme> getCategorieArmes() 
	{
		return (List<CategorieArme>)em.createQuery("from CategorieArme").getResultList();
	}

}
