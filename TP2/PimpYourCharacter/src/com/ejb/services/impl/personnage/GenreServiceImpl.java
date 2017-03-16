package com.ejb.services.impl.personnage;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.personnage.GenreService;
import com.jpa.entities.personnage.Genre;

@Stateless
public class GenreServiceImpl implements GenreService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterGenre(Genre g) 
	{
		em.persist(g);
	}

	@Override
	public void modifierGenre(Genre g) 
	{
		Genre genre = (Genre)em.find(Genre.class, g.getId_genre());

		if (genre != null)
		{
			genre.setLabel(g.getLabel());
			em.persist(genre);
		}
	}

	@Override
	public void supprimerGenre(int id) 
	{
		Genre genre = (Genre)em.find(Genre.class, id);
		
		if (genre != null)
		{
			em.remove(genre);
		}
	}

	@Override
	public List<Genre> getGenres() 
	{
		return (List<Genre>)em.createQuery("from Genre").getResultList();
	}

}
