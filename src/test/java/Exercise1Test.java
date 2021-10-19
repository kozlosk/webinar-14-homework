import org.testng.annotations.Test;

public class Exercise1Test extends BaseTest {

    @Test
    public void printTitleTest() {
        driver.get("http://testuj.pl/");
        System.out.println("======================================================\n" + driver.getTitle() + "======================================================");
    }
}
