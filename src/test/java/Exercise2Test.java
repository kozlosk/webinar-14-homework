import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class Exercise2Test extends BaseTest {

    @Test
    public void objectCounterTest() {
        driver.get("http://bbc.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".fc-cta-consent"))).click();
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        System.out.println("Links counter: " + linksList.size());
        List<WebElement> imagesList = driver.findElements(By.tagName("img"));
        System.out.println("Images counter: " + imagesList.size());
    }
}
