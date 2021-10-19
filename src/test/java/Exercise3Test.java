import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise3Test extends BaseTest {

    @Test
    public void loginToAdminPanelTest() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement loginInput = driver.findElement(By.id("txtUsername"));
        loginInput.sendKeys("Admin");
        WebElement passwordInput = driver.findElement(By.id("txtPassword"));
        passwordInput.sendKeys("admin123");
        WebElement button = driver.findElement(By.id("btnLogin"));
        button.click();
        Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
    }
}
