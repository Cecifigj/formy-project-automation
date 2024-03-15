import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise2_ExecuteJavaScript {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/modal");
        WebElement openModalBtn = driver.findElement(By.id("modal-button"));
        openModalBtn.click();
        WebElement closeBtn = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",closeBtn);

        driver.quit();

    }
}
