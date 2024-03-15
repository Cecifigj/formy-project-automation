import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise2_Autocomplete {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement address = driver.findElement(By.id("autocomplete"));
        address.sendKeys("Las Corzuelas 785");
        Thread.sleep(3000);

        WebElement dismiss = driver.findElement(By.className("dismissButton"));
        dismiss.click();

        driver.quit();
    }
}
