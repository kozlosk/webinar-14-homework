import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise4Test extends BaseTest {
    @Test
    public void invalidLoginToAdminPanelTest() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement loginInput = driver.findElement(By.id("txtUsername"));
        loginInput.sendKeys("WrongUsername");
        WebElement passwordInput = driver.findElement(By.id("txtPassword"));
        passwordInput.sendKeys("WrongPassword");
        WebElement button = driver.findElement(By.id("btnLogin"));
        button.click();
        Assert.assertEquals(driver.findElement(By.id("spanMessage")).getText(),"Invalid credentials");
    }
}
