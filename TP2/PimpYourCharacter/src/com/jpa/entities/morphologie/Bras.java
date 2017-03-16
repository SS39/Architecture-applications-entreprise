package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "bras")
public class Bras implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_bras;
	private int longueur;
	private String forme;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_bras()
	{
		return id_bras;
	}
	
	public void setId_bras(int id)
	{
		id_bras = id;
	}
	
	@Column(name = "longueur")
	public int getLongueur()
	{
		return longueur;
	}
	
	public void setLongueur(int l)
	{
		longueur = l;
	}
	
	@Column(name = "forme")
	public String getForme()
	{
		return forme;
	}
	
	public void setForme(String f)
	{
		forme = f;
	}
	
	
}