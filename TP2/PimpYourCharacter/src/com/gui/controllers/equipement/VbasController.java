package com.gui.controllers.equipement;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.equipement.VbasService;
import com.jpa.entities.equipement.Vbas;

@ManagedBean
public class VbasController 
{	
	private Vbas vbas = new Vbas();
	
	@EJB
	private VbasService vbasservice;
	
	public Vbas getVbas(){
		return vbas;
	}
	
	public void setVbas(Vbas vbas){
		this.vbas = vbas;
	}
	
	public void ajouterVbas(Vbas vb)
	{
		vbasservice.ajouterVbas(vb);
	}
	
	public void modifierVbas(Vbas vb)
	{
		vbasservice.modifierVbas(vb);
	}
	
	public void supprimerVbas(int idVbas)
	{				
		vbasservice.supprimerVbas(idVbas);
	}
	
	public List<Vbas> getListVbas()
	{
		return vbasservice.getListVbas();
	}
}