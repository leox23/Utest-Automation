package com.mytest.utest.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/create_user.feature",
glue = "com.mytest.utest.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class CreateUser {
}
