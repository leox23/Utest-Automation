package com.mytest.utest.stepdefinitions;

import com.mytest.utest.models.DataUser;
import com.mytest.utest.tasks.CreateUser;
import com.mytest.utest.utils.MyDriverWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


import java.util.List;

public class CreateUserSteps {

    @Given("^I want to open the webpage$")
    public void iWantToOpenTheWebpage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Monik");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriverWeb.web().inThePage("https://utest.com/")));
    }


    @When("^Create a user in the Utest page$")
    public void createAUserInTheUtestPage(List<DataUser> data) throws InterruptedException {
        Thread.sleep(10000);
        theActorInTheSpotlight().attemptsTo(CreateUser.create(data));
        Thread.sleep(5000);
    }



    @Then("^I validate creation succesfully$")
    public void iValidateCreationSuccesfully() {

    }
}
