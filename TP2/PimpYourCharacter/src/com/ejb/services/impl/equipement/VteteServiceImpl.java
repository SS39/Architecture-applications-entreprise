package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.VteteService;
import com.jpa.entities.Couleur;
import com.jpa.entities.Texture;
import com.jpa.entities.equipement.Vtete;

@Stateless
public class VteteServiceImpl implements VteteService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterVtete(Vtete vt)
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, vt.getCouleur().getId_couleur());
		if (couleur != null)
		{
			Texture texture = (Texture)em.find(Texture.class, vt.getTexture().getId_texture());
			if (texture != null)
			{
				vt.setCouleur(couleur);
				vt.setTexture(texture);
				em.persist(vt);
			}
		}
	}

	@Override
	public void modifierVtete(Vtete vt) 
	{
		Vtete vtete = (Vtete)em.find(Vtete.class, vt.getId_vtete());
		if (vtete != null)
		{
			Couleur couleur = (Couleur)em.find(Couleur.class, vt.getCouleur().getId_couleur());
			if (couleur != null)
			{
				Texture texture = (Texture)em.find(Texture.class, vt.getTexture().getId_texture());
				if (texture != null)
				{
					vtete.setCouleur(couleur);
					vtete.setTexture(texture);
					vtete.setLabel(vt.getLabel());
					vtete.setPoids(vt.getPoids());
			
					em.persist(vtete);
				}
			}
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
