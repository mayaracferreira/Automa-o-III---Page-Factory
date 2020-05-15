package Drivers;

import org.openqa.selenium.edge.EdgeDriver;

public class DriverManagerFactory {

    public enum DriverType {
        CHROME,
        EDGE;
    }

    public static DriverManager getManager(DriverType type) {
        DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case EDGE:
                driverManager = new EdgeDriverManager();
                break;

            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;
    }
}



