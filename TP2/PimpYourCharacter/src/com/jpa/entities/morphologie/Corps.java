package com.jpa.entities.morphologie;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "corps")
public class Corps implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_corps;
	private int taille;
	private Bras bras;
	private Jambes jambes;
	private Buste buste;
	private Tete tete;

	public Corps() 
	{
		this.bras = new Bras();
		this.jambes = new Jambes();
		this.buste = new Buste();
		this.tete = new Tete();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_corps()
	{
		return id_corps;
	}
	
	public void setId_corps(int id)
	{
		id_corps = id;
	}

	@Column(name = "taille")
	public int getTaille()
	{
		return taille;
	}
	
	public void setTaille(int t)
	{
		taille = t;
	}

	@ManyToOne
	@JoinColumn(name = "id_bras")
	public Bras getBras() {
		return bras;
	}

	public void setBras(Bras bras) {
		this.bras = bras;
	}

	@ManyToOne
	@JoinColumn(name = "id_jambe")
	public Jambes getJambes() {
		return jambes;
	}

	public void setJambes(Jambes jambes) {
		this.jambes = jambes;
	}

	@ManyToOne
	@JoinColumn(name = "id_buste")
	public Buste getBuste() {
		return buste;
	}

	public void setBuste(Buste buste) {
		this.buste = buste;
	}

	@ManyToOne
	@JoinColumn(name = "id_tete")
	public Tete getTete() {
		return tete;
	}

	public void setTete(Tete tete) {
		this.tete = tete;
	}
}