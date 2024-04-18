package Steps;

import Pages.Homepage;
import net.serenitybdd.annotations.Step;

public class HomepageSteps {

    Homepage hp;
    @Step
    public boolean getVisibilityBurgerIcon(){
        return hp.btn_BurigerIcon.isDisplayed();
    }

    @Step
    public void clickBurgerIcon(){
        hp.click_BurgerIconBtn();
    }

    @Step
    public void clickLogout(){
        hp.click_LogoutBtn();
    }

}
