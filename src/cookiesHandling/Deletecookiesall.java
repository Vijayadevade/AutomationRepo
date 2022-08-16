package cookiesHandling;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Set;

public class Deletecookiesall {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.flipkart.com");
        driver.manage().window().maximize();

        Cookie cookie = new Cookie("Institute", "Digital Partner");
        driver.manage().addCookie(cookie);


        System.out.println("Fatch all cookies"+"************************");
        Set<Cookie> cookies1 = driver.manage().getCookies();
        for (Cookie c : cookies1) {
            System.out.println(c);
        }

        System.out.println("Delete cookie from cookies"+"/////////////////////////////////");
        driver.manage().deleteCookie(cookie);
        Set<Cookie> cookies2 = driver.manage().getCookies();
        for (Cookie c : cookies2) {
            System.out.println(c);
        }

        System.out.println("Delete All cookie"+"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        driver.manage().deleteAllCookies();
        Set<Cookie> cookies3 = driver.manage().getCookies();
        for (Cookie c : cookies3) {
            System.out.println(c);
        }
        driver.quit();

    }
}
