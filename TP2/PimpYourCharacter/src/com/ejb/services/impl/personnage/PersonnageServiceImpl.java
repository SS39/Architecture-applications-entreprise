package com.ejb.services.impl.personnage;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.personnage.PersonnageService;
import com.jpa.entities.personnage.Personnage;

@Stateless
public class PersonnageServiceImpl implements PersonnageService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterPersonnage(Personnage p) 
	{
		em.persist(p);
	}

	@Override
	public void modifierPersonnage(Personnage p) 
	{
		Personnage personnage = (Personnage)em.find(Personnage.class, p.getId_personnage());

		if (personnage != null)
		{
			personnage.setAge(p.getAge());
			personnage.setCorps(p.getCorps());
			personnage.setEthnie(p.getEthnie());
			personnage.setGenre(p.getGenre());
			personnage.setNom(p.getNom());
			personnage.setVbas(p.getVbas());
			personnage.setVhaut(p.getVhaut());
			
			em.persist(personnage);
		}
	}

	@Override
	public void supprimerPersonnage(int id) 
	{
		Personnage personnage = (Personnage)em.find(Personnage.class, id);
		
		if (personnage != null)
		{
			em.remove(personnage);
		}
	}

	@Override
	public List<Personnage> getPersonnages() 
	{
		return (List<Personnage>)em.createQuery("from Personnage").getResultList();
	}

}
