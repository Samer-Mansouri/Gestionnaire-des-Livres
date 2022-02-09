# RAPPORT DU PROJET JAVA

## Gestionnaire des Livres

#### Samer Mansouri Année universitaire 2021-

#### LCS-GLSI 2



## Introduction

Dans le cadre de notre deuxième année licence en Génie Logiciel et Systèmes
d’informations à la Faculté des Sciences de Tunis nous avons eu pour tâche la réalisation
d'un projet informatique.

Notre objectif était de réaliser l’analyse à l’aide de schéma UML et la conception d’un
Gestionnaire de Livres permettant à la bibliothèque d’ajouter des livres dans sa base de
données à partir d’une interface graphique.

Dans ce dossier nous allons tout d’abord exposer l’analyse de ce logiciel, puis un manuel

#### d’utilisateur et enfin un manuel du programmeur.


## Sommaire

```
● Partie 1: Analyse du logiciel
○ Les cas d'utilisation
○ Le diagramme de classes
○ Les diagrammes de séquences
● Partie 2: Le guide de l’utilisateur
○ Présentation Générale
○ Interfaces du logiciel
● Conclusion
```

## Partie I : Analyse du logiciel

### 1.Les cas d’utilisation:

Nous allons répondre aux questions suivantes : Quels sont les utilisateurs du
système? Quelles sont leurs interactions avec celui-ci? Il faut donc identifier les différents
acteurs ainsi que les cas d’utilisation c’est-à-dire les différentes fonctionnalités du système.

```
○ Acteur : L’administrateur
○ Cas d’utilisation pour l’administrateur :
i. Ajouter livre
ii. Consulter livre
iii. Mettre à jour livre
iv. Supprimer livre
v. Importer Fichier Excel
vi. S’authentifier
○ Diagramme des cas d’utilisations :
```

### 2.Le diagramme de classes:

Dans cette partie, nous étudierons les entités statiques du système. Ceci est illustré
par le diagramme de classes suivant :


### 3.Les diagrammes de séquences:

#### ● S’authentifier


#### ● Ajouter Livre


#### ● Mettre à jour livre


#### ● Supprimer livre


#### ● Importer Excel

### Ajouter Livre


## Partie II : Le guide de l’utilisateur

Dans cette partie nous allons expliciter les règles et le fonctionnement de notre gestionnaire
des livres.

### 1.Présentation générale:

Le rôle principal de ce logiciel est de permettre à l’utilisateur (Administrateur) qui est le
responsable de la bibliothèque, de gérer ses livres.

Avant de commencer à utiliser les différentes fonctionnalités du système, l’utilisateur doit
s’authentifier en utilisant son propre nom d’utilisateur et mot de passe.
Une fois que cet utilisateur est authentifié, il sera redirigé vers une interface de bienvenue.

Après avoir être authentifié, l’utilisateur peut commencer à utiliser le système:

```
● Consulter la liste des livres disponibles dans la bibliothèque, aussi effectuer des tri
sur cette liste selon une certaine colonne.
● Effectuer une recherche des livres selon le titre ou le nom d’auteur
● Sélectionner un livre puis le mettre à jour
● Sélectionner un livre puis le supprimer
● Remplir le formulaire, puis ajouter le livre
● Pour faciliter la tâche des administrateurs et les aider à gagner un peu plus de
temps, le logiciel offre la possibilité d’importer un fichier excel contenant une liste des
livres directement à la base de données de la bibliothèque.
Ce fichier ne doit pas dépasser 100 lignes de données et doit avoir comme entête
(Première ligne) le contenu de chaque colonne (titre, auteur, disponible)
```
Après avoir effectué ces différentes tâches (d’ajout, suppression, mise à jour, etc...)
l’utilisateur peut se déconnecter, pour garantir que les données sont juste accessibles par
les responsables de la bibliothèque ayant des comptes.


### 2.Interfaces du logiciel:

Lorsque vous lancez le logiciel, une interface de connexion apparaît, pour que vous puissiez
vous connecter et accéder aux différentes fonctionnalités du logiciel.

Après la connexion vous aurez redirigé à une autre interface


Vous pouvez cliquer sur le bouton “Liste des livres” pour consulter la liste des livres dans la
bibliothèque.
Vous pouvez aussi effectuer une recherche des livres selon leurs titre ou le nom de leurs
auteurs.

Pour supprimer ou modifier un livre vous devez d’abord le sélectionner à partir du tableau:


Pour ajouter un nouveau livre vous devez cliquer sur le bouton “Ajouter un livre”:

Si vous souhaitez ajouter une liste de livres vous pouvez l’importer sous la forme d’un fichier
Excel (extension xlsx) ayant au maximum 100 lignes.


## Conclusion

A l’aide de ce projet nous avons pu comprendre et expérimenter les différentes étapes de la
conception d’un logiciel, en commençant par l’analyse avec la partie UML.
De plus, la programmation nous a permis d’améliorer nos connaissances du langage Java et
d’acquérir les compétences nécessaires qui nous ont permis de développer une interface
graphique et de la relier avec la base de données relationnelle.

En plus d’être un projet pédagogique il est aussi ludique et nous a donné beaucoup de
liberté dans le code et dans la conception.


