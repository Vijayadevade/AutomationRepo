package LocatorsExaple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class FindElement{
    public static WebDriver driver;

    public static void main(String[] args) throws IOException,InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver =  new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.id("login1")).sendKeys("vijaya2010devade@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("passwd")).sendKeys(("1122222333"));
        Thread.sleep(3000);
        driver.findElement(By.className("signinbtn")).click();
        Thread.sleep(3000);

        }
    }
