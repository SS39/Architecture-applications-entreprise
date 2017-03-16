package com.ejb.services.impl.equipement;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ejb.services.equipement.VmainService;
import com.jpa.entities.equipement.Vmain;

@Stateless
public class VmainServiceImpl implements VmainService{

	@PersistenceContext(unitName="PimpYourCharacter")
	private EntityManager em;
	
	@Override
	public void ajouterVmain(Vmain vm)
	{
		em.persist(vm);
	}

	@Override
	public void modifierVmain(Vmain vm) 
	{
		Vmain vmain = (Vmain)em.find(Vmain.class, vm.getIdVmain());

		if (vmain != null)
		{
			vmain.setLabel(vm.getLabel());
			vmain.setCouleur(vm.getCouleur());
			vmain.setTexture(vm.getTexture());
			vmain.setPoids(vm.getPoids());
	
			em.persist(vmain);
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
