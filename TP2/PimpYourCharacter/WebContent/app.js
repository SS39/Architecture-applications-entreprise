var pimpApp = angular.module('pimp', ['ngRoute', 'ngAnimate'])

pimpApp.config(function($routeProvider){
	$routeProvider
		.when('/', {
			templateUrl : './home.xhtml',
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
		.when('/bouche', {
			templateUrl : './bouche/home_bouche.xhtml',
		})
		.when('/couleur', {
			templateUrl : './couleur/home_couleur.xhtml',
		})
		.when('/corps', {
			templateUrl : './corps/home_corps.xhtml',
		})
		.when('/buste', {
			templateUrl : './buste/home_buste.xhtml',
		})
		.when('/bras', {
			templateUrl : './bras/home_bras.xhtml',
		})
		.when('/jambes', {
			templateUrl : './jambes/home_jambes.xhtml',
		})
	    .otherwise({
	        redirectTo : '/',
	    })
});