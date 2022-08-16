package vijayatech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class elements2 {
    public static WebDriver driver;

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login1.cgi");

        List<WebElement> elements = driver.findElements(By.tagName("input"));
        System.out.println(elements.size());


        for (WebElement e : elements) {
            System.out.println(e);

            Thread.sleep(3000);
            driver.close();
        }
    }
}
