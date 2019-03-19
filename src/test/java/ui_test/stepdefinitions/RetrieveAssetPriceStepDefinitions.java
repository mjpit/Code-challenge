package ui_test.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import ui_test.navigation.NavigateTo;
import ui_test.navigation.TradingPage;

import static org.assertj.core.api.Assertions.assertThat;

public class RetrieveAssetPriceStepDefinitions {


    @Steps
    NavigateTo navigateTo;

    TradingPage tradingPage;


    @Given("^(?:.*) is visiting the trade page")
    public void user_is_visiting_the_trade_page() {
        navigateTo.theTradingPage();
    }


    @When("^he looks up (.*)")
    public void he_looks_up_the_asset(String asset) {
        tradingPage.selectAsset(asset);
    }


    @Then("he can see the current {string} price is between {float} and {float}")
    public void he_can_see_the_current_price_is_between_and(String fiat, Float minPrice, Float maxPrice) {
        assertThat(tradingPage.getPrice(fiat)).isBetween(minPrice, maxPrice);
    }
}
