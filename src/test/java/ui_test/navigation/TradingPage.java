package ui_test.navigation;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static org.assertj.core.api.Assertions.assertThat;

public class TradingPage extends PageObject {

    @FindBy(xpath = "//a[.='Prices']")
    public WebElement openTradePageLink;

    @FindBy(css = "#menuContentQueryInput")
    public WebElement searchAssetsField;

    @FindBy(xpath = "//span/button[.='Assets']")
    public WebElement assetSelectButton;


    /**
     * Navigate to the trade page in a new tab.
     * Not using the specific trade page URL, but navigating to the page form the main URL
     */
    public void goToTradeTab() {
        open();
        openTradePageLink.click();

       //Close the homepage tab
        getDriver().close();

        //Switch to trading page tab
        for (String Child_Window : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(Child_Window);

        }
        this.shouldContainAllText("Assets", "Quotes");
        assertThat(this.getTitle()).contains("markets");

    }

    /**
     * Select the asset in the menu on the trade page
     *
     * @param asset This is the asset to select
     */
    public void selectAsset(String asset) {
        assetSelectButton.click();
        searchAssetsField.sendKeys(asset);
        getDriver().findElement(By.xpath("//div[.='" + asset + "'][@class='search-menu-asset-name']")).click();

    }

    /**
     * @param fiat The Fiat retrieve the price for
     * @return price This is price in the given fiat currency
     */
    public float getPrice(String fiat) {
        String price = getDriver().findElement(By.xpath("//a[contains(@title,'" + fiat + "')]/div[contains(@class, 'price')]")).getText();
        return Float.parseFloat(price);
    }
}

