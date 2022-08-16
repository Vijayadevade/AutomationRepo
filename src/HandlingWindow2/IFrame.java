
package HandlingWindow2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class IFrame {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        int count = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame("frame1");
        System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
        System.out.println(count);
        Thread.sleep(3000);
        driver.quit();

    }



    }


