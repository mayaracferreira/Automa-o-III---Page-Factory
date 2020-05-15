package hooks;

import lombok.Getter;
import lombok.Setter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTest implements DefaultProperties {

    @Getter
    @Setter
    private static ChromeDriver driver;
    @Getter
    @Setter
    private static WebDriverWait wait;

    @Before

    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://seubarriga.wcaquino.me/login");
        wait = new WebDriverWait(getDriver(), 10);
    }

    @After
    public void TearDown () {
        driver.close();


    }
}