import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise2_SwithToActiveWindow {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement openNewTabBtn = driver.findElement(By.id("new-tab-button"));
        openNewTabBtn.click();
        String originalHandle = driver.getWindowHandle();

        for (String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);
        WebElement openAlertBtn = driver.findElement(By.id("alert-button"));
        openAlertBtn.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();

    }
}
