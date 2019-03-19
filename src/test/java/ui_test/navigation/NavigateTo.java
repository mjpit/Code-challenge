package ui_test.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {
    HomePage homePage;
    TradingPage tradingPage;



    @Step("Open the home page")
    public void theHomePage() {
        homePage.open();
    }

    @Step("Open the trading page")
    public void theTradingPage() {
        tradingPage.goToTradeTab();
    }
}
