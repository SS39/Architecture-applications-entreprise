package com.gui.controllers.equipement;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.equipement.VteteService;
import com.jpa.entities.equipement.Vtete;


@ManagedBean
public class VteteController 
{	
	private Vtete vtete = new Vtete();
	
	@EJB
	private VteteService vteteservice;
	
	public Vtete getVtete(){
		return vtete;
	}
	
	public void setVtete(Vtete vt){
		this.vtete = vt;
	}
	
	public void ajouterVtete(Vtete vt)
	{
		vteteservice.ajouterVtete(vt);
	}
	
	public void modifierVtete(Vtete vt)
	{
		vteteservice.modifierVtete(vt);
	}
	
	public void supprimerVtete(Vtete vt)
	{				
		vteteservice.supprimerVtete(vt.getId_vtete());
	}
	
	public List<Vtete> getVtetes()
	{
		return vteteservice.getVtetes();
	}
}