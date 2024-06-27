import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CloseBrowserPage {

    private final SelenideElement usernameInput = $(By.name("username"));
    private final SelenideElement passwordInput = $(By.name("password"));
    private final SelenideElement loginButton = $(By.xpath("//button[text()[normalize-space()='Login']]"));
    private final SelenideElement externalLink = $(By.xpath("//a[@href='http://www.orangehrm.com' and @target='_blank']"));

    public void login(String username, String password) {
        usernameInput.setValue(username);
        passwordInput.setValue(password);
        loginButton.click();
    }

    public void clickExternalLink() {
        externalLink.click();
    }
}
