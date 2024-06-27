import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class HandlingIframesTest {

    private HandlingIframesPage handlingIframesPage;

    @BeforeTest
    public void setup() {
        handlingIframesPage = new HandlingIframesPage();
        open("https://allwebco-templates.com/support/S_script_IFrame.htm");
        handlingIframesPage.waitForFrame();
    }

    @Test
    public void iframeTest() {
        handlingIframesPage.switchToFrame();
        handlingIframesPage.clickSearchImage();
        handlingIframesPage.enterSearchTerm("Hello World");
        handlingIframesPage.clickSubmitButton();
        handlingIframesPage.switchToDefaultContent();
        String text = handlingIframesPage.getSampleText();
        System.out.println(text);
    }
}
