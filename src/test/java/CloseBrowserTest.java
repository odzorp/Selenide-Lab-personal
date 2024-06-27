import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class CloseBrowserTest {

    private CloseBrowserPage closeBrowserPage;

    @BeforeClass
    public void setup() {
        closeBrowserPage = new CloseBrowserPage();
    }

    @Test
    public void closeBrowserTest() {
        open("https://opensource-demo.orangehrmlive.com/");

        closeBrowserPage.login("Admin", "admin123");

        System.out.println("Dashboard Title: " + title());

        closeBrowserPage.clickExternalLink();

        switchTo().window(1);
        System.out.println("External Link Window Title: " + title());

        closeWindow();

        switchTo().window(0);
        System.out.println("Back to Dashboard Title: " + title());

        closeWebDriver();
    }
}
