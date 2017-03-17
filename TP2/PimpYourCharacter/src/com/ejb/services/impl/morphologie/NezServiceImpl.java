package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.NezService;
import com.jpa.entities.morphologie.Nez;

@Stateless
public class NezServiceImpl implements NezService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterNez(Nez n) 
	{
		em.persist(n);
	}

	@Override
	public void modifierNez(Nez n) 
	{
		Nez nez = (Nez)em.find(Nez.class, n.getId_nez());

		if (nez != null)
		{
			nez.setForme(n.getForme());
			nez.setHauteur(n.getHauteur());
			nez.setLargeur(n.getLargeur());
			nez.setProfondeur(n.getProfondeur());
		
			em.persist(nez);
		}
	}

	@Override
	public void supprimerNez(int id) 
	{
		Nez nez = (Nez)em.find(Nez.class, id);
		
		if (nez != null)
		{
			em.remove(nez);
		}
	}

	@Override
	public List<Nez> getListNez() 
	{
		return (List<Nez>)em.createQuery("from Nez").getResultList();
	}
	
	@Override
	public List<Nez> getNez(String id, String forme, String largeur, String hauteur, String profondeur) {
		String query = null;

		if (id.compareToIgnoreCase("0") != 0) {
			query = "from Nez where id_nez="+id;
		}
		if (forme==null) {
			if (query == null) {
				query = "from Nez where forme="+"'"+forme+"'";
			} else {
				query+=" and forme="+"'"+forme+"'";
			}
		}
		if (largeur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Nez where largeur="+largeur;
			} else {
				query+=" and largeur="+largeur;
			}
		}
		if (hauteur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Nez where hauteur="+hauteur;
			} else {
				query+=" and hauteur="+hauteur;
			}
		}
		if (profondeur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Nez where profondeur="+profondeur;
			} else {
				query+=" and profondeur="+profondeur;
			}
		}

		if (query == null) {
			return null;
		} else {
			return (List<Nez>)em.createQuery(query).getResultList();
		}
	}

	@Override
	public List<Nez> getSearchNez(String research) {
		// TODO Auto-generated method stub
		return null;
	}
}
