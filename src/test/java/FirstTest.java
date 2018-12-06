
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static junit.framework.TestCase.assertTrue;

public class FirstTest {

    @Test
    public void driverIsTheKing(){
        //WebDriver driver =new HtmlUnitDriver();
        WebDriver driver =new HtmlUnitDriver();
        driver.get("https://compendiumdev.co.uk/");
        assertTrue(driver.getTitle().startsWith("Software"));
    }
}
