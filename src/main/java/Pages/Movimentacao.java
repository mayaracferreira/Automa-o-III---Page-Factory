package Pages;

import hooks.BaseTest;
import hooks.DefaultProperties;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Movimentacao extends BaseTest implements DefaultProperties {

    //criar movimentação
    private By btnMovimentacao = By.xpath("//a[@href='/movimentacao']");
    private By txtTipo = By.id("tipo");
    private By txtDataTransacao = By.id("data_transacao");
    private By txtDataPagamento = By.id("data_pagamento");
    private By txtDescricao = By.id("descricao");
    private By txtInteressado = By.id("interessado");
    private By txtValor = By.id("valor");
    private By slcConta = By.id("conta");
    private By slcStatus = By.id("status_pago");
    private By btnSubmit = By.cssSelector("button[type='submit']");

    public void CriarMovimentação() {


        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().findElement(btnMovimentacao).click();
        getDriver().findElement(txtTipo).sendKeys("receita");
        getDriver().findElement(txtDataTransacao).sendKeys("20/04/2020");
        getDriver().findElement(txtDataPagamento).sendKeys("21/04/2020");
        getDriver().findElement(txtDescricao).sendKeys("aluguel");
        getDriver().findElement(txtInteressado).sendKeys("Jose");
        getDriver().findElement(txtValor).sendKeys("1000");
        getDriver().findElement(slcConta).sendKeys("Aluguel");
        getDriver().findElement(slcStatus).click();
        getDriver().findElement(btnMovimentacao).click();
    }
}
