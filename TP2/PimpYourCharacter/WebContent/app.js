var pimpApp = angular.module('pimp', ['ngRoute', 'ngAnimate'])

pimpApp.config(function($routeProvider){
	$routeProvider
		.when('/', {
			templateUrl : './home.xhtml',
		})
		.when('/tete', {
			templateUrl : './tete/home_tete.xhtml',
		})
		.when('/teteadd', {
			templateUrl : './tete/ajouter_tete.xhtml',
		})
		.when('/teteup', {
			templateUrl : './tete/modifier_tete.xhtml',
		})
		.when('/yeux', {
			templateUrl : './yeux/home_yeux.xhtml',
		})
		.when('/yeuxadd', {
			templateUrl : './yeux/ajouter_yeux.xhtml',
		})
		.when('/yeuxup', {
			templateUrl : './yeux/modifier_yeux.xhtml',
		})
		.when('/nez', {
			templateUrl : './nez/home_nez.xhtml',
		})
		.when('/nezadd', {
			templateUrl : './nez/ajouter_nez.xhtml',
		})
		.when('/nezup', {
			templateUrl : './nez/modifier_nez.xhtml',
		})
		.when('/bouche', {
			templateUrl : './bouche/home_bouche.xhtml',
		})
		.when('/boucheadd', {
			templateUrl : './bouche/ajouter_bouche.xhtml',
		})
		.when('/boucheup', {
			templateUrl : './bouche/modifier_bouche.xhtml',
		})
		.when('/couleur', {
			templateUrl : './couleur/home_couleur.xhtml',
		})
		.when('/couleuradd', {
			templateUrl : '/couleur/ajouter_couleur.xhtml',
		})
		.when('/couleurup', {
			templateUrl : './couleur/modifier_couleur.xhtml',
		})
		.when('/corps', {
			templateUrl : './corps/home_corps.xhtml',
		})
		.when('/corpsadd', {
			templateUrl : './corps/ajouter_corps.xhtml',
		})
		.when('/corpsup', {
			templateUrl : './corps/modifier_corps.xhtml',
		})
		.when('/buste', {
			templateUrl : './buste/home_buste.xhtml',
		})
		.when('/busteadd', {
			templateUrl : './buste/ajouter_buste.xhtml',
		})
		.when('/busteup', {
			templateUrl : './buste/modifier_buste.xhtml',
		})
		.when('/bras', {
			templateUrl : './bras/home_bras.xhtml',
		})
		.when('/brasadd', {
			templateUrl : './bras/ajouter_bras.xhtml',
		})
		.when('/brasup', {
			templateUrl : './bras/modifier_bras.xhtml',
		})
		.when('/jambes', {
			templateUrl : './jambes/home_jambes.xhtml',
		})
		.when('/jambesadd', {
			templateUrl : './jambes/ajouter_jambes.xhtml',
		})
		.when('/jambesup', {
			templateUrl : './jambes/modifier_jambes.xhtml',
		})
	    .otherwise({
	        redirectTo : '/',
	    })
});