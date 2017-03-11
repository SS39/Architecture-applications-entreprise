package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.BoucheService;
import com.jpa.entities.morphologie.Bouche;

@Stateless
public class BoucheServiceImpl implements BoucheService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterBouche(Bouche b)
	{
		em.persist(b);
	}

	@Override
	public void modifierBouche(Bouche b) 
	{
		Bouche bouche = (Bouche)em.find(Bouche.class, b.getIdBouche());

		bouche.setCouleur(b.getCouleur());
		bouche.setForme(b.getForme());
		bouche.setHauteur(b.getHauteur());
		bouche.setProfondeur(b.getProfondeur());
		bouche.setLargeur(b.getLargeur());

		em.persist(bouche);
	}

	@Override
	public void supprimerBouche(int id) 
	{
		Bouche bouche = (Bouche)em.find(Bouche.class, id);
		
		if (bouche != null)
		{
			em.remove(bouche);
		}
	}

	@Override
	public List<Bouche> getBouches() 
	{
		return (List<Bouche>)em.createQuery("from Bouche").getResultList();
	}

}
