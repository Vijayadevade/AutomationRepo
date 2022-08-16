package HandlingWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args)throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");

        WebElement doubleClickMethod = driver.findElement(By.xpath("//button[text()='Double-Click me to see Alert message']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickMethod).perform();
        Thread.sleep(3000);
        driver.close();


    }
}
