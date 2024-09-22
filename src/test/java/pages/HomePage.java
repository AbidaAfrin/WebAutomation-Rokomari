package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{
    public String url="https://www.rokomari.com/book";

    public By signInButton = By.className("logged-out-user-menu-btn");
    public By userIcon = By.xpath("//span[@class='user-name']");





    public By writerButton= By.id("js--authors");
    public By writerName = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");

}
