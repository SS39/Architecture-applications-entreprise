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
	
	public Yeux(int id_yeux, String forme, int hauteur, int largeur, int profondeur, int ecartement, Couleur couleur) {
		this.id_yeux = id_yeux;
		this.forme = forme;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.profondeur = profondeur;
		this.ecartement = ecartement;
		this.couleur = couleur;
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
	
	public String toString() {
		return 	"Id : "+this.id_yeux+", Forme : "+this.forme+", Hauteur : "+this.hauteur+", Largeur : "+this.largeur+", Profondeur : "+this.profondeur+", Ecartement : "+this.ecartement+", Couleur : "+this.couleur.getId_couleur();
	}
	
	public String toQuery() {
		String rep = null;
		
		if (!(this.id_yeux==-1) || !(this.forme == null) || !(this.largeur==-1) || !(this.hauteur == -1) || !(this.profondeur==-1) || !(this.ecartement == -1) || !(this.couleur == null)) {
			rep ="from Yeux where" ;
			if (!(this.id_yeux==-1)) {
				rep+=" id_yeux="+this.id_yeux+" and";
			}
			if (!(this.forme == null)) {
				rep+=" forme="+this.forme+" and";
			}
			if (!(this.largeur==-1)) {
				rep+=" largeur="+this.largeur+" and";
			}
			if (!(this.hauteur == -1)) {
				rep+=" hauteur="+this.hauteur+" and";
			}
			if (!(this.profondeur == -1)) {
				rep+=" profondeur="+this.profondeur+" and";
			}
			if (!(this.ecartement == -1)) {
				rep+=" ecartement="+this.ecartement+" and";
			}
			if (!(this.couleur == null)) {
				rep+=" id_couleur="+this.couleur.getId_couleur()+" and";
			}
			rep=rep.substring(0, rep.length()-4);
		}
		
		return rep;
	}
	
}