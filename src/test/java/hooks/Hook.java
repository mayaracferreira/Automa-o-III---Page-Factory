package hooks;

import Drivers.DriverManager;
import Drivers.DriverManagerFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hook extends DriverManagerFactory implements DefaultProperties {

    @Getter
    @Setter
    private  static WebDriver driver;
    DriverManager driverManager;

    @Before
    public void init (){
        System.setProperty("webdriver.chrome.driver", "src\\tes\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://seubarriga.wcaquino.me/login");

    }

    @After
    public  void  tearDown (){
        driver.close();

    }
}
