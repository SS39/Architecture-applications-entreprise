package com.jpa.entities.equipement;

import java.io.Serializable;

import javax.persistence.*;

import com.jpa.entities.Couleur;
import com.jpa.entities.Texture;

@Entity
@Table(name = "vhaut")
public class Vhaut implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_vhaut;
	private String label;
	private int poids;
	private Couleur couleur;
	private Texture texture;
	
	public Vhaut() 
	{
		this.couleur = new Couleur();
		this.texture = new Texture();
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_vhaut()
	{
		return id_vhaut;
	}

	public void setId_vhaut(int id)
	{
		id_vhaut = id;
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
