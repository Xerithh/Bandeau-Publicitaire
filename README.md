# Projet Bandeau - Animations de texte

## Description

Ce projet a pour objectif de modéliser en UML et d'implémenter en Java un programme qui diffuse des animations de texte sur un bandeau publicitaire.

## La classe Bandeau

Le bandeau publicitaire est simulé par une classe Java `bandeau.Bandeau` qui permet d'afficher un texte centré dans une fenêtre, en précisant :
- La police de caractères
- La couleur d'affichage
- L'angle de rotation

Les fonctionnalités détaillées de la classe `Bandeau` sont décrites dans sa javadoc.

### Classes Java utilisées

- `java.awt.Font` : pour la gestion des polices de caractères
- `java.awt.Color` : pour la gestion des couleurs

## Travail demandé

### 1. Effets d'animation

En utilisant (sans la modifier) la classe `Bandeau`, vous devez définir la notion d'**effet d'animation**. 

Exemples d'effets possibles :
- Faire apparaître le texte caractère par caractère (par la gauche ou par la droite)
- Faire faire un tour complet au texte
- Faire défiler des couleurs
- Jeu du pendu
- Teletype
- Clignotant
- Zoom
- Rotation
- etc.

### 2. Scénarios d'animation

Un **scénario** est un enchaînement d'effets d'animation quelconques, définissant pour chaque effet combien de fois il est répété.

Exemple de scénario :
- Effet « Jeu du pendu » : répété 1×
- Effet « Teletype » : répété 1×
- Effet « Clignotant » : répété 10×
- Effet « Zoom » : répété 1×
- Effet « Rotation » : répété 2×

On doit pouvoir construire un scénario en lui ajoutant des effets et en précisant combien de fois chaque effet est répété.

## Conception

Vous devez définir et implémenter :
- Les classes nécessaires (`Effet`, `Scenario`, etc.)
- Les relations entre elles
- Les méthodes nécessaires dans chaque classe
- Un exemple significatif d'utilisation sous la forme d'un programme principal

### Éléments de solution

- Chaque effet doit être représenté par une **classe à part**
- Le scénario doit également être représenté par une **classe**
- Le scénario doit avoir une méthode permettant d'ajouter un effet avec son nombre de répétitions
- On doit pouvoir "inventer" une nouvelle classe d'effet et l'utiliser dans un scénario, **sans changer la classe `Scenario`**

## Livrables

1. **Diagramme UML** correspondant à votre solution (modifier le fichier fourni dans le répertoire `doc/`)
2. **Projet Java** implémentant :
   - Au moins trois effets de votre choix
   - Un scénario qui enchaîne ces effets
   - Une démonstration significative

Note : Cet exercice ne nécessite pas de tests unitaires.

## Structure du projet

```
.
├── pom.xml
├── doc/
│   ├── Bandeau.mdzip
│   └── Untitled.mdj
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── exemple/
│   │   │       └── ExempleDUtilisation.java
│   │   └── resources/
│   └── test/
│       └── java/
│           └── bandeau/
└── target/
```

## Dépendances Maven

Le projet utilise la classe `Bandeau` sous la forme d'une dépendance Maven.

## Utilisation

Un exemple d'utilisation de la classe `Bandeau` est fourni dans le projet. Vous pouvez vous en inspirer pour créer vos propres effets et scénarios.

## Dépôt Git

URL du dépôt : https://github.com/bastide/Bandeau_Enonce
