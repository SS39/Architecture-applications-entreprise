package com.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "bras")
public class Bras 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_bras;
	@Column(name = "longueur")
	private int longueur;
	@Column(name = "forme")
	private int forme;
	
	public int getIdBras()
	{
		return id_bras;
	}
	
	public int getLongueur()
	{
		return longueur;
	}
	
	public void setLongueur(int l)
	{
		longueur = l;
	}
	
	public int getForme()
	{
		return forme;
	}
	
	public void setForme(int f)
	{
		forme = f;
	}
	
	
}