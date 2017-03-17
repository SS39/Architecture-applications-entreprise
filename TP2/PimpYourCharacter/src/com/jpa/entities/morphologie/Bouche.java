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
	
	
	public Bouche(int id,String forme,int largeur,int hauteur,int profondeur,Couleur color) {
		this.id_bouche = id;
		this.forme = forme;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.profondeur = profondeur;
		this.couleur = color;
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
	
	public String toString() {
		return "Id : "+this.id_bouche+", Forme : "+this.forme+", Largeur : "+this.largeur+", Hauteur : "+this.hauteur+", Profondeur : "+this.profondeur+", Couleur : "+this.couleur.getId_couleur();
	}
	
	public String toQuery() {
		String rep = null;
		
		if (!(this.id_bouche == -1) || !(this.forme == null) || !(this.largeur == -1) || !(this.hauteur == -1) || !(this.profondeur == -1) || !(this.couleur == null)) {
			rep = "from Bouche where ";
			if (!(this.id_bouche == -1)) {
				rep+=" id_bouche="+this.id_bouche+" and";
			}
			if (!(this.forme == null)) {
				rep+=" forme="+this.forme+" and";
			}
			if (!(this.hauteur == -1)) {
				rep+=" hauteur="+this.hauteur+" and";
			}
			if (!(this.profondeur == -1)) {
				rep+=" profondeur="+this.profondeur+" and";
			}
			if (!(this.couleur == null)) {
				rep+=" id_couleur="+this.couleur.getId_couleur()+" and";
			}
			
			rep = rep.substring(0, rep.length()-4);
		}
		
		return rep;
	}
	
}