package com.gui.controllers.search;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import com.ejb.services.CouleurService;
import com.ejb.services.morphologie.BoucheService;
import com.ejb.services.morphologie.BrasService;
import com.ejb.services.morphologie.BusteService;
import com.ejb.services.morphologie.CorpsService;
import com.ejb.services.morphologie.JambesService;
import com.ejb.services.morphologie.NezService;
import com.ejb.services.morphologie.TeteService;
import com.ejb.services.morphologie.YeuxService;
import com.jpa.entities.Couleur;
import com.jpa.entities.morphologie.Bouche;
import com.jpa.entities.morphologie.Bras;
import com.jpa.entities.morphologie.Buste;
import com.jpa.entities.morphologie.Corps;
import com.jpa.entities.morphologie.Jambes;
import com.jpa.entities.morphologie.Nez;
import com.jpa.entities.morphologie.Tete;
import com.jpa.entities.morphologie.Yeux;

@ManagedBean
@RequestScoped
public class SearchController {
	
	@EJB
	private BoucheService serviceBouche;
	private Bouche paramBouche = new Bouche();
	
	@EJB
	private BrasService serviceBras;
	private Bras paramBras = new Bras();
	
	@EJB
	private BusteService serviceBuste;
	private Buste paramBuste = new Buste();
	
	@EJB
	private CorpsService serviceCorps;
	private Corps paramCorps = new Corps();

	@EJB
	private CouleurService serviceCouleur;
	private Couleur paramCouleur = new Couleur();

	@EJB
	private JambesService serviceJambes;
	private Jambes paramJambes = new Jambes();

	@EJB
	private NezService serviceNez;
	private Nez paramNez = new Nez();

	@EJB
	private TeteService serviceTete;
	private Tete paramTete = new Tete();

	@EJB
	private YeuxService serviceYeux;
	private Yeux paramYeux = new Yeux();
	
	public Bouche getParamBouche() {
		return paramBouche;
	}
	public void setParamBouche(Bouche paramBouche) {
		this.paramBouche = paramBouche;
	}
	public Bras getParamBras() {
		return paramBras;
	}
	public void setParamBras(Bras paramBras) {
		this.paramBras = paramBras;
	}
	public Buste getParamBuste() {
		return paramBuste;
	}
	public void setParamBuste(Buste paramBuste) {
		this.paramBuste = paramBuste;
	}
	public Corps getParamCorps() {
		return paramCorps;
	}
	public void setParamCorps(Corps paramCorps) {
		this.paramCorps = paramCorps;
	}
	public Couleur getParamCouleur() {
		return paramCouleur;
	}
	public void setParamCouleur(Couleur paramCouleur) {
		this.paramCouleur = paramCouleur;
	}
	public Jambes getParamJambes() {
		return paramJambes;
	}
	public void setParamJambes(Jambes paramJambes) {
		this.paramJambes = paramJambes;
	}
	public Nez getParamNez() {
		return paramNez;
	}
	public void setParamNez(Nez paramNez) {
		this.paramNez = paramNez;
	}
	public Tete getParamTete() {
		return paramTete;
	}
	public void setParamTete(Tete paramTete) {
		this.paramTete = paramTete;
	}
	public Yeux getParamYeux() {
		return paramYeux;
	}
	public void setParamYeux(Yeux paramYeux) {
		this.paramYeux = paramYeux;
	}
	
	public List<Bouche> getBouche(String id, String forme, String largeur, String hauteur, String profondeur, String couleur) {
		return serviceBouche.getBouches(id,forme,largeur,hauteur,profondeur,couleur);
	}
	
	public List<Bras> getBras(String id, String longueur, String forme) {
		return serviceBras.getBras(id,longueur,forme);
	}
	
	public List<Buste> getBustes(Integer id,Integer largeur, Integer hauteur, Integer corpulence) {
		return serviceBuste.getBustes(id.toString(),largeur.toString(),hauteur.toString(),corpulence.toString());
	}
	
	public List<Corps> getCorps(Integer id, Integer taille, Integer bras, Integer jambes, Integer buste, Integer tete) {
		return serviceCorps.getCorps(id.toString(),taille.toString(),bras.toString(),jambes.toString(),buste.toString(),tete.toString());
	}
	
	public List<Couleur> getCouleurs(String id, String label) {
		return serviceCouleur.getCouleurs(id,label);
	}
	
