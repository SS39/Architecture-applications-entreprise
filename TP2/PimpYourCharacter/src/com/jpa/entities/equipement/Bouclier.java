package com.jpa.entities.equipement;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.jpa.entities.personnage.Personnage;

@Entity
@Table(name = "bouclier")
public class Bouclier implements Serializable
{
	private int id_bouclier;
	private String label;
	private int poids;
	private Set<Personnage> personnages;
	
	public Bouclier() 
	{
		this.personnages = new HashSet<Personnage>(0);
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_bouclier() 
	{
		return id_bouclier;
	}
	public void setId_bouclier(int id) 
	{
		this.id_bouclier = id;
	}
	
	@Column(name = "label")
	public String getLabel() 
	{
		return label;
	}
	
	public void setLabel(String label) 
	{
		this.label = label;
	}
	
	@Column(name = "poids")
	public int getPoids() 
	{
		return poids;
	}
	
	public void setPoids(int poids) 
	{
		this.poids = poids;
	}
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "boucliers")
	public Set<Personnage> getPersonnages() 
	{
		return personnages;
	}

	public void setPersonnages(Set<Personnage> personnages) 
	{
		this.personnages = personnages;
	}
}
