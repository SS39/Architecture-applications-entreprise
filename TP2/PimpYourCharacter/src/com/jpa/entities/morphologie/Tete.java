package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tete")
public class Tete implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_tete;
	private String forme;
	private int largeur;
	private int hauteur;
	private Nez nez;
	private Bouche bouche;
	private Yeux yeux;
	
	public Tete() 
	{
		this.nez = new Nez();
		this.bouche = new Bouche();
		this.yeux = new Yeux();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_tete()
	{
		return id_tete;
	}
	
	public void setId_tete(int id)
	{
		id_tete = id;
	}
	
	@Column(name = "forme")
	public String getForme()
	{
		return forme;
	}
	
	public void setForme(String f)
	{
		forme = f;
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

	@ManyToOne
	@JoinColumn(name = "id_nez")
	public Nez getNez() {
		return nez;
	}

	public void setNez(Nez nez) {
		this.nez = nez;
	}

	@ManyToOne
	@JoinColumn(name = "id_bouche")
	public Bouche getBouche() {
		return bouche;
	}

	public void setBouche(Bouche bouche) {
		this.bouche = bouche;
	}

	@ManyToOne
	@JoinColumn(name = "id_yeux")
	public Yeux getYeux() {
		return yeux;
	}

	public void setYeux(Yeux yeux) {
		this.yeux = yeux;
	}
}