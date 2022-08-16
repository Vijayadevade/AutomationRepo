//package LocatorsExaple;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import java.io.IOException;
//
//public class singleDropDown {
//    public static WebDriver driver;
//    public static void main(String[] args) throws IOException, InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
//        WebElement singleDrpDown = driver.findElement(By.name("country"));
//
//        Select select = new Select(singleDrpDown);
//        select.
//
//
//        Thread.sleep(3000);
//        driver.close();
//
//
//
//    }
//
//}