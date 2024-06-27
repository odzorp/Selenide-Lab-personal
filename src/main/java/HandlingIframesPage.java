import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class HandlingIframesPage {

    private final SelenideElement frame = $(By.xpath("//iframe[@name='Framename' and contains(@class, 'framesample framesample2')]"));
    private final SelenideElement searchImage = $(By.xpath("(//img[@alt='Search'])[1]"));
    private final SelenideElement searchInput = $(By.xpath("//td[normalize-space()='broad exact']//input[@name='terms']"));
    private final SelenideElement submitButton = $(By.xpath("(//input[@name='submitbutton'])[1]"));
    private final SelenideElement sampleText = $(By.xpath("(//span[normalize-space()='Sample website in an IFrame page'])[1]"));

    public void switchToFrame() {
        switchTo().frame(frame);
    }

    public void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    public void clickSearchImage() {
        searchImage.click();
    }

    public void enterSearchTerm(String term) {
        searchInput.sendKeys(term);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void waitForFrame() {
        frame.shouldBe(Condition.visible);
    }

    public String getSampleText() {
        return sampleText.getText();
    }
}
