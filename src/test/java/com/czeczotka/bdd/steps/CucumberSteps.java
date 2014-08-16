package com.czeczotka.bdd.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static java.text.MessageFormat.format;

public class CucumberSteps {

    @Before
    public void setUp() {
    }

    @Given("^I have a cucumber step$")
    public void i_have_a_cucumber_step() throws Throwable {
        System.out.println ("Step definition exact match");
    }

    @Given("^I have (\\d+) (.*) in my basket$")
    public void i_have_in_my_basket(int number, String veg) throws Throwable {
        System.out.println(format("I have {0} {1} in my basket", number, veg));
    }
}