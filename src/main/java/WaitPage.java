import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class WaitPage {

    public static class LoginPage {

        private SelenideElement emailInput = $(By.name("email"));
        private SelenideElement passwordInput = $(By.name("password"));
        private SelenideElement loginButton = $(By.xpath("//div[@class='ui fluid large blue submit button']"));

        public void enterEmail(String email) {
            emailInput.shouldBe(visible).sendKeys(email);
        }

        public void enterPassword(String password) {
            passwordInput.shouldBe(visible).sendKeys(password);
        }

        public void clickLoginButton() {
            loginButton.shouldBe(visible).click();
        }
    }

    public static class RegistrationPage {

        private SelenideElement signUpLink = $(By.xpath("//a[@href='https://api.cogmento.com/register?lang=en-GB' and text()='Sign Up']"));
        private SelenideElement emailInput = $(By.name("email"));
        private SelenideElement agreeCheckbox = $(By.name("terms"));
        private SelenideElement submitButton = $(By.id("submitButton"));

        public void clickSignUpLink() {
            signUpLink.shouldBe(visible).click();
        }

        public void enterEmail(String email) {
            emailInput.sendKeys(email);
        }

        public void agreeToTerms() {
            agreeCheckbox.click();
            agreeCheckbox.should(checked, appear).click();
        }

        public void clickSubmitButton() {
            submitButton.shouldBe(visible).click();
        }
    }
}
