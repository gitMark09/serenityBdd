package Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/")
public class Loginpage extends PageObject {

    public void setTxtUsername(String username){
        txtUsername.sendKeys(username);
    }

    public void setTxtPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    @FindBy(id = "user-name")
    public WebElement txtUsername;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(id = "login-button")
    WebElement btnLogin;
}
