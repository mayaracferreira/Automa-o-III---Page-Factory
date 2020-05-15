package Drivers;
import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;

     abstract void startService();
     abstract void stopService();
     abstract void createDriver();


    public void closeDriver() {
        if (driver != null) {
            driver.close();
        }

    }
    public WebDriver getDriver() {
        if (null == driver) {
            startService();
            createDriver();
        }
        return driver;
    }



}