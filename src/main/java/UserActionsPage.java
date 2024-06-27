import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class UserActionsPage {

    public void navigateToSpiceJet() {
        open("https://www.spicejet.com");
    }

    public SelenideElement getAddOnElement() {
        return $(By.id("highlight-addons")).shouldBe(visible);
    }

    public SelenideElement getVisaServicesLink() {
        return $(By.xpath("//a[text()='Visa Services']")).shouldBe(visible, enabled);
    }

    public void navigateToDragAndDropDemo() {
        open("https://jqueryui.com/droppable/");
        switchTo().frame(0); // Switch to the iframe for droppable demo
    }

    public SelenideElement getDragElement() {
        return $(By.xpath("//div[@id='draggable']"));
    }

    public SelenideElement getDropElementText() {
        return $(By.cssSelector("div[id='droppable'] p"));
    }

    public SelenideElement getDropElement() {
        return $(By.xpath("//div[@id='droppable']"));
    }

    public void navigateToRightClickDemo() {
        open("https://swisnl.github.io/jQuery-contextMenu/demo.html");
    }

    public SelenideElement getRightClickElement() {
        return $(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
    }
}
