package com.ejb.services.equipement;

import java.util.List;

import com.jpa.entities.equipement.*;

public interface VhautService {

	public void ajouterVhaut(Vhaut vp);
	public void modifierVhaut(Vhaut vp);
	public void supprimerVhaut(int id);
	public List<Vhaut> getVhauts();
	
}
