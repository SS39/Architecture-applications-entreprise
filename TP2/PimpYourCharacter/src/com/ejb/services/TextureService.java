package com.ejb.services;

import java.util.List;

import com.jpa.entities.Texture;

public interface TextureService {
	
	public void ajouterTexture(Texture text);
	public void modifierTexture(Texture text);
	public void supprimerTexture(int id);
	public List<Texture> getTextures();
}
