package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "jambe")
public class Jambes implements Serializable
{
	private int id_jambe;
	private int hauteur;
	private String forme;
	
	public Jambes() {
		
	}
	
	public Jambes(int id_jambe, int hauteur, String forme) {
		this.id_jambe = id_jambe;
		this.hauteur = hauteur;
		this.forme = forme;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_jambe()
	{
		return id_jambe;
	}
	
	public void setId_jambe(int id)
	{
		id_jambe = id;
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
		return "Id : "+this.id_jambe+", Hauteur : "+this.hauteur+", Forme : "+this.forme;
	}
	
	public String toQuery() {
		String rep = null;
		
		if (!(this.id_jambe==-1) || !(this.hauteur == -1) || !(this.forme==null)) {
			rep ="from Jambes where" ;
			if (!(this.id_jambe==-1)) {
				rep+=" id_jambe="+this.id_jambe+" and";
			}
			if (!(this.hauteur == -1)) {
				rep+=" hauteur="+this.hauteur+" and";
			}
			if (!(this.forme==null)) {
				rep+=" forme="+this.forme+" and";
			}			
			rep=rep.substring(0, rep.length()-4);
		}
		
		return rep;
	}
}