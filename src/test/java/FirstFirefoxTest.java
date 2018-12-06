
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static junit.framework.TestCase.assertTrue;

public class FirstFirefoxTest {

    @Test
    public void driverIsTheKing(){
        //WebDriver driver =new HtmlUnitDriver();
        WebDriver driver =new FirefoxDriver();
        driver.navigate().to("https://compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
        driver.get("https://compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
       /* driver.get("https://compendiumdev.co.uk/search.php");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified Search Engine"));
        driver.get("https://compendiumdev.co.uk/basic_html_form.html");
        assertTrue(driver.getTitle().startsWith("HTML Form Elements"));
        driver.get("https://compendiumdev.co.uk/basic_web_page");
        assertTrue(driver.getTitle().startsWith("Basic Web Page Title"));
        driver.get("https://compendiumdev.co.uk/selenium");
        assertTrue(driver.getTitle().startsWith("Software"));*/

        driver.close();
    }
}
