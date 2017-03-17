package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.TeteService;
import com.jpa.entities.morphologie.Bouche;
import com.jpa.entities.morphologie.Nez;
import com.jpa.entities.morphologie.Tete;
import com.jpa.entities.morphologie.Yeux;

@Stateless
public class TeteServiceImpl implements TeteService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterTete(Tete t)
	{
		Bouche bouche = (Bouche)em.find(Bouche.class, t.getBouche().getId_bouche());
		if (bouche != null)
		{
			Nez nez = (Nez)em.find(Nez.class, t.getNez().getId_nez());
			if (nez != null)
			{
				Yeux yeux = (Yeux)em.find(Yeux.class, t.getYeux().getId_yeux());
				if (yeux != null)
				{
					t.setBouche(bouche);
					t.setNez(nez);
					t.setYeux(yeux);
					em.persist(t);
				}
			}
		}
	}

	@Override
	public void modifierTete(Tete t) 
	{
		Tete tete = (Tete)em.find(Tete.class, t.getId_tete());
		if (tete != null)
		{
			Bouche bouche = (Bouche)em.find(Bouche.class, t.getBouche().getId_bouche());
			if (bouche != null)
			{
				Nez nez = (Nez)em.find(Nez.class, t.getNez().getId_nez());
				if (nez != null)
				{
					Yeux yeux = (Yeux)em.find(Yeux.class, t.getYeux().getId_yeux());
					if (yeux != null)
					{
						tete.setBouche(bouche);
						tete.setForme(t.getForme());
						tete.setHauteur(t.getHauteur());
						tete.setLargeur(t.getLargeur());
						tete.setNez(nez);
						tete.setYeux(yeux);
				
						em.persist(tete);
					}
				}
			}
		}
	}

	@Override
	public void supprimerTete(int id) 
	{
		Tete tete = (Tete)em.find(Tete.class, id);
		
		if (tete != null)
		{
			em.remove(tete);
		}
	}

	@Override
	public List<Tete> getTetes() 
	{
		return (List<Tete>)em.createQuery("from Tete").getResultList();
	}
	
	public List<Tete> getSearchTetes(String research) {
		return (List<Tete>)em.createQuery(research).getResultList();
	}

	@Override
	public List<Tete> getTetes(String id, String forme, String largeur, String hauteur, String nez, String bouche,
			String yeux) {
		String query = null;

		if (id.compareToIgnoreCase("0") != 0) {
			query = "from Tete where id_tete="+id;
		}
		if (forme==null) {
			if (query == null) {
				query = "from Tete where forme="+"'"+forme+"'";
			} else {
				query+=" and forme="+"'"+forme+"'";
			}
		}
		if (largeur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Tete where largeur="+largeur;
			} else {
				query+=" and largeur="+largeur;
			}
		}
		if (hauteur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Tete where hauteur="+hauteur;
			} else {
				query+=" and hauteur="+hauteur;
			}
		}
		if (nez.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Tete where id_nez="+nez;
			} else {
				query+=" and id_nez="+nez;
			}
		}
		if (bouche.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Tete where id_bouche="+bouche;
			} else {
				query+=" and id_bouche="+bouche;
			}
		}
		if (yeux.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Tete where id_yeux="+yeux;
			} else {
				query+=" and id_yeux="+yeux;
			}
		}

		if (query == null) {
			return null;
		} else {
			return (List<Tete>)em.createQuery(query).getResultList();
		}
	}

}

	
