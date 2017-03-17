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
	
	public Corps(int id_corps, int taille, Bras bras, Jambes jambes, Buste buste, Tete tete) {
		this.id_corps = id_corps;
		this.taille = taille;
		this.bras = bras;
		this.jambes = jambes;
		this.buste = buste;
		this.tete = tete;
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
	
	public String toString() {
		return 	"Id : "+this.id_corps+", Taille : "+this.taille+", Bras : "+this.bras+", Jambes : "+this.jambes.getId_jambe()+", Buste : "+this.buste.getId_buste()+", Tete : "+this.tete.getId_tete();
	}
	
	public String toQuery() {
		String rep = null;
		
		if (!(this.id_corps==-1) || !(this.taille == -1) || !(this.bras==null) || !(this.jambes == null) || !(this.buste==null) || !(this.tete == null)) {
			rep ="from Corps where" ;
			if (!(this.id_corps==-1)) {
				rep+=" id_corps="+this.id_corps+" and";
			}
			if (!(this.taille == -1)) {
				rep+=" taille="+this.taille+" and";
			}
			if (!(this.bras==null)) {
				rep+=" id_bras="+this.bras.getId_bras()+" and";
			}
			if (!(this.jambes == null)) {
				rep+=" id_jambes="+this.jambes.getId_jambe()+" and";
			}
			if (!(this.buste == null)) {
				rep+=" id_buste="+this.buste.getId_buste()+" and";
			}
			if (!(this.tete == null)) {
				rep+=" id_tete="+this.tete.getId_tete()+" and";
			}
			
			rep=rep.substring(0, rep.length()-4);
		}
		
		return rep;
	}
}