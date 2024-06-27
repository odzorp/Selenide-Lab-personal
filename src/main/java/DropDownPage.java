import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DropDownPage {

    private final SelenideElement countryDropdown = $(By.id("Form_getForm_Country"));
    private final ElementsCollection countryOptions = $$(By.cssSelector("select#Form_getForm_Country option"));

    public void selectCountryByIndex(int index) {
        countryDropdown.selectOption(index);
    }

    public void selectCountryByName(String countryName) {
        for (SelenideElement option : countryOptions) {
            if (option.getText().equals(countryName)) {
                option.click();
                break;
            }
        }
    }

    public int getCountryOptionsCount() {
        return countryOptions.size();
    }
}
