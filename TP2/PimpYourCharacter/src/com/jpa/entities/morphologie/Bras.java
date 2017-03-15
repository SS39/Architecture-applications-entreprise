package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "bras")
public class Bras implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_bras;
	@Column(name = "longueur")
	private int longueur;
	@Column(name = "forme")
	private String forme;
	
	public int getIdBras()
	{
		return id_bras;
	}
	
	public void setIdBras(int id)
	{
		id_bras = id;
	}
	
	public int getLongueur()
	{
		return longueur;
	}
	
	public void setLongueur(int l)
	{
		longueur = l;
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