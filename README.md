
# OOP Code Examples
 
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
Encapsulation is an Object Oriented Programming concept that binds together the data and functions that manipulate the 
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

## Healthy Code Practices
### Prefer [Composition over Inheritance](https://en.wikipedia.org/wiki/Composition_over_inheritance)
This doctrine advocates implementing has-a relationships using composition instead of inheritance. For example, instead 
of inheriting from class Person, class Employee could give each Employee object an internal Person object, which it then 
has the opportunity to hide from external code even if class Person has many public attributes or methods. Some 
languages, like Go do not support inheritance at all.

### Tell, Don't Ask
* [Original post on pragprog.com via wayback machine](https://web.archive.org/web/20200505174840/https://pragprog.com/articles/tell-dont-ask)
* [Martin Fowler’s take](https://martinfowler.com/bliki/TellDontAsk.html)

### Dependency Injection

### Outside-In/Top-Down Development

## SOLID Principles

# Refactoring Code Examples

## Parallel Refactoring
This is a refactoring technique that allows us to make large changes to our 
codebase while keeping our code compiling and our tests passing except for 
the time that we are making small (single-line) changes.

The process consists of three steps:
* Expand
* Migrate
* Contract

In our example, we decide that we want to eliminate some primitive obsession 
involving the domain concept of Employee. For instance, we have a hire method 
in our Staffing class that looks like:
```
public void hireEmployee(String employeeName, String employeeId) {
...
}
```
and we would like to start using an Employee class that encapsulates the 
properties of an employee. 


### Expand
The Expand step involves implementing a new version of a code block (usually 
a new version of a method) that is not yet called by any other code. This version
has the desired new design structure.

In our example, we'd create an anemic Employee data object and create a new 
hireEmployee method that implements the same behavior. One way to ensure that we
have the same behavior is to call the existing hireEmployee method.
```
public void hireEmployee(String employeeName, String employeeId) {
...
}  
public void hireEmployee(Employee employee) {
    hireEmployee(employee.getName(), employee.getId);
}
```

Note that are not calling this new method anywhere. So this cannot be a breaking change.


### Migrate
We Migrate by change one place that we use the old pattern to instead use the new 
pattern. For instance, we change one method call to an old interface to instead call 
the new interface that we created in the Expand step. After we make this simple change, 
we can (and should) compile and run tests.

In our example, we might have an existing invocation that looks like:
```
    hireEmployee("Bill", "123-45-6789");
```

We can change this one line to invoke the new method:
```
    hireEmployee(new Employee("Bill", "123-45-6789"));
```

We repeat changes like this until there are no invocations of the original hireEmployee 
method.

### Contract
Once we have eliminated all instances of the old pattern (we no longer call the method 
with the old signature), we delete it. At this point we have move closer to (or
all the way to) our desired implementation.

Since there are no invocations of the original method except for the one in the new method,
we can safely inline that method. So we will have finished our refactoring (or at least a 
step towards that larger change).

# References
* [Wikipedia, Object-oriented programming](https://en.wikipedia.org/wiki/Object-oriented_programming)
* [Parallel Change Refactoring](https://medium.com/@alex_fedorov/parallel-change-refactoring-b83a2993ef26)
 
