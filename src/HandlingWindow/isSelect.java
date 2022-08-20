package HandlingWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class isSelect {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement bmwradio = driver.findElement(By.id(""));
        bmwradio.click();

        System.out.println(bmwradio.isSelected());

        Thread.sleep(3000);
    }

}