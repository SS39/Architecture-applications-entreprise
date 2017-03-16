package com.ejb.services.personnage;

import java.util.List;

import com.jpa.entities.personnage.Position;

public interface PositionService 
{
	public void ajouterPosition(Position p);
	public void modifierPosition(Position p);
	public void supprimerPosition(int id);
	public List<Position> getPositions();
}