	public List<Jambes> getJambes(String id, String hauteur, String forme) {
		return serviceJambes.getJambes(id,hauteur,forme);
	}
	
	public List<Nez> getNez(String id,String forme,String largeur, String hauteur, String profondeur) {
		return serviceNez.getNez(id,forme,largeur,hauteur,profondeur);
	}
	
	public List<Tete> getTete(String id, String forme, String largeur, String hauteur, String nez, String bouche, String yeux) {
		return serviceTete.getTetes(id,forme,largeur,hauteur,nez,bouche,yeux);
	}
	
	public List<Yeux> getYeux(String id, String forme, String hauteur, String largeur, String profondeur, String ecartement, String couleur) {
		return serviceYeux.getYeux(id,forme,hauteur,largeur,profondeur,ecartement,couleur);
	}

    public String searchBouche() {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("bouche_id", paramBouche.getId_bouche());
        flash.put("bouche_forme", paramBouche.getForme());
        flash.put("bouche_largeur", paramBouche.getLargeur());
        flash.put("bouche_hauteur", paramBouche.getHauteur());
        flash.put("bouche_profondeur", paramBouche.getProfondeur());
        flash.put("bouche_couleur", paramBouche.getCouleur().getId_couleur());
        return "search_bouche?faces-redirect=true";
    }
	
    public String searchBras() {
    	Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("bras_id", paramBras.getId_bras());
        flash.put("bras_longueur", paramBras.getLongueur());
        flash.put("bras_forme", paramBras.getForme());
        return "search_bras?faces-redirect=true";
    }
    
    public String searchBuste() {
    	Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("buste_id", paramBuste.getId_buste());
        flash.put("buste_largeur", paramBuste.getLargeur());
        flash.put("buste_hauteur", paramBuste.getHauteur());
        flash.put("buste_corpulence", paramBuste.getCorpulence());
        return "search_buste?faces-redirect=true";
    }
    
    public String searchCorps() {
    	Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("corps_id", paramCorps.getId_corps());
        flash.put("corps_taille", paramCorps.getTaille());
        flash.put("corps_bras", paramCorps.getBras().getId_bras());
        flash.put("corps_jambes", paramCorps.getJambes().getId_jambe());
        flash.put("corps_buste", paramCorps.getId_corps());
        flash.put("corps_tete", paramCorps.getId_corps());
        return "search_corps?faces-redirect=true";
    }
    
    public String searchCouleur() {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("couleur_id", paramCouleur.getId_couleur());
        flash.put("couleur_label", paramCouleur.getLabel());
        return "search_couleur?faces-redirect=true";
    }
    
    public String searchJambes() {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("jambe_id", paramJambes.getId_jambe());
        flash.put("jambe_hauteur", paramJambes.getHauteur());
        flash.put("jambe_forme", paramJambes.getForme());
        return "search_jambe?faces-redirect=true";
    }
    
    public String searchNez() {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("nez_id", paramNez.getId_nez());
        flash.put("nez_forme", paramNez.getForme());
        flash.put("nez_largeur", paramNez.getLargeur());
        flash.put("nez_hauteur", paramNez.getHauteur());
        flash.put("nez_profondeur", paramNez.getProfondeur());
        return "search_nez?faces-redirect=true";
    }
    
    public String searchTete() {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("tete_id", paramTete.getId_tete());
        flash.put("tete_forme", paramTete.getForme());
        flash.put("tete_largeur", paramTete.getLargeur());
        flash.put("tete_hauteur", paramTete.getHauteur());
        flash.put("tete_nez", paramTete.getNez().getId_nez());
        flash.put("tete_bouche", paramTete.getBouche().getId_bouche());
        flash.put("tete_yeux", paramTete.getYeux().getId_yeux());
        return "search_tete?faces-redirect=true";
    }
    
    public String searchYeux() {
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("yeux_id", paramYeux.getId_yeux());
        flash.put("yeux_forme", paramYeux.getForme());
        flash.put("yeux_hauteur", paramYeux.getHauteur());
        flash.put("yeux_largeur", paramYeux.getLargeur());
        flash.put("yeux_profondeur", paramYeux.getProfondeur());
        flash.put("yeux_ecartement", paramYeux.getEcartement());
        flash.put("yeux_couleur", paramYeux.getCouleur().getId_couleur());
        return "search_yeux?faces-redirect=true";
    }
}
