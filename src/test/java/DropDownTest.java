import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class DropDownTest {

    private DropDownPage dropDownPage;

    @BeforeClass
    public void setup() {
        dropDownPage = new DropDownPage();
    }

    @Test
    public void dropDownSelect() throws InterruptedException {
        open("https://www.orangehrm.com/orangehrm-30-day-trial/");

        // Select by index
        dropDownPage.selectCountryByIndex(2);
        Thread.sleep(2000);

        // Select by country name
        System.out.println("Number of countries in the dropdown: " + dropDownPage.getCountryOptionsCount());

        dropDownPage.selectCountryByName("Angola");
        Thread.sleep(2000);
    }
}
