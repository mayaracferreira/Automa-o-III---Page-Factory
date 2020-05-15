package Pages;

import hooks.BaseTest;
import hooks.DefaultProperties;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Register extends BaseTest implements DefaultProperties {

    //novo usuario
    private  By btnCadastro = By.xpath("//a[@href='/cadastro']");

    public void cadastrar (){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().findElement(btnCadastro).click();
    }

    //fazer cadastro

    private By txtNome = By.id("nome");
    private By txtEmail = By.id("email");
    private By txtSenha = By.id("senha");
    private By btnSubmit = By.cssSelector("input[type='submit']");

    public void dadosUsuario (){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().findElement(txtNome).sendKeys("Mayara");
        getDriver().findElement(txtEmail).sendKeys("mayara.teste1@gft.com");
        getDriver().findElement(txtSenha).sendKeys("12345");
        getDriver().findElement(btnCadastro).click();
    }


}