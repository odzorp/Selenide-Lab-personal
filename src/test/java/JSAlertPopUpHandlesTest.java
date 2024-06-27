import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class JSAlertPopUpHandlesTest {

    private JSAlertPopUpHandlesPage jsAlertPopUpHandlesPage;

    @BeforeTest
    public void setup() {
        jsAlertPopUpHandlesPage = new JSAlertPopUpHandlesPage();
    }

    @Test
    public void alertTest() throws InterruptedException {
        open("https://mail.rediff.com/cgi-bin/login.cgi");
        jsAlertPopUpHandlesPage.clickProceedButton();

        // Wait for the alert to appear
        Thread.sleep(5000);

        String alertText = jsAlertPopUpHandlesPage.getAlertText();
        System.out.println(alertText);
        Assert.assertEquals(alertText, "Please enter a valid user name");
        jsAlertPopUpHandlesPage.acceptAlert();
        // jsAlertPopUpHandlesPage.dismissAlert();
    }
}
