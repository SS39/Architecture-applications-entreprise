var pimpApp = angular.module('pimp', ['ngRoute', 'ngAnimate'])

pimpApp.config(function($routeProvider){
	$routeProvider
		.when('/', {
			templateUrl : './home.xhtml',
		})
		.when('/accessoire', {
			templateUrl : './accessoire/home_accessoire.xhtml',
		})
		.when('/arme', {
			templateUrl : './arme/home_arme.xhtml',
		})
		.when('/bouche', {
			templateUrl : './bouche/home_bouche.xhtml',
		})
		.when('/bouclier', {
			templateUrl : './bouclier/home_bouclier.xhtml',
		})
		.when('/bras', {
			templateUrl : './bras/home_bras.xhtml',
		})
		.when('/buste', {
			templateUrl : './buste/home_buste.xhtml',
		})
		.when('/cat1', {
			templateUrl : './categorie_accessoire/home_categorie_accessoire.xhtml',
		})
		.when('/cat2', {
			templateUrl : './categorie_arme/home_categorie_arme.xhtml',
		})
		.when('/corps', {
			templateUrl : './corps/home_corps.xhtml',
		})
		.when('/couleur', {
			templateUrl : './couleur/home_couleur.xhtml',
		})
		.when('/ethnie', {
			templateUrl : './ethnie/home_ethnie.xhtml',
		})
		.when('/genre', {
			templateUrl : './genre/home_genre.xhtml',
		})
		.when('/jambe', {
			templateUrl : './jambes/home_jambes.xhtml',
		})
		.when('/nez', {
			templateUrl : './nez/home_nez.xhtml',
		})
		.when('/personnage', {
			templateUrl : './personnage/home_personnage.xhtml',
		})
		.when('/position', {
			templateUrl : './position/home_position.xhtml',
		})
		.when('/tatouage', {
			templateUrl : './tatouage/home_tatouage.xhtml',
		})
		.when('/tete', {
			templateUrl : './tete/home_tete.xhtml',
		})
		.when('/texture', {
			templateUrl : './texture/home_texture.xhtml',
		})
		.when('/vet1', {
			templateUrl : './vbas/home_vbas.xhtml',
		})
		.when('/vet2', {
			templateUrl : './vhaut/home_vhaut.xhtml',
		})
		.when('/vet3', {
			templateUrl : './vmain/home_vmain.xhtml',
		})
		.when('/vet4', {
			templateUrl : './vpied/home_vpied.xhtml',
		})
		.when('/vet5', {
			templateUrl : './vtete/home_vtete.xhtml',
		})
		.when('/yeux', {
			templateUrl : './yeux/home_yeux.xhtml',
		})
	    .otherwise({
	        redirectTo : '/',
	    })
});