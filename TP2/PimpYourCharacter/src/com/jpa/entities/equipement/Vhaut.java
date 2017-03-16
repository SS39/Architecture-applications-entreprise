package com.jpa.entities.equipement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vhaut")
public class Vhaut {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_vhaut;
	@Column(name = "label")
	private String label;
	@Column(name = "poids")
	private int poids;
	@Column(name = "id_couleur")
	private int idCouleur;
	@Column(name = "id_texture")
	private int idTexture;
	
	public int getIdVhaut()
	{
		return id_vhaut;
	}

	public void setIdVhaut(int id)
	{
		id_vhaut = id;
	}
	
	public String getLabel()
	{
		return label;
	}
	
	public void setLabel(String l)
	{
		label = l;
	}
	
	public int getPoids()
	{
		return poids;
	}
	
	public void setPoids(int p)
	{
		poids = p;
	}
	
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
	
	@OneToOne
    @JoinColumn(name = "id_texture")
	public int getTexture()
	{
		return idTexture;
	}
	
	public void setTexture(int t)
	{
		idTexture = t;
	}
}
