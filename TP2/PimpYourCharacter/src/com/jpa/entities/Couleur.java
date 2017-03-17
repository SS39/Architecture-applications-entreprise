package com.jpa.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "couleur")
public class Couleur implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_couleur;
	private String label;
	
	public Couleur() {
		
	}
	
	public Couleur(int id_couleur, String label) {
		this.id_couleur = id_couleur;
		this.label = label;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_couleur()
	{
		return id_couleur;
	}
	
	public void setId_couleur(int id)
	{
		id_couleur = id;
	}
	
	@Column(name = "label")
	public String getLabel()
	{
		return label;
	}
	
	public void setLabel(String l)
	{
		label = l;
	}
	
	public String toString() {
		return "Id : "+this.id_couleur+", Label : "+this.label;
	}
	
	public String toQuery() {
		String rep = null;
		
		if (!(this.id_couleur==-1) || !(this.label == null)) {
			rep ="from Couleur where" ;
			if (!(this.id_couleur==-1)) {
				rep+=" id_couleur="+this.id_couleur+" and";
			}
			if (!(this.label == null)) {
				rep+=" label="+this.label+" and";
			}
			
			rep=rep.substring(0, rep.length()-4);
		}
		
		return rep;
	}
}