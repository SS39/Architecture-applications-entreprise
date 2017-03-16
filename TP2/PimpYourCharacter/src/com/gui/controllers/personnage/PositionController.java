package com.gui.controllers.personnage;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.personnage.PositionService;
import com.jpa.entities.personnage.Position;

@ManagedBean
public class PositionController 
{
	private Position position = new Position();
	
	@EJB
	private PositionService service;
	
	public Position getPosition()
	{
		return position;
	}
	
	public void setPosition(Position p)
	{
		this.position = p;
	}
	
	public void ajouterPosition(Position p)
	{
		service.ajouterPosition(p);
	}
	
	public void modifierPosition(Position p)
	{
		service.modifierPosition(p);
	}
	
	public void supprimerPosition(Position p)
	{				
		service.supprimerPosition(p.getId_position());
	}
	
	public List<Position> getPositions()
	{
		return service.getPositions();
	}
}
