# salsabile-massabih-enset-adria-test
# le code existe dans MASTER branch
# Projet de POC (Proof Of Concept) - Gestion de Portefeuilles et Transferts

Ce projet vise à développer une application web sous forme d'une architecture microservices en utilisant l'écosystème Spring Boot et Spring Cloud pour la partie backend, et un framework tel qu'Angular ou React pour la partie frontend. L'application permet de gérer des portefeuilles (Wallets) de devises ainsi que des transferts entre ces portefeuilles.

## Fonctionnalités

L'application se compose de deux microservices fonctionnels :

1. **wallet-service**: Ce microservice gère les portefeuilles (Wallets) et les clients. Chaque Wallet appartient à un client et est défini par un ID, un solde, une date de création et une devise. Chaque client est défini par un ID, un nom et un email.

2. **transfer-service**: Ce microservice gère les transferts entre les Wallets. Chaque transfert est défini par un ID, une date, un Wallet source, un Wallet de destination, un montant et un état (PENDING, VALIDATED, REJECTED).



## Microservices à mettre en place

- **service Gateway**: Basé sur Spring Cloud Gateway, ce microservice sert de point d'entrée pour les requêtes HTTP vers les autres microservices.

- **service Discovery**: Vous avez le choix entre Eureka Server ou Consul Discovery pour la gestion de la découverte des microservices.

- **service de Configuration**: Vous pouvez choisir entre Spring Cloud Config ou Consul Config pour la gestion des configurations des microservices.

## Arhitecture
![image](https://github.com/salsabile18/salsabile-massabih-enset-adria-test/assets/100244944/51436f4d-2f77-4d5f-bf56-09c500d07f1b)


## Instructions de Travail

###  Configuration de l'environnement

Il Faut d'abord avoir configuré l'environnement de développement avec les éléments suivants :
- Java JDK
- Maven ou Gradle
- Un IDE (par exemple, IntelliJ IDEA, Eclipse)
- Node.js (si vous choisissez Angular ou React)
- Outils Spring (Spring Boot, Spring Cloud)

### 1. Modelisation ( Diagramme de classe):


### 2. Mise en place des Microservices

- Créez un projet Spring Boot vide pour chaque microservice : `wallet-service`, `transfer-service`, `gateway-service`, `discovery-service`, et `config-service`.
  example:
  ![image](https://github.com/salsabile18/salsabile-massabih-enset-adria-test/assets/100244944/df06eb8f-cdbf-4b5b-8844-a169e27d44fe)

### 3. Développement et Tests

- Développer et tester les microservices `discovery-service`, `gateway-service`, et `config-service`.

- Développer et tester le microservice `wallet-service`.

- Développer et tester le microservice `transfer-service`.
example de test  d'exécution : "gateway-service":
![image](https://github.com/salsabile18/salsabile-massabih-enset-adria-test/assets/100244944/4d58d461-18eb-41b0-926d-8d23cfe74327)
example de test d'execution : "config-service":
![image](https://github.com/salsabile18/salsabile-massabih-enset-adria-test/assets/100244944/850fe028-83ab-4c06-94d9-faa4bfdaa785)



### 4. Frontend

- Créez une application frontend (Angular ou React) pour interagir avec les microservices.

- Configurez l'application frontend pour envoyer des requêtes aux API RESTful exposées par le microservice Gateway.
