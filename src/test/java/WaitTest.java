import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class WaitTest {

    private WaitPage.LoginPage loginPage = new WaitPage.LoginPage();
    private WaitPage.RegistrationPage registrationPage = new WaitPage.RegistrationPage();

    @Test
    public void loginWaitTest() throws InterruptedException {
        open("https://ui.cogmento.com/register");
        Thread.sleep(1000);
        loginPage.enterEmail("Naveen");
        loginPage.enterPassword("123456");
        loginPage.clickLoginButton();
    }

    @Test
    public void registerWaitTest() throws InterruptedException {
        open("https://ui.cogmento.com/register");
        Thread.sleep(1000);
        registrationPage.clickSignUpLink();
        registrationPage.enterEmail("hero@gmail.com");
        registrationPage.agreeToTerms();
        registrationPage.clickSubmitButton();
    }
}
