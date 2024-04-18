package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage extends PageObject {

    public void click_BurgerIconBtn(){
        btn_BurigerIcon.click();
    }

    public void click_LogoutBtn(){
        btn_Logout.click();
    }

    public boolean isItemDisplayed(String item) {
        return getDriver().findElement(By.xpath(inventoryItem.replace("{0}", item))).isDisplayed();

    }

    @FindBy(xpath = "//button[text()='Open Menu']")
    public WebElement btn_BurigerIcon;

    @FindBy(id = "logout_sidebar_link")
    public WebElement btn_Logout;

    public String inventoryItem = "//div[@class='inventory_item_name ' and text()='"+"{0}"+"']";


}
