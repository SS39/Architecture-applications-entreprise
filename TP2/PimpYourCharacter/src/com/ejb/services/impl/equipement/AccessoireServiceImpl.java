package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.AccessoireService;
import com.jpa.entities.equipement.Accessoire;
import com.jpa.entities.equipement.CategorieAccessoire;

@Stateless
public class AccessoireServiceImpl implements AccessoireService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterAccessoire(Accessoire a) 
	{
		CategorieAccessoire ca = (CategorieAccessoire)em.find(CategorieAccessoire.class, a.getCategorieAccessoire().getId_categorie_accessoire());
		if (ca != null)
		{
			a.setCategorieAccessoire(ca);
			em.persist(a);
		}
	}

	@Override
	public void modifierAccessoire(Accessoire a) 
	{
		Accessoire accessoire = (Accessoire)em.find(Accessoire.class, a.getId_accessoire());
		if (accessoire != null)
		{
			CategorieAccessoire ca = (CategorieAccessoire)em.find(CategorieAccessoire.class, a.getCategorieAccessoire().getId_categorie_accessoire());
			if (ca != null)
			{
				accessoire.setLabel(a.getLabel());
				accessoire.setCategorieAccessoire(ca);
				
				em.persist(accessoire);
			}
		}
	}

	@Override
	public void supprimerAccessoire(int id) 
	{
		Accessoire accessoire = (Accessoire)em.find(Accessoire.class, id);
		
		if (accessoire != null)
		{
			em.remove(accessoire);
		}
	}

	@Override
	public List<Accessoire> getAccessoires() 
	{
		return (List<Accessoire>)em.createQuery("from Accessoire").getResultList();
	}

}
