package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.VpiedService;
import com.jpa.entities.equipement.Vpied;

@Stateless
public class VpiedServiceImpl implements VpiedService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterVpied(Vpied vp)
	{
		em.persist(vp);
	}

	@Override
	public void modifierVpied(Vpied vp) 
	{
		Vpied vpied = (Vpied)em.find(Vpied.class, vp.getId_vpied());

		if (vpied != null)
		{
			vpied.setLabel(vp.getLabel());
			vpied.setCouleur(vp.getCouleur());
			vpied.setTexture(vp.getTexture());
			vpied.setPoids(vp.getPoids());
	
			em.persist(vpied);
		}
	}

	@Override
	public void supprimerVpied(int id) 
	{
		Vpied vpied = (Vpied)em.find(Vpied.class, id);
		
		if (vpied != null)
		{
			em.remove(vpied);
		}
	}

	@Override
	public List<Vpied> getVpieds() 
	{
		return (List<Vpied>)em.createQuery("from Vpied").getResultList();
	}
}
