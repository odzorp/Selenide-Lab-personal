import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class JSAlertPopUpHandlesPage {

    private final SelenideElement proceedButton = $(By.name("proceed"));

    public void clickProceedButton() {
        proceedButton.click();
    }

    public String getAlertText() {
        return switchTo().alert().getText();
    }

    public void acceptAlert() {
        switchTo().alert().accept();
    }

    public void dismissAlert() {
        switchTo().alert().dismiss();
    }
}
