package com.jpa.entities.equipement;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.jpa.entities.Couleur;
import com.jpa.entities.Texture;
import com.jpa.entities.personnage.Personnage;

@Entity
@Table(name = "vtete")
public class Vtete implements Serializable
{
	private int id_vtete;
	private String label;
	private int poids;
	private Couleur couleur;
	private Texture texture;
	private Set<Personnage> personnages;
	
	public Vtete() 
	{
		this.couleur = new Couleur();
		this.texture = new Texture();
		this.personnages = new HashSet<Personnage>(0);
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_vtete()
	{
		return id_vtete;
	}

	public void setId_vtete(int id)
	{
		id_vtete = id;
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
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "vtetes")
	public Set<Personnage> getPersonnages() 
	{
		return personnages;
	}

	public void setPersonnages(Set<Personnage> personnages) 
	{
		this.personnages = personnages;
	}
}
