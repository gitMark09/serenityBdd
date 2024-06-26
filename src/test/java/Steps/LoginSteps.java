package Steps;

import Pages.Loginpage;
import net.serenitybdd.annotations.Step;

public class LoginSteps {

    Loginpage lp;

    @Step
    public void openSite(){
        lp.open();
    }

    @Step
    public void enterUsername(String username){
        lp.setTxtUsername(username);
    }
    @Step
    public void enterPassword(String password){
        lp.setTxtPassword(password);
    }
    @Step
    public void clickLoginButton(){
        lp.clickBtnLogin();
    }



}
