import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class FindElementsTest {

    private FindElementsPage findElementsPage;

    @BeforeClass
    public void setup() {
        findElementsPage = new FindElementsPage();
    }

    @Test
    public void elementsTest() {
        open("https://amazon.com/");
        findElementsPage.printAllLinks();
    }
}
