package LocatorsExaple;

import com.company.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.io.IO;
import java.io.IOException;


public class cssSelector {

    public static WebDriver driver;
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.cssSelector("input[id = 'login1']")).sendKeys("vijaya2010devade@gmail");
        Thread.sleep(3000);
        driver.close();

}
}