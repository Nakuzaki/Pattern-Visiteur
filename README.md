# Pattern Visiteur

## Overview
This repository demonstrates the implementation of the Visitor Design Pattern in Java. The Visitor Pattern is used to separate an algorithm from an object structure on which it operates. This allows adding new operations to existing object structures without modifying them.

## Motivation
The Visitor Pattern is useful when you need to perform an operation on all elements of a complex object structure. The pattern allows you to define a new operation without changing the classes of the elements on which it operates.

## Intent
- Represent an operation to be performed on the elements of an object structure.
- Visitor lets you define a new operation without changing the classes of the elements on which it operates.

## Applicability
Use the Visitor Pattern when:
- An object structure contains many classes of objects with differing interfaces, and you want to perform operations on these objects that depend on their concrete classes.
- Many distinct and unrelated operations need to be performed on objects in an object structure, and you want to avoid "polluting" their classes with these operations. Visitor lets you keep related operations together by defining them in one class. When the object structure is shared by many applications, use Visitor to put operations in just those applications that need them.
- The classes defining the object structure rarely change, but you often want to define new operations over the structure. Changing the object structure classes requires redefining the interface to all visitors, which is potentially costly. If the object structure classes change often, then it's probably better to define the operations in those classes.

## Structure
![Visitor Pattern Structure](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Visitor_pattern_uml.svg/1280px-Visitor_pattern_uml.svg.png)

![Visitor Pattern Structure](https://refactoring.guru/images/patterns/diagrams/visitor/structure-en.png?id=34126311c4e0d5c9fbb970595d2f1777)

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

- A lot of the information in this document was taken from the following source: [Refactoring Guru - Visitor](https://refactoring.guru/design-patterns/visitor).
