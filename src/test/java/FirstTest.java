import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FirstTest extends BaseTest {
    @Test
    public void myTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement searchField = driver.findElementByXPath("//input[@name=\"q\"]");
        searchField.sendKeys(Keys.chord("selenide", Keys.ENTER));
    }
}
