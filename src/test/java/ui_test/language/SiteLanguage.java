package ui_test.language;

import ui_test.navigation.HomePage;

import static org.assertj.core.api.Assertions.assertThat;

public class SiteLanguage {

    HomePage homePage;


    public void select(String language) {

        homePage.selectLanguage(language);
    }

    public void shouldSeeJapaneseGreeting() {
        assertThat(homePage.containsText("仮想通貨取引のパワーを")).isTrue();
    }
}
