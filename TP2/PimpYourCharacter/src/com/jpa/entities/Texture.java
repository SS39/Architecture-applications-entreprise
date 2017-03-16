package com.jpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "texture")
public class Texture implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id_texture;
	private String label;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_texture()
	{
		return id_texture;
	}
	
	public void setId_texture(int id)
	{
		id_texture = id;
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
