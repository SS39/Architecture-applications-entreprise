-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 09 Mars 2017 à 05:25
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `pimp_your_character`
--

-- --------------------------------------------------------

--
-- Structure de la table `accessoire`
--

CREATE TABLE `accessoire` (
  `id_accessoire` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  `id_categorie_accessoire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `arme`
--

CREATE TABLE `arme` (
  `id_arme` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  `poids` int(11) NOT NULL,
  `id_categorie_arme` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `bouche`
--

CREATE TABLE `bouche` (
  `id_bouche` int(11) NOT NULL,
  `forme` varchar(50) NOT NULL,
  `largeur` int(11) NOT NULL,
  `hauteur` int(11) NOT NULL,
  `profondeur` int(11) NOT NULL,
  `id_couleur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `bouclier`
--

CREATE TABLE `bouclier` (
  `id_bouclier` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  `poids` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `bras`
--

CREATE TABLE `bras` (
  `id_bras` int(11) NOT NULL,
  `longueur` int(11) NOT NULL,
  `forme` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `buste`
--

CREATE TABLE `buste` (
  `id_buste` int(11) NOT NULL,
  `hauteur` int(11) NOT NULL,
  `largeur` int(11) NOT NULL,
  `corpulence` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `categorie_accessoire`
--

CREATE TABLE `categorie_accessoire` (
  `id_categorie_accessoire` int(11) NOT NULL,
  `label` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `categorie_arme`
--

CREATE TABLE `categorie_arme` (
  `id_categorie_arme` int(11) NOT NULL,
  `categorie_arme` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `categorie_arme`
--

INSERT INTO `categorie_arme` (`id_categorie_arme`, `categorie_arme`) VALUES
(1, 'arme de mêlée'),
(2, 'arme lourde'),
(3, 'arme de contact'),
(4, 'arc'),
(5, 'arbalète'),
(6, 'sarbacane'),
(7, 'lance'),
(8, 'fusil'),
(9, 'bâton de jet'),
(10, 'sagaie'),
(11, 'arme de poing'),
(12, 'arme d\'épaule'),
(13, 'pistolet');

-- --------------------------------------------------------

--
-- Structure de la table `corps`
--

CREATE TABLE `corps` (
  `id_corps` int(11) NOT NULL,
  `id_bras` int(11) NOT NULL,
  `id_jambe` int(11) NOT NULL,
  `id_buste` int(11) NOT NULL,
  `id_tete` int(11) NOT NULL,
  `taille` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `couleur`
--

CREATE TABLE `couleur` (
  `id_couleur` int(11) NOT NULL,
  `label` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `couleur`
--

INSERT INTO `couleur` (`id_couleur`, `label`) VALUES
(1, 'Abricot'),
(2, 'Acajou'),
(3, 'Aigue-marine'),
(4, 'Alezan'),
(5, 'Amande'),
(6, 'Amarante'),
(7, 'Ambre'),
(8, 'Améthyste'),
(9, 'Anthracite'),
(10, 'Aquilain'),
(11, 'Ardoise'),
(12, 'Argent'),
(13, 'Aubergine'),
(14, 'Auburn'),
(15, 'Aurore'),
(16, 'Avocat'),
(17, 'Azur'),
(18, 'Baillet'),
(19, 'Basané'),
(20, 'Beige'),
(21, 'Beurre'),
(22, 'Bis'),
(23, 'Bisque'),
(24, 'Bistre'),
(25, 'Bitume'),
(26, 'Blanc'),
(27, 'Blanc cassé'),
(28, 'Blanc lunaire'),
(29, 'Blé'),
(48, 'Bleu'),
(30, 'Bleu acier'),
(31, 'Bleu barbeau'),
(32, 'Bleu canard'),
(33, 'Bleu céleste'),
(34, 'Bleu charrette'),
(35, 'Bleu ciel'),
(36, 'Bleu de cobalt'),
(37, 'Bleu de Prusse'),
(38, 'Bleu électrique'),
(39, 'Bleu givré'),
(40, 'Bleu Klein'),
(41, 'Bleu Majorelle'),
(42, 'Bleu marine'),
(43, 'Bleu nuit'),
(44, 'Bleu outremer'),
(45, 'Bleu paon'),
(46, 'Bleu Persan'),
(47, 'Bleu pétrole'),
(49, 'Bleu roi'),
(50, 'Bleu turquin'),
(52, 'Blond'),
(51, 'Blond vénitien'),
(53, 'Bordeaux'),
(54, 'Bouton d\'or'),
(55, 'Brique'),
(56, 'Bronze'),
(57, 'Brou de noix'),
(58, 'Brun'),
(59, 'Caca d\'oie'),
(60, 'Cacao'),
(61, 'Cachou'),
(62, 'Caeruleum'),
(63, 'Café'),
(64, 'Café au lait'),
(65, 'Cannelle'),
(66, 'Capucine'),
(67, 'Caramel'),
(68, 'Carmin'),
(69, 'Carotte'),
(70, 'Chamois'),
(71, 'Chartreuse'),
(72, 'Châtain'),
(73, 'Chaudron'),
(74, 'Chocolat'),
(75, 'Cinabre'),
(76, 'Citrouille'),
(164, 'Coquelicot'),
(77, 'Coquille d\'oeuf'),
(78, 'Corail'),
(79, 'Cramoisi'),
(80, 'Crème'),
(81, 'Cuisse de nymphe'),
(82, 'Cuisse de nymphe émue'),
(83, 'Cuivre'),
(84, 'Cyan'),
(85, 'Ecarlate'),
(86, 'Ecru'),
(87, 'Emeraude'),
(88, 'Fauve'),
(89, 'Flave'),
(90, 'Fraise'),
(91, 'Fraise écrasée'),
(92, 'Framboise'),
(93, 'Fuchsia'),
(94, 'Fumée'),
(95, 'Garance'),
(96, 'Glauque'),
(97, 'Glycine'),
(98, 'Grège'),
(99, 'Grenadine'),
(100, 'Grenat'),
(101, 'Gris'),
(102, 'Gris acier'),
(103, 'Gris de Payne'),
(104, 'Gris fer'),
(105, 'Gris perle'),
(106, 'Groseille'),
(108, 'Gueules'),
(109, 'Héliotrope'),
(110, 'Incarnat'),
(111, 'Indigo'),
(112, 'Indigo (teinture)'),
(113, 'Isabelle'),
(114, 'Ivoire'),
(116, 'Jaune canari'),
(117, 'Jaune chartreuse'),
(118, 'Jaune citron'),
(119, 'Jaune d\'or'),
(115, 'Jaune de cobalt'),
(120, 'Jaune de Mars'),
(121, 'Jaune de Naples'),
(122, 'Jaune impérial'),
(123, 'Jaune mimosa'),
(124, 'Kaki'),
(125, 'Lapis-lazuli'),
(126, 'Lavallière'),
(127, 'Lavande'),
(128, 'Lie de vin'),
(129, 'Lilas'),
(130, 'Lime'),
(131, 'Lin'),
(132, 'Magenta'),
(133, 'Maïs'),
(134, 'Malachite'),
(135, 'Mandarine'),
(136, 'Marron'),
(137, 'Mastic'),
(138, 'Mauve'),
(139, 'Menthe'),
(140, 'Moutarde'),
(141, 'Nacarat'),
(142, 'Nankin'),
(143, 'Noir'),
(144, 'Noir animal'),
(145, 'Noir d\'aniline'),
(146, 'Noir d\'ivoire'),
(147, 'Noir de carbone'),
(148, 'Noir de fumée'),
(149, 'Noisette'),
(150, 'Ocre'),
(151, 'Ocre rouge'),
(152, 'Olive'),
(153, 'Or'),
(154, 'Orange'),
(155, 'Orange brûlé'),
(156, 'Orchidée'),
(157, 'Orpiment'),
(158, 'Paille'),
(159, 'Parme'),
(107, 'Pastel des teinturiers'),
(160, 'Pelure d\'oignon'),
(161, 'Pervenche'),
(162, 'Pistache'),
(163, 'Poil de chameau'),
(165, 'Pourpre'),
(166, 'Prasin'),
(167, 'Prune'),
(168, 'Puce'),
(169, 'Rose'),
(170, 'Rose Mountbatten'),
(171, 'Rouge anglais'),
(172, 'Rouge cardinal'),
(173, 'Rouge cerise'),
(174, 'Rouge d\'alizarine'),
(175, 'Rouge d\'Andrinople'),
(177, 'Rouge de Falun'),
(176, 'Rouge feu'),
(178, 'Rouge sang'),
(179, 'Rouge tomette'),
(180, 'Rouille'),
(181, 'Roux'),
(182, 'Rubis'),
(183, 'Sable'),
(184, 'Sable (héraldique)'),
(185, 'Safre'),
(186, 'Sang de boeuf'),
(187, 'Sanguine'),
(188, 'Saphir'),
(189, 'Sarcelle'),
(190, 'Saumon'),
(191, 'Sépia'),
(192, 'Sinople'),
(193, 'Smalt'),
(194, 'Smaragdin'),
(195, 'Soufre'),
(196, 'Souris'),
(197, 'Tabac'),
(198, 'Taupe'),
(199, 'Terre d\'ombre'),
(200, 'Terre de Sienne'),
(201, 'Terre de Sienne brûlée'),
(202, 'Tomate'),
(203, 'Topaze'),
(204, 'Tourterelle'),
(205, 'Turquoise'),
(206, 'Vanille'),
(207, 'Vermeil'),
(208, 'Vermillon'),
(209, 'Vert'),
(210, 'Vert armée'),
(211, 'Vert bouteille'),
(212, 'Vert céladon'),
(213, 'Vert chartreuse'),
(214, 'Vert d\'eau'),
(215, 'Vert de chrome'),
(217, 'Vert de Hooker'),
(218, 'Vert de vessie'),
(219, 'Vert épinard'),
(220, 'Vert gazon'),
(221, 'Vert impérial'),
(222, 'Vert lichen'),
(223, 'Vert mélèze'),
(224, 'Vert mousse'),
(225, 'Vert perroquet'),
(226, 'Vert poireau'),
(227, 'Vert pomme'),
(228, 'Vert prairie'),
(229, 'Vert printemps'),
(230, 'Vert sapin'),
(231, 'Vert sauge'),
(232, 'Vert tilleul'),
(233, 'Vert Véronèse'),
(216, 'Vert-de-gris'),
(234, 'Violet'),
(235, 'Violet d\'évêque'),
(236, 'Violine'),
(237, 'Viride'),
(238, 'Zinzolin');

-- --------------------------------------------------------

--
-- Structure de la table `ethnie`
--

CREATE TABLE `ethnie` (
  `id_ethnie` int(11) NOT NULL,
  `label` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `ethnie`
--

INSERT INTO `ethnie` (`id_ethnie`, `label`) VALUES
(2, 'Aborigènes d\'Australie'),
(3, 'Afro-américain'),
(1, 'Amérindien'),
(4, 'Apache'),
(5, 'Catalan'),
(6, 'Celte'),
(7, 'Chinois Han'),
(8, 'Germain'),
(9, 'Indiens');

-- --------------------------------------------------------

--
-- Structure de la table `genre`
--

CREATE TABLE `genre` (
  `id_genre` int(11) NOT NULL,
  `label` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `genre`
--

INSERT INTO `genre` (`id_genre`, `label`) VALUES
(3, 'Autre'),
(1, 'Féminin'),
(2, 'Masculin');

-- --------------------------------------------------------

--
-- Structure de la table `jambe`
--

CREATE TABLE `jambe` (
  `id_jambe` int(11) NOT NULL,
  `hauteur` int(11) NOT NULL,
  `forme` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `nez`
--

CREATE TABLE `nez` (
  `id_nez` int(11) NOT NULL,
  `hauteur` int(11) NOT NULL,
  `largeur` int(11) NOT NULL,
  `profondeur` int(11) NOT NULL,
  `forme` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnage`
--

CREATE TABLE `personnage` (
  `id_personnage` int(11) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `id_ethnie` int(11) NOT NULL,
  `id_genre` int(11) NOT NULL,
  `id_vbas` int(11) NOT NULL,
  `id_vhaut` int(11) NOT NULL,
  `id_corps` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnage_accessoire`
--

CREATE TABLE `personnage_accessoire` (
  `id_personnage` int(11) NOT NULL,
  `id_accessoire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnage_arme`
--

CREATE TABLE `personnage_arme` (
  `id_personnage` int(11) NOT NULL,
  `id_arme` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnage_bouclier`
--

CREATE TABLE `personnage_bouclier` (
  `id_personnage` int(11) NOT NULL,
  `id_bouclier` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnage_tatouage_position`
--

CREATE TABLE `personnage_tatouage_position` (
  `id_personnage` int(11) NOT NULL,
  `id_position` int(11) NOT NULL,
  `id_tatouage` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnage_vmain`
--

CREATE TABLE `personnage_vmain` (
  `id_personnage` int(11) NOT NULL,
  `id_vmain` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnage_vpied`
--

CREATE TABLE `personnage_vpied` (
  `id_personnage` int(11) NOT NULL,
  `id_vpied` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `personnage_vtete`
--

CREATE TABLE `personnage_vtete` (
  `id_personnage` int(11) NOT NULL,
  `id_vtete` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `position`
--

CREATE TABLE `position` (
  `id_position` int(11) NOT NULL,
  `label` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `tatouage`
--

CREATE TABLE `tatouage` (
  `id_tatouage` int(11) NOT NULL,
  `label` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `tete`
--

CREATE TABLE `tete` (
  `id_tete` int(11) NOT NULL,
  `id_nez` int(11) NOT NULL,
  `id_bouche` int(11) NOT NULL,
  `id_yeux` int(11) NOT NULL,
  `hauteur` int(11) NOT NULL,
  `largeur` int(11) NOT NULL,
  `forme` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `texture`
--

CREATE TABLE `texture` (
  `id_texture` int(11) NOT NULL,
  `label` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contenu de la table `texture`
--

INSERT INTO `texture` (`id_texture`, `label`) VALUES
(14, 'Acier'),
(5, 'Acrylique'),
(13, 'Bambou'),
(12, 'Bois'),
(10, 'Coton'),
(11, 'Cuir rigide'),
(8, 'Cuir souple'),
(6, 'Elasthane'),
(2, 'Jute'),
(7, 'Laine'),
(3, 'Lin'),
(16, 'Métal'),
(15, 'Os'),
(1, 'Polyester'),
(9, 'Soie'),
(4, 'Velour');

-- --------------------------------------------------------

--
-- Structure de la table `vbas`
--

CREATE TABLE `vbas` (
  `id_vbas` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  `poids` int(11) NOT NULL,
  `id_texture` int(11) NOT NULL,
  `id_couleur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `vhaut`
--

CREATE TABLE `vhaut` (
  `id_vhaut` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  `poids` int(11) NOT NULL,
  `id_texture` int(11) NOT NULL,
  `id_couleur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `vmain`
--

CREATE TABLE `vmain` (
  `id_vmain` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  `poids` int(11) NOT NULL,
  `id_texture` int(11) NOT NULL,
  `id_couleur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `vpied`
--

CREATE TABLE `vpied` (
  `id_vpied` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  `poids` int(11) NOT NULL,
  `id_texture` int(11) NOT NULL,
  `id_couleur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `vtete`
--

CREATE TABLE `vtete` (
  `id_vtete` int(11) NOT NULL,
  `label` varchar(50) NOT NULL,
  `poids` int(11) NOT NULL,
  `id_texture` int(11) NOT NULL,
  `id_couleur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `yeux`
--

CREATE TABLE `yeux` (
  `id_yeux` int(11) NOT NULL,
  `forme` varchar(50) NOT NULL,
  `hauteur` int(11) NOT NULL,
  `largeur` int(11) NOT NULL,
  `profondeur` int(11) NOT NULL,
  `ecartement` int(11) NOT NULL,
  `id_couleur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `accessoire`
--
ALTER TABLE `accessoire`
  ADD PRIMARY KEY (`id_accessoire`),
  ADD UNIQUE KEY `label` (`label`),
  ADD KEY `id_categorie_accessoire` (`id_categorie_accessoire`);

--
-- Index pour la table `arme`
--
ALTER TABLE `arme`
  ADD PRIMARY KEY (`id_arme`),
  ADD UNIQUE KEY `label` (`label`),
  ADD KEY `id_categorie_arme` (`id_categorie_arme`);

--
-- Index pour la table `bouche`
--
ALTER TABLE `bouche`
  ADD PRIMARY KEY (`id_bouche`),
  ADD KEY `id_couleur` (`id_couleur`);

--
-- Index pour la table `bouclier`
--
ALTER TABLE `bouclier`
  ADD PRIMARY KEY (`id_bouclier`),
  ADD UNIQUE KEY `label` (`label`);

--
-- Index pour la table `bras`
--
ALTER TABLE `bras`
  ADD PRIMARY KEY (`id_bras`);

--
-- Index pour la table `buste`
--
ALTER TABLE `buste`
  ADD PRIMARY KEY (`id_buste`);

--
-- Index pour la table `categorie_accessoire`
--
ALTER TABLE `categorie_accessoire`
  ADD PRIMARY KEY (`id_categorie_accessoire`);

--
-- Index pour la table `categorie_arme`
--
ALTER TABLE `categorie_arme`
  ADD PRIMARY KEY (`id_categorie_arme`);

--
-- Index pour la table `corps`
--
ALTER TABLE `corps`
  ADD PRIMARY KEY (`id_corps`),
  ADD KEY `id_jambe` (`id_jambe`),
  ADD KEY `id_bras` (`id_bras`),
  ADD KEY `id_buste` (`id_buste`),
  ADD KEY `id_tete` (`id_tete`);

--
-- Index pour la table `couleur`
--
ALTER TABLE `couleur`
  ADD PRIMARY KEY (`id_couleur`),
  ADD UNIQUE KEY `label` (`label`);

--
-- Index pour la table `ethnie`
--
ALTER TABLE `ethnie`
  ADD PRIMARY KEY (`id_ethnie`),
  ADD UNIQUE KEY `label` (`label`);

--
-- Index pour la table `genre`
--
ALTER TABLE `genre`
  ADD PRIMARY KEY (`id_genre`),
  ADD UNIQUE KEY `label` (`label`);

--
-- Index pour la table `jambe`
--
ALTER TABLE `jambe`
  ADD PRIMARY KEY (`id_jambe`);

--
-- Index pour la table `nez`
--
ALTER TABLE `nez`
  ADD PRIMARY KEY (`id_nez`);

--
-- Index pour la table `personnage`
--
ALTER TABLE `personnage`
  ADD PRIMARY KEY (`id_personnage`),
  ADD UNIQUE KEY `nom` (`nom`),
  ADD KEY `id_ethnie` (`id_ethnie`),
  ADD KEY `id_genre` (`id_genre`),
  ADD KEY `id_vbas` (`id_vbas`),
  ADD KEY `id_vhaut` (`id_vhaut`),
  ADD KEY `id_corps` (`id_corps`);

--
-- Index pour la table `personnage_accessoire`
--
ALTER TABLE `personnage_accessoire`
  ADD PRIMARY KEY (`id_personnage`,`id_accessoire`),
  ADD KEY `id_accessoire` (`id_accessoire`);

--
-- Index pour la table `personnage_arme`
--
ALTER TABLE `personnage_arme`
  ADD PRIMARY KEY (`id_personnage`,`id_arme`),
  ADD KEY `id_arme` (`id_arme`);

--
-- Index pour la table `personnage_bouclier`
--
ALTER TABLE `personnage_bouclier`
  ADD PRIMARY KEY (`id_personnage`,`id_bouclier`),
  ADD KEY `id_bouclier` (`id_bouclier`);

--
-- Index pour la table `personnage_tatouage_position`
--
ALTER TABLE `personnage_tatouage_position`
  ADD PRIMARY KEY (`id_personnage`,`id_position`),
  ADD KEY `id_position` (`id_position`),
  ADD KEY `id_tatouage` (`id_tatouage`);

--
-- Index pour la table `personnage_vmain`
--
ALTER TABLE `personnage_vmain`
  ADD PRIMARY KEY (`id_personnage`,`id_vmain`),
  ADD KEY `id_vmain` (`id_vmain`);

--
-- Index pour la table `personnage_vpied`
--
ALTER TABLE `personnage_vpied`
  ADD PRIMARY KEY (`id_personnage`,`id_vpied`),
  ADD KEY `id_vpied` (`id_vpied`);

--
-- Index pour la table `personnage_vtete`
--
ALTER TABLE `personnage_vtete`
  ADD PRIMARY KEY (`id_personnage`,`id_vtete`),
  ADD KEY `id_vtete` (`id_vtete`);

--
-- Index pour la table `position`
--
ALTER TABLE `position`
  ADD PRIMARY KEY (`id_position`),
  ADD UNIQUE KEY `label` (`label`);

--
-- Index pour la table `tatouage`
--
ALTER TABLE `tatouage`
  ADD PRIMARY KEY (`id_tatouage`);

--
-- Index pour la table `tete`
--
ALTER TABLE `tete`
  ADD PRIMARY KEY (`id_tete`),
  ADD KEY `id_nez` (`id_nez`),
  ADD KEY `id_bouche` (`id_bouche`),
  ADD KEY `id_yeux` (`id_yeux`);

--
-- Index pour la table `texture`
--
ALTER TABLE `texture`
  ADD PRIMARY KEY (`id_texture`),
  ADD UNIQUE KEY `label` (`label`);

--
-- Index pour la table `vbas`
--
ALTER TABLE `vbas`
  ADD PRIMARY KEY (`id_vbas`),
  ADD UNIQUE KEY `label` (`label`),
  ADD KEY `id_texture` (`id_texture`),
  ADD KEY `id_couleur` (`id_couleur`);

--
-- Index pour la table `vhaut`
--
ALTER TABLE `vhaut`
  ADD PRIMARY KEY (`id_vhaut`),
  ADD UNIQUE KEY `label` (`label`),
  ADD KEY `id_texture` (`id_texture`),
  ADD KEY `id_couleur` (`id_couleur`);

--
-- Index pour la table `vmain`
--
ALTER TABLE `vmain`
  ADD PRIMARY KEY (`id_vmain`),
  ADD UNIQUE KEY `label` (`label`),
  ADD KEY `id_texture` (`id_texture`),
  ADD KEY `id_couleur` (`id_couleur`);

--
-- Index pour la table `vpied`
--
ALTER TABLE `vpied`
  ADD PRIMARY KEY (`id_vpied`),
  ADD UNIQUE KEY `label` (`label`),
  ADD KEY `id_texture` (`id_texture`),
  ADD KEY `id_couleur` (`id_couleur`);

--
-- Index pour la table `vtete`
--
ALTER TABLE `vtete`
  ADD PRIMARY KEY (`id_vtete`),
  ADD UNIQUE KEY `label` (`label`),
  ADD KEY `id_texture` (`id_texture`),
  ADD KEY `id_couleur` (`id_couleur`);

--
-- Index pour la table `yeux`
--
ALTER TABLE `yeux`
  ADD PRIMARY KEY (`id_yeux`),
  ADD KEY `id_couleur` (`id_couleur`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `accessoire`
--
ALTER TABLE `accessoire`
  MODIFY `id_accessoire` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `arme`
--
ALTER TABLE `arme`
  MODIFY `id_arme` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `bouche`
--
ALTER TABLE `bouche`
  MODIFY `id_bouche` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `bouclier`
--
ALTER TABLE `bouclier`
  MODIFY `id_bouclier` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `bras`
--
ALTER TABLE `bras`
  MODIFY `id_bras` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `buste`
--
ALTER TABLE `buste`
  MODIFY `id_buste` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `categorie_accessoire`
--
ALTER TABLE `categorie_accessoire`
  MODIFY `id_categorie_accessoire` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `categorie_arme`
--
ALTER TABLE `categorie_arme`
  MODIFY `id_categorie_arme` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT pour la table `corps`
--
ALTER TABLE `corps`
  MODIFY `id_corps` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `couleur`
--
ALTER TABLE `couleur`
  MODIFY `id_couleur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=239;
--
-- AUTO_INCREMENT pour la table `ethnie`
--
ALTER TABLE `ethnie`
  MODIFY `id_ethnie` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT pour la table `genre`
--
ALTER TABLE `genre`
  MODIFY `id_genre` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT pour la table `jambe`
--
ALTER TABLE `jambe`
  MODIFY `id_jambe` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `nez`
--
ALTER TABLE `nez`
  MODIFY `id_nez` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `personnage`
--
ALTER TABLE `personnage`
  MODIFY `id_personnage` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `position`
--
ALTER TABLE `position`
  MODIFY `id_position` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `tatouage`
--
ALTER TABLE `tatouage`
  MODIFY `id_tatouage` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `tete`
--
ALTER TABLE `tete`
  MODIFY `id_tete` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `texture`
--
ALTER TABLE `texture`
  MODIFY `id_texture` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT pour la table `vbas`
--
ALTER TABLE `vbas`
  MODIFY `id_vbas` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `vhaut`
--
ALTER TABLE `vhaut`
  MODIFY `id_vhaut` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `vmain`
--
ALTER TABLE `vmain`
  MODIFY `id_vmain` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `vpied`
--
ALTER TABLE `vpied`
  MODIFY `id_vpied` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `vtete`
--
ALTER TABLE `vtete`
  MODIFY `id_vtete` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `yeux`
--
ALTER TABLE `yeux`
  MODIFY `id_yeux` int(11) NOT NULL AUTO_INCREMENT;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `accessoire`
--
ALTER TABLE `accessoire`
  ADD CONSTRAINT `accessoire_ibfk_1` FOREIGN KEY (`id_categorie_accessoire`) REFERENCES `categorie_accessoire` (`id_categorie_accessoire`);

--
-- Contraintes pour la table `arme`
--
ALTER TABLE `arme`
  ADD CONSTRAINT `arme_ibfk_1` FOREIGN KEY (`id_categorie_arme`) REFERENCES `categorie_arme` (`id_categorie_arme`);

--
-- Contraintes pour la table `bouche`
--
ALTER TABLE `bouche`
  ADD CONSTRAINT `bouche_ibfk_1` FOREIGN KEY (`id_couleur`) REFERENCES `couleur` (`id_couleur`);

--
-- Contraintes pour la table `corps`
--
ALTER TABLE `corps`
  ADD CONSTRAINT `corps_ibfk_1` FOREIGN KEY (`id_jambe`) REFERENCES `jambe` (`id_jambe`),
  ADD CONSTRAINT `corps_ibfk_2` FOREIGN KEY (`id_bras`) REFERENCES `bras` (`id_bras`),
  ADD CONSTRAINT `corps_ibfk_3` FOREIGN KEY (`id_buste`) REFERENCES `buste` (`id_buste`),
  ADD CONSTRAINT `corps_ibfk_4` FOREIGN KEY (`id_tete`) REFERENCES `tete` (`id_tete`);

--
-- Contraintes pour la table `personnage`
--
ALTER TABLE `personnage`
  ADD CONSTRAINT `personnage_ibfk_1` FOREIGN KEY (`id_ethnie`) REFERENCES `ethnie` (`id_ethnie`),
  ADD CONSTRAINT `personnage_ibfk_2` FOREIGN KEY (`id_genre`) REFERENCES `genre` (`id_genre`),
  ADD CONSTRAINT `personnage_ibfk_3` FOREIGN KEY (`id_vbas`) REFERENCES `vbas` (`id_vbas`),
  ADD CONSTRAINT `personnage_ibfk_4` FOREIGN KEY (`id_vhaut`) REFERENCES `vhaut` (`id_vhaut`),
  ADD CONSTRAINT `personnage_ibfk_5` FOREIGN KEY (`id_corps`) REFERENCES `corps` (`id_corps`);

--
-- Contraintes pour la table `personnage_accessoire`
--
ALTER TABLE `personnage_accessoire`
  ADD CONSTRAINT `personnage_accessoire_ibfk_1` FOREIGN KEY (`id_personnage`) REFERENCES `personnage` (`id_personnage`),
  ADD CONSTRAINT `personnage_accessoire_ibfk_2` FOREIGN KEY (`id_accessoire`) REFERENCES `accessoire` (`id_accessoire`);

--
-- Contraintes pour la table `personnage_arme`
--
ALTER TABLE `personnage_arme`
  ADD CONSTRAINT `personnage_arme_ibfk_1` FOREIGN KEY (`id_personnage`) REFERENCES `personnage` (`id_personnage`),
  ADD CONSTRAINT `personnage_arme_ibfk_2` FOREIGN KEY (`id_arme`) REFERENCES `arme` (`id_arme`);

--
-- Contraintes pour la table `personnage_bouclier`
--
ALTER TABLE `personnage_bouclier`
  ADD CONSTRAINT `personnage_bouclier_ibfk_1` FOREIGN KEY (`id_personnage`) REFERENCES `personnage` (`id_personnage`),
  ADD CONSTRAINT `personnage_bouclier_ibfk_2` FOREIGN KEY (`id_bouclier`) REFERENCES `bouclier` (`id_bouclier`);

--
-- Contraintes pour la table `personnage_tatouage_position`
--
ALTER TABLE `personnage_tatouage_position`
  ADD CONSTRAINT `personnage_tatouage_position_ibfk_1` FOREIGN KEY (`id_personnage`) REFERENCES `personnage` (`id_personnage`),
  ADD CONSTRAINT `personnage_tatouage_position_ibfk_2` FOREIGN KEY (`id_position`) REFERENCES `position` (`id_position`),
  ADD CONSTRAINT `personnage_tatouage_position_ibfk_3` FOREIGN KEY (`id_tatouage`) REFERENCES `tatouage` (`id_tatouage`);

--
-- Contraintes pour la table `personnage_vmain`
--
ALTER TABLE `personnage_vmain`
  ADD CONSTRAINT `personnage_vmain_ibfk_1` FOREIGN KEY (`id_personnage`) REFERENCES `personnage` (`id_personnage`),
  ADD CONSTRAINT `personnage_vmain_ibfk_2` FOREIGN KEY (`id_vmain`) REFERENCES `vmain` (`id_vmain`);

--
-- Contraintes pour la table `personnage_vpied`
--
ALTER TABLE `personnage_vpied`
  ADD CONSTRAINT `personnage_vpied_ibfk_1` FOREIGN KEY (`id_personnage`) REFERENCES `personnage` (`id_personnage`),
  ADD CONSTRAINT `personnage_vpied_ibfk_2` FOREIGN KEY (`id_vpied`) REFERENCES `vpied` (`id_vpied`);

--
-- Contraintes pour la table `personnage_vtete`
--
ALTER TABLE `personnage_vtete`
  ADD CONSTRAINT `personnage_vtete_ibfk_1` FOREIGN KEY (`id_personnage`) REFERENCES `personnage` (`id_personnage`),
  ADD CONSTRAINT `personnage_vtete_ibfk_2` FOREIGN KEY (`id_vtete`) REFERENCES `vtete` (`id_vtete`);

--
-- Contraintes pour la table `tete`
--
ALTER TABLE `tete`
  ADD CONSTRAINT `tete_ibfk_1` FOREIGN KEY (`id_nez`) REFERENCES `nez` (`id_nez`),
  ADD CONSTRAINT `tete_ibfk_2` FOREIGN KEY (`id_bouche`) REFERENCES `bouche` (`id_bouche`),
  ADD CONSTRAINT `tete_ibfk_3` FOREIGN KEY (`id_yeux`) REFERENCES `yeux` (`id_yeux`);

--
-- Contraintes pour la table `vbas`
--
ALTER TABLE `vbas`
  ADD CONSTRAINT `vbas_ibfk_1` FOREIGN KEY (`id_texture`) REFERENCES `texture` (`id_texture`),
  ADD CONSTRAINT `vbas_ibfk_2` FOREIGN KEY (`id_couleur`) REFERENCES `couleur` (`id_couleur`);

--
-- Contraintes pour la table `vhaut`
--
ALTER TABLE `vhaut`
  ADD CONSTRAINT `vhaut_ibfk_1` FOREIGN KEY (`id_texture`) REFERENCES `texture` (`id_texture`),
  ADD CONSTRAINT `vhaut_ibfk_2` FOREIGN KEY (`id_couleur`) REFERENCES `couleur` (`id_couleur`);

--
-- Contraintes pour la table `vmain`
--
ALTER TABLE `vmain`
  ADD CONSTRAINT `vmain_ibfk_1` FOREIGN KEY (`id_texture`) REFERENCES `texture` (`id_texture`),
  ADD CONSTRAINT `vmain_ibfk_2` FOREIGN KEY (`id_couleur`) REFERENCES `couleur` (`id_couleur`);

--
-- Contraintes pour la table `vpied`
--
ALTER TABLE `vpied`
  ADD CONSTRAINT `vpied_ibfk_1` FOREIGN KEY (`id_texture`) REFERENCES `texture` (`id_texture`),
  ADD CONSTRAINT `vpied_ibfk_2` FOREIGN KEY (`id_couleur`) REFERENCES `couleur` (`id_couleur`);

--
-- Contraintes pour la table `vtete`
--
ALTER TABLE `vtete`
  ADD CONSTRAINT `vtete_ibfk_1` FOREIGN KEY (`id_texture`) REFERENCES `texture` (`id_texture`),
  ADD CONSTRAINT `vtete_ibfk_2` FOREIGN KEY (`id_couleur`) REFERENCES `couleur` (`id_couleur`);

--
-- Contraintes pour la table `yeux`
--
ALTER TABLE `yeux`
  ADD CONSTRAINT `yeux_ibfk_1` FOREIGN KEY (`id_couleur`) REFERENCES `couleur` (`id_couleur`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
