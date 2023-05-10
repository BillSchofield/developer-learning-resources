Feature: Checking account customer interactions

  Scenario: Open account with initial deposit
    When I open a checking account with $100.00
    Then my balance should be $100.00

  @ignore
  Scenario: Make a deposit
    Given I have an empty checking account
    When I deposit $100.00
    Then my balance should be $100.00

#  Scenario: Make a withdrawal
#    Given I have a checking account
#    When I make a withdrawal
#    Then my balance should decrease by the amount of the deposit

  @ignore
  Scenario Outline: Today is or is not Friday
    When I open a checking account with <initialDepositAmount>
    Then my account type should be '<accountType>'

    Examples:
      | initialDepositAmount | accountType |
      | $0                    | Silver      |
      | $100                  | Silver      |
      | $500                  | Gold        |
      | $5000                 | Platinum    |