package com.gui.controllers.equipement;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.equipement.VmainService;
import com.jpa.entities.equipement.Vmain;

@ManagedBean
public class VmainController {
	
	private Vmain vmain = new Vmain();
	
	@EJB
	private VmainService vmainservice;
	
	public Vmain getVmain(){
		return vmain;
	}
	
	public void setVmain(Vmain vm){
		this.vmain = vm;
	}
	
	public void ajouterVmain(Vmain vm)
	{
		vmainservice.ajouterVmain(vm);
	}
	
	public void modifierVmain(Vmain vm)
	{
		vmainservice.modifierVmain(vm);
	}
	
	public void supprimerVmain(int idVmain)
	{				
		vmainservice.supprimerVmain(idVmain);
	}
	
	public List<Vmain> getVmains()
	{
		return vmainservice.getVmains();
	}
}
