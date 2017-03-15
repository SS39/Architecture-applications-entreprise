package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "jambe")
public class Jambes implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_jambe;
	@Column(name = "hauteur")
	private int hauteur;
	@Column(name = "forme")
	private String forme;
	
	public int getIdJambes()
	{
		return id_jambe;
	}
	
	public void setIdJambes(int id)
	{
		id_jambe = id;
	}
	
	public int getHauteur()
	{
		return hauteur;
	}
	
	public void setHauteur(int h)
	{
		hauteur = h;
	}
	
	public String getForme()
	{
		return forme;
	}
	
	public void setForme(String f)
	{
		forme = f;
	}
}