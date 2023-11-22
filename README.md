# Pattern Visiteur

## Overview
This repository demonstrates the implementation of the Visitor Design Pattern in Java. The Visitor Pattern is used to separate an algorithm from an object structure on which it operates. This allows adding new operations to existing object structures without modifying them.

## Files and Implementation
- [`ChargeBaggages.java`](https://github.com/paul-rezzonico/Pattern-Visiteur/blob/master/patternVisiteur/src/main/java/patternVisiteur/ChargeBaggages.java): Implements the `VisitorChargeur` interface, representing a charge by weight for baggage.
- [`ChargePassager.java`](https://github.com/paul-rezzonico/Pattern-Visiteur/blob/master/patternVisiteur/src/main/java/patternVisiteur/ChargePassager.java): Another implementation of `VisitorChargeur`, handling the charge of passengers.
- [`Moto.java`](https://github.com/paul-rezzonico/Pattern-Visiteur/blob/master/patternVisiteur/src/main/java/patternVisiteur/Moto.java): Represents a motorcycle, extending the `Vehicule` class and accepting charges.
- [`SandBox.java`](https://github.com/paul-rezzonico/Pattern-Visiteur/blob/master/patternVisiteur/src/main/java/patternVisiteur/SandBox.java): A sandbox class for testing the implementation of the Visitor Pattern.
- [`Vehicule.java`](https://github.com/paul-rezzonico/Pattern-Visiteur/blob/master/patternVisiteur/src/main/java/patternVisiteur/Vehicule.java): An abstract class representing a vehicle, defining the structure for accepting charges.
- [`VisitorChargeur.java`](https://github.com/paul-rezzonico/Pattern-Visiteur/blob/master/patternVisiteur/src/main/java/patternVisiteur/VisitorChargeur.java): An interface for visitor chargers.
- [`Voiture.java`](https://github.com/paul-rezzonico/Pattern-Visiteur/blob/master/patternVisiteur/src/main/java/patternVisiteur/Voiture.java): Represents a car, extending the `Vehicule` class.

## Usage
The repository provides a clear example of how the Visitor Pattern can be implemented and used in Java. The `SandBox` class can be run to see the pattern in action.

## Additional Resources
- A compressed file with videos explaining the pattern is also available in the repository: [`videos.rar`](https://github.com/paul-rezzonico/Pattern-Visiteur/blob/master/videos/videos.rar).
