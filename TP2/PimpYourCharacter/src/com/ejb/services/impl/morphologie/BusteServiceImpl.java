package com.ejb.services.impl.morphologie;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.morphologie.BusteService;
import com.jpa.entities.morphologie.Buste;

@Stateless
public class BusteServiceImpl implements BusteService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterBuste(Buste b) 
	{
		em.persist(b);
	}

	@Override
	public void modifierBuste(Buste b) 
	{
		Buste buste = (Buste)em.find(Buste.class, b.getId_buste());

		if (buste != null)
		{
			buste.setCorpulence(b.getCorpulence());
			buste.setHauteur(b.getHauteur());
			buste.setLargeur(b.getLargeur());
			
			em.persist(buste);
		}
	}

	@Override
	public void supprimerBuste(int id) 
	{
		Buste buste = (Buste)em.find(Buste.class, id);
		
		if (buste != null)
		{
			em.remove(buste);
		}
	}

	@Override
	public List<Buste> getBustes(String id, String largeur, String hauteur, String corpulence) {
		String query = null;

		if (id.compareToIgnoreCase("0") != 0) {
			query = "from Buste where id_buste="+id;
		}
		if (largeur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Buste where largeur="+largeur;
			} else {
				query+=" and largeur="+largeur;
			}
		}
		if (hauteur.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Buste where hauteur="+hauteur;
			} else {
				query+=" and hauteur="+hauteur;
			}
		}
		if (corpulence.compareToIgnoreCase("0") != 0) {
			if (query == null) {
				query = "from Buste where corpulence="+corpulence;
			} else {
				query+=" and corpulence="+corpulence;
			}
		}

		if (query == null) {
			return null;
		} else {
			return (List<Buste>)em.createQuery(query).getResultList();
		}
	}

	@Override
	public List<Buste> getBustes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Buste> getSearchBustes(String research) {
		// TODO Auto-generated method stub
		return null;
	}

}
