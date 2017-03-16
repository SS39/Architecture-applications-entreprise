package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "jambe")
public class Jambes implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_jambe;
	private int hauteur;
	private String forme;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_jambe()
	{
		return id_jambe;
	}
	
	public void setId_jambe(int id)
	{
		id_jambe = id;
	}
	
	@Column(name = "hauteur")
	public int getHauteur()
	{
		return hauteur;
	}
	
	public void setHauteur(int h)
	{
		hauteur = h;
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