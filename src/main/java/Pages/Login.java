package Pages;

import hooks.BaseTest;
import hooks.DefaultProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class Login extends BaseTest implements DefaultProperties {

    //login
    private By txtEmail = By.id("email");
    private By txtSenha = By.id("senha");
    private By btnSubmit = By.cssSelector("button[type='submit']");

    public void acessarAplicacao() {
        getDriver().get(URL_BASE);
    }

    public boolean isLoginPagePresent() {
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = getWait().until((ExpectedConditions.elementToBeClickable(btnSubmit)));
        return element.isEnabled();
    }

        public void Logar () {
            getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            getDriver().findElement(txtEmail).sendKeys("mayara.test@gft.com");
            getDriver().findElement(txtSenha).sendKeys("12345");
            getDriver().findElement(btnSubmit).click();
        }


}

