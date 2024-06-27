import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class FindElementsPage {

    private final ElementsCollection allLinks = $$(By.tagName("a"));

    public ElementsCollection getAllLinks() {
        return allLinks;
    }

    public void printAllLinks() {
        for (SelenideElement link : allLinks) {
            String text = link.getText();
            String href = link.getAttribute("href");
            System.out.println("Text: " + text + " ____ Href: " + href);
        }
    }
}
