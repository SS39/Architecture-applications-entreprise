package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.VteteService;
import com.jpa.entities.equipement.Vtete;

@Stateless
public class VteteServiceImpl implements VteteService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterVtete(Vtete vt)
	{
		em.persist(vt);
	}

	@Override
	public void modifierVtete(Vtete vt) 
	{
		Vtete vtete = (Vtete)em.find(Vtete.class, vt.getId_vtete());

		if (vtete != null)
		{
			vtete.setLabel(vt.getLabel());
			vtete.setCouleur(vt.getCouleur());
			vtete.setTexture(vt.getTexture());
			vtete.setPoids(vt.getPoids());
	
			em.persist(vtete);
		}
	}

	@Override
	public void supprimerVtete(int id) 
	{
		Vtete vtete = (Vtete)em.find(Vtete.class, id);
		
		if (vtete != null)
		{
			em.remove(vtete);
		}
	}

	@Override
	public List<Vtete> getVtetes() 
	{
		return (List<Vtete>)em.createQuery("from Vtete").getResultList();
	}
}
