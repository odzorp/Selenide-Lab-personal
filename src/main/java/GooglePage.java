import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class GooglePage {

    private final SelenideElement searchInput = $(By.name("q"));
    private final SelenideElement searchButton = $(By.name("btnK"));
    private final SelenideElement logo = $(By.id("logo"));
    private final SelenideElement searchResultHeader = $(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' and text()='Welcome to Naveen AutomationLabs - naveen automationlabs']"));

    public void searchFor(String query) {
        searchInput.setValue(query);
        searchButton.click();
    }

    public void verifyLogoAppears() {
        logo.shouldHave(appear);
    }

    public String getSearchResultHeaderText() {
        return searchResultHeader.text();
    }
}
