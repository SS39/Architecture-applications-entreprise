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
	
	public Tete(int id_tete, String forme, int largeur, int hauteur, Nez nez, Bouche bouche, Yeux yeux) {
		this.id_tete = id_tete;
		this.forme = forme;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.nez = nez;
		this.bouche = bouche;
		this.yeux = yeux;
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
	
	public String toString() {
		return 	"Id : "+this.id_tete+", Forme : "+this.forme+", Largeur : "+this.largeur+", Hauteur : "+this.hauteur+", Nez : "+this.nez.getId_nez()+", Bouche : "+this.bouche.getId_bouche()+", Yeux : "+this.yeux.getId_yeux();
	}
	
	public String toQuery() {
		String rep = null;
		
		if (!(this.id_tete==-1) || !(this.forme == null) || !(this.largeur==-1) || !(this.hauteur == -1) || !(this.nez==null) || !(this.bouche == null) || !(this.yeux == null)) {
			rep ="from Tete where" ;
			if (!(this.id_tete==-1)) {
				rep+=" id_tete="+this.id_tete+" and";
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
			if (!(this.nez == null)) {
				rep+=" id_nez="+this.nez.getId_nez()+" and";
			}
			if (!(this.bouche == null)) {
				rep+=" id_bouchee="+this.bouche.getId_bouche()+" and";
			}
			if (!(this.yeux == null)) {
				rep+=" id_yeux="+this.yeux.getId_yeux()+" and";
			}
			rep=rep.substring(0, rep.length()-4);
		}
		
		return rep;
	}
}