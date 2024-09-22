package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BrowserSetup {

    public static String browserName = System.getProperty("browser","Chrome");

   // public WebDriver browser;
   public static final ThreadLocal<WebDriver> LOCAL_BROWSER = new ThreadLocal<>();

    public static WebDriver getBrowser() {
        return LOCAL_BROWSER.get();
    }

    public static void setBrowser(WebDriver browser) {
        BrowserSetup.LOCAL_BROWSER.set(browser);
    }

    public WebDriver getBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("Chrome")){

           // ChromeOptions chromeOptions = new ChromeOptions();
            //chromeOptions.setBinary("C:\\Users\\Asus\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
           // chromeOptions.addArguments("user-data-dir=C:\\Users\\Asus\\AppData\\Local\\Google\\Chrome\\User Data");
           // return new ChromeDriver(chromeOptions);
            return new ChromeDriver();
        }


        else if (browserName.equalsIgnoreCase("Firefox")){
          //  FirefoxOptions firefoxOptions = new FirefoxOptions();
          //  firefoxOptions.addArguments("user-data-dir=C:\\Users\\Asus\\AppData\\Local\\Mozilla\\Firefox\\Profiles");;
            return new FirefoxDriver();
        }

        else if (browserName.equalsIgnoreCase("Edge")){
           // EdgeOptions edgeOptions = new EdgeOptions();
           // edgeOptions.addArguments("user-data-dir=C:\\Users\\Asus\\AppData\\Local\\Microsoft\\Edge\\User Data");
            return new EdgeDriver();
        }

        else {
            throw new RuntimeException("Browser is not available with the given name:" + browserName);
        }


    }

    @BeforeSuite
    public void startBrowser() {
     //   browser = new ChromeDriver();

        WebDriver browser = getBrowser(browserName);
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        browser.manage().window().maximize();
        setBrowser(browser);
    }




    @AfterSuite
    public void quitBrowser() {
        getBrowser().quit();
    }

}

