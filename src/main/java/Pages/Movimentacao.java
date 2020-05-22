package Pages;

import hooks.DefaultProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Movimentacao extends BaseTest implements DefaultProperties {


    @FindBy (xpath ="//a[@href='/movimentacao']" )
    WebElement btnMovimentacao;

    @FindBy (id = "tipo")
    WebElement txtTipo;

    @FindBy (id = "data_transacao")
    WebElement txtDataTransacao;

    @FindBy (id = "data_pagamento")
    WebElement txtDataPagamento;

    @FindBy (id = "descricao")
    WebElement txtDescricao;

    @FindBy (id = "interessado")
    WebElement txtInteressado;

    @FindBy (id = "valor")
    WebElement txtValor;

    @FindBy (id = "conta")
    WebElement slcConta;

    @FindBy (id = "status_pago")
    WebElement slcStatus;

    @FindBy (css = "button[type='submit']")
    WebElement btnSubmit;


    public void CriarMovimentação(String tipo, String dataMovimentacao, String dataPagamento, String descricao, String interessado, String valor, String conta, String status ) {

        btnMovimentacao.click();
        txtTipo.sendKeys(tipo);
        txtDataTransacao.sendKeys(dataMovimentacao);
        txtDataPagamento.sendKeys(dataPagamento);
        txtDescricao.sendKeys(descricao);
        txtInteressado.sendKeys(interessado);
        txtValor.sendKeys(valor);
        slcConta.sendKeys(conta);
        slcStatus.sendKeys(status);

    }

    public void Salvar (){
        btnSubmit.click();

    }
}
