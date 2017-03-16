package com.gui.controllers.search;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.gui.controllers.CouleurController;
import com.gui.controllers.morphologie.BoucheController;
import com.gui.controllers.morphologie.BrasController;
import com.gui.controllers.morphologie.BusteController;
import com.gui.controllers.morphologie.CorpsController;
import com.gui.controllers.morphologie.JambesController;
import com.gui.controllers.morphologie.NezController;
import com.gui.controllers.morphologie.TeteController;
import com.gui.controllers.morphologie.YeuxController;
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
public class SearchController {

	private BoucheController boucheController = new BoucheController();
	private Bouche searchBouche = new Bouche(-1,null,-1,-1,-1,null);
	private String simpleSearchBouche = null;
	
	private BrasController brasController = new BrasController();
	private Bras searchBras = new Bras(-1,-1,null);
	private String simplesSearchBras = null;
	
	private BusteController busteController = new BusteController();
	private Buste searchBuste = new Buste(-1,-1,-1,-1);
	private String simpleSearchBuste = null;
	
	private CorpsController corpsController = new CorpsController();
	private Corps searchCorps = new Corps(-1,-1,null,null,null,null);
	private String simpleSearchCorps = null;

	private CouleurController couleurController = new CouleurController();
	private Couleur searchCouleur = new Couleur(-1,null);
	private String simpleSearchCouleur = null;

	private JambesController jambesController = new JambesController();
	private Jambes searchJambes = new Jambes(-1, -1, null);
	private String simpleSearchJambes = null;

	private NezController nezController = new NezController();
	private Nez searchNez = new Nez(-1, null, -1, -1, -1);
	private String simpleSearchNez = null;

	private TeteController teteController = new TeteController();
	private Tete searchTete = new Tete(-1, null, -1, -1, null, null, null);
	private String simpleSearchTete = null;

	private YeuxController yeuxController = new YeuxController();
	private Yeux searchYeux = new Yeux(-1, null, -1, -1, -1, -1, null);
	private String simpleSearchYeux = null;
	
	
	public void simpleSearchParse(String search) {
			
			//Initialisation des variables de recherche
			this.simpleSearchBouche = "from Bouche where "+search;
			this.simplesSearchBras = "from Bras where "+search;
			this.simpleSearchBuste = "from Buste where "+search;
			this.simpleSearchCorps = "from Corps where "+search;
			this.simpleSearchCouleur = "from Couleur where "+search;
			this.simpleSearchJambes = "from Jambes where "+search;
			this.simpleSearchNez = "from Nez where "+search;
			this.simpleSearchTete = "from Tete where "+search;
			this.simpleSearchYeux = "from Yeux where "+search;
	}
	/*
	public void advancedSearchParse(String[][] search) {
		if (search.length == 9) {
			
			if (search[0] != null) {//Recherche pour bouche
				searchBouche = "from Bouche where ";
				if (search[0][0] != null) {//Forme
					searchBouche+="";
				}
			} else {
				searchBouche = null;
			}
			
			if (search[1] != null) {//Recherche pour bras
				searchBras = "from Bras where ";

			} else {
				searchBras = null;
			}
			
			if (search[2] != null) {//Recherche pour buste
				searchBuste = "from Buste where ";

			} else {
				searchBuste = null;
			}
			
			if (search[3] != null) {//Recherche pour corps
				searchCorps = "from Corps where ";

			} else {
				searchCorps = null;
			}
			if (search[4] != null) {//Recherche pour couleurs
				searchCouleur = "from Couleur where ";
				
			} else {
				searchCouleur = null;
			}
			
			if (search[5] != null) {//Recherche pour jambes
				searchJambes = "from Jambes where ";

			} else {
				searchJambes = null;
			}
			
			if (search[6] != null) {//Recherche pour Nez
				searchNez = "from Nez where ";
				
			} else {
				searchNez = null;
			}
			
			if (search[7] != null) {//Recherche pour tete
				searchTete = "from Tete where ";
				
			} else {
				searchTete = null;
			}
			
			if (search[8] != null) {//Recherche pour yeux
				searchYeux = "from Yeux where ";
			} else {
				searchYeux = null;
			}
		}
	}
	*/
	public List<Bouche> getSearchBouche(String searchBouche) {
		if (searchBouche == null) {
			return null;
		}
		return boucheController.getSearchBouches(searchBouche);
	}
	
	public List<Bras> getSearchBras(String searchBras) {
		if (searchBras == null) {
			return null;
		}
		return brasController.getSearchBras(searchBras);
	}
	
	public List<Buste> getSearchBuste(String searchBuste) {
		if (searchBuste == null) {
			return null;
		}
		return busteController.getSearchBustes(searchBuste);
	}
	
	public List<Corps> getSearchCorps(String searchCorps) {
		if (searchCorps == null) {
			return null;
		}
		return corpsController.getSearchCorps(searchCorps);
	}
	
	public List<Couleur> getSearchCouleurs(String searchCouleur) {
		if (searchCouleur == null) {
			return null;
		}
		return couleurController.getSearchCouleur(searchCouleur);
	}
	
	public List<Jambes> getSearchJambes(String searchJambes) {
		if (searchJambes == null) {
			return null;
		}
		return jambesController.getSearchJambes(searchJambes);
	}
	
	public List<Nez> getSearchNez(String searchNez) {
		if (searchNez == null) {
			return null;
		}
		return nezController.getSearchNez(searchNez);
	}
	
	public List<Tete> getSearchTetes(String searchTete) {
		if (searchTete == null) {
			return null;
		}
		return teteController.getSearchTetes(searchTete);
	}
	
	public List<Yeux> getSearchYeux(String searchYeux) {
		if (searchYeux == null) {
			return null;
		}
		return yeuxController.getSearchYeux(searchYeux);
	}
	
}
