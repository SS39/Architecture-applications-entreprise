package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "yeux")
public class Yeux implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_yeux;
	@Column(name = "forme")
	private String forme;
	@Column(name = "hauteur")
	private int hauteur;
	@Column(name = "largeur")
	private int largeur;
	@Column(name = "profondeur")
	private int profondeur;
	@Column(name = "ecartement")
	private int ecartement;
	@Column(name = "id_couleur")
	private int idCouleur;
	
	public int getIdYeux()
	{
		return id_yeux;
	}
	
	public void setIdYeux(int id)
	{
		id_yeux = id;
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
	
	public int getEcartement()
	{
		return ecartement;
	}
	
	public void setEcartement(int e)
	{
		ecartement = e;
	}
	
	@OneToOne
    @JoinColumn(name = "id_couleur")
	public int getCouleur()
	{
		return idCouleur;
	}
	
	public void setCouleur(int c)
	{
		idCouleur = c;
	}
}