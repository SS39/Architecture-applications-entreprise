package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.VpiedService;
import com.jpa.entities.Couleur;
import com.jpa.entities.Texture;
import com.jpa.entities.equipement.Vpied;

@Stateless
public class VpiedServiceImpl implements VpiedService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterVpied(Vpied vp)
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, vp.getCouleur().getId_couleur());
		if (couleur != null)
		{
			Texture texture = (Texture)em.find(Texture.class, vp.getTexture().getId_texture());
			if (texture != null)
			{
				vp.setCouleur(couleur);
				vp.setTexture(texture);
				em.persist(vp);
			}
		}
	}

	@Override
	public void modifierVpied(Vpied vp) 
	{
		Vpied vpied = (Vpied)em.find(Vpied.class, vp.getId_vpied());
		if (vpied != null)
		{
			Couleur couleur = (Couleur)em.find(Couleur.class, vp.getCouleur().getId_couleur());
			if (couleur != null)
			{
				Texture texture = (Texture)em.find(Texture.class, vp.getTexture().getId_texture());
				if (texture != null)
				{
					vpied.setCouleur(couleur);
					vpied.setTexture(texture);
					vpied.setLabel(vp.getLabel());
					vpied.setPoids(vp.getPoids());
			
					em.persist(vpied);
				}
			}
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
