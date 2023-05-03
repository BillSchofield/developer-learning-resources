
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

# Useful Computer Science Concepts

## Big O - Complexity and Performance
Briefly, Big O notation tells us how fast (or slow) an algorithm is. The 
notation is clunky, but it's so commonly used that it's worth understanding.

We care about this concept because it allows us to concisely discuss performance.

| Big O    | Common name      | Example                                                 |
|----------|------------------|---------------------------------------------------------|
| O(1)     | Constant Time    | Accessing an element in an array                        |
 | O(log n) | Logarithmic Time | Accessing an element in a tree                          |
| O(n)     | Linear Time      | Find an element in an array                             |
| O(n^2)   | Quadratic Time   | Sort an array with a naive algorithm (like bubble sort) |   

## Common operations
* Access - read or write a value
* Add element - put a new element into the collection without regard for order
* Insert element - put a new element into a specific place in an ordered collection
* Size - determine how many elements are in a collection
* Empty - determine if the collection has no elements (this is always as fast or faster than size==0)
* Search - find a specific element by 'name'
* Sort - put all elements of the collection in a specific order (or make a new sorted collection)

## Data Structures
### Array
Blob of memory that allows fast random access. You probably know how this works already.
### List
Collection of objects that are in the order they were added and can be randomly
accessed

#### Array List
A type of list that is implemented in terms of an array

#### [Linked List](https://en.wikipedia.org/wiki/Linked_list)
A list where the elements are represented as nodes that point to the 'next' 
node in the list.
![Linked List Example](src/main/resources/linkedlist.png)
### Set
A collection where duplicate elements are not allowed. Typically, the duplicate 
element is ignored when added.
### Hash Function
Hashing is commonly used in data structures where we want to look up values
using a key.

A hash function maps data of an arbitrary size to a fixed size value (called a
hash code). They always map the data to the same hash code. Hash codes allows
us to quickly determine if two objects are not equal because two objects that
are identical will have the same hash code. Hash tables use them to quickly locate
specific objects.

Note that two objects can have the same hash code and not be equal because hash codes
don't have the same number of bits as the source object.
```
Java Example

	@Override
	public int hashCode() {
		Object[] a = new Object[]{name, heading, x, y};
		if (a == null)
		    return 0;

		int result = 1;

		for (Object element : a)
		    result = 31 * result + (element == null ? 0 : element.hashCode());

		return result;
	}
```

### [Hash Table](https://en.wikipedia.org/wiki/Hash_table)
A hash table, also known as hash map, is a data structure that implements an
associative array or dictionary. It is an abstract data type that maps keys to values.

When we want to look up an object in a hash table, we use a specific hashing function
to compute that objects hash code. That hash code tells us which 'hash bucket' should contain
that object. We look in that hash bucket (which is usually implemented as a list), to find
the object that we are looking up. If the object has been added to the hash table then we
will find it in the correct bucket otherwise we can report that the object wasn't found.

We use a similar process to add an object to the hash table.
![Hash Table Example](src/main/resources/hashtable.png)

##### Note
In Java, HashMap is implemented using a HashTable and HashSet is implemented with a HashMap.
### Tree 
A collection where elements are represented as nodes that have 'child' nodes. 
Each tree has a unique 'root' node that gives a starting point for accessing 
the tree.

#### Binary search tree
A common type of tree where each node has two children which are usually named
something like 'leftChild' and 'rightChild'. This tree is kept 'sorted' by 
making nodes that are before the current node in the left sub-tree of that node.
![Binary Search Tree Example](src/main/resources/binarysearchtree.png)


### Map
A collection where values are associated with 'keys' that allow them to be 
looked up. This works like looking up the definition of a word in a 
dictionary or finding a house by its address. Think of the key as being a label
for the associated value.

[//]: # (# Java Language Features)
[//]: # ()
[//]: # (## Collections )
[//]: # ()
[//]: # (### Class hierarchy)
[//]: # ()
# Refactoring 

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
 
