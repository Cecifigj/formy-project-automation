import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
    public static void WaitForAlertBanner(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Thanks for submitting your form')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

    }
    public static String getAlertBannerText (WebDriver driver) {
        return driver.findElement(By.className("alert")).getText();
    }
}
