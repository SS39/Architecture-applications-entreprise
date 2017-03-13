package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.CouleurService;
import com.jpa.entities.morphologie.Couleur;

@Stateless
public class CouleurServiceImpl implements CouleurService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterCouleur(Couleur c)
	{
		em.persist(c);
	}

	@Override
	public void modifierCouleur(Couleur c) 
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, c.getIdCouleur());

		if (couleur != null)
		{
			couleur.setLabel(c.getLabel());
			em.persist(couleur);
		}
	}

	@Override
	public void supprimerCouleur(int id) 
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, id);
		
		if (couleur != null)
		{
			em.remove(couleur);
		}
	}

	@Override
	public List<Couleur> getCouleurs() 
	{
		return (List<Couleur>)em.createQuery("from Couleur").getResultList();
	}

}
