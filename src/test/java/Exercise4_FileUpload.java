import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Exercise4_FileUpload {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileUploadText = driver.findElement(By.id("file-upload-field"));
        fileUploadText.sendKeys("November 3.txt");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement fileUploadTextResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("file-upload-field")));


        driver.quit();

    }
}
