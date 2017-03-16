package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.VbasService;
import com.jpa.entities.equipement.Vbas;

@Stateless
public class VbasServiceImpl implements VbasService{

	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterVbas(Vbas vb)
	{
		em.persist(vb);
	}

	@Override
	public void modifierVbas(Vbas vb) 
	{
		Vbas vbas = (Vbas)em.find(Vbas.class, vb.getIdVbas());

		if (vbas != null)
		{
			vbas.setLabel(vb.getLabel());
			vbas.setCouleur(vb.getCouleur());
			vbas.setTexture(vb.getTexture());
			vbas.setPoids(vb.getPoids());
	
			em.persist(vbas);
		}
	}

	@Override
	public void supprimerVbas(int id) 
	{
		Vbas vbas = (Vbas)em.find(Vbas.class, id);
		
		if (vbas != null)
		{
			em.remove(vbas);
		}
	}

	@Override
	public List<Vbas> getVbass() 
	{
		return (List<Vbas>)em.createQuery("from Vbas").getResultList();
	}
}
