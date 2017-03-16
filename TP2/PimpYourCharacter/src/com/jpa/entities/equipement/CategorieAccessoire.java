package com.jpa.entities.equipement;

import javax.persistence.*;

@Entity
@Table(name = "categorie_accessoire")
public class CategorieAccessoire 
{
	private int id_categorie_accessoire;
	private String label;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_categorie_accessoire() 
	{
		return id_categorie_accessoire;
	}
	
	public void setId_categorie_accessoire(int id) 
	{
		this.id_categorie_accessoire = id;
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
}
