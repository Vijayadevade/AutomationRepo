package vijayatech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class exmplElement {
    public static WebDriver driver;

    public static void main(String[] args)throws InterruptedException , IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login1.cgi");

        driver.findElement(By.id("login")).sendKeys("vijaya2010devade@gmail.com");
        Thread.sleep(3000);
        driver.close();


    }

}

