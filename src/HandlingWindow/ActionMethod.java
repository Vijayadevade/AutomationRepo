package HandlingWindow;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionMethod {
    public static void main(String[] args)throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        WebElement elementA = driver.findElement(By.xpath("//li[text()='A']"));
        WebElement elementB = driver.findElement(By.xpath("//li[text()='B']"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",elementA);
        Thread.sleep(5000);

        Actions actions= new Actions(driver);
        actions.clickAndHold(elementA).moveToElement(elementB).build().perform();
        Thread.sleep(5000);

        actions.release().build().perform();
        Thread.sleep(5000);
        driver.close();

    }
}
