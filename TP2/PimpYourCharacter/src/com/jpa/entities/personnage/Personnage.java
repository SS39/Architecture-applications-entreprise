package com.jpa.entities.personnage;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.jpa.entities.equipement.Accessoire;
import com.jpa.entities.equipement.Arme;
import com.jpa.entities.equipement.Bouclier;
import com.jpa.entities.equipement.Vmain;
import com.jpa.entities.equipement.Vpied;
import com.jpa.entities.equipement.Vtete;
import com.jpa.entities.morphologie.Corps;
import com.jpa.entities.equipement.Vbas;
import com.jpa.entities.equipement.Vhaut;

@Entity
@Table(name = "personnage")
public class Personnage implements Serializable
{
	private int id_personnage;
	private String nom;
	private int age;
	private Ethnie ethnie;
	private Genre genre;
	private Vbas vbas;
	private Vhaut vhaut;
	private Corps corps;
	private Set<Accessoire> accessoires;
	private Set<Arme> armes;
	private Set<Bouclier> boucliers;
	private Set<Vmain> vmains;
	private Set<Vpied> vpieds;
	private Set<Vtete> vtetes;

	public Personnage() 
	{
		ethnie = new Ethnie();
		genre = new Genre();
		vbas = new Vbas();
		vhaut = new Vhaut();
		corps = new Corps();
		accessoires = new HashSet<Accessoire>(0);
		armes = new HashSet<Arme>(0);
		boucliers = new HashSet<Bouclier>(0);
		vmains = new HashSet<Vmain>(0);
		vpieds = new HashSet<Vpied>(0);
		vtetes = new HashSet<Vtete>(0);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_personnage() 
	{
		return id_personnage;
	}
	
	public void setId_personnage(int id) 
	{
		this.id_personnage = id;
	}
	
	@Column(name = "nom")
	public String getNom() 
	{
		return nom;
	}
	
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	
	@Column(name = "age")
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}

	@ManyToOne
	@JoinColumn(name = "id_ethnie")
	public Ethnie getEthnie() {
		return ethnie;
	}

	public void setEthnie(Ethnie ethnie) {
		this.ethnie = ethnie;
	}

	@ManyToOne
	@JoinColumn(name = "id_genre")
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@ManyToOne
	@JoinColumn(name = "id_vbas")
	public Vbas getVbas() {
		return vbas;
	}

	public void setVbas(Vbas vbas) {
		this.vbas = vbas;
	}

	@ManyToOne
	@JoinColumn(name = "id_vhaut")
	public Vhaut getVhaut() {
		return vhaut;
	}

	public void setVhaut(Vhaut vhaut) {
		this.vhaut = vhaut;
	}

	@ManyToOne
	@JoinColumn(name = "id_corps")
	public Corps getCorps() {
		return corps;
	}

	public void setCorps(Corps corps) {
		this.corps = corps;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "personnage_accessoire", joinColumns = {
			@JoinColumn(name = "id_personnage", nullable = false, updatable = false, insertable = false) },
			inverseJoinColumns = { @JoinColumn(name = "id_accessoire", nullable = false, updatable = false, insertable = false) })
	public Set<Accessoire> getAccessoires() 
	{
		return accessoires;
	}

	public void setAccessoires(Set<Accessoire> accessoires) 
	{
		this.accessoires = accessoires;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "personnage_arme", joinColumns = {
			@JoinColumn(name = "id_personnage", nullable = false, updatable = false, insertable = false) },
			inverseJoinColumns = { @JoinColumn(name = "id_arme", nullable = false, updatable = false, insertable = false) })
	public Set<Arme> getArmes() 
	{
		return armes;
	}

	public void setArmes(Set<Arme> armes) 
	{
		this.armes = armes;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "personnage_bouclier", joinColumns = {
			@JoinColumn(name = "id_personnage", nullable = false, updatable = false, insertable = false) },
			inverseJoinColumns = { @JoinColumn(name = "id_bouclier", nullable = false, updatable = false, insertable = false) })
	public Set<Bouclier> getBoucliers() 
	{
		return boucliers;
	}

	public void setBoucliers(Set<Bouclier> bouciers) 
	{
		this.boucliers = bouciers;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "personnage_vmain", joinColumns = {
			@JoinColumn(name = "id_personnage", nullable = false, updatable = false, insertable = false) },
			inverseJoinColumns = { @JoinColumn(name = "id_vmain", nullable = false, updatable = false, insertable = false) })
	public Set<Vmain> getVmains() {
		return vmains;
	}

	public void setVmains(Set<Vmain> vmains) 
	{
		this.vmains = vmains;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "personnage_vpied", joinColumns = {
			@JoinColumn(name = "id_personnage", nullable = false, updatable = false, insertable = false) },
			inverseJoinColumns = { @JoinColumn(name = "id_vpied", nullable = false, updatable = false, insertable = false) })
	public Set<Vpied> getVpieds() 
	{
		return vpieds;
	}

	public void setVpieds(Set<Vpied> vpieds) 
	{
		this.vpieds = vpieds;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "personnage_vtete", joinColumns = {
			@JoinColumn(name = "id_personnage", nullable = false, updatable = false, insertable = false) },
			inverseJoinColumns = { @JoinColumn(name = "id_vtete", nullable = false, updatable = false, insertable = false) })
	public Set<Vtete> getVtetes() 
	{
		return vtetes;
	}
	
	public void setVtetes(Set<Vtete> vtetes) 
	{
		this.vtetes = vtetes;
	}
	
	
}
