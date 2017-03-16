package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.BoucheService;
import com.jpa.entities.Couleur;
import com.jpa.entities.morphologie.Bouche;

@Stateless
public class BoucheServiceImpl implements BoucheService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterBouche(Bouche b)
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, b.getCouleur().getId_couleur());
		
		b.setCouleur(couleur);
		
		em.persist(b);
	}

	@Override
	public void modifierBouche(Bouche b) 
	{
		Bouche bouche = (Bouche)em.find(Bouche.class, b.getId_bouche());

		if (bouche != null)
		{
			Couleur couleur = (Couleur)em.find(Couleur.class, b.getCouleur().getId_couleur());
			if (couleur != null)
			{
				bouche.setCouleur(couleur);
			}
			bouche.setForme(b.getForme());
			bouche.setHauteur(b.getHauteur());
			bouche.setProfondeur(b.getProfondeur());
			bouche.setLargeur(b.getLargeur());
	
			em.persist(bouche);
		}
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

	public List<Bouche> getSearchBouches(String research) {
		return (List<Bouche>)em.createQuery(research).getResultList();
	}
}
