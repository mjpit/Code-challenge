package ui_test.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class HomePage extends PageObject {



    By LANGUAGE_PULLDOWN = By.cssSelector("#curlang");


    /**
     * @param language The language to select
     */
    @Step("Select language {0}")
    //Using $ as an alternative to defining a WebElement using @FindBy
    public void selectLanguage(String language) {
        $(LANGUAGE_PULLDOWN).selectByVisibleText(language);
    }

}




