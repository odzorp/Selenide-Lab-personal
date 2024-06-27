import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class UserActionsTest {

    private UserActionsPage userActionsPage = new UserActionsPage();

    @Test
    public void moveToElementTest() throws InterruptedException {
        userActionsPage.navigateToSpiceJet();
        Thread.sleep(10000);
        SelenideElement addOn = userActionsPage.getAddOnElement();
        actions().moveToElement(addOn).build().perform();
        sleep(5000);
        SelenideElement visaServices = userActionsPage.getVisaServicesLink();
        visaServices.click();
        visaServices.should(disappear);
    }

    @Test(dependsOnMethods = "moveToElementTest")
    public void dragAndDropElementTest() {
        userActionsPage.navigateToDragAndDropDemo();
        SelenideElement dragElement = userActionsPage.getDragElement();
        SelenideElement dropElement = userActionsPage.getDropElement();
        actions().dragAndDrop(dropElement, dragElement).perform();
        userActionsPage.getDropElementText().shouldHave(text("Dropped!"));
    }

    @Test(dependsOnMethods = "dragAndDropElementTest")
    public void rightClickTest() {
        userActionsPage.navigateToRightClickDemo();
        SelenideElement rightClick = userActionsPage.getRightClickElement();
        actions().contextClick(rightClick).perform();
        // Handle right-click context menu actions here
        sleep(5000);
    }
}
