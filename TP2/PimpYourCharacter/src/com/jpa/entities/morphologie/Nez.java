package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "nez")
public class Nez implements Serializable
{
	private int id_nez;
	private String forme;
	private int largeur;
	private int hauteur;
	private int profondeur;
	
	public Nez() {
		
	}
	
	public Nez(int id_nez, String forme, int largeur, int hauteur, int profondeur) {
		this.id_nez = id_nez;
		this.forme = forme;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.profondeur = profondeur;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_nez()
	{
		return id_nez;
	}
	
	public void setId_nez(int id)
	{
		id_nez = id;
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
	
	public String toString() {
		return 	"Id : "+this.id_nez+", Forme : "+this.forme+", Hauteur : "+this.largeur+", Hauteur : "+this.hauteur+", Profondeur : "+this.profondeur;
	}
	
	public String toQuery() {
		String rep = null;
		
		if (!(this.id_nez==-1) || !(this.forme == null) || !(this.largeur==-1) || !(this.hauteur == -1) || !(this.profondeur==-1)) {
			rep ="from Nez where" ;
			if (!(this.id_nez==-1)) {
				rep+=" id_nez="+this.id_nez+" and";
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
			
			rep=rep.substring(0, rep.length()-4);
		}
		
		return rep;
	}
}