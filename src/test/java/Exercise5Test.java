import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise5Test extends BaseTest {

    @Test
    public void verifyFinalPriceForThreeItemsTest() {
        driver.get("http://demo.guru99.com/payment-gateway/index.php");
        WebElement selectList = driver.findElement(By.name("quantity"));
        Select select = new Select(selectList);
        select.selectByValue("3");
        WebElement button = driver.findElement(By.cssSelector(".button"));
        button.click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".\\36 u > font:nth-child(2)")).getText(),"$60.00");
    }
}
