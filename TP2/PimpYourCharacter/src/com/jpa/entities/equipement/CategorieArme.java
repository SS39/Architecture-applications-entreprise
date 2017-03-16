package com.jpa.entities.equipement;

import javax.persistence.*;

@Entity
@Table(name = "categorie_arme")
public class CategorieArme 
{
	private int id_categorie_arme;
	private String categorieArme;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_categorie_arme() 
	{
		return id_categorie_arme;
	}
	
	public void setId_categorie_arme(int id_categorie_arme) 
	{
		this.id_categorie_arme = id_categorie_arme;
	}
	
	@Column(name = "categorie_arme")
	public String getCategorieArme() 
	{
		return categorieArme;
	}
	
	public void setCategorieArme(String categorieArme) 
	{
		this.categorieArme = categorieArme;
	}
}
