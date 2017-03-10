package com.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "buste")
public class Buste 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_buste;
	@Column(name = "largeur")
	private int largeur;
	@Column(name = "hauteur")
	private int hauteur;
	@Column(name = "corpulence")
	private int corpulence;
	
	public int getIdBuste()
	{
		return id_buste;
	}
	
	public int getLargeur()
	{
		return largeur;
	}
	
	public void setLargeur(int l)
	{
		largeur = l;
	}
	
	public int getHauteur()
	{
		return hauteur;
	}
	
	public void setHauteur(int h)
	{
		hauteur = h;
	}
	
	public int getCorpulence()
	{
		return corpulence;
	}
	
	public void setCorpulence(int c)
	{
		corpulence = c;
	}
	
}