import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicAuthPage {

    private final SelenideElement exampleDiv = $(By.cssSelector("div.example"));

    public String getExampleText() {
        return exampleDiv.getText();
    }
}
