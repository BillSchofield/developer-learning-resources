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
* [Parallel Change Refactoring](https://medium.com/@alex_fedorov/parallel-change-refactoring-b83a2993ef26)
 