package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "bras")
public class Bras implements Serializable
{
	private int id_bras;
	private int longueur;
	private String forme;
	
	public Bras() {
		
	}
	
	public Bras(int id, int longueur, String forme) {
		this.id_bras= id;
		this.forme = forme;
		this.longueur = longueur;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_bras()
	{
		return id_bras;
	}
	
	public void setId_bras(int id)
	{
		id_bras = id;
	}
	
	@Column(name = "longueur")
	public int getLongueur()
	{
		return longueur;
	}
	
	public void setLongueur(int l)
	{
		longueur = l;
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
	
	public String toString() {
		return "Id : "+this.id_bras+", Forme : "+this.forme+", Longueur : "+this.longueur;
	}
	
	public String toQuery() {
		String rep  = null;
		
		if ( !(this.id_bras == -1) || !(this.longueur == -1) || !(this.forme == null)) {
			rep = "from Bras where";
			if (!(this.id_bras == -1)) {
				rep+=" id_bras="+this.id_bras+" and";
			}
			if (!(this.longueur == -1)) {
				rep+=" longueur="+this.longueur+" and";
			}
			if (!(this.forme == null)) {
				rep+=" forme="+this.forme+" and";
			}
			rep = rep.substring(0, rep.length()-4);
		}
		
		return rep;
	}
	
}