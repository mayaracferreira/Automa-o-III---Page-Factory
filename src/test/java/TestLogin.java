import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLogin {

    WebDriver driver;

    @FindBy (id="email")
    WebElement usuario;

    @FindBy (id = "senha")
    WebElement senha;

    @FindBy (css = "button[type='submit']")
    WebElement  btnSubmit;

    public TestLogin (WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public void setUsuario (String strUsuario){
        usuario.sendKeys(strUsuario);
    }

    public void setSenha (String strSenha) {
        senha.sendKeys(strSenha);

    }

    public  void clickLogin(){
        btnSubmit.click();
    }

    public String getLoginTitle(){
        return  usuario.getText();
    }
}
