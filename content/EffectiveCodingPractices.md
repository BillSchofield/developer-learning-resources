## Effective Coding Practices
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

### SOLID Principles
