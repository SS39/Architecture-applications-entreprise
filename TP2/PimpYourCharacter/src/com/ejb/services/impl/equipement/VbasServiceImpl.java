package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.VbasService;
import com.jpa.entities.Couleur;
import com.jpa.entities.Texture;
import com.jpa.entities.equipement.Vbas;

@Stateless
public class VbasServiceImpl implements VbasService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterVbas(Vbas vb)
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, vb.getCouleur().getId_couleur());
		if (couleur != null)
		{
			Texture texture = (Texture)em.find(Texture.class, vb.getTexture().getId_texture());
			if (texture != null)
			{
				vb.setCouleur(couleur);
				vb.setTexture(texture);
				em.persist(vb);
			}
		}
	}

	@Override
	public void modifierVbas(Vbas vb) 
	{
		Vbas vbas = (Vbas)em.find(Vbas.class, vb.getId_vbas());
		if (vbas != null)
		{
			Couleur couleur = (Couleur)em.find(Couleur.class, vb.getCouleur().getId_couleur());
			if (couleur != null)
			{
				Texture texture = (Texture)em.find(Texture.class, vb.getTexture().getId_texture());
				if (texture != null)
				{
					vbas.setLabel(vb.getLabel());
					vbas.setCouleur(couleur);
					vbas.setTexture(texture);
					vbas.setPoids(vb.getPoids());
			
					em.persist(vbas);
				}
			}
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
	public List<Vbas> getListVbas() 
	{
		return (List<Vbas>)em.createQuery("from Vbas").getResultList();
	}
}
