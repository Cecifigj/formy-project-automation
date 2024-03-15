import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Exercise2_DragAndDrop {
    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver", "/driver/chromedriver/chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement seleniumImage = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(seleniumImage,box).build().perform();





        driver.quit();

    }
}
