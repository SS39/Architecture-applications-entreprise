package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "couleur")
public class Couleur implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_couleur;
	@Column(name = "label")
	private String label;
	
	public int getIdCouleur()
	{
		return id_couleur;
	}
	
	public void setIdCouleur(int id)
	{
		id_couleur = id;
	}
	
	public String getLabel()
	{
		return label;
	}
	
	public void setLabel(String l)
	{
		label = l;
	}
}