# Structure
The project consists of three main classes:

```
Animal (Abstract Class)
```
```
Lion (Concrete Class)
```
```
Main (Driver Class)
```

# Animal Class
The Animal class is an abstract class that serves as a base for all animal types. It encapsulates common properties and methods that all animals share, such as name, age, weight, and species. It also defines an abstract method extinct() that must be implemented by subclasses, demonstrating the principle of abstraction.

## Properties
```
name: The name of the animal.
```
```
age: The age of the animal.
```
```
weight: The weight of the animal.
```
```
species: The species of the animal.
```
## Methods

Constructors, getters, and setters for the properties.
An abstract method extinct().

# Lion Class
The Lion class extends the Animal class, inheriting its properties and providing a concrete implementation of the extinct() method. This demonstrates the principle of inheritance.
The extinct() method is overridden to provide specific details about the extinction causes of the lion species.

# Main Class
The Main class contains the main method, which is the entry point of the application. It demonstrates creating an instance of the Lion class, using its methods, and showcasing polymorphism through the use of an overridden method.

# How to Run
To run this project, you need to have Java installed on your machine. Compile the Java files and run the Main class:
```
javac Main.java Lion.java Animal.java
java Main
```

# Output
Running the Main class will produce output similar to the following, demonstrating the creation of a Lion object and the use of its methods:
```
Name: Leo
Age: 100000
Weight: 300 kg
Species: Barbary lion
This species has gone extinct due to overhunting, habitat destruction, and a fatal respiratory ailment.
```

# Conclusion
This simple project showcases the use of OOP principles such as Inheritance, Encapsulation, and Abstraction through a basic animal hierarchy. The Animal class provides a common structure for animal types, while the Lion class extends this structure with specific details.






