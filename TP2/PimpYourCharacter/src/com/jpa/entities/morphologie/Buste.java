package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "buste")
public class Buste implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_buste;
	private int largeur;
	private int hauteur;
	private int corpulence;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_buste()
	{
		return id_buste;
	}
	
	public void setId_buste(int id)
	{
		id_buste = id;
	}
	
	@Column(name = "largeur")
	public int getLargeur()
	{
		return largeur;
	}
	
	public void setLargeur(int l)
	{
		largeur = l;
	}
	
	@Column(name = "hauteur")
	public int getHauteur()
	{
		return hauteur;
	}
	
	public void setHauteur(int h)
	{
		hauteur = h;
	}
	
	@Column(name = "corpulence")
	public int getCorpulence()
	{
		return corpulence;
	}
	
	public void setCorpulence(int c)
	{
		corpulence = c;
	}
	
}