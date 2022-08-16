package HandlingWindow2;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Screenshot {
    public static void main(String[] args) throws InterruptedException, IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amozon.com");
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f,new File("C:\\Users\\Vijaya\\Desktop\\Digi Notes\\Testing ex"));
        Thread.sleep(5000);
        driver.quit();
    }
}


