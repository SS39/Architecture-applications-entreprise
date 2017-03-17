package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.CorpsService;
import com.jpa.entities.morphologie.Bras;
import com.jpa.entities.morphologie.Buste;
import com.jpa.entities.morphologie.Corps;
import com.jpa.entities.morphologie.Jambes;
import com.jpa.entities.morphologie.Tete;

@Stateless
public class CorpsServiceImpl implements CorpsService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterCorps(Corps c) 
	{
		Bras bras = (Bras)em.find(Bras.class, c.getBras().getId_bras());
		if (bras != null)
		{
			Buste buste = (Buste)em.find(Buste.class, c.getBuste().getId_buste());
			if (buste != null)
			{
				Jambes jambes = (Jambes)em.find(Jambes.class, c.getJambes().getId_jambe());
				if (jambes != null)
				{
					c.setBras(bras);
					c.setBuste(buste);
					c.setJambes(jambes);
					
					em.persist(c);
				}
			}
		}
	}

	@Override
	public void modifierCorps(Corps c) 
	{
		Corps corps = (Corps)em.find(Corps.class, c.getId_corps());
		if (corps != null)
		{
			Bras bras = (Bras)em.find(Bras.class, c.getBras().getId_bras());
			if (bras != null)
			{
				Buste buste = (Buste)em.find(Buste.class, c.getBuste().getId_buste());
				if (buste != null)
				{
					Jambes jambes = (Jambes)em.find(Jambes.class, c.getJambes().getId_jambe());
					if (jambes != null)
					{
						corps.setBras(bras);
						corps.setBuste(buste);
						corps.setJambes(jambes);
						corps.setTaille(c.getTaille());
						corps.setTete(c.getTete());
				
						em.persist(corps);
					}
				}
			}
		}
	}

	@Override
	public void supprimerCorps(int id) 
	{
		Corps corps = (Corps)em.find(Corps.class, id);
		
		if (corps != null)
		{
			em.remove(corps);
		}
	}

	@Override
	public List<Corps> getListCorps() 
	{
		return (List<Corps>)em.createQuery("from Corps").getResultList();
	}
	
	public List<Corps> getSearchCorps(String research) {
		return (List<Corps>)em.createQuery(research).getResultList();
	}

	@Override
	public List<Corps> getCorps(String id, String taille, String bras, String jambes, String buste, String tete) {
		// TODO Auto-generated method stub
		return null;
	}
}
