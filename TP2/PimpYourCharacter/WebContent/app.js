var pimpApp = angular.module('pimp', ['ngRoute', 'ngAnimate'])

pimpApp.config(function($routeProvider){
	$routeProvider
		.when('/', {
			templateUrl : 'home.html',
		})
		.when('/tete', {
			templateUrl : 'tete.html',
			controller : 'teteCtrl'
		})
		.when('/yeux', {
			templateUrl : 'yeux.html',
			controller : 'yeuxCtrl'
		})
		.when('/nez', {
			templateUrl : 'nez.html',
			controller : 'nezCtrl'
		})
		.when('/bouche', {
			templateUrl : 'bouche.html',
			controller : 'boucheCtrl'
		})
});


pimpApp.controller('teteCtrl', function($scope){
		$scope.title = "Modélisation de la tête du personnage"
		$scope.tiles = [
			{
	 	    	 title : 'Identifiant',
	 	    	 identifiant: {
	 	    		 i1: "1",
	 	    		 i2: "2"
	 	    	 }
	 	     },
	 		 {
	 		   	 title : 'Forme',
	 	    	 forme: {
	 	    		 f1: "1",
	 	    		 f2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 		 {
	 		   	 title : 'Largeur',
	 	    	 largeur: {
	 	    		 l1: "1",
	 	    		 l2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 		 {
	 		   	 title : 'Hauteur',
	 	    	 hauteur: {
	 	    		 h1: "1",
	 	    		 h2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 	     {
	 	    	 title : 'Couleur',
	 	    	 couleur: {
	 	    		 c1: '1',
	 	    		 c2: '2'
	 	    	 }
	 	     },
			{
				title : 'Yeux',
				yeux: {
					y1: '1',
					y2: '2'
				}
			},
			{
				title : 'Nez',
				nez: {
					n1: '1',
					n2: '2'
				}
			},
			{
				title : 'Bouche',
				bouche: {
					b1: '1',
					b2: '2'
				}
			}
		]
	})
	
pimpApp.controller('yeuxCtrl', function($scope){
		$scope.title = "Modélisation des yeux du personnage"
		$scope.tiles = [
	 	     {
	 	    	 title : 'Identifiant',
	 	    	 identifiant: {
	 	    		 i1: "1",
	 	    		 i2: "2"
	 	    	 }
	 	     },
	 		 {
	 		   	 title : 'Forme',
	 	    	 forme: {
	 	    		 f1: "1",
	 	    		 f2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 		 {
	 		   	 title : 'Largeur',
	 	    	 largeur: {
	 	    		 l1: "1",
	 	    		 l2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 		 {
	 		   	 title : 'Hauteur',
	 	    	 hauteur: {
	 	    		 h1: "1",
	 	    		 h2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 		 {
	 			 title : 'Écartement',
	 	    	 ecartement: {
	 	    		 e1: "1",
	 	    		 e2: "2"
	 	    	 }
	 		 },
	 		 
	 		 {
	 		   	 title : 'Couleur',
	 	    	 couleur: {
	 	    		 c1: "1",
	 	    		 c2: "2"
	 	    	 }
	 		    	
	 		 }
	 	]
			
	})
	
pimpApp.controller('nezCtrl', function($scope){
		$scope.title = "Modélisation du nez du personnage"
		$scope.tiles = [
			{
	 	    	 title : 'Identifiant',
	 	    	 identifiant: {
	 	    		 i1: "1",
	 	    		 i2: "2"
	 	    	 }
	 	     },
	 		 {
	 		   	 title : 'Forme',
	 	    	 forme: {
	 	    		 f1: "1",
	 	    		 f2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 		 {
	 		   	 title : 'Largeur',
	 	    	 largeur: {
	 	    		 l1: "1",
	 	    		 l2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 		 {
	 		   	 title : 'Hauteur',
	 	    	 hauteur: {
	 	    		 h1: "1",
	 	    		 h2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 	     {
	 	    	 title : 'Profondeur',
	 	    	 profondeur: {
	 	    		 p1: '1',
	 	    		 p2: '2',
	 	    	 }
	 		    	
	 	     }, 
	 	     {
	 	    	 title : 'Couleur',
	 	    	 couleur: {
	 	    		 c1: '1',
	 	    		 c2: '2'
	 	    	 }
	 	     }
	 	]
	})
	
pimpApp.controller('boucheCtrl', function($scope){
		$scope.title = "Modélisation de la bouche du personnage"
		$scope.tiles = [
			{
	 	    	 title : 'Identifiant',
	 	    	 identifiant: {
	 	    		 i1: "1",
	 	    		 i2: "2"
	 	    	 }
	 	     },
	 		 {
	 		   	 title : 'Forme',
	 	    	 forme: {
	 	    		 f1: "1",
	 	    		 f2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 		 {
	 		   	 title : 'Largeur',
	 	    	 largeur: {
	 	    		 l1: "1",
	 	    		 l2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 		 {
	 		   	 title : 'Hauteur',
	 	    	 hauteur: {
	 	    		 h1: "1",
	 	    		 h2: "2"
	 	    	 }
	 		    	 
	 		 }, 
	 	     {
	 	    	 title : 'Profondeur',
	 	    	 profondeur: {
	 	    		 p1: '1',
	 	    		 p2: '2',
	 	    	 }
	 		    	
	 	     }, 
	 	     {
	 	    	 title : 'Couleur',
	 	    	 couleur: {
	 	    		 c1: '1',
	 	    		 c2: '2'
	 	    	 }
	 	     }
 		]
	})