# Languages and Frameworks
## Cucumber
### Short intro to BDD
#### How the cucumber folks frame it
BDD is a way for software teams to work that closes the gap between business people and technical people by:

* Encouraging collaboration across roles to build shared understanding of the problem to be solved
* Working in rapid, small iterations to increase feedback and the flow of value
* Producing system documentation that is automatically checked against the system’s behaviour
#### An example of a BDD scenario
```
  Scenario: Open account with initial deposit
    When I open a checking account with $100.00
    Then my balance should be $100.00
```
Things to note about this example are:
* Concise - We only use concepts that are relevant to this scenario.
* Domain-centered and User-centered. Users should be able to read them and understand them.
* Does not operate your product. <Cucumber.io 1922 example>
* Specific enough - It contains enough detail that you understand what the test represents.

### Files to look at:
* [Checking Account Scenario file](../src/test/resources/features/CheckingAccount.feature)
* [CheckingAccountStepDefinitions.java](../src/main/java/developer_learning_resources/languages_and_frameworks/cucumber/CheckingAccount.java)
* [Report that shows up after you run the scenarios. Open outside of IDE.](../target/cucumber-report.html)

## References
* [Cucumber.io Guides](https://cucumber.io/docs/guides/)
* [Behaviour-Driven Development from cucumber.io](https://cucumber.io/docs/bdd/)