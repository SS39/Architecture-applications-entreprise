package com.gui.controllers.equipement;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.equipement.VpiedService;
import com.jpa.entities.equipement.Vpied;

@ManagedBean
public class VpiedController {
	
	private Vpied vpied = new Vpied();
	
	@EJB
	private VpiedService vpiedservice;
	
	public Vpied getVpied(){
		return vpied;
	}
	
	public void setVpied(Vpied vp){
		this.vpied = vp;
	}
	
	public void ajouterVpied(Vpied vp)
	{
		vpiedservice.ajouterVpied(vp);
	}
	
	public void modifierVpied(Vpied vp)
	{
		vpiedservice.modifierVpied(vp);
	}
	
	public void supprimerVpied(int idVpied)
	{				
		vpiedservice.supprimerVpied(idVpied);
	}
	
	public List<Vpied> getVpieds()
	{
		return vpiedservice.getVpieds();
	}
}