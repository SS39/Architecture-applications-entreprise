package com.jpa.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "couleur")
public class Couleur implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_couleur;
	private String label;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_couleur()
	{
		return id_couleur;
	}
	
	public void setId_couleur(int id)
	{
		id_couleur = id;
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
}