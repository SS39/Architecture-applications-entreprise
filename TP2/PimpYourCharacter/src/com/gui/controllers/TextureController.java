package com.gui.controllers;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.ejb.services.TextureService;
import com.jpa.entities.Texture;

@ManagedBean
public class TextureController {
	
	private Texture texture = new Texture();
	
	@EJB
	private TextureService textureservice;
	
	public Texture getTexture(){
		return texture;
	}
	
	public void setTexture(Texture texture){
		this.texture = texture;
	}
	
	public void ajouterTexture(Texture t){
		int j = 0;
		boolean find = false;
		List<Texture> list = getTextures();
		
		while (j < list.size() && !find) 
		{
			Texture t2 = (Texture)list.get(j);
			if (t.getLabel().equals(t2.getLabel()))
			{
				find = true;
			}
			j++;
		}
		
		if (!find)
		{
			textureservice.ajouterTexture(t);
		}
	}
	
	public void modifierTexture(Texture t)
	{
		textureservice.modifierTexture(t);
	}
	
	public void supprimerTexture(Texture t)
	{				
		textureservice.supprimerTexture(t.getId_texture());
	}
	
	public List<Texture> getTextures()
	{
		return textureservice.getTextures();
	}
	
}
