package com.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "couleur")
public class Couleur
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
	
	public String getLabel()
	{
		return label;
	}
	
	public void setLabel(String l)
	{
		label = l;
	}
}