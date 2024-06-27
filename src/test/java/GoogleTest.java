import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    private GooglePage googlePage;

    @BeforeTest
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.baseUrl = "https://www.google.com";
        Configuration.browserSize = "1920x1080";
        Configuration.screenshots = false;
        googlePage = new GooglePage();
        open("/");
    }

    @Test
    public void testGoogle() {
        googlePage.searchFor("Naveen AutomationLabs");
        googlePage.verifyLogoAppears();
        String header = googlePage.getSearchResultHeaderText();
        System.out.println(header);
        Assert.assertEquals(header, "Welcome to Naveen AutomationLabs - naveen automationlabs");
    }
}

