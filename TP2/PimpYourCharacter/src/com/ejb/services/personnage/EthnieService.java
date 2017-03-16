package com.ejb.services.personnage;

import java.util.List;

import com.jpa.entities.personnage.Ethnie;

public interface EthnieService 
{
	public void ajouterEthnie(Ethnie e);
	public void modifierEthnie(Ethnie e);
	public void supprimerEthnie(int id);
	public List<Ethnie> getEthnies();
}
