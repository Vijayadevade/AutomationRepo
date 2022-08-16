package HandlingWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args)throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");

        WebElement dragElement = driver.findElement(By.id("Dragaable"));
        WebElement dropElement = driver.findElement(By.id("Droppable"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",dragElement);
        Thread.sleep(5000);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement,dropElement).perform();
        Thread.sleep(5000);

    }
}
