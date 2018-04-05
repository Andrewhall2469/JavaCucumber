Feature: Working with Calculator
  As a person
  I want to be able to use calculator
  So that I can demonstrate it's functionality

Scenario: Adding two numbers together
  Given A calculator
  When I use the addition functionality for numbers 5 and 5
  Then the result will be 10

Scenario: Multiplying two numbers together
Given A calculator
When I use the multiplication functionality for numbers 10 and 10
Then the result will be 100

Scenario: Subtracting two numbers
Given A calculator
When I use the subtraction functionality for numbers 90 and 40
Then the result will be 50

Scenario: Dividing two numbers
Given A calculator
When I use the division functionality for numbers 9 and 9
Then the result will be 1
