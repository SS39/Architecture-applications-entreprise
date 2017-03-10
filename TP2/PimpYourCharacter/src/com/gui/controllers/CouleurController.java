package com.gui.controllers;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.CouleurService;
import com.jpa.entities.Couleur;

@ManagedBean
public class CouleurController {
	
	private Couleur couleur = new Couleur();
	
	@EJB
	private CouleurService couleurservice;
	
	public Couleur getCouleur(){
		return couleur;
	}
	
	public void setCouleur(Couleur couleur){
		this.couleur = couleur;
	}
	
	public void saveCouleur(Couleur cou){
		couleurservice.ajouterCouleur(cou);
	}
}