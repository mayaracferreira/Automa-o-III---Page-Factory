package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

    @FindBy (css="a[href='/cadastro']")
    WebElement btnNovoUsuario;

    @FindBy (css="a[class=dropdown-toggle]")
    WebElement btnCriarConta;


    @FindBy (css="a[href='/addConta']")
    WebElement btnAddConta;

    @FindBy (css="a[href='/movimentacao']")
    WebElement btnCriarMovimentacao;

    @FindBy (css="a[href='/logout']")
    WebElement btnSair;


    public void NovoUsuario (){
        btnNovoUsuario.click();
    }

    public void CriarConta (){
        btnCriarConta.click();
        btnAddConta.click();

    }

    public void CriarMovimentacao (){
        btnCriarMovimentacao.click();
    }

    public void Sair (){
        btnSair.click();
    }
}
