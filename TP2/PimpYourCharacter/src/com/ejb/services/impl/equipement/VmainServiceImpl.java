package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.VmainService;
import com.jpa.entities.Couleur;
import com.jpa.entities.Texture;
import com.jpa.entities.equipement.Vmain;

@Stateless
public class VmainServiceImpl implements VmainService
{

	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterVmain(Vmain vm)
	{
		Couleur couleur = (Couleur)em.find(Couleur.class, vm.getCouleur().getId_couleur());
		if (couleur != null)
		{
			Texture texture = (Texture)em.find(Texture.class, vm.getTexture().getId_texture());
			if (texture != null)
			{
				vm.setCouleur(couleur);
				vm.setTexture(texture);
				em.persist(vm);
			}
		}
	}

	@Override
	public void modifierVmain(Vmain vm) 
	{
		Vmain vmain = (Vmain)em.find(Vmain.class, vm.getId_vmain());
		if (vmain != null)
		{
			Couleur couleur = (Couleur)em.find(Couleur.class, vm.getCouleur().getId_couleur());
			if (couleur != null)
			{
				Texture texture = (Texture)em.find(Texture.class, vm.getTexture().getId_texture());
				if (texture != null)
				{
					vmain.setCouleur(couleur);
					vmain.setTexture(texture);
					vmain.setLabel(vm.getLabel());
					vmain.setPoids(vm.getPoids());
					em.persist(vmain);
				}
			}
		}
	}

	@Override
	public void supprimerVmain(int id) 
	{
		Vmain vmain = (Vmain)em.find(Vmain.class, id);
		
		if (vmain != null)
		{
			em.remove(vmain);
		}
	}

	@Override
	public List<Vmain> getVmains() 
	{
		return (List<Vmain>)em.createQuery("from Vmain").getResultList();
	}
}
