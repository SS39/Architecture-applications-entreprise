package com.jpa.entities.equipement;

import java.io.Serializable;

import javax.persistence.*;

import com.jpa.entities.Couleur;
import com.jpa.entities.Texture;

@Entity
@Table(name = "vbas")
public class Vbas implements Serializable
{
	private int id_vbas;
	private String label;
	private int poids;
	private Couleur couleur;
	private Texture texture;
	
	public Vbas() 
	{
		this.couleur = new Couleur();
		this.texture = new Texture();
	}

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_vbas()
	{
		return id_vbas;
	}
	
	public void setId_vbas(int id)
	{
		id_vbas = id;
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
	
	@Column(name = "poids")
	public int getPoids()
	{
		return poids;
	}
	
	public void setPoids(int p)
	{
		poids = p;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_couleur")
	public Couleur getCouleur()
	{
		return couleur;
	}
	
	public void setCouleur(Couleur c)
	{
		couleur = c;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_texture")
	public Texture getTexture()
	{
		return texture;
	}
	
	public void setTexture(Texture t)
	{
		texture = t;
	}
}
