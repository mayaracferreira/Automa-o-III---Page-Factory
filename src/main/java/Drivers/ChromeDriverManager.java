package Drivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;

public class ChromeDriverManager extends DriverManager {

    ChromeDriverService chromeService;

    @Override
    public void startService() {
        if (null == chromeService) {
            chromeService = new ChromeDriverService.Builder().usingDriverExecutable(new File("src\\main\\resources\\crhomedriver.exe")).usingAnyFreePort().build();
        }
    }

    @Override
    protected void stopService() {
        if (null != chromeService && chromeService.isRunning())
            chromeService.stop();

    }

    @Override
    protected void createDriver() {
        driver = new ChromeDriver(chromeService);

    }

}