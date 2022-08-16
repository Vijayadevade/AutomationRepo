package HandlingWindow2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UploadFile {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement uploadfile = driver.findElement(By.id("file-upload"));
        uploadfile.sendKeys("C:\\Users\\Vijaya\\Desktop\\Digi Notes\\Testing ex\\testdoc.txt");
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(5000);
        driver.quit();


    }
}
