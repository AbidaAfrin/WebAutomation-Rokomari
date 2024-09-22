package pages;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MyCartPage extends BasePage {

    NavBarPage navBarPage = new NavBarPage();
    public String url="https://www.rokomari.com/cart/new";



    public By cart = By.cssSelector("img[alt='cart']");

    public By placeOrderButton = By.cssSelector("a[id='js-continue-to-shipping'] span");



    public void goToMyCartPage(){

        clickOnElement((cart));
    }
}
