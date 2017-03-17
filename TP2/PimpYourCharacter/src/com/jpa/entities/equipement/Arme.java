package com.jpa.entities.equipement;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.jpa.entities.personnage.Personnage;

@Entity
@Table(name = "arme")
public class Arme implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_arme;
	private String label;
	private int poids;
	private CategorieArme categorieArme;
	private Set<Personnage> personnages;
	
	public Arme() 
	{
		this.categorieArme = new CategorieArme();
		this.personnages = new HashSet<Personnage>(0);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_arme() 
	{
		return id_arme;
	}
	
	public void setId_arme(int id) 
	{
		this.id_arme = id;
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
	
	@ManyToOne
	@JoinColumn(name = "id_categorie_arme")
	public CategorieArme getCategorieArme() 
	{
		return categorieArme;
	}
	
	public void setCategorieArme(CategorieArme categorieArme) 
	{
		this.categorieArme = categorieArme;
	}
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "armes")
	public Set<Personnage> getPersonnages() 
	{
		return personnages;
	}

	public void setPersonnages(Set<Personnage> personnages) 
	{
		this.personnages = personnages;
	}
}
