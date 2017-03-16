package com.jpa.entities.personnage;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "genre")
public class Genre implements Serializable
{
	private int id_genre;
	private String label;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_genre() 
	{
		return id_genre;
	}
	
	public void setId_genre(int id) 
	{
		this.id_genre = id;
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
