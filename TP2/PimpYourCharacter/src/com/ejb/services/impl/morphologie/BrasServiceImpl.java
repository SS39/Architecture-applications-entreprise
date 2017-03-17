package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.BrasService;
import com.jpa.entities.morphologie.Bras;

@Stateless
public class BrasServiceImpl implements BrasService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterBras(Bras b) 
	{
		em.persist(b);
	}

	@Override
	public void modifierBras(Bras b) 
	{
		Bras bras = (Bras)em.find(Bras.class, b.getId_bras());

		if (bras != null)
		{
			bras.setForme(b.getForme());
			bras.setLongueur(b.getLongueur());
			
			em.persist(bras);
		}
	}

	@Override
	public void supprimerBras(int id) 
	{
		Bras bras = (Bras)em.find(Bras.class, id);
		
		if (bras != null)
		{
			em.remove(bras);
		}
	}

	@Override
	public List<Bras> getBras(String id, String longueur, String forme) {
		String query = null;
		
		if (id.compareToIgnoreCase("0") != 0) {
			query = "from Bras where id_bras="+id;
		}
		if (forme == null) {
			if (query == null) {
				query = "from Bras where forme="+"'"+forme+"'";
			} else {
				query+=" and forme="+"'"+forme+"'";
			}
		}
		if (longueur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Bras where longueur="+longueur;
			} else {
				query+=" and longueur="+longueur;
			}
		}
		
		if (query == null) {
			return null;
		} else {
			return (List<Bras>)em.createQuery(query).getResultList();
		}
	}

	@Override
	public List<Bras> getListBras() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bras> getSearchBras(String research) {
		// TODO Auto-generated method stub
		return null;
	}

}
