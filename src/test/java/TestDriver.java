import hooks.BaseTest;
import org.junit.Test;
import Pages.*;
import org.openqa.selenium.support.PageFactory;


public class TestDriver extends BaseTest {

     AddConta addConta = PageFactory.initElements(getDriver(), AddConta.class);
     Login login = PageFactory.initElements(getDriver(), Login.class);
     Movimentacao movimentacao = PageFactory.initElements(getDriver(),Movimentacao.class);
     Register register = PageFactory.initElements(getDriver(),Register.class);

    @Test

public void testSeuBarriga (){
        addConta.AdicionarConta();
        login.acessarAplicacao();
        login.isLoginPagePresent();
        login.Logar();
        movimentacao.CriarMovimentação();
        register.cadastrar();
        register.dadosUsuario();
    }

}
