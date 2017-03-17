package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.YeuxService;
import com.jpa.entities.Couleur;
import com.jpa.entities.morphologie.Yeux;

@Stateless
public class YeuxServiceImpl implements YeuxService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterYeux(Yeux y) 
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, y.getCouleur().getId_couleur());
		if (couleur != null)
		{
			y.setCouleur(couleur);
			em.persist(y);
		}
	}

	@Override
	public void modifierYeux(Yeux y) 
	{
		Yeux yeux = (Yeux)em.find(Yeux.class, y.getId_yeux());
		if (yeux != null)
		{
			Couleur couleur = (Couleur)em.find(Couleur.class, y.getCouleur().getId_couleur());
			if (couleur != null)
			{
				yeux.setForme(y.getForme());
				yeux.setHauteur(y.getHauteur());
				yeux.setLargeur(y.getLargeur());
				yeux.setProfondeur(y.getProfondeur());
				yeux.setEcartement(y.getEcartement());
				yeux.setCouleur(couleur);
			
				em.persist(yeux);
			}
		}
	}

	@Override
	public void supprimerYeux(int id) 
	{
		Yeux yeux = (Yeux)em.find(Yeux.class, id);
		
		if (yeux != null)
		{
			em.remove(yeux);
		}
	}

	@Override
	public List<Yeux> getListYeux() 
	{
		return (List<Yeux>)em.createQuery("from Yeux").getResultList();
	}

	@Override
	public List<Yeux> getYeux(String id, String forme, String hauteur, String largeur, String profondeur,
			String ecartement, String couleur) {
		String query = null;

		if (id.compareToIgnoreCase("0") != 0) {
			query = "from Yeux where id_yeux="+id;
		}
		if (forme==null) {
			if (query == null) {
				query = "from Yeux where forme="+"'"+forme+"'";
			} else {
				query+=" and forme="+"'"+forme+"'";
			}
		}
		if (largeur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Yeux where largeur="+largeur;
			} else {
				query+=" and largeur="+largeur;
			}
		}
		if (hauteur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Yeux where hauteur="+hauteur;
			} else {
				query+=" and hauteur="+hauteur;
			}
		}
		if (profondeur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Yeux where id_profondeur="+profondeur;
			} else {
				query+=" and id_profondeur="+profondeur;
			}
		}
		if (ecartement.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Yeux where ecartement="+ecartement;
			} else {
				query+=" and ecartement="+ecartement;
			}
		}
		if (couleur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Yeux where id_couleur="+couleur;
			} else {
				query+=" and id_couleur="+couleur;
			}
		}

		if (query == null) {
			return null;
		} else {
			return (List<Yeux>)em.createQuery(query).getResultList();
		}
	}

	@Override
	public List<Yeux> getSearchYeux(String research) {
		// TODO Auto-generated method stub
		return null;
	}

}
