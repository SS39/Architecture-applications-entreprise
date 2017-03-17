package com.ejb.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.TextureService;
import com.jpa.entities.Texture;

@Stateless
public class TextureServiceImpl implements TextureService{

	@PersistenceContext(name = "PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterTexture(Texture text){
		em.persist(text);
	}
	
	@Override
	public void modifierTexture(Texture t) {
		Texture texture = (Texture)em.find(Texture.class, t.getId_texture());

		if (texture != null)
		{
			texture.setLabel(t.getLabel());
			em.persist(texture);
		}
	}

	@Override
	public void supprimerTexture(int id) {
		Texture texture = (Texture)em.find(Texture.class, id);
		
		if (texture != null)
		{
			em.remove(texture);
		}
	}

	@Override
	public List<Texture> getTextures() 
	{
		return (List<Texture>)em.createQuery("from Texture").getResultList();
	}

}