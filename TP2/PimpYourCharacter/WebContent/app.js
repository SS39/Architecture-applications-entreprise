var pimpApp = angular.module('pimp', ['ngRoute', 'ngAnimate'])

pimpApp.config(function($routeProvider){
	$routeProvider
		.when('/', {
			templateUrl : '/index.xhtml',
		})
		.when('/tete', {
			templateUrl : './tete/home_tete.xhtml',
		})
		.when('/yeux', {
			templateUrl : './yeux/home_yeux.xhtml',
		})
		.when('/nez', {
			templateUrl : './nez/home_nez.xhtml',
		})
		.when('/nezadd', {
			templateUrl : './nez/ajouter_nez.xhtml',
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
		.when('/bouchedel', {
			templateUrl : './bouche/supprimer_bouche.xhtml',
		})
		.when('/couleur', {
			templateUrl : './couleur/home_couleur.xhtml',
		})
		.when('/couleuradd', {
			templateUrl : './couleur/ajouter_couleur.xhtml',
		})
});