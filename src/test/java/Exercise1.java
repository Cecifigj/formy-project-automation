import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Exercise1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.id("APjFqb"));
        element.sendKeys("Cheese!");
        element.submit();
        driver.manage().timeouts().implicitlyWait (10, SECONDS);
        driver.quit();


    }
}
