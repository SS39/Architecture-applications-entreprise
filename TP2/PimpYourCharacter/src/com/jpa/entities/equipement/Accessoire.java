package com.jpa.entities.equipement;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.jpa.entities.personnage.Personnage;

@Entity
@Table(name = "accessoire")
public class Accessoire implements Serializable
{
	private int id_accessoire;
	private String label;
	private CategorieAccessoire categorieAccessoire;
	private Set<Personnage> personnages;
	
	public Accessoire() 
	{
		this.categorieAccessoire = new CategorieAccessoire();
		this.personnages = new HashSet<Personnage>(0);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_accessoire() 
	{
		return id_accessoire;
	}
	
	public void setId_accessoire(int id) 
	{
		this.id_accessoire = id;
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
	
	@ManyToOne
	@JoinColumn(name = "id_categorie_accessoire")
	public CategorieAccessoire getCategorieAccessoire() 
	{
		return categorieAccessoire;
	}
	
	public void setCategorieAccessoire(CategorieAccessoire categorieAccessoire) 
	{
		this.categorieAccessoire = categorieAccessoire;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "accessoires")
	public Set<Personnage> getPersonnages() 
	{
		return personnages;
	}

	public void setPersonnages(Set<Personnage> personnages) 
	{
		this.personnages = personnages;
	}	
}
