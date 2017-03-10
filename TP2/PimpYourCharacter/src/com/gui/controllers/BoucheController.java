/*package com.gui.controllers;
 
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
 
import com.ejb.services.BoucheService;
import com.jpa.entities.Bouche;
 
@ManagedBean
public class BoucheController {
 
	private Bouche bouche = new Bouche();
 
	@EJB
	private BoucheService service;
 
	public Bouche getBouche() {
		return bouche;
	}
 
	public void setBouche(Bouche b) {
		this.bouche = b;
	}
 
	public void saveBouche(Bouche b) {
		service.ajouterBouche(b);
	}
 
}*/