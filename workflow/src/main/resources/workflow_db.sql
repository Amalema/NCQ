-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mer 12 Février 2020 à 21:02
-- Version du serveur :  10.1.16-MariaDB
-- Version de PHP :  5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `workflow_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `workflow`
--

CREATE TABLE `workflow` (
  `id_workflow` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `enabled` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `workflow`
--

INSERT INTO `workflow` (`id_workflow`, `description`, `enabled`, `name`) VALUES
(1, 'descroption1', 2, 'Workflow1'),
(2, 'description2', 3, 'Workflow2'),
(3, 'description3', 4, 'Workflow3'),
(4, 'description4', 5, 'Workflow4');

-- --------------------------------------------------------

--
-- Structure de la table `workflow_category`
--

CREATE TABLE `workflow_category` (
  `id_workflow_category` int(11) NOT NULL,
  `create_at` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `update_at` date DEFAULT NULL,
  `parent_category_id_workflow_category` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `workflow_category`
--

INSERT INTO `workflow_category` (`id_workflow_category`, `create_at`, `description`, `enabled`, `logo`, `name`, `update_at`, `parent_category_id_workflow_category`) VALUES
(1, '2020-02-12', 'descriptionparent', b'1', 'logoparent', 'nameparent', '2020-02-12', NULL),
(2, '2020-02-12', 'descriptionCategory1', b'1', 'logo', 'name', '2020-02-12', 1);

-- --------------------------------------------------------

--
-- Structure de la table `workflow_category_workflows`
--

CREATE TABLE `workflow_category_workflows` (
  `workflow_categories_id_workflow_category` int(11) NOT NULL,
  `workflows_id_workflow` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `workflow_category_workflows`
--

INSERT INTO `workflow_category_workflows` (`workflow_categories_id_workflow_category`, `workflows_id_workflow`) VALUES
(1, 1),
(1, 2),
(2, 3),
(2, 4);

-- --------------------------------------------------------

--
-- Structure de la table `workflow_workflows`
--

CREATE TABLE `workflow_workflows` (
  `workflow_id_workflow` int(11) NOT NULL,
  `workflows_id_workflow` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `workflow_workflows`
--

INSERT INTO `workflow_workflows` (`workflow_id_workflow`, `workflows_id_workflow`) VALUES
(4, 1),
(4, 2),
(4, 3);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `workflow`
--
ALTER TABLE `workflow`
  ADD PRIMARY KEY (`id_workflow`);

--
-- Index pour la table `workflow_category`
--
ALTER TABLE `workflow_category`
  ADD PRIMARY KEY (`id_workflow_category`),
  ADD KEY `FK7omq023oprkny6t2iutkns4ta` (`parent_category_id_workflow_category`);

--
-- Index pour la table `workflow_category_workflows`
--
ALTER TABLE `workflow_category_workflows`
  ADD KEY `FKa74jm1y03uhtfn4um20xvo71k` (`workflows_id_workflow`),
  ADD KEY `FK8l0yipf86a9pk0w1eb2bhpij3` (`workflow_categories_id_workflow_category`);

--
-- Index pour la table `workflow_workflows`
--
ALTER TABLE `workflow_workflows`
  ADD KEY `FK1jbq2u7pnmlsp29hm2anq4v6b` (`workflows_id_workflow`),
  ADD KEY `FKk47sdfww0h33iw3u7a7xwha2p` (`workflow_id_workflow`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `workflow`
--
ALTER TABLE `workflow`
  MODIFY `id_workflow` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `workflow_category`
--
ALTER TABLE `workflow_category`
  MODIFY `id_workflow_category` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `workflow_category`
--
ALTER TABLE `workflow_category`
  ADD CONSTRAINT `FK7omq023oprkny6t2iutkns4ta` FOREIGN KEY (`parent_category_id_workflow_category`) REFERENCES `workflow_category` (`id_workflow_category`);

--
-- Contraintes pour la table `workflow_category_workflows`
--
ALTER TABLE `workflow_category_workflows`
  ADD CONSTRAINT `FK8l0yipf86a9pk0w1eb2bhpij3` FOREIGN KEY (`workflow_categories_id_workflow_category`) REFERENCES `workflow_category` (`id_workflow_category`),
  ADD CONSTRAINT `FKa74jm1y03uhtfn4um20xvo71k` FOREIGN KEY (`workflows_id_workflow`) REFERENCES `workflow` (`id_workflow`);

--
-- Contraintes pour la table `workflow_workflows`
--
ALTER TABLE `workflow_workflows`
  ADD CONSTRAINT `FK1jbq2u7pnmlsp29hm2anq4v6b` FOREIGN KEY (`workflows_id_workflow`) REFERENCES `workflow` (`id_workflow`),
  ADD CONSTRAINT `FKk47sdfww0h33iw3u7a7xwha2p` FOREIGN KEY (`workflow_id_workflow`) REFERENCES `workflow` (`id_workflow`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
