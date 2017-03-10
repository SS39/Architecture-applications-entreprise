package com.ejb.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.CouleurService;
import com.jpa.entities.Couleur;

@Stateless
public class CouleurServiceImpl implements CouleurService{

	@PersistenceContext(name = "Pimp")
	private EntityManager em;
	
	@Override
	public void ajouterCouleur(Couleur cou){
		em.persist(cou);
	}
}