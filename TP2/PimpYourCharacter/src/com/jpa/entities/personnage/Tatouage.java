package com.jpa.entities.personnage;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tatouage")
public class Tatouage implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_tatouage;
	private String label;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_tatouage()
	{
		return id_tatouage;
	}
	
	public void setId_tatouage(int id) 
	{
		this.id_tatouage = id;
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
