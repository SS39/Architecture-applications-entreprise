package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.NezService;
import com.jpa.entities.morphologie.Nez;

@Stateless
public class NezServiceImpl implements NezService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterNez(Nez n) 
	{
		em.persist(n);
	}

	@Override
	public void modifierNez(Nez n) 
	{
		Nez nez = (Nez)em.find(Nez.class, n.getId_nez());

		if (nez != null)
		{
			nez.setForme(n.getForme());
			nez.setHauteur(n.getHauteur());
			nez.setLargeur(n.getLargeur());
			nez.setProfondeur(n.getProfondeur());
		
			em.persist(nez);
		}
	}

	@Override
	public void supprimerNez(int id) 
	{
		Nez nez = (Nez)em.find(Nez.class, id);
		
		if (nez != null)
		{
			em.remove(nez);
		}
	}

	@Override
	public List<Nez> getListNez() 
	{
		return (List<Nez>)em.createQuery("from Nez").getResultList();
	}
}
