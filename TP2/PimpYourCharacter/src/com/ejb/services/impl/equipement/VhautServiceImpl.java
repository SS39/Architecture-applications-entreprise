package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.VhautService;
import com.jpa.entities.equipement.Vhaut;

@Stateless
public class VhautServiceImpl implements VhautService{

	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterVhaut(Vhaut vh)
	{
		em.persist(vh);
	}

	@Override
	public void modifierVhaut(Vhaut vh) 
	{
		Vhaut vhaut = (Vhaut)em.find(Vhaut.class, vh.getIdVhaut());

		if (vhaut != null)
		{
			vhaut.setLabel(vh.getLabel());
			vhaut.setCouleur(vh.getCouleur());
			vhaut.setTexture(vh.getTexture());
			vhaut.setPoids(vh.getPoids());
	
			em.persist(vhaut);
		}
	}

	@Override
	public void supprimerVhaut(int id) 
	{
		Vhaut vhaut = (Vhaut)em.find(Vhaut.class, id);
		
		if (vhaut != null)
		{
			em.remove(vhaut);
		}
	}

	@Override
	public List<Vhaut> getVhauts() 
	{
		return (List<Vhaut>)em.createQuery("from Vhaut").getResultList();
	}
}
