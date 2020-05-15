package Pages;

import hooks.BaseTest;
import hooks.DefaultProperties;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AddConta extends BaseTest implements DefaultProperties {

    //criar conta

    private By btnConta = By.xpath("//a[@class='dropdown-toggle']");
    private By btnAddConta = By.xpath("//a[@href='/addConta']");
    private By txtNome = By.id("nome");
    private By btnSubmit = By.cssSelector("button[type='submit']");

    public void AdicionarConta (){
        getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        getDriver().findElement(btnConta).click();
        getDriver().findElement(btnAddConta).click();
        getDriver().findElement(txtNome).sendKeys("Alugel");
        getDriver().findElement(btnSubmit).click();
    }

}
