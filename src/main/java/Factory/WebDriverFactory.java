package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class WebDriverFactory {

    public static WebDriver driver;
    public static void initializeDriver(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void openApp() {
        driver.get("https://www.poundland.co.uk/");

    }

    public static void killWebDriver(){
        driver.quit();
    }
}
