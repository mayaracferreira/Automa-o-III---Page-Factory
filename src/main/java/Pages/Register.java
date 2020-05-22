package Pages;

import hooks.DefaultProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Register extends BaseTest implements DefaultProperties {




    @FindBy(id = "nome")
    WebElement txtNome;

    @FindBy(id = "email")
    WebElement txtEmail;

    @FindBy(id= "senha")
    WebElement txtSenha;

    @FindBy (css="input[type='submit']")
    WebElement btnSubmit;




    public void dadosUsuario (String nome, String email, String senha){

        txtNome.sendKeys(nome);
        txtEmail.sendKeys(email);
        txtSenha.sendKeys(senha;
    }

    public void cadastrar (){
        btnSubmit.click();
    }


}