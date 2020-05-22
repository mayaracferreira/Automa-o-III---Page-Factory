package Pages;

import Drivers.DriverManager;
import Drivers.DriverManagerFactory;
import hooks.DefaultProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class Login extends DriverManagerFactory implements DefaultProperties {

    public class TestLogin {

        WebDriver driver;

        @FindBy(id = "email")
        WebElement txtEmail;

        @FindBy(id = "senha")
        WebElement txtSenha;

        @FindBy(css = "button[type='submit']")
        WebElement btnSubmit;


        public void acessarAplicacao() {
            getDriver().get(URL_BASE);

        }

        public boolean isLoginPagePresent() {
            getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            WebElement element = getWait().until((ExpectedConditions.elementToBeClickable(btnSubmit)));
            return element.isEnabled();
        }

        public void Logar(String email, String senha) {
            txtEmail.sendKeys(email);
            txtSenha.sendKeys(senha);
            btnSubmit.click();

        }
    }

}

