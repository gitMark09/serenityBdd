package Tests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Steps.LoginSteps;
import Steps.HomepageSteps;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Steps
    LoginSteps loginSteps;
    @Steps
    HomepageSteps homepageSteps;

    @Managed(driver = "chrome")
    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void TestLogin(){

        loginSteps.openSite();
        loginSteps.enterUsername("standard_user");
        loginSteps.enterPassword("secret_sauce");
        loginSteps.clickLoginButton();
        homepageSteps.getVisibilityBurgerIcon();

    }




}
