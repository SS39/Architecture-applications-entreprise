package com.ejb.services.personnage;

import java.util.List;

import com.jpa.entities.personnage.Genre;

public interface GenreService 
{
	public void ajouterGenre(Genre g);
	public void modifierGenre(Genre g);
	public void supprimerGenre(int id);
	public List<Genre> getGenres();
}
