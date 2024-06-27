import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverRunnerTest {

    private WebDriverRunnerPage webPage;

    @BeforeMethod
    public void setUp() {
        webPage = new WebDriverRunnerPage();
        webPage.openLoginPage();
    }

    @Test
    public void testWebDriverRunner() {
        String currentUrl = webPage.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        Assert.assertTrue(currentUrl.contains("orangehrmlive"));

        String pageSource = webPage.getPageSource();
        System.out.println("Page Source:\n" + pageSource);
    }

    @AfterMethod
    public void tearDown() {
        webPage.closeBrowser();
    }
}
