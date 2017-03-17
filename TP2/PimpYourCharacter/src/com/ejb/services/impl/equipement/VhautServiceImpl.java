package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.VhautService;
import com.jpa.entities.Couleur;
import com.jpa.entities.Texture;
import com.jpa.entities.equipement.Vhaut;

@Stateless
public class VhautServiceImpl implements VhautService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterVhaut(Vhaut vh)
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, vh.getCouleur().getId_couleur());
		if (couleur != null)
		{
			Texture texture = (Texture)em.find(Texture.class, vh.getTexture().getId_texture());
			if (texture != null)
			{
				vh.setCouleur(couleur);
				vh.setTexture(texture);
				em.persist(vh);
			}
		}
	}

	@Override
	public void modifierVhaut(Vhaut vh) 
	{
		Vhaut vhaut = (Vhaut)em.find(Vhaut.class, vh.getId_vhaut());
		if (vhaut != null)
		{
			Couleur couleur = (Couleur)em.find(Couleur.class, vh.getCouleur().getId_couleur());
			if (couleur != null)
			{
				Texture texture = (Texture)em.find(Texture.class, vh.getTexture().getId_texture());
				if (texture != null)
				{
					vhaut.setCouleur(couleur);
					vhaut.setTexture(texture);
					vhaut.setLabel(vh.getLabel());
					vhaut.setPoids(vh.getPoids());
			
					em.persist(vhaut);
				}
			}
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
