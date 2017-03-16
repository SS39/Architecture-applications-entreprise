package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

import com.jpa.entities.Couleur;

@Entity
@Table(name = "yeux")
public class Yeux implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_yeux;
	private String forme;
	private int hauteur;
	private int largeur;
	private int profondeur;
	private int ecartement;
	private Couleur couleur;
	
	public Yeux()
	{
		couleur = new Couleur();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_yeux()
	{
		return id_yeux;
	}
	
	public void setId_yeux(int id)
	{
		id_yeux = id;
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
	
	@Column(name = "profondeur")
	public int getProfondeur()
	{
		return profondeur;
	}
	
	public void setProfondeur(int p)
	{
		profondeur = p;
	}
	
	@Column(name = "ecartement")
	public int getEcartement()
	{
		return ecartement;
	}
	
	public void setEcartement(int e)
	{
		ecartement = e;
	}

	@ManyToOne
	@JoinColumn(name = "id_couleur")
	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}
	
}