package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

import com.jpa.entities.Couleur;

@Entity
@Table(name = "bouche")
public class Bouche implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_bouche;
	private String forme;
	private int largeur;
	private int hauteur;
	private int profondeur;
	private Couleur couleur;
	
	public Bouche()
	{
		couleur = new Couleur();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_bouche()
	{
		return id_bouche;
	}
	
	public void setId_bouche(int id)
	{
		id_bouche = id;
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

	@ManyToOne
	@JoinColumn(name = "id_couleur")
	public Couleur getCouleur() 
	{
		return couleur;
	}

	public void setCouleur(Couleur couleur) 
	{
		this.couleur = couleur;
	}
	
}