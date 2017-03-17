package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.JambesService;
import com.jpa.entities.morphologie.Jambes;

@Stateless
public class JambesServiceImpl implements JambesService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterJambes(Jambes j) 
	{
		em.persist(j);
	}

	@Override
	public void modifierJambes(Jambes j) 
	{
		Jambes jambes = (Jambes)em.find(Jambes.class, j.getId_jambe());

		if (jambes != null)
		{
			jambes.setForme(j.getForme());
			jambes.setHauteur(j.getHauteur());
			
			em.persist(jambes);
		}
	}

	@Override
	public void supprimerJambes(int id) 
	{
		Jambes jambes = (Jambes)em.find(Jambes.class, id);
		
		if (jambes != null)
		{
			em.remove(jambes);
		}
	}

	@Override
	public List<Jambes> getListJambes() 
	{
		return (List<Jambes>)em.createQuery("from Jambes").getResultList();
	}
	

	@Override
	public List<Jambes> getJambes(String id, String hauteur, String forme) {
		String query = null;

		if (id.compareToIgnoreCase("0") != 0) {
			query = "from Jambes where id_jambe="+id;
		}
		if (hauteur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Jambes where hauteur="+hauteur;
			} else {
				query+=" and hauteur="+hauteur;
			}
		}
		if (forme==null) {
			if (query == null) {
				query = "from Jambes where forme="+"'"+forme+"'";
			} else {
				query+=" and forme="+"'"+forme+"'";
			}
		}

		if (query == null) {
			return null;
		} else {
			return (List<Jambes>)em.createQuery(query).getResultList();
		}
	}

	@Override
	public List<Jambes> getSearchJambes(String research) {
		// TODO Auto-generated method stub
		return null;
	}
}