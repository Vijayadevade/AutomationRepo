package vijayatech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import javax.crypto.spec.PSource;
import java.io.IOException;
import java.lang.management.OperatingSystemMXBean;

public class exmplDriver {
    public static WebDriver driver;
    public static void main(String[] args) throws  InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");

        driver = new EdgeDriver();
        driver.get("https://www.facebook.com");

        driver = new OperaDriver();
        driver.get("https://www.facebook.com");

        driver = new InternetExplorerDriver();
        driver.get("https://www.facebook.com");



    }
}
