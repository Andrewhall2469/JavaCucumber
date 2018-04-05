package com.qa.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {

    private Calculator calculator;
    private int additionNumber;
    private int multiplicationNumber;
    private int subtractionNumber;
    private int divisionNumber;

    @Given("^A calculator$")
    public void createCalculator(){
        calculator = new Calculator();
    }

    @When("^I use the addition functionality for numbers 5 and 5$")
    public void addTwoNumbers(){
        additionNumber = calculator.addition(5,5);
    }

    @Then("^the result will be 10$")
    public void numberEquals(){
        assertEquals(additionNumber, 10);
    }

    @When("^I use the multiplication functionality for numbers 10 and 10$")
    public void multiplyTwoNumbers(){
        multiplicationNumber = calculator.multiplication(10,10);
    }

    @Then("^the result will be 100$")
    public void multiplicationNumberEquals(){
        assertEquals(multiplicationNumber, 100);
    }

    @When("^I use the subtraction functionality for numbers 90 and 40$")
    public void subtractTwoNumbers(){
        subtractionNumber = calculator.subtraction(90,40);
    }

    @Then("^the result will be 50$")
    public void subtractNumberEquals(){
        assertEquals(subtractionNumber, 50);
    }

    @When("^I use the division functionality for numbers 9 and 9$")
    public void divideTwoNumbers(){
        divisionNumber = calculator.division(9,9);
    }

    @Then("^the result will be 1$")
    public void divideNumberEquals(){
        assertEquals(divisionNumber, 1);
    }

}