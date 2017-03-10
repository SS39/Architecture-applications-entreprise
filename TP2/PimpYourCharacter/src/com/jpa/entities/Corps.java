package com.jpa.entities;

import javax.persistence.*;

@Entity
@Table(name = "corps")
public class Corps
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_corps;
	@Column(name = "taille")
	private int taille;
	/*private Bras bras;
	private Jambes jambes;
	private Buste buste;
	private Tete tete;*/
	@Column(name = "id_bras")
	private int idBras;
	@Column(name = "id_jambe")
	private int idJambes;
	@Column(name = "id_buste")
	private int idBuste;
	@Column(name = "id_tete")
	private int idTete;
	
	public int getIdCorps()
	{
		return id_corps;
	}
	
	public int getTaille()
	{
		return taille;
	}
	
	public void setTaille(int t)
	{
		taille = t;
	}
	
	/*@ManyToOne
    @JoinColumn(name = "id_bras")
	public Bras getBras()
	{
		return bras;
	}
	
	public void setBras(Bras b)
	{
		bras = b;
	}

	@ManyToOne
    @JoinColumn(name = "id_jambe")
	public Jambes getJambes()
	{
		return jambes;
	}
	
	public void setJambes(Jambes j)
	{
		jambes = j;
	}
	
	@ManyToOne
    @JoinColumn(name = "id_buste")
	public Buste getBuste()
	{
		return buste;
	}
	
	public void setBuste(Buste b)
	{
		buste = b;
	}
	
	@ManyToOne
    @JoinColumn(name = "id_tete")
	public Tete getTete()
	{
		return tete;
	}
	
	public void setTete(Tete t)
	{
		tete = t;
	}*/
	
	@ManyToOne
    @JoinColumn(name = "id_bras")
	public int getBras()
	{
		return idBras;
	}
	
	public void setBras(int b)
	{
		idBras = b;
	}

	@ManyToOne
    @JoinColumn(name = "id_jambe")
	public int getJambes()
	{
		return idJambes;
	}
	
	public void setJambes(int j)
	{
		idJambes = j;
	}
	
	@ManyToOne
    @JoinColumn(name = "id_buste")
	public int getBuste()
	{
		return idBuste;
	}
	
	public void setBuste(int b)
	{
		idBuste = b;
	}
	
	@ManyToOne
    @JoinColumn(name = "id_tete")
	public int getTete()
	{
		return idTete;
	}
	
	public void setTete(int t)
	{
		idTete = t;
	}

}