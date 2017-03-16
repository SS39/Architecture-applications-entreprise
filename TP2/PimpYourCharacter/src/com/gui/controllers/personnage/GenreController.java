package com.gui.controllers.personnage;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.personnage.GenreService;
import com.jpa.entities.personnage.Genre;

@ManagedBean
public class GenreController 
{
	private Genre genre = new Genre();
	
	@EJB
	private GenreService service;
	
	public Genre getGenre()
	{
		return genre;
	}
	
	public void setGenre(Genre g)
	{
		this.genre = g;
	}
	
	public void ajouterGenre(Genre g)
	{
		service.ajouterGenre(g);
	}
	
	public void modifierGenre(Genre g)
	{
		service.modifierGenre(g);
	}
	
	public void supprimerGenre(int idGenre)
	{				
		service.supprimerGenre(idGenre);
	}
	
	public List<Genre> getGenres()
	{
		return service.getGenres();
	}
}
