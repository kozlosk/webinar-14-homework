import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Exercise6Test extends BaseTest {

    @Test
    public void moveBlocksToProperColumns() {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Actions moveBlocksToColumnsAction = new Actions(driver);

        List<WebElement> valueBlockList = driver.findElements(By.id("fourth"));

        moveBlocksToColumnsAction
                .dragAndDrop(valueBlockList.get(0),driver.findElement(By.id("amt7")))
                .build()
                .perform();
        Assert.assertTrue(driver.findElement(By.id("t7")).isDisplayed());
        Assert.assertEquals(driver.findElement(By.id("t7")).getText(),valueBlockList.get(0).getText());
    }
}
