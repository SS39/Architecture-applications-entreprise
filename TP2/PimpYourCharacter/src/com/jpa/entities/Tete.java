package com.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "tete")
public class Tete 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_tete;
	@Column(name = "forme")
	private String forme;
	@Column(name = "largeur")
	private int largeur;
	@Column(name = "hauteur")
	private int hauteur;
	/*private Nez nez;
	private Bouche bouche;
	private Yeux yeux;*/
	@Column(name = "id_nez")
	private int idNez;
	@Column(name = "id_bouche")
	private int idBouche;
	@Column(name = "id_yeux")
	private int idYeux;
	
	public int getIdTete()
	{
		return id_tete;
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
	
	/*public Nez getNez()
	{
		return nez;
	}
	
	public void setNez(Nez n)
	{
		nez = n;
	}
	
	public Bouche getBouche()
	{
		return bouche;
	}
	
	public void setBouche(Bouche b)
	{
		bouche = b;
	}
	
	public Yeux getYeux()
	{
		return yeux;
	}
	
	public void setYeux(Yeux y)
	{
		yeux = y;
	}*/
	
	@ManyToOne
    @JoinColumn(name = "id_nez")
	public int getNez()
	{
		return idNez;
	}
	
	public void setNez(int n)
	{
		idNez = n;
	}
	
	@ManyToOne
    @JoinColumn(name = "id_bouche")
	public int getBouche()
	{
		return idBouche;
	}
	
	public void setBouche(int b)
	{
		idBouche = b;
	}
	
	@ManyToOne
    @JoinColumn(name = "id_yeux")
	public int getYeux()
	{
		return idYeux;
	}
	
	public void setYeux(int y)
	{
		idYeux = y;
	}
	
}