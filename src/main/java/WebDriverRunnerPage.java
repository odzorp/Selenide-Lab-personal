import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebDriverRunnerPage {

    private By usernameInput = By.id("txtUsername");
    private By passwordInput = By.id("txtPassword");
    private By loginButton = By.id("btnLogin");

    public void openLoginPage() {
        open("https://opensource-demo.orangehrmlive.com/");
    }

    public String getCurrentUrl() {
        return WebDriverRunner.url();
    }

    public String getPageSource() {
        return WebDriverRunner.source();
    }

    public void closeBrowser() {
        WebDriverRunner.closeWebDriver();
    }

    public void login(String username, String password) {
        $(usernameInput).setValue(username);
        $(passwordInput).setValue(password);
        $(loginButton).click();
    }
}
