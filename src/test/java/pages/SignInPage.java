package pages;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;

public class SignInPage extends BasePage{

    Dotenv dotenv = Dotenv.load();
    public String Email =dotenv.get("Email");
    public String password =dotenv.get("password");


    public String OTP = "4901";
    public By emailInputBox = By.cssSelector("input[placeholder='Email or phone']");
    public By nextButton1 = By.cssSelector("#js--btn-next");
    public By passwordInputBox = By.name("j_password");
    public By otpInputBox = By.cssSelector("input[placeholder='OTP']");
    public By logInButton = By.xpath("//form[@id='login-form']/button[@type='submit']");
   // public By errorMsg = By.xpath("//input[@name='password']/following-sibling::p");
    public By otpErrorMsg = By.id("js--message");
    public By invalidEmailMsg = By.cssSelector(".validation-text");
    public By invalidPasswordMsg = By.cssSelector("#js--message");
}
