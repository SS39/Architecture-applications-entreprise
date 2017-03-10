package com.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "jambe")
public class Jambes
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_jambe;
	@Column(name = "hauteur")
	private int hauteur;
	@Column(name = "forme")
	private int forme;
	
	public int getIdJambes()
	{
		return id_jambe;
	}
	
	public int getHauteur()
	{
		return hauteur;
	}
	
	public void setHauteur(int h)
	{
		hauteur = h;
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