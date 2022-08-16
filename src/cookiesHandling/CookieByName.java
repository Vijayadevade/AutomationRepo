package cookiesHandling;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Set;

public class CookieByName {

    public static void main(String[] args) throws IOException,InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.flipkart.com");
        driver.manage().window().maximize();

        Cookie cookie = new Cookie("Institute","Digital Partner");
        driver.manage().addCookie(cookie);

        System.out.println(driver.manage().getCookieNamed("Institute"));

        Thread.sleep(3000);
        driver.quit();
    }
}

