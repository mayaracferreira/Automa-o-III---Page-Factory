package Pages;

import hooks.DefaultProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddConta extends BaseTest implements DefaultProperties {

    //criar conta
    @FindBy(id = "nome")
    WebElement txtNome;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    WebElement btnConta;

    @FindBy(xpath = "//a[@href='/addConta']")
    WebElement btnAddConta;

    @FindBy(css = "button[type='submit']")
    WebElement btnSubimit;


    public void AdicionarConta() {
        btnConta.click();
        btnAddConta.click();
        txtNome.sendKeys("Aluguel");
    }

    public void Salvar() {
        btnAddConta.click();

    }
}


