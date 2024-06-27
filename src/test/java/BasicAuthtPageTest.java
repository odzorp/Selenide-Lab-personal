import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.open;

public class BasicAuthtPageTest {

    private BasicAuthPage basicAuthPage;

    @BeforeClass
    public void setup() {
        Configuration.browser = "firefox";
        basicAuthPage = new BasicAuthPage();
    }

    @Test
    public void authPopTest() throws MalformedURLException, InterruptedException {
        open(new URL("https://the-internet.herokuapp.com/basic_auth"), "", "admin", "admin");
        Thread.sleep(5000);
        String text = basicAuthPage.getExampleText();
        System.out.println(text);
        Assert.assertTrue(text.contains("Congratulations"));
    }
}
