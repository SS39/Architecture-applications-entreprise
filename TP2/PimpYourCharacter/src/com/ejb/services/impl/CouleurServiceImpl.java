package com.ejb.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.CouleurService;
import com.jpa.entities.Couleur;

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
		Couleur couleur = (Couleur)em.find(Couleur.class, c.getId_couleur());

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
	
	public List<Couleur> getCouleurs(String id, String label) {
		
		String query = null;
		System.out.println("Le label est : "+label);
		
		if (id.compareToIgnoreCase("0") != 0) {
			query = "from Couleur where id_couleur="+id;
			if (label.compareToIgnoreCase("") != 0) {
				 query +=" and label="+"'"+label+"'";
			}
		} else if (label != null) {
			query = "from Couleur where label="+"'"+label+"'";	
		}
		System.out.println("La query est : "+query);
		if (query == null) {
			return new ArrayList<Couleur>();
		} else {
			return (List<Couleur>)em.createQuery(query).getResultList();
		}		
	}

	@Override
	public List<Couleur> getSearchCouleurs(String research) {
		// TODO Auto-generated method stub
		return null;
	}

}
