package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.*;

public interface VpiedService {

	public void ajouterVpied(Vpied vp);
	public void modifierVpied(Vpied vp);
	public void supprimerVpied(int id);
	public List<Vpied> getVpieds();
	
}
