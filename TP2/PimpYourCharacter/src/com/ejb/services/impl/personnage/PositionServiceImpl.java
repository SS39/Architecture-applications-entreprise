package com.ejb.services.impl.personnage;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.personnage.PositionService;
import com.jpa.entities.personnage.Position;

@Stateless
public class PositionServiceImpl implements PositionService
{
	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;

	@Override
	public void ajouterPosition(Position p) 
	{
		em.persist(p);
	}

	@Override
	public void modifierPosition(Position p) 
	{
		Position position = (Position)em.find(Position.class, p.getId_position());

		if (position != null)
		{
			position.setLabel(p.getLabel());
			em.persist(position);
		}
	}

	@Override
	public void supprimerPosition(int id)
	{
		Position position = (Position)em.find(Position.class, id);
		
		if (position != null)
		{
			em.remove(position);
		}
	}

	@Override
	public List<Position> getPositions() 
	{
		return (List<Position>)em.createQuery("from Position").getResultList();
	}

}
