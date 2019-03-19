package ui_test.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import ui_test.language.SiteLanguage;
import ui_test.navigation.NavigateTo;

public class SelectSiteLanguageStepDefinitions {



    @Steps
    NavigateTo navigateTo;

    @Steps
    SiteLanguage siteLanguage;


    @Given("^(?:.*) is on the homepage")
    public void yoko_is_on_the_homepage() {
       navigateTo.theHomePage();
    }

    @When("she chooses {string} as a language")
    public void she_chooses_Japanese_as_a_language(String language) {
        siteLanguage.select(language);

    }

    @Then("she can see the Japanese greeting")
    public void she_can_see_the_Japanese_greeting() {
        siteLanguage.shouldSeeJapaneseGreeting();
    }

}
