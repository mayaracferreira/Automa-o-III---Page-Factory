package Drivers;


import lombok.Getter;
import lombok.Setter;
import  org.openqa.selenium.WebDriver;


import  class DriverManagerFactory {

    @Getter @Setter
    public static WebDriver driver;

    public static  DriverManagerFactory {

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
}



