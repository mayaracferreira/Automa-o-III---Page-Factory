package steps;

import Pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import hooks.Hook;
import org.openqa.selenium.support.PageFactory;

public class MovimentacaoSteps extends Hook {


    private AddConta addConta = PageFactory.initElements(getDriver(), AddConta.class);
    private Login login = PageFactory.initElements(getDriver(), Login.class);
    private Movimentacao movimentacao = PageFactory.initElements(getDriver(),Movimentacao.class);
    private Register register = PageFactory.initElements(getDriver(),Register.class);
    private Home home = PageFactory.initElements(getDriver(), Home.class);

    @Dado("^eu tenha acessado a pagina de movimentação$")
    public void euTenhaAcessadoAPaginaDeMovimentacao() throws Throwable{
        AddConta addConta = PageFactory.initElements(getDriver(), AddConta.class);
        Login login = PageFactory.initElements(getDriver(), Login.class);
        Movimentacao movimentacao = PageFactory.initElements(getDriver(),Movimentacao.class);
        Register register = PageFactory.initElements(getDriver(),Register.class);
        Home home = PageFactory.initElements(getDriver(), Home.class);


        login.acessarAplicacao();
        home.NovoUsuario();
        register.dadosUsuario("Mayara","mayara.test5@gft.com", "12345");
        register.cadastrar();
        login.isLoginPagePresent();
        login.Logar("mayara.test5@gft.com", "12345");
        home.CriarConta();
        addConta.AdicionarConta();
        addConta.Salvar();
        }

    @Quando("eu criar movimentação")
    public void euCriarMovimentação() {
        home.CriarMovimentacao();
        movimentacao.CriarMovimentação("Receita", "20/04/2020", "21/04/2020", "Aluguel", "Jose", "1000", "aluguel","Recebido" );
        movimentacao.Salvar();
        
    }

    @Entao("devo ver o valor")
    public void devoVerOValor() {

        Home.Sair();


    }
}
