package com.ejb.services.impl.personnage;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.personnage.PersonnageService;
import com.jpa.entities.equipement.Vbas;
import com.jpa.entities.equipement.Vhaut;
import com.jpa.entities.morphologie.Corps;
import com.jpa.entities.personnage.Ethnie;
import com.jpa.entities.personnage.Genre;
import com.jpa.entities.personnage.Personnage;

@Stateless
public class PersonnageServiceImpl implements PersonnageService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterPersonnage(Personnage p) 
	{
		Corps corps = (Corps)em.find(Corps.class, p.getCorps().getId_corps());
		if (corps != null)
		{
			Ethnie ethnie = (Ethnie)em.find(Ethnie.class, p.getEthnie().getId_ethnie());
			if (ethnie != null)
			{
				Genre genre = (Genre)em.find(Genre.class, p.getGenre().getId_genre());
				if (genre != null)
				{
					Vbas vbas = (Vbas)em.find(Vbas.class, p.getVbas().getId_vbas());
					if (vbas != null)
					{
						Vhaut vhaut = (Vhaut)em.find(Vhaut.class, p.getVhaut().getId_vhaut());
						if (vhaut != null)
						{
							p.setCorps(corps);
							p.setEthnie(ethnie);
							p.setGenre(genre);
							p.setVbas(vbas);
							p.setVhaut(vhaut);
							em.persist(p);
						}
					}
				}
			}
		}
	}

	@Override
	public void modifierPersonnage(Personnage p) 
	{
		Personnage personnage = (Personnage)em.find(Personnage.class, p.getId_personnage());
		if (personnage != null)
		{
			Corps corps = (Corps)em.find(Corps.class, p.getCorps().getId_corps());
			if (corps != null)
			{
				Ethnie ethnie = (Ethnie)em.find(Ethnie.class, p.getEthnie().getId_ethnie());
				if (ethnie != null)
				{
					Genre genre = (Genre)em.find(Genre.class, p.getGenre().getId_genre());
					if (genre != null)
					{
						Vbas vbas = (Vbas)em.find(Vbas.class, p.getVbas().getId_vbas());
						if (vbas != null)
						{
							Vhaut vhaut = (Vhaut)em.find(Vhaut.class, p.getVhaut().getId_vhaut());
							if (vhaut != null)
							{
								personnage.setAge(p.getAge());
								personnage.setCorps(corps);
								personnage.setEthnie(ethnie);
								personnage.setGenre(genre);
								personnage.setNom(p.getNom());
								personnage.setVbas(vbas);
								personnage.setVhaut(vhaut);
								
								em.persist(personnage);
							}
						}
					}
				}
			}
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
