package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.CategorieAccessoireService;
import com.jpa.entities.equipement.CategorieAccessoire;

@Stateless
public class CategorieAccessoireServiceImpl implements CategorieAccessoireService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterCategorieAccessoire(CategorieAccessoire ca) 
	{
		em.persist(ca);
	}

	@Override
	public void modifierCategorieAccessoire(CategorieAccessoire ca) 
	{
		CategorieAccessoire categorieAccessoire = (CategorieAccessoire)em.find(CategorieAccessoire.class, ca.getId_categorie_accessoire());

		if (categorieAccessoire != null)
		{
			categorieAccessoire.setLabel(ca.getLabel());
			
			em.persist(categorieAccessoire);
		}
	}

	@Override
	public void supprimerCategorieAccessoire(int id) 
	{
		CategorieAccessoire categorieAccessoire = (CategorieAccessoire)em.find(CategorieAccessoire.class, id);
		
		if (categorieAccessoire != null)
		{
			em.remove(categorieAccessoire);
		}
	}

	@Override
	public List<CategorieAccessoire> getCategorieAccessoires() 
	{
		return (List<CategorieAccessoire>)em.createQuery("from CategorieAccessoire").getResultList();
	}

}
