# Object Oriented Design
## The Fundamentals of Flexible Code: Coupling & Cohesion
_"Flexible code is loosely coupled and highly cohesive."_

[**Coupling**](https://en.wikipedia.org/wiki/Cohesion_\(computer_science\)) between code modules is the degree to which
they depend upon each other. Lower coupling is better.

[**Cohesion**](https://en.wikipedia.org/wiki/Coupling_\(computer_programming\)) of a code module is the degree to which
its elements belong together. Higher cohesion is better.

## Features of Object Oriented Languages
### Dynamic Dispatch / Message Passing
It is the responsibility of the object, not any external code, to select the procedural code to execute in response to a
method call, typically by looking up the method at run time in a table associated with the object. A method call is also
known as message passing. It is conceptualized as a message (the name of the method and its input parameters) being
passed to the object for dispatch.

### Encapsulation
Encapsulation is an Object Oriented concept that binds together the data and functions that manipulate the
data, and that keeps both safe from outside interference and misuse. Data encapsulation led to the important OOP concept
of data hiding. Encapsulation prevents external code from being concerned with the internal workings of an object. This
facilitates code refactoring, for example allowing the author of the class to change how objects of that class represent
their data internally without changing any external code (as long as "public" method calls work the same way). It also
encourages programmers to put all the code that is concerned with a certain set of data in the same class, which
organizes it for easy comprehension by other programmers. Encapsulation is a technique that encourages decoupling.

### Composition
Objects can contain other objects in their instance variables; this is known as object composition. For example, an
object in the Employee class might contain (point to) an object in the Address class, in addition to its own instance variables like "first_name" and "position". Object composition is used to represent "has-a" relationships: every employee has an address, so every Employee object has a place to store an Address object.

### Inheritance
Languages that support classes almost always support inheritance. This allows classes to be arranged in a hierarchy that
represents "is-a-type-of" relationships. For example, class Employee might inherit from class Person. All the data and
methods available to the parent class also appear in the child class with the same names. For example, class Person
might define variables "first_name" and "last_name" with method "make_full_name()". These will also be available in
class Employee, which might add the variables "position" and "salary". This technique allows easy re-use of the same
procedures and data definitions, in addition to potentially mirroring real-world relationships in an intuitive way.
Rather than utilizing database tables and programming subroutines, the developer utilizes objects the user may be more
familiar with: objects from their application domain.

### [Delegation](https://en.wikipedia.org/wiki/Delegation_pattern)
In delegation, an object handles a request by delegating to a second object (the delegate). The delegate is a helper
object, but with the original context.

### Polymorphism (subtype polymorphism)
Polymorphism (from Greek πολύς, polys, "many, much" and μορφή, morphē, "form, shape") is the provision of a single
interface to entities of different types. This allows client code to interact with the shared interface without being
coupled to or even aware of the actual behavior it is calling.

### Open Recursion
In open recursion object methods can call other methods on the same object (including themselves), typically using a
special variable or keyword called this or self.
