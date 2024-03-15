import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4_DatePicker {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("03/28/2024");
        datePicker.sendKeys(Keys.RETURN);



        driver.quit();

    }
}
