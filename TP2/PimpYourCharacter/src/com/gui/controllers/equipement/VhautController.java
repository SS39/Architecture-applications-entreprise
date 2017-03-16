package com.gui.controllers.equipement;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.equipement.VhautService;
import com.jpa.entities.equipement.Vhaut;

@ManagedBean
public class VhautController 
{	
	private Vhaut vhaut = new Vhaut();
	
	@EJB
	private VhautService vhautservice;
	
	public Vhaut getVhaut(){
		return vhaut;
	}
	
	public void setVhaut(Vhaut vh){
		this.vhaut = vh;
	}
	
	public void ajouterVhaut(Vhaut vh)
	{
		vhautservice.ajouterVhaut(vh);
	}
	
	public void modifierVhaut(Vhaut vh)
	{
		vhautservice.modifierVhaut(vh);
	}
	
	public void supprimerVhaut(int idVhaut)
	{				
		vhautservice.supprimerVhaut(idVhaut);
	}
	
	public List<Vhaut> getVhauts()
	{
		return vhautservice.getVhauts();
	}
}