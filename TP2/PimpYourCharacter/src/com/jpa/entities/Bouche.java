package com.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "bouche")
public class Bouche 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_bouche;
	@Column(name = "forme")
	private String forme;
	@Column(name = "largeur")
	private int largeur;
	@Column(name = "hauteur")
	private int hauteur;
	@Column(name = "profondeur")
	private int profondeur;
	//private Couleur couleur;
	@Column(name = "id_couleur")
	private int idCouleur;
	
	public int getIdBouche()
	{
		return id_bouche;
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
	
	/*@OneToOne
    @JoinColumn(name = "id_couleur")
	public Couleur getCouleur()
	{
		return couleur;
	}
	
	public void setCouleur(Couleur c)
	{
		couleur = c;
	}*/
	
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