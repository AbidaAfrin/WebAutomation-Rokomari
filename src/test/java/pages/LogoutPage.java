package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogoutPage extends BasePage{



    public By logoutButton = By.cssSelector(".user-name");
    public By signOutButton = By.xpath("//a[normalize-space()='Sign Out']");


    public void clickSignOut(){
       clickOnElement(logoutButton);
       //scroll(signOutButton);
       clickOnElement(signOutButton);


    }
}
