package com.jpa.entities.personnage;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "ethnie")
public class Ethnie implements Serializable
{
	private int id_ethnie;
	private String label;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_ethnie() 
	{
		return id_ethnie;
	}
	
	public void setId_ethnie(int id) 
	{
		this.id_ethnie = id;
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
