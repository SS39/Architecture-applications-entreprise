package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.BoucheService;
import com.jpa.entities.Couleur;
import com.jpa.entities.morphologie.Bouche;

@Stateless
public class BoucheServiceImpl implements BoucheService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterBouche(Bouche b)
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, b.getCouleur().getId_couleur());
		if (couleur != null)
		{
			b.setCouleur(couleur);
			em.persist(b);
		}
	}

	@Override
	public void modifierBouche(Bouche b) 
	{
		Bouche bouche = (Bouche)em.find(Bouche.class, b.getId_bouche());

		if (bouche != null)
		{
			Couleur couleur = (Couleur)em.find(Couleur.class, b.getCouleur().getId_couleur());
			if (couleur != null)
			{
				bouche.setCouleur(couleur);
				bouche.setForme(b.getForme());
				bouche.setHauteur(b.getHauteur());
				bouche.setProfondeur(b.getProfondeur());
				bouche.setLargeur(b.getLargeur());
		
				em.persist(bouche);
			}
		}
	}

	@Override
	public void supprimerBouche(int id) 
	{
		Bouche bouche = (Bouche)em.find(Bouche.class, id);
		
		if (bouche != null)
		{
			em.remove(bouche);
		}
	}

	@Override
	public List<Bouche> getBouches() 
	{
		return (List<Bouche>)em.createQuery("from Bouche").getResultList();
	}

	@Override
	public List<Bouche> getBouches(String id, String forme, String largeur, String hauteur, String profondeur, String couleur) {
		String query = null;
		
		if (id.compareToIgnoreCase("0") != 0) {
			query = "from Bouche where id_bouche="+id;
		}
		if (forme == null) {
			if (query == null) {
				query = "from Bouche where forme="+"'"+forme+"'";
			} else {
				query+=" and forme="+"'"+forme+"'";
			}
		}
		if (largeur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Bouche where largeur="+largeur;
			} else {
				query+=" and largeur="+largeur;
			}
		}
		if (hauteur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Bouche where hauteur="+hauteur;
			} else {
				query+=" and hauteur="+hauteur;
			}
		}
		if (profondeur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Bouche where profondeur="+profondeur;
			} else {
				query+=" and profondeur="+profondeur;
			}
		}
		if (couleur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Bouche where id_couleur="+couleur;
			} else {
				query+=" and id_couleur="+couleur;
			}
		}
		
		if (query == null) {
			return null;
		} else {
			return (List<Bouche>)em.createQuery(query).getResultList();
		}
	}

	@Override
	public List<Bouche> getSearchBouches(String research) {
		// TODO Auto-generated method stub
		return null;
	}
}
