package com.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "nez")
public class Nez 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_nez;
	@Column(name = "forme")
	private String forme;
	@Column(name = "largeur")
	private int largeur;
	@Column(name = "hauteur")
	private int hauteur;
	@Column(name = "profondeur")
	private int profondeur;
	
	public int getIdNez()
	{
		return id_nez;
	}
	
	public String getForme()
	{
		return forme;
	}
	
	public void setForme(String f)
	{
		forme = f;
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
	
	public int getProfondeur()
	{
		return profondeur;
	}
	
	public void setProfondeur(int p)
	{
		profondeur = p;
	}
}