package com.jpa.entities.personnage;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "position")
public class Position implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_position;
	private String label;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_position() 
	{
		return id_position;
	}
	
	public void setId_position(int id) 
	{
		this.id_position = id;
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
