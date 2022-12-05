package com.mytest.utest.stepdefinitions;

import com.mytest.utest.models.DataUser;
import com.mytest.utest.questions.ValidateMensaje;
import com.mytest.utest.tasks.CreateUser;
import com.mytest.utest.utils.MyDriversWeb;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.mytest.utest.utils.Constants.ACTOR_PAGE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static com.mytest.utest.utils.Constants.URL;


import java.util.List;

public class CreateUserSteps {

    @Given("^I want to open the webpage$")
    public void iWantToOpenTheWebpage() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled(ACTOR_PAGE);
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(MyDriversWeb.web().inThePage(URL)));
    }

    @When("^Create a user in the Utest page$")
    public void createAUserInTheUtestPage(List<DataUser> data) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(CreateUser.create(data));
    }

    @Then("^I validate creation succesfully$")
    public void iValidateCreationSuccesfully() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateMensaje.valMens()));
    }
}
