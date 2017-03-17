package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "buste")
public class Buste implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_buste;
	private int largeur;
	private int hauteur;
	private int corpulence;
	
	public Buste() {
		
	}
	
	public Buste(int id_buste, int largeur, int hauteur, int corpulence) {
		this.id_buste = id_buste;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.corpulence = corpulence;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_buste()
	{
		return id_buste;
	}
	
	public void setId_buste(int id)
	{
		id_buste = id;
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
	
	@Column(name = "corpulence")
	public int getCorpulence()
	{
		return corpulence;
	}
	
	public void setCorpulence(int c)
	{
		corpulence = c;
	}
	
	public String toString() {
		return "Id : "+this.id_buste+", Largeur : "+this.largeur+", Hauteur : "+this.hauteur+", Corpulence : "+this.corpulence;
	}
	
	public String toQuery() {
		String rep = null;
		
		if (!(this.id_buste==-1) || !(this.largeur == -1) || !(this.hauteur==-1) || !(this.corpulence == -1)) {
			rep ="from Buste where" ;
			if (!(this.id_buste==-1)) {
				rep+=" id_buste="+this.id_buste+" and";
			}
			if (!(this.largeur == -1)) {
				rep+=" largeur="+this.largeur+" and";
			}
			if (!(this.hauteur==-1)) {
				rep+=" hauteur="+this.hauteur+" and";
			}
			if (!(this.corpulence == -1)) {
				rep+=" corpulence="+this.corpulence+" and";
			}
			
			rep=rep.substring(0, rep.length()-4);
		}
		
		return rep;
	}
	
}